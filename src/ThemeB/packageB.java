package ThemeB;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//ThemeAパッケージ内のpackageAクラスをインポート
import ThemeA.packageA;

public class packageB {
	public static void main(String[] args) {

		// packageAクラスのインスタンスを作成し、あいさつと言語を渡す
		packageA A = new packageA("こんにちは！", "日本");
		// 食べ物の名前を設定
		A.setFood("寿司");
		// カテゴリ（ジャンル）を設定
		A.setCategory("和食");
		// 現在の日時を取得
		LocalDateTime now = LocalDateTime.now();
		// 日付と時間のフォーマットを指定
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		// 現在日時をフォーマットに従って文字列に変換
		String formattedDate = now.format(formatter);
		// packageAインスタンスに現在の日時を設定
		A.setCurrentTime(formattedDate);
		// 情報をまとめて出力（packageAクラスのprintメソッドで表示）
		A.print();
	}
}