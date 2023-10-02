package introduce;

public class Main {

	public static void main(String[] args) {
		// Personクラスのインスタンスを生成
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		// インスタンスの情報を表示
		person1.print();

		// 別のPersonクラスのインスタンスを生成
		Person person2 = new Person("山田花子", 22, 1.5, 40);

		// インスタンスの情報を表示
		person2.print();

		// インスタンスの総数を表示
		Person.printCount();

		System.out.println("\n合計" + Person.getTotalCount() + "人です");

	}

}