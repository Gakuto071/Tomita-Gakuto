package ThemeA; // ThemeAというパッケージに属していることを示す

public class packageA { // クラス名packageA（処理用のクラス）

	private String greeting; // あいさつの文言（例：こんにちは）
	private String country; // 国名（例：日本）
	private String food; // 食べ物の名前（例：寿司）
	private String category; // 食べ物のカテゴリ（例：和食）
	private String currenttime; // 現在の日時

	// コンストラクタ（greetingとcountryを初期設定する）
	public packageA(String gree, String come) {
		this.greeting = gree; // 引数のgreeをフィールドgreetingに代入
		this.country = come; // 引数のcomeをフィールドcountryに代入
	}

	// foodフィールドの値を返すメソッド
	public String getFood() {
		return food;
	}

	// foodフィールドに値を設定するメソッド
	public void setFood(String food) {
		this.food = food;
	}

	// categoryフィールドに値を設定するメソッド
	public void setCategory(String cate) {
		this.category = cate;
	}

	// categoryフィールドの値を返すメソッド
	public String getCategory() {
		return category;
	}

	// currenttimeフィールドに現在の日時を設定するメソッド
	public void setCurrentTime(String time) {
		this.currenttime = time;
	}

	// currenttimeフィールドの値を返すメソッド
	public String getCurrentTime() {
		return currenttime;
	}

	// 設定された情報を出力するメソッド（mainから呼び出して使う）
	public void print() {
		System.out.println(this.greeting + "ここは" + this.country + "です！"); // 「こんにちは！ここは日本です！」のように出力
		System.out.println("この" + this.getFood() + "はうまい"); // 「この寿司はうまい」のように出力
		System.out.println(food + "は" + this.getCategory() + "です"); // 「寿司は和食です」のように出力
		System.out.println("今の現在日時は" + this.getCurrentTime() + "です"); // 「今の現在日時は2023/03/09 10:23:39です」のように出力
	}
}