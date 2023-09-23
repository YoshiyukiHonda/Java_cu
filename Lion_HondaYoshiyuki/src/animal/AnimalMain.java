package animal;

public class AnimalMain {

	public static void main(String[] args) {
		// 動物情報を設定
		// AnimalLionクラスのインスタンスlionを生成し、引数を指定して初期化
		AnimalLion lion = new AnimalLion("ライオン", 2.1, 80);

		// 動物情報を出力
		// lionのprintAnimalInfoメソッドを呼び出して、ライオンの情報をコンソールに表示
		lion.printAnimalInfo();

	}

}