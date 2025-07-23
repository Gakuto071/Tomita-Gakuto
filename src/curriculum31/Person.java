package curriculum31;

public class Person {

	    // フィールド（インスタンスフィールド）
	    public String name;
	    public int age;
	    public double height;
	    public double weight;

	    public static int count = 0;

	    // コンストラクタ
	    public Person(String name, int age, double height, double weight) {
	        this.name = name;
	        this.age = age;
	        this.height = height;
	        this.weight = weight;

	        count++;
	    }

	    // BMIを計算するインスタンスメソッド
	    public double bmi() {
	        return this.weight / (this.height * this.height);
	    }

	    // 自己紹介を表示するインスタンスメソッド
	    public void print() {
	        System.out.println("名前は" + this.name + "です。");
	        System.out.println("年は" + this.age + "歳です。");
	        System.out.println("身長は" + this.height + "mです。");
	        System.out.println("体重は" + this.weight + "kgです。");
	        System.out.println("BMIは" + String.format("%.2f", this.bmi()) + "です。");
	        System.out.println();
	    }

	    public static void printCount() {
	       
	        System.out.println("合計" + count + "人です。（クラスメソッドからの出力）");
	    }
	}
