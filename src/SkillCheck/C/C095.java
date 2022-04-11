package SkillCheck.C;

import java.util.Scanner;

public class C095 {
	// あなたは某 P 社のセキュリティ部門で働くエンジニアです。
	// あなたは今、会社の入口に設置する特殊な認証システムの開発を行っています。
	//
	//
	// 今回作る認証システムでは、英小文字の文字列で表される合言葉が使われます。
	//
	//
	// 認証システムは、毎回誰かが会社に入ろうとしたときに、合言葉の入力を要求します。
	// このとき、合言葉をそのまま入力すると、「合言葉が流出した」と判断され、認証エラーとして会社の入り口をロックしてしまいます。
	// そのため、会社に入るには、合言葉の文字の並びを入れ替えて、合言葉そのものとは一致しない文字列を入力する必要があります。
	// それ以外の文字列を入力した場合も認証エラーとなってしまい、会社に入ることが出来ません。
	//
	//
	// 「合言葉」と認証システムに入力される文字列が与えられたときに、その文字列で会社に入れるかどうかを判定するプログラムを作成してください。
	//
	//
	// 入力例 1 〜 3 では、「合言葉」は "abc" です。
	//
	//
	// ・入力例 1の場合、システムに入力される文字列は "bac" です。
	// この 2 つの文字列は一致していませんが、"abc" の 1 文字目と 2 文字目を入れ替えれば "abc" になるので、この場合は会社に入ることが出来ます。
	//
	// ・入力例 2 の場合、システムに入力される文字列は "abc" です。
	// この 2 つの文字列は一致しているため、認証エラーになってしまい会社に入ることは出来ません。
	//
	// ・入力例 3 の場合、システムに入力される文字列は "xy" です。
	// この 2 つの文字列は一致していませんが、"xy" をどのように入れ替えても "abc" と一致させることが出来ないので、認証エラーになってしまい会社に入ることは出来ません。
	//
	//
	// 入力される値
	//
	// 入力は以下のフォーマットで与えられます。
	//
//	     s
//	     t
	//
	// ・1行目に、合言葉を表す文字列 s が与えられます。
	// ・2 行目に、システムに入力される文字列 t が与えられます。
	// ・入力は 2 行となり、2 行目の末尾に改行が 1 つ入ります。
	//
	//
	// 期待する出力
//	     システムに入力される文字列によって会社に入れる場合
	//
//	     YES
	//
//	     と出力してください。そうでない場合
	//
//	     NO
	//
//	     と出力してください。出力の最後に改行を入れ、余計な文字、空行を含んではいけません。
	//
	//
	// 入力例1
	//
	// abc
	// bac
	//
	// 出力例1
	//
	// YES
	//
	// 入力例2
	//
	// abc
	// abc
	//
	// 出力例2
	//
	// NO
	//
	// 入力例3
	//
	// abc
	// xy
	//
	// 出力例3
	//
	// NO
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    String s = sc.next();
		    String t = sc.next();
		    String work = "";
		    for (int i = 0; i < s.length(); i++) {
		    	for (int j = i + 1; j < s.length(); j++) {

		    	}
		    }
	  }

}
