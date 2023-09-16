package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// ランダムな台数を生成するためのRandomオブジェクト
		Random random = new Random();

		// 商品のリストを入力
		String input = scanner.nextLine();

		// 入力をカンマで分割
		String[] inputProducts = input.split("、");

		for (String inputProduct : inputProducts) {
			// 入力の前後の空白を取り除く
			String product = inputProduct.trim();
			int remainingCount = 0;

			switch (product) {
			case "テレビ":
			case "ディスプレイ":
				// ディスプレイが出た場合は、テレビの個数を計算して出力
				remainingCount = (product.equals("ディスプレイ")) ? 11 - random.nextInt(12) : random.nextInt(12);
				break;

			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				// 0から11までのランダムな値
				remainingCount = random.nextInt(12);
				break;

			default:
				System.out.println("『" + product + "』は指定の商品ではありません" + "\n");
				continue;
			}
			System.out.println(product + "の残り台数は" + remainingCount + "台です" + "\n");
		}

		// Scannerをクローズ
		scanner.close();
	}
}