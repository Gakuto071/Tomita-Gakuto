package curriculum23;

public class Execution {

	public static void main(String[] args) {
		
		// Animal23 クラスのインスタンスを作成
		Animal23 A = new Animal23();
		// 動物名を「ライオン」に設定
		A.setAnimalName("ライオン");
		// 体長を2.1メートルに設定
		A.setHight(2.1);
		// 速度を80km/hに設定
		A.setSpeed(80);
		// 動物名を出力
		System.out.println("動物名:"+ A.getAnimalName());
		// 体長を出力（単位：メートル）
		System.out.println("体長:" + A.getHight() + "m");
		// 速度を出力（単位：km/h）
		System.out.println("速度:" + A.getSpeed() + "km/h");
	}
}