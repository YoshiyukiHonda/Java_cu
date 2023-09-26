package main;

import java.util.Scanner;

import animal.CustomAnimal;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// ユーザーから入力を受け取る
		String input = scanner.nextLine();
		scanner.close();

		// 入力された文字列をカンマで分割し、動物データを取得
		String[] animalData = input.split(",");

		// 動物データを処理するループ
		for (String data : animalData) {
			String[] parts = data.split(":");

			// 動物データが名前、体長、速度の3つの要素を持つかを確認
			if (parts.length == 3) {
				// 名前
				String name = parts[0];
				// 体長
				double length = Double.parseDouble(parts[1]);
				// 速度
				int speed = Integer.parseInt(parts[2]);

				// CustomAnimalクラスを使用して動物情報を生成
				CustomAnimal animal = new CustomAnimal(name, length, speed);

				// 動物情報を表示
				animal.displayInfo();
			}
		}

	}

}