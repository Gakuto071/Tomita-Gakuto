package curriculum25; // curriculum25 というパッケージに属するクラス

public class Processing {
	// フィールド変数：キャラクターの名前
	private String name;
	// フールド変数：HP
	private int hp;
	// フィールド変数：MP
	private int mp;
	
	// nameフィールドに値を設定するセッターメソッド
	public void setName(String name) {
		this.name = name;
	}
	// nameフィールドの値を取得するゲッターメソッド
	public String getName() {
		return name;
	}
	// hpフィールドに値を設定するセッターメソッド
	public void setHp(int hp) {
		this.hp = hp;
	}
	// hpフィールドの値を取得するゲッターメソッド
	public int getHp() {
		return hp;
	}
	// mpフィールドに値を設定するセッターメソッド
	public void setMp(int mp) {
		this.mp = mp;
	}
	// mpフィールドの値を取得するゲッターメソッド
	public int getMp() {
		return mp;
	}

	// キャラクターの名前・HP・MP を出力するメソッド
	public void print() {
		// 挨拶文と名前を表示
		System.out.println("こんにちは 「" + getName() + "」 さん");
		// ステータスのラベル行を表示
		System.out.println("ステータス");
		// HPの値を表示
		System.out.println("HP:" + getHp());
		// MPの値を表示
		System.out.println("MP:" + getMp());
	}
}
