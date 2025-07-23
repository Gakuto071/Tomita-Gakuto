package curriculum31;

	public class Main {
	    public static void main(String[] args) {
	        Person person1 = new Person("富田樂斗", 24, 1.8, 70);
	        person1.print();

	        Person person2 = new Person("富田樂斗(幼)", 10, 1.3, 35);
	        person2.print();

	        System.out.println("合計" + Person.count + "人です");

	        Person.printCount();
	    }
	}

