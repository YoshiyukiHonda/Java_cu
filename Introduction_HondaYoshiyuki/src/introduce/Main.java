package introduce;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);

		// インスタンスの情報を表示
		person1.print();

		Person person2 = new Person("山田", "花子", 22, 1.5, 40);

		// 別のインスタンスの情報を表示
		person2.print();

		// クラスメソッドを呼び出して、インスタンスの総数を表示
		Person.printCount();
	}
}