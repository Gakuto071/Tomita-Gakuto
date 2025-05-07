package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("ユーザー名を入力してください: ");
		String userName = scanner.nextLine();

		if (userName == null || userName.trim().isEmpty()) {
			System.out.println("名前を入力してください");
		} else if (userName.length() > 10) {
			System.out.println("名前を10文字以内にしてください");
		} else {
			System.out.println("ユーザー名「" + userName + "」を登録しました");
		}

		scanner.close();
	}

}

//Q1-3まで書いて 、4-7は別タブに記載