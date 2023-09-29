package introduce;

//Mainクラスの定義
public class Main {
	// メインメソッド
	public static void main(String[] args) {
		// Personクラスのインスタンスを生成し、情報を設定
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		// person1の情報を表示
		person1.print();

		// クラスメソッドを呼び出して合計人数を表示
		Person.printTotalPersons();
	}
}
