package execution;

//processingパッケージ内のSushiクラスをインポート
import processing.Sushi;

public class Main {

	public static void main(String[] args) {
		// Sushiクラスのインスタンスを生成してsushi変数に格納
		Sushi sushi = new Sushi();

		// SushiクラスのprintMessagesメソッドを呼び出してメッセージを表示
		sushi.printMessages();

	}

}