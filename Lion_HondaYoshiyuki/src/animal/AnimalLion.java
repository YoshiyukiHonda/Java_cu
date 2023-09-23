package animal;

//FormatterUtilクラスをインポート
import utility.FormatterUtil;

public class AnimalLion {
	// インスタンス変数の宣言
	private String animalName;
	private double bodyLength;
	private int speed;

	// コンストラクタ（クラスのインスタンスが作成されたときに実行されるメソッド）
	public AnimalLion(String animalName, double bodyLength, int speed) {
		// インスタンス変数に引数の値を設定
		this.animalName = animalName;
		this.bodyLength = bodyLength;
		this.speed = speed;
	}

	// 動物の情報を表示するメソッド
	public void printAnimalInfo() {
		// 動物名、体長、速度を表示
		System.out.println("動物名: " + this.animalName);
		System.out.println("体長: " + FormatterUtil.formatDouble(this.bodyLength) + "m");
		System.out.println("速度: " + this.speed + "km/h");
	}

	// GetterとSetterメソッドを定義
	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public double getBodyLength() {
		return bodyLength;
	}

	public void setBodyLength(double bodyLength) {
		this.bodyLength = bodyLength;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}