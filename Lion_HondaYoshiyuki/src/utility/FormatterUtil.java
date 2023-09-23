package utility;

public class FormatterUtil {
	// クラス内の静的メソッド(formatDouble)を宣言
	public static String formatDouble(double value) {
		// フォーマットされた文字列を返す（小数点以下1桁まで表示）
		return String.format("%.1f", value);
	}

}