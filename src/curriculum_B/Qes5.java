package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {

		int num = 0;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 20; j++) {
				num = j * i;
				String strI = String.format("%03d", i);
				String strJ = String.format("%03d", j);
				String strN = String.format("%03d", num);
				System.out.print(strJ + "*" + strI + "=" + strN + " || ");
			}
			System.out.println();
		}
	}

}
