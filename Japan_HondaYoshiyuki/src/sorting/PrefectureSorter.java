package sorting;

import data.Prefecture;

public class PrefectureSorter {
	// 昇順で都道府県データをソートして表示するメソッド
	public static void sortAscending(Prefecture[] prefectures, int[] indices) {
		// インデックスを昇順にソート (バブルソートアルゴリズムを使用)
		int n = indices.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (indices[j] > indices[j + 1]) {
					// インデックスを交換
					int temp = indices[j];
					indices[j] = indices[j + 1];
					indices[j + 1] = temp;
				}
			}
		}

		// ソートされたインデックスに基づいて都道府県データを表示
		for (int index : indices) {
			System.out.println(prefectures[index]);
		}
	}

	// 降順で都道府県データをソートして表示するメソッド
	public static void sortDescending(Prefecture[] prefectures, int[] indices) {
		// インデックスを降順にソート (バブルソートアルゴリズムを使用)
		int n = indices.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (indices[j] < indices[j + 1]) {
					// インデックスを交換
					int temp = indices[j];
					indices[j] = indices[j + 1];
					indices[j + 1] = temp;
				}
			}
		}

		// ソートされたインデックスに基づいて都道府県データを表示
		for (int index : indices) {
			System.out.println(prefectures[index]);
		}
	}
}
