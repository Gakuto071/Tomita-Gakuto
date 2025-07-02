package curriculumC;

import java.util.Random;

public class Curriculum_New_1_18 {

	// Q1：引数に文字列型と整数型をいれて「Hello JavaSE 11」と出力する
	public static void printMessage(String message, int version) {
		System.out.println(message + " " + version);
	}

	// Q2：引数に整数を渡して乗算結果を出力する
	public static void multiply(int a, int b) {
		int result = a * b;
		System.out.println("乗算結果：" + result);
	}

	// Q3：引数に整数配列を渡して順番に出力する
	public static void printArray(int[] array) {
		System.out.println("配列の要素：");
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
	}

	// Q4：Q2のオーバーロード版（小数を加算）
	public static void multiply(double a, double b) {
		double result = a + b;
		System.out.println("小数の和：" + result);
	}

	// Q5：指定回数分1〜100のランダムな整数を生成して出力＆配列で返す
	public static int[] generateRandomNumbers(int count) {
		Random rand = new Random();
		int[] numbers = new int[count];
		for (int i = 0; i < count; i++) {
			int randomNumber = rand.nextInt(100) + 1; // 1〜100
			numbers[i] = randomNumber;
			System.out.println("ランダムな値[" + i + "]：" + randomNumber);
		}
		return numbers;
	}

	// Q6：配列の平均値を出力し、その値を返す
	public static double calculateAverage(int[] numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		double average = (double) sum / numbers.length;
		System.out.println("平均値：" + average);
		return average;
	}

	// Q7：平均値が50以上か判定して出力し、結果を返す
	public static boolean isAverageAbove50(double average) {
		boolean result = average >= 50;
		System.out.println("平均が50以上か？：" + result);
		return result;
	}

	// mainメソッド：各メソッドを呼び出してテスト
	public static void main(String[] args) {
		// Q1
		printMessage("Hello JavaSE", 11);

		// Q2
		multiply(4, 5);

		// Q3
		int[] sampleArray = { 10, 20, 30 };
		printArray(sampleArray);

		// Q4
		multiply(3.5, 2.5);

		// Q5 → Q6 → Q7
		int[] randomNumbers = generateRandomNumbers(5); // Q5
		double avg = calculateAverage(randomNumbers); // Q6
		boolean isAbove50 = isAverageAbove50(avg); // Q7
		System.out.println("Q7の戻り値：" + isAbove50);
	}
}




