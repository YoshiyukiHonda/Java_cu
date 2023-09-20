package basicClass;

public class Dog {

	// Q1：フィールドに動物の名前の変数を定義してください。
	// 犬の名前を格納する変数
	String name;

	// Q2：フィールドに動物の数の変数を定義してください。
	// 犬の数を格納する変数
	int numberOfAnimals;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	// デフォルトコンストラクタ
	public Dog() {
		// 犬の名前をデフォルト値 "犬" で初期化
		this.name = "犬";
	}

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	// パラメータつきコンストラクタ
	public Dog(int numberOfAnimals) {
		// 引数で渡された値で numberOfAnimals 変数を初期化
		this.numberOfAnimals = numberOfAnimals;
	}

}