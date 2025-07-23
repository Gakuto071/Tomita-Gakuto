package curriculum27;

public class Animal  {
    private String name;
    private double length;
    private int speed;
    private String scientificName;

    public Animal (String name, double length, int speed) {
        this.name = name;
        this.length = length;
        this.speed = speed;
        this.scientificName = getScientificNameByName(name); // 学名はここで設定
    }

    private String getScientificNameByName(String name) {
        switch (name) {
            case "ライオン":
                return "パンテラ レオ";
            case "ゾウ":
                return "ロキソドンタ・サイクロティス";
            case "パンダ":
                return "アイルロポダ・メラノレウカ";
            case "チンパンジー":
                return "パン・トゥログロディテス";
            case "シマウマ":
                return "チャップマンシマウマ";
            default:
                return "不明";
        }
    }

    public void printInfo() {
        System.out.println("動物名：" + name);
        System.out.println("体長：" + length + "m");
        System.out.println("速度：" + speed + "km/h");
        System.out.println("学名：" + scientificName);
        System.out.println(); // 改行
    }
}
