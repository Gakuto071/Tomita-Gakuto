package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("ユーザー名を入力してください: ");
		String userName = scanner.nextLine(); // userNameにコンソールで入力した値（文字列）を代入

		if ((userName.length() <= 0) || userName.isEmpty()) { // userNameが0文字以下またはuserNameが空の場合
			System.out.println("名前を入力してください");
		} else if (userName.length() > 10) { // userNameが10文字以上の場合
			System.out.println("名前を10文字以内にしてください");
		} else if (!userName.matches("[a-zA-Z0-9]+")) { // userNameが半角英数字ではなかった場合
			System.out.println("半角英数字のみで名前を入力してください");
		} else { // 成功処理
			System.out.println("ユーザー名「" + userName + "」を登録しました");
		}

		int my_hand = 0; // 自分の手を初期化
		int opponent_hand = 0; // 相手の手を初期化
		System.out.print("じゃんけん 0はグー、1：チョキ、2：パー: ");
		int count = 0; // じゃんけんを行った回数をカウントする変数
		boolean flag = false; // 勝利したかの判定するフラグを作成

		while (flag == false) { // 勝利した場合は継続
			my_hand = scanner.nextInt(); // my_handにコンソールで入力した値（整数）を代入
			Random random = new Random(); // スキャナークラスにランダムを代入
			opponent_hand = random.nextInt(3); // 相手の手をランダムに設定
			String[] hands = { "グー", "チョキ", "パー" }; // 文字列を表示
			System.out.println(userName + "の手は「" + hands[my_hand] + "」");
			System.out.println("相手の手は「" + hands[opponent_hand] + "」");

			// （グー vs チョキ または チョキ vs パー または パー vs グー）
			if ((my_hand == 0 && opponent_hand == 1) || (my_hand == 1 && opponent_hand == 2)
					|| (my_hand == 2 && opponent_hand == 0)) {
				System.out.print("やるやん。\n 次は俺にリベンジさせて \n ");
				// 勝った場合ループ終了
				flag = true;
				// 以下は相手が勝った時に表示される文
			} else if (my_hand == 1 && opponent_hand == 0) {
				System.out.print("俺の勝ち！\n 負けは次につながるチャンスです！ \n ネバーギブアップ！ \n");
			} else if (my_hand == 2 && opponent_hand == 1) {
				System.out.print("俺の勝ち！\n たかがじゃんけん、そう思ってないですか？ \n それやったら次も、俺が勝ちますよ \n");
			} else if (my_hand == 0 && opponent_hand == 2) {
				System.out.print("俺の勝ち！\n なんで負けたか、明日まで考えといてください。 \n そしたら何かが見えてくるはずです \n");
			} else {
				System.out.print("DRAW あいこ もう一回しましょう！"); // 引き分けの場合
			}

			count++; // 行数をカウント
		}
		System.out.println("勝つまでにかかった回数は" + count + "回です");

		scanner.close();

	}

}
