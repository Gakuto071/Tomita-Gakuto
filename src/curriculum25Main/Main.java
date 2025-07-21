package curriculum25Main; // curriculum25Main というパッケージに属するクラス

import java.util.Random; // ランダムな数値を生成するためのクラスをインポート
import java.util.Scanner; // コンソール入力を受け取るためのクラスをインポート

import curriculum25.Inheritance; // curriculum25 パッケージに Inheritance クラスをインポート

public class Main {

	public static void main(String[] args) {
		// ランダム値を生成するためのオブジェクトを作成
		Random random = new Random();

		// 長さ5のint配列を作成（パワー、スピード、防御力、HP、MPの5つを格納）
		int[] numbers = new int[5];

		// 30～999の範囲でランダムな値を5つ生成して配列に格納
		for (int i = 0; i < 5; i++) {
			numbers[i] = random.nextInt(1000 - 30) + 30; // nextInt(970) + 30 → 30以上999以下
		}

		// 名前を入力するためのScannerオブジェクトを作成
		Scanner scanner = new Scanner(System.in);

		// Inheritanceクラスのインスタンスを生成
		Inheritance inher = new Inheritance();

		// ランダムに生成した数値を各ステータスに設定
		inher.setPower(numbers[0]);   // パワー
		inher.setSpeed(numbers[1]);   // スピード
		inher.setDefense(numbers[2]); // 防御力
		inher.setHp(numbers[3]);      // HP
		inher.setMp(numbers[4]);      // MP

		// 名前を入力して設定
		inher.setName(scanner.nextLine());

		// キャラクターのステータスを表示
		inher.print();

		// Scannerを閉じる
		scanner.close();
	}
}