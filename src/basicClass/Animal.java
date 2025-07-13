package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

    public static void main(String[] args) {
        // Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力
        Dog d = new Dog();
        System.out.println("動物の名前: " + d.getName());

        // Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力
        Dog num = new Dog(2);
        System.out.println("動物の数: " + num.getNum());

        // 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
        String formattedDate = now.format(formatter);
        System.out.println("現在日時: " + formattedDate);
    }
}