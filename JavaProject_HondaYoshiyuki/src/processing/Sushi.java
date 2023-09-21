package processing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sushi {
	// インスタンス変数の宣言
	String message0;
	String message1;
	String message2;
	String message3;
	String message4;
	String message5;
	String currentDate;

	// コンストラクタ（クラスのインスタンスが作成されたときに実行されるメソッド）
	public Sushi() {
		// インスタンス変数への初期値の設定
		this.message0 = "こんにちは！";
		this.message1 = "日本";
		this.message2 = "寿司";
		this.message3 = "うまい";
		this.message4 = "和食";
		this.message5 = "今";

		// 現在の日時を取得してフォーマットし、インスタンス変数に格納
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		this.currentDate = dateFormat.format(new Date());
	}

	// メッセージを表示するメソッド
	public void printMessages() {
		// メッセージ0とメッセージ1を組み合わせて表示
		System.out.println(this.message0 + "ここは" + this.message1 + "です！");

		// メッセージ2とメッセージ3を組み合わせて表示
		System.out.println("この" + this.message2 + "は" + this.message3);

		// メッセージ2とメッセージ4を組み合わせて表示
		System.out.println(this.message2 + "は" + this.message4 + "です");

		// メッセージ5と現在の日時を組み合わせて表示
		System.out.println(this.message5 + "の現在日時は" + this.currentDate + "です");

	}


}