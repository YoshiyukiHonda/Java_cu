package introduce;

public class Person {
	// 名前を格納する変数
	public String name;

	// 年齢を格納する変数
	public int age;

	// 身長を格納する変数
	public double height;

	// 体重を格納する変数
	public double weight;

	// クラスフィールド「count」を定義（初期値：0,データ型：int）
	// インスタンスの総数を格納するクラス変数
	private static int count = 0;

	// Personコンストラクタの中でクラスフィールドcountに1を足す
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// インスタンスが生成されるたびにcountをインクリメント
		count++;
	}

	// BMI（Body Mass Index）を計算するメソッド
	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	public void print() {
		// 名前を表示
		System.out.println("名前は" + this.name + "です");

		// 年齢を表示
		System.out.println("年は" + this.age + "です\n");
	}

	// クラスメソッド「printCount」を定義（データ型：void）
	public static void printCount() {
		// クラスメソッドの中にクラスフィールド「count」を用いて出力
		// インスタンスの総数を表示
		System.out.println("合計" + count + "人です");
	}

}
