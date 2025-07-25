package curriculum32;

public class Person {

	    public static int count = 0; // クラス変数
	    public String firstName;
	    public String lastName; // ← 問題1
	    public int age;
	    public double height, weight;

	    // 問題2・3
	    public Person(String firstName, String lastName, int age, double height, double weight) {
	        this.firstName = firstName;
	        this.lastName = lastName;  
	        this.age = age;
	        this.height = height;
	        this.weight = weight;
	        Person.count++; // ← インスタンスが作られたら人数カウント（問題3）
	    }

	    // fullNameメソッド
	    public String fullName() {
	        return this.firstName + this.lastName;
	    }

	    // 自己紹介メソッド
	    public void print() {
	        System.out.println("名前は" + this.fullName() + "です");
	        System.out.println("年は" + this.age + "です");
	        System.out.println("BMIは" + String.format("%.2f", this.bmi()) + "です。");
	        System.out.println();
	    }

	    // BMIの計算
	    public double bmi() {
	        return this.weight / (this.height * this.height);
	    }

	    // クラスメソッド：人数を表示
	    public static void printCount() {
	        System.out.println("合計" + Person.count + "人です");
	    }
	}

