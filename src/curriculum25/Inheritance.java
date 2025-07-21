package curriculum25; // curriculum25 というパッケージに属するクラス

// Processingクラスを継承し、追加ステータス（攻撃力・素早さ・防御力）を持つクラス
public class Inheritance extends Processing {
	// フィールド変数：攻撃力
	private int power;
	// フィールド変数：素早さ
	private int speed;
	// フィールド変数：防御力
	private int defense;
	
	// powerフィールドに値を設定するセッター
	public void setPower(int power) {
		this.power = power;
	}
	// powerフィールドの値を取得するゲッター
	public int getPower() {
		return power;
	}
	// speedフィールドに値を設定するセッター
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	// speedフィールドの値を取得するゲッター
	public int getSpeed() {
		return speed;
	}
	// defenseフィールドに値を設定するセッター
	public void setDefense(int defense) {
		this.defense = defense;
	}
	// defenseフィールドの値を取得するゲッター
	public int getDefense() {
		return defense;
	}

	// ステータスを表示するメソッド
	public void print() {
		// 親クラス（Processing）のprintメソッドを呼び出して、名前・HP・MPを表示
		super.print();
		// 攻撃力を表示
		System.out.println("攻撃力:" + getPower());
		// 素早さを表示
		System.out.println("素早さ:" + getSpeed());
		// 防御力を表示
		System.out.println("防御力:" + getDefense());
		// 冒険に出かけるメッセージを表示
		System.out.println("さあ冒険に出かけよう！");
	}
}