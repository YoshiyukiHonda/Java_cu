package introduce;

public class Person {
	// 姓を表すフィールド
	private String firstName;
	private String lastName;

	// 年齢を表すフィールド
	private int age;

	// 身長を表すフィールド
	private double height;

	// 体重を表すフィールド
	private double weight;

	// 合計人数のための静的フィールド
	private static int totalCount = 0;

	// 人物オブジェクトのコンストラクタ
	Person(String firstName, String lastName, int age, double height, double weight) {
		// 姓を初期化
		this.firstName = firstName;
		this.lastName = lastName;

		// 年齢を初期化
		this.age = age;

		// 身長を初期化
		this.height = height;

		// 体重を初期化
		this.weight = weight;

		// 人数をカウントアップ
		totalCount++;
	}

	// フルネームを取得するメソッド
	public String fullName() {
		// 姓と名前を連結してフルネームを返す
		return firstName + lastName;
	}

	// インスタンスメソッド：BMIを計算する
	// BMIを計算するメソッド
	double bmi() {
		return weight / (height * height);
	}

	// インスタンスメソッド：情報を出力する
	// 人物情報を出力するメソッド
	void print() {
		// フルネームを出力
		System.out.println("名前は" + this.fullName() + "です");

		// 年齢を出力
		System.out.println("年は" + this.age + "です");

		// BMIを小数点第1位まで出力
		System.out.println("BMIは" + String.format("%.1f", this.bmi()) + "です\n");
	}

	// 合計人数を取得する静的メソッド
	static int getTotalCount() {
		// 合計人数を返す
		return totalCount;
	}

	// インスタンスメソッドbuyを定義
	public void buy(Car car) {
		// 車の所有者を設定
		car.setOwner(this.fullName());

		// 車の購入情報を出力
		System.out.println(car.getOwner() + "が購入しました");
	}

	public void buy(Bicycle bicycle) {
		// 自転車の所有者を設定
		bicycle.setOwner(this.fullName());

		// 自転車の購入情報を出力
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}
