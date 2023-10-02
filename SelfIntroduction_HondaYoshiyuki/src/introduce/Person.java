package introduce;

//Personクラスの定義
public class Person {
	// インスタンスフィールドを定義
	// 名前
	private String name;

	// 年齢
	private int age;

	// 身長
	private double height;

	// 体重
	private double weight;

	// クラスレベルの変数（人数の合計を記録するため）
	// 合計人数のカウント
	private static int totalPersons = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// インスタンスが生成されるたびに人数をカウントアップ
		totalPersons++;
	}

	// インスタンスメソッド（BMIを計算する）
	public double bmi() {
		// BMIの計算式：BMI = 体重(kg) / (身長(m) * 身長(m))
		return weight / (height * height);
	}

	// インスタンスメソッド（情報を表示する）
	public void print() {
		// 名前を表示
		System.out.println("名前は、" + this.name + "です");

		// BMIを表示
		System.out.println("BMIは、" + Math.floor(this.bmi()) + "です");

		// 年齢を表示
		System.out.println("年は、" + this.age + "歳です\n");

	}

	// クラスメソッド（人数の合計を取得）
	public static void printTotalPersons() {
		// 合計人数を表示
		System.out.println("合計" + totalPersons + "人です");
	}

}