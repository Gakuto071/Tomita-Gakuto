package curriculum30;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("富田樂斗", 24, 1.8, 70.0);
		person1.print();
		System.out.println("合計" + Person.count + "人です");
	}
}
