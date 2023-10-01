package introduce;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("本田", "嘉章", 31, 1.6, 60);
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);

		// インスタンスの情報を出力
		//person1.print();
		//person2.print();

		// 購入処理を実行
		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		//ownerを設定
		car.setOwner(person1.fullName());
		bicycle.setOwner(person2.fullName());

		// 乗り物を購入
		person1.buy(car);
		person2.buy(bicycle);

		//System.out.println("\n合計" + Person.getTotalCount() + "人です");

	}

}