package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		Random random = new Random(); // ランダムな数値を生成するための Random オブジェクトを作成
		Scanner scanner = new Scanner(System.in); // 標準入力（キーボード）を受け取る Scanner オブジェクトを作成
		String input = scanner.nextLine(); // ユーザーの入力を1行受け取る
		String[] home_appliances = input.split("、"); // "、" で文字列を分割して、家電製品の配列を作成

		// 各家電製品についてループ処理を実行
		for (String home_appliance : home_appliances) {
			int num = random.nextInt(12); // 0〜11 の間でランダムな整数を生成

			// 家電製品の種類に応じて処理を分岐
			switch (home_appliance) {
			case "パソコン": // 「パソコン」の場合
				System.out.println(home_appliance + "の残り台数は" + num + "台です");
				break;
			case "冷蔵庫": // 「冷蔵庫」の場合
				System.out.println(home_appliance + "の残り台数は" + num + "台です");
				break;
			case "扇風機": // 「扇風機」の場合
				System.out.println(home_appliance + "の残り台数は" + num + "台です");
				break;
			case "洗濯機": // 「洗濯機」の場合
				System.out.println(home_appliance + "の残り台数は" + num + "台です");
				break;
			case "加湿器": // 「加湿器」の場合
				System.out.println(home_appliance + "の残り台数は" + num + "台です");
				break;
			case "テレビ": // 「テレビ」または
			case "ディスプレイ": // 「ディスプレイ」の場合
				// 「ディスプレイ」の場合は在庫数を (11 - num) にして出力、それ以外はそのまま出力
				System.out.println(home_appliance.equals("ディスプレイ") ? home_appliance + "の残り台数は" + (11 - num) + "台です"
						: home_appliance + "の残り台数は" + num + "台です");
				break;

			default: //上記に該当しない場合
				; // 何もしない空文
				System.out.println(home_appliance + "は指定の商品ではありません");
				break;
			}
		}
		scanner.close();
	}

}
