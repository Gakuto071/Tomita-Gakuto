package curriculum29Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import curriculum29.Prefecture;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// データ入力
		System.out.println("番号をカンマ区切りで入力してください");
		String input = scanner.nextLine();
		String[] tokens = input.split(",");

		// 並び順入力
		System.out.println("並び順を入力してください（asc または desc）:");
		String order = scanner.nextLine().trim().toLowerCase();

		// 都道府県データ（都道府県:県庁所在地:面積）
		String[] data = {
				"北海道:札幌市:83424",
				"青森県:青森市:9646",
				"岩手県:盛岡市:15275",
				"宮城県:仙台市:7282",
				"秋田県:秋田市:11638",
				"山形県:山形市:9323",
				"福島県:福島市:13784",
				"茨城県:水戸市:6097",
				"栃木県:宇都宮市:6408",
				"群馬県:前橋市:6362",
				"埼玉県:さいたま市:3798"
		};

		// 番号に対応する都道府県データを選択
		List<Prefecture> selected = new ArrayList<>();
		for (String token : tokens) {
			try {
				int index = Integer.parseInt(token.trim());
				if (index >= 0 && index < data.length) {
					String[] parts = data[index].split(":");
					String name = parts[0];
					String capital = parts[1];
					double area = Double.parseDouble(parts[2]);
					selected.add(new Prefecture(name, capital, area));
				} else {
					System.out.println("番号 " + index + " は範囲外です");
				}
			} catch (NumberFormatException e) {
				System.out.println("無効な入力：" + token);
			}
		}// 「昇順」と入力された場合の処理
		if (order.equals("asc")) {
			// リスト内の要素を小さい順に並び替える
			selected.sort(Comparator.comparing(Prefecture::getArea));
			// 「降順」と入力された場合の処理
		} else if (order.equals("desc")) {
			// リスト内の要素を大きい順に並び替える
			selected.sort(Comparator.comparing(Prefecture::getArea).reversed());
		}

		for (Prefecture p : selected) {
			p.printInfo();
		}

		scanner.close();
	}
}
