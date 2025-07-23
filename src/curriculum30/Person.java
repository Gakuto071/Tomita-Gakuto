package curriculum30;

class Person {
	// インスタンスフィールド
	private String name;
	private int age;
	private double height;
	private double weight;

	// 合計人数
	static int count = 0;

	// コンストラクタ
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		count++; // 人数カウント
	}

	// セッター・ゲッター
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	// BMI計算
	public double getBmi() {
		return weight / (height * height);
	}

	// 出力メソッド
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.printf("BMIは%.2fです\n", getBmi());
	}

}
