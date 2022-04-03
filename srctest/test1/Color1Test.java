package test1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import test.Example1;

class Color1Test {
	
//	テストを行うメソッドごとに@Testアノテーションをつけます。
//	@DisplayNameは、結果に指定した文言を表示します。
	
	@Test
	@DisplayName("1つめのテスト")
	void testGetColor1() {
		Color1 c1 = new Color1();
		assertEquals("赤", c1.getColor(1));
		assertNotEquals("青", c1.getColor(1));
	}
	
	@Test
	@DisplayName("2つめのテスト")
	void testGetColor2() {
		Color1 c1 = new Color1();
		assertEquals("青", c1.getColor(2));
	}	

	@Test
	@DisplayName("3つめのテスト")
	void testGetColor3() {
		Color1 c1 = new Color1();
		assertEquals("1or2を入力して下さい", c1.getColor(3));
	}
	
	@Test
	@DisplayName("assertTrueFalse")
	void testIsRed() {
		Color1 c1 = new Color1();
		assertTrue(c1.isRed(1));
		assertFalse(c1.isRed(2));
	}
	
	@Test
	@DisplayName("assertNullNotNull")
	void testAssertNullNotNull() {
		Color1 c1 = new Color1();
		assertNull(c1.isNull(1));
		assertNotNull(c1.isNull(2));
	}
	
	@Test
	@DisplayName("assertEqualsFloat")
	void testAssertEqualsFloat() {
		//浮動小数点は完全一致するとは限らないので、第3引数で一致する範囲（delta）を指定する。
		assertEquals(0.333f, 1 / 3f, 0.001f);
		assertEquals(0.333d, 1 / 3d, 0.001d);
	}
	
	@Test
	@DisplayName("assertArrayEquals")
	void testAssertArrayEquals() {
		Color1 c1 = new Color1();
		int[] expected = {1, 2, 3};
		assertArrayEquals(expected, c1.array(1));
	}
	
	@Test
	@DisplayName("assertIteratableEquals")
//	リスト（Iterable）の比較にはassertIterableEqualsが便利。
//	（ListならassertEqualsでも比較できるが、不一致だった場合、assertIterableEqualsだと「不一致だった要素」を表示してくれる）
	void testAssertIteratableEquals() {
		List<String> expected = Arrays.asList("a", "b", "c");
		Color1 c1 = new Color1();
		Assertions.assertIterableEquals(expected, c1.iteratable(1));
	}

	
	@Test
	void linesMatch() {
//		複数行にわたるメッセージ（スタックトレースとかログメッセージ）の比較にはassertLinesMatchが便利。
//		assertLinesMatchは、基本的にはList<String>の比較。
//		だが、期待値の方に正規表現等を指定できる。
		List<String> expected = Arrays.asList("\\d+ms", "abc", ">> skip >>", ".{3}");
		List<String> actual   = Arrays.asList("123ms", "abc", "1", "2", "3", "zzz");
		Assertions.assertLinesMatch(expected, actual);
	}
	
	@Test
	void same() {
		String s = new String("zzz");
		assertEquals("zzz", s);
//		インスタンスが同じかどうかを比較する例。
		assertNotSame("zzz", s);
		assertSame("zzz", s.intern());
	}
	
	@Test
//	assertAllを使うと、1つのテストに失敗しても残りのテストが全て実行される。
//	複数のテストが失敗しても、エラーがスローされるのは1回だけ（MultipleFailuresError）となる。
	void all() {
		Person target = new Person();
		Assertions.assertAll("person",
			() -> assertEquals("zzz", target.getName(), "name"),
			() -> assertEquals(20, target.getAge(), "age")
		);
	}
	
	@Test
	void exception1() {
		// 例外が発生することを確認する例。
		Example1 target = new Example1();
		// assertThrowsの第1引数で「発生するであろう例外」のクラスを指定し、第2引数（ラムダ式）でテスト対象の処理を実行する。
		assertThrows(IllegalArgumentException.class, () -> target.execute2(null));
	}
	
	@Test
	void exception2() {
		Example1 target = new Example1();
//		発生した例外を受け取り、例外が保持している情報をチェックすることも出来る。
		SQLException e = assertThrows(SQLException.class, () -> target.getValue());
		assertEquals("message", e.getMessage());
		assertEquals("state", e.getSQLState());
		assertEquals(123, e.getErrorCode());
	}
	
	@Test
	void exception3() {
		Example1 target = new Example1();
		// JUnit5.2で、例外が発生しないことを確認するassertDoesNotThrowが追加された。
		Assertions.assertDoesNotThrow(() -> target.execute3(null));
	}
	
//	タイムアウト「しない」こと（一定時間内に終了すること）を確認する例。
//	assertTimeout（assertTimeoutPreemptively）の第1引数でタイムアウト時間を指定する。
//	第2引数（ラムダ式）でテスト対象の処理を実行する。
	@Test
	void timeout1() {
		Assertions.assertTimeout(Duration.ofSeconds(2), () -> Thread.sleep(1000));
	}
	
//	assertTimeoutとassertTimeoutPreemptivelyの違いは、テスト対象の処理がタイムアウト時間を過ぎた場合にある。
//	assertTimeoutはテスト対象の処理が終わるまで待ち、終わってからAssertionFailedErrorを発生させる。
//	assertTimeoutPreemptivelyは、タイムアウト時間になったらすぐに（テスト対象の処理が終わるのを待たずに）AssertionFailedErrorを発生させる。
	@Test
	void timeout2() {
		Assertions.assertTimeoutPreemptively(Duration.ofSeconds(2), () -> Thread.sleep(1000));
	}
	
	@Test
	void timeout3() {
		ExecutorService service = Executors.newCachedThreadPool();
		Callable<String> task = () -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			return "zzz";
		};

		String result = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(2), () -> {
			Future<String> future = service.submit(task);
			return future.get();
		});
		assertEquals("zzz", result);
	}
}
