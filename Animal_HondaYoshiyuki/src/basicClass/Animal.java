package basicClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		// Dogクラスのインスタンスを生成し、myDog変数に格納
		Dog myDog = new Dog();

		// myDogの名前を表示
		System.out.println("動物の名前は: " + myDog.name);

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		// Dogクラスの別のインスタンスを生成し、myDog1変数に格納
		Dog myDog1 = new Dog(1);

		// myDog1の動物の数を表示
		System.out.println("動物の数は: " + myDog1.numberOfAnimals);

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// 現在の日時をフォーマットするためのSimpleDateFormatオブジェクトを作成
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");

		// 現在の日時を取得し、指定されたフォーマットで文字列に変換
		String formattedDate = sdf.format(new Date());

		// フォーマットされた現在の日時を表示
		System.out.println("現在の日時は: " + formattedDate);

	}

}