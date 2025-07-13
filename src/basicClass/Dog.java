package basicClass;

public class Dog {

    // Q1：フィールドに動物の名前の変数を定義（privateに変更）
    private String name;

    // Q2：フィールドに動物の数の変数を定義（privateに変更）
    private int num;

    // Q3：Q1で作成した変数に「犬」を代入するコンストラクタ
    public Dog() {
        this.name = "犬";
    }

    // Q4：Q2で作成した変数に引数を代入するコンストラクタ
    public Dog(int num) {
        this.num = num;
    }

    // name のゲッター
    public String getName() {
        return name;
    }

    // name のセッター
    public void setName(String name) {
        this.name = name;
    }

    // num のゲッター
    public int getNum() {
        return num;
    }

    // num のセッター
    public void setNum(int num) {
        this.num = num;
    }
}