package introduce;

public class Person {
	// クラスフィールド「count」を定義して、初期値を0に設定
	public static int count = 0;

	// インスタンスフィールド「firstName」を定義
	public String firstName;

	// インスタンスフィールド「lastName」を定義
	public String lastName;

	// インスタンスフィールド「age」を定義
	public int age;

	// インスタンスフィールド「height」と「weight」を定義
	public double height, weight;

	// コンストラクタ：lastNameの値を引数で受け取る
	Person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// インスタンスが作成されるたびにクラスフィールド「count」をインクリメントして、インスタンスの総数を追跡
		Person.count++;
	}

	// フルネームを返すメソッド
	public String fullName() {
		return this.firstName + this.lastName;
	}

	// フルネームと年齢を表示するメソッド
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です\n");
	}

	// BMI（Body Mass Index）を計算するメソッド
	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	public static void printCount() {
		// クラスメソッドでインスタンスの総数を表示
		System.out.println("合計" + Person.count + "人です");
	}
}