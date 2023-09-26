package animal;

public class AnimalInfo {
	private String name;
	private double length;
	private int speed;
	private String scientificName;

	// コンストラクタ：動物情報を初期化
	public AnimalInfo(String name, double length, int speed) {
		// 名前を設定
		setName(name);

		// 体長を設定
		setLength(length);

		// 速度を設定
		setSpeed(speed);

		// 学名を取得
		this.scientificName = getScientificName();
	}

	// 名前を取得するゲッターメソッド
	public String getName() {
		return name;
	}

	// 名前を設定するセッターメソッド
	public void setName(String name) {
		if (name != "") {
			// 名前が空文字列でない場合、設定。そうでなければデフォルトの名前を設定。
			this.name = name;
		} else {
			// デフォルトの名前を設定
			this.name = "不明";
		}
	}

	// 体長を取得するゲッターメソッド
	public double getLength() {
		return length;
	}

	// 体長を設定するセッターメソッド
	public void setLength(double length) {
		// 体長が0以上の場合、設定。負の値は設定しない。
		if (length >= 0) {
			this.length = length;
		} else {
			// 負の値は設定しない
			this.length = 0;
		}
	}

	// 速度を取得するゲッターメソッド
	public int getSpeed() {
		return speed;
	}

	// 速度を設定するセッターメソッド
	public void setSpeed(int speed) {
		// 速度が0以上の場合、設定。負の値は設定しない。
		if (speed >= 0) {
			this.speed = speed;
		} else {
			// 負の値は設定しない
			this.speed = 0;
		}
	}

	// 学名を取得するメソッド
	public String getScientificName() {
		// 動物の名前に基づいて学名を返す
		switch (name) {
		case "ライオン":
			return "パンテラ レオ";
		case "ゾウ":
			return "ロキソドンタ・サイクロティス";
		case "パンダ":
			return "アイルロポダ・メラノレウカ";
		case "チンパンジー":
			return "パン・トゥログロディテス";
		case "シマウマ":
			return "チャップマンシマウマ";
		case "インコ":
			return "不明";
		default:
			return "不明";
		}
	}

	// 動物情報を表示するメソッド
	public void displayInfo() {
		System.out.println("\n動物名：" + getName());
		System.out.println("体長：" + getLength() + "m");
		System.out.println("速度：" + getSpeed() + "km/h");
		System.out.println("学名：" + scientificName);
	}

}