package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("ユーザー名を入力してください: ");
		String userName = scanner.nextLine();

		if ( (userName.length() <= 0)|| userName.isEmpty()) { 
			System.out.println("名前を入力してください");
		} else if (userName.length() > 10) {
			System.out.println("名前を10文字以内にしてください");
		} else if (!userName.matches("[a-zA-Z0-9]+")) {
				System.out.println("半角英数字のみで名前を入力してください");	
		} else {
			System.out.println("ユーザー名「" + userName + "」を登録しました");
		}
		
		
		scanner.close();
	}

}
