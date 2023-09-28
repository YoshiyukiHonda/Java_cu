package sorting;

import java.util.Scanner;

import data.Prefecture;

public class Main {

	public static void main(String[] args) {
		// 都道府県データの配列を作成
		Prefecture[] prefectures = {
				new Prefecture("北海道", "札幌市", 83424.0),
				new Prefecture("青森県", "青森市", 9646.0),
				new Prefecture("岩手県", "盛岡市", 15275.0),
				new Prefecture("宮城県", "仙台市", 7282.0),
				new Prefecture("秋田県", "秋田市", 11638.0),
				new Prefecture("山形県", "山形市", 9323.0),
				new Prefecture("福島県", "福島市", 13784.0),
				new Prefecture("茨城県", "水戸市", 6097.0),
				new Prefecture("栃木県", "宇都宮市", 6408.0),
				new Prefecture("群馬県", "前橋市", 6362.0),
				new Prefecture("埼玉県", "さいたま市", 3798.0)
		};

		Scanner scanner = new Scanner(System.in);
		int[] indices = null;

		// 有効な値が入力されるまで繰り返し入力を受け付ける
		while (indices == null) {
			System.out.println("数字を入力してください（複数の数字はカンマで区切ってください）");
			String input = scanner.nextLine();
			String[] inputTokens = input.split(",");
			indices = new int[inputTokens.length];

			// 入力された数字を整数配列に変換
			boolean validInput = true;
			for (int i = 0; i < inputTokens.length; i++) {
				try {
					indices[i] = Integer.parseInt(inputTokens[i].trim());
					if (indices[i] < 0 || indices[i] >= prefectures.length) {
						validInput = false;
						break;
					}
				} catch (NumberFormatException e) {
					validInput = false;
					break;
				}
			}

			// 無効な入力を検出した場合、indicesをリセットして再試行します。
			if (!validInput) {
				System.out.println("\n無効な入力が含まれています。数字以外の値または無効なインデックスを含む場合、再入力してください。");
				indices = null;
			}
		}

		// NULLチェックと昇順ソート
		System.out.println("\n昇順ソート");
		for (int index : indices) {
			Prefecture pref = prefectures[index];
			System.out.println(pref);
		}

		// NULLチェックと降順ソート
		System.out.println("\n降順ソート");
		for (int i = indices.length - 1; i >= 0; i--) {
			int index = indices[i];
			Prefecture pref = prefectures[index];
			System.out.println(pref);
		}

		// Scannerを閉じる
		scanner.close();
	}
}
