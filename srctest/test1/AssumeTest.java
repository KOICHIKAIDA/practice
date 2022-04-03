package test1;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class AssumeTest {

//	テストクラス毎に、全テストの実行前に呼ばれる処理には@BeforeAllアノテーションを付ける。
//	全テストの実行後に呼ばれる処理には@AfterAllアノテーションを付ける。
//	TestInfoクラスの引数からは、テスト対象の情報を取得できる。

	@BeforeAll // JUnit4の @BeforeClass
	static void beforeAllTests(TestInfo testInfo) {
		System.out.printf("before all [%s]\n", testInfo.getDisplayName());
	}

	@AfterAll // JUnit4の @AfterClass
	static void afterAllTests(TestInfo testInfo) {
		System.out.printf("after all [%s]\n", testInfo.getDisplayName());
	}

//	各テスト毎に、テスト実行前に呼ばれる処理には@BeforeEachアノテーションを付ける。
//	テスト実行後に呼ばれる処理には@AfterEachアノテーションを付ける。

	@BeforeEach // JUnit4の @Before
	void beforeEachTest(TestInfo testInfo) {
		System.out.printf("before each [%s]\n", testInfo.getDisplayName());
	}

	@AfterEach // JUnit4の @After
	void afterEachTest(TestInfo testInfo) {
		System.out.printf("after each [%s]\n", testInfo.getDisplayName());
	}

//	assumeTrueは、条件を満たしていたら後続処理を続行する。
//	条件外だったら後続処理は実行しない。
	@Test
	void assume1() {
		Assumptions.assumeTrue(System.getProperty("os.name").contains("Windows"));

		System.out.println("assume1");
		assertEquals(";", File.pathSeparator);
	}

//	assumingThatは、条件を満たしている場合だけ第2引数の処理を実行する。
//	条件を満たしていてもいなくても、後続処理は実行される。（第2引数のテストが失敗したら、その時点で終了するが）
	@Test
	void assume2() {
		Assumptions.assumingThat(System.getProperty("os.name").contains("Windows"), () -> {
			System.out.println("assume2-1");
			assertEquals(";", File.pathSeparator);
		});

		System.out.println("assume2-2");
		assertTrue(System.lineSeparator().contains("\n"));
	}

//	テストを実行しないクラスやメソッドには@Disabledアノテーションを付ける。
//	引数でコメントを入れることも出来る。
	@Test
	@Disabled
	void assume3() {
		Assumptions.assumeTrue(System.getProperty("os.name").contains("Windows"));

		System.out.println("assume1");
		assertEquals(";", File.pathSeparator);
	}

}
