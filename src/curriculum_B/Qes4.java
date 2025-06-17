package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {

		int num = 0;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				num = i * j;
				String strI = String.format("%02d", i);
				String strJ = String.format("%02d", j);
				String strN = String.format("%02d", num);
				System.out.print(strI + "*" + strJ + "=" + strN + " || ");
			}
			System.out.println();
		}

	}

}
