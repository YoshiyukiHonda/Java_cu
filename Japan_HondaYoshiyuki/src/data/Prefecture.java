package data;

public class Prefecture {
	// 都道府県名を格納するフィールド
	private String name;

	// 県庁所在地を格納するフィールド
	private String capital;

	// 面積を格納するフィールド
	private double area;

	// コンストラクタ: 都道府県名、県庁所在地、面積を受け取り、フィールドに設定する
	public Prefecture(String name, String capital, double area) {
		this.name = name;
		this.capital = capital;
		this.area = area;
	}

	// 都道府県名を取得するゲッターメソッド
	public String getName() {
		return name;
	}

	// 県庁所在地を取得するゲッターメソッド
	public String getCapital() {
		return capital;
	}

	// 面積を取得するゲッターメソッド
	public double getArea() {
		return area;
	}

	// 文字列形式で都道府県情報を返すメソッド
	public String toString() {
		return "\n都道府県名：" + name + "\n県庁所在地：" + capital + "\n面積：" + area + "km2";
	}
}
