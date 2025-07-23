package curriculum29Main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("番号をカンマ区切りで入力してください");
		String input = scanner.nextLine(); // ユーザーからの入力
		String[] tokens = input.split(","); // カンマで分割

		// Prefecture型の配列に修正
		Prefecture[] data = {
				new Prefecture("北海道", "札幌市", 83424),
				new Prefecture("青森県", "青森市", 9646),
				new Prefecture("岩手県", "盛岡市", 15275),
				new Prefecture("宮城県", "仙台市", 7282),
				new Prefecture("秋田県", "秋田市", 11638),
				new Prefecture("山形県", "山形市", 9323),
				new Prefecture("福島県", "福島市", 13784),
				new Prefecture("茨城県", "水戸市", 6097),
				new Prefecture("栃木県", "宇都宮市", 6408),
				new Prefecture("群馬県", "前橋市", 6362),
				new Prefecture("埼玉県", "さいたま市", 3798)
		};

		// 入力された番号に対応する都道府県を出力
		for (String token : tokens) {
			try {
				int index = Integer.parseInt(token.trim());
				if (index >= 0 && index < data.length) {
					data[index].printInfo(); // 都道府県情報を表示
				} else {
					System.out.println("存在しない番号です: " + index);
				}
			} catch (NumberFormatException e) {
				System.out.println("数値として読み取れません: " + token);
			}
		}

		scanner.close();

	}
}
