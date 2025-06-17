package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("生徒の人数を入力してください"); // ユーザーに人数入力を促す
		int student = scanner.nextInt();  // 入力された生徒数を取得
		String[] subjects = { "英語", "数学", "理科", "社会" }; // 教科名を格納した配列を作成
		
		int[][] scores = new int[student][subjects.length]; // 生徒数×教科数の2次元配列を作成（点数用）
		 // 各生徒・各教科の点数を入力
		for (int j = 0; j < student; j++) { // 各生徒について繰り返し処理
			for (int i = 0; i < subjects.length; i++) { // 各教科について繰り返し処理
				System.out.println((j + 1) + "人目の" + subjects[i] + "の点数を入力してください");  // 点数入力を促す
				scores[j][i] = scanner.nextInt(); // 入力された点数を配列に格納

			}
		}
		 int n = 0; // 生徒のカウント用変数（表示用）
	        for (int[] row : scores) { // 各生徒の点数配列について繰り返し
	            double sum = 0; // 各生徒の点数合計を初期化
	            n++; // 生徒番号を1増やす
	            for (double num : row) { // 各教科の点数を取り出して合計を計算
	                sum += num; // 点数を合計に加算
	            }
	            double average = sum / subjects.length; // 平均点を計算（教科数で割る）
	            System.out.println(n + "人目の平均点は" + average + "点です。"); // 平均点を表示
	        }

	        // 各教科ごとの平均点を計算
	        for (int i = 0; i < subjects.length; i++) { // 各教科について繰り返し
	            double sum = 0; // 教科ごとの合計点を初期化
	            for (int j = 0; j < student; j++) { // 各生徒について繰り返し
	                sum += scores[j][i]; // 生徒ごとのその教科の点数を加算
	            }
	            double average = sum / student; // 教科の平均点を計算（生徒数で割る）
	            System.out.println(subjects[i] + "の平均点は" + average + "点です。"); // 教科の平均点を表示
	        }

	        double sum = 0; // 全体の合計点を初期化
	        for (int[] row : scores) { // 各生徒について繰り返し
	            for (double num : row) { // 各教科の点数を繰り返し
	                sum += num; // 点数を全体合計に加算
	            }
	        }
	        double average = sum / (student * subjects.length); // 全体の平均点を計算（全体の点数数で割る）
	        System.out.println("全体の平均点は" + average + "点です。"); // 全体の平均点を表示

	        scanner.close();
	    }
	}