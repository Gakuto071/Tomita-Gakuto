package curriculum27;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("コンソールに文字を入力してください");

		// 入力例: ライオン:2.1:80～
		String input = scanner.nextLine();

		// 動物ごとに分割
		String[] animalDataArray = input.split(",");

		for (String animalData : animalDataArray) {
			String[] parts = animalData.split(":");
			if (parts.length == 3) {
				String name = parts[0];
				double length = Double.parseDouble(parts[1]);
				int speed = Integer.parseInt(parts[2]);

				// Animal オブジェクト作成
				Animal animal = new Animal(name, length, speed);
				animal.printInfo();
			}
		}

		scanner.close();
	}
}
