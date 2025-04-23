package sample;

public class Sample {

	public static void main(String[] args) {
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		char c;
		String str;
		boolean bool;
		
		b = 0;
		s = 0;
		i = 0;
		l = 0L;
		f = 0.0f;
		d = 0.0;
		c = '\u0000';
		str = null;
		bool = false;
		
		b = 10;
		s = 100;
		i = 1000;
		l = 10000L;
		f = 9.5f;
		d = 10.5;
		c = 'a';
		str = "Hello";
		bool = true;
		
		System.out.println(b + s + i + l);
		System.out.println(b * 2);
		System.out.println(c + str + bool);
		System.out.println(b + s + i + l + f + d);
		System.out.println(b * s * i * l);
		System.out.println(d / s);
		System.out.println(b - s);
		
		
		String num="20";		
		int num1=23;				
		System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));
		
	}

}