package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// 問１ローカル変数として宣言
		// バイト型
		byte byteVar;

		// 短整数型
		short shortVar;

		// 整数型
		int intVar;

		// 長整数型
		long longVar;

		// 単精度浮動小数点数型
		float floatVar;

		// 倍精度浮動小数点数型
		double doubleVar;

		// 文字型
		char charVar;

		// 文字列型
		String stringVar;

		// ブーリアン型
		boolean booleanVar;

		// 問2ローカル変数の初期化
		// バイト型
		byteVar = 0;

		// 短整数型
		shortVar = 0;

		// 整数型
		intVar = 0;

		// 長整数型
		longVar = 0;

		// 単精度浮動小数点数型
		floatVar = 0.0F;

		// 倍精度浮動小数点数型
		doubleVar = 0.0;

		// 文字型
		charVar = '\u0000';

		// 文字列型
		stringVar = null;

		// ブーリアン型
		booleanVar = false;

		// 問３ローカル変数に値の代入
		// バイト型
		byteVar = 10;

		// 短整数型
		shortVar = 100;

		// 整数型
		intVar = 1000;

		// 長整数型
		longVar = 10000;

		// 単精度浮動小数点数型
		floatVar = 9.5F;

		// 倍精度浮動小数点数型
		doubleVar = 10.5;

		// 文字型
		charVar = 'a';

		// 文字列型
		stringVar = "ハロー";

		// ブーリアン型
		booleanVar = true;

		// 問４
		System.out.println(byteVar + shortVar + intVar + longVar);

		System.out.println(byteVar + byteVar);

		System.out.println(charVar + stringVar + booleanVar);

		// 数字を全て足す
		System.out.println(byteVar + shortVar + intVar + longVar + floatVar + doubleVar);

		// 小数点以外の数字を全てかける
		System.out.println(byteVar * shortVar * intVar * longVar);

		// 10.5割る100をする
		System.out.println(doubleVar / shortVar);

		// 10引く100をする
		System.out.println(byteVar - shortVar + "\n");

		// 問5 文字列型から整数型に変換
		String num="20";

		int num2 = Integer.parseInt(num);

		int num1 = 23;

		System.out.println("ハローJAVA" + (num2 + num1) + "\n");

		// 問6 ローカル変数に条件を代入		
		String name = "山田太郎";

		int age = 18;

		double height = 170.5;

		double weight = 62.2;

		String food = "寿司";

		System.out.println("「初めまして" + name + "です」");

		System.out.println("「年齢は" + age + "歳です」");

		System.out.println("「身長は" + height + "ｃｍです」");

		System.out.println("「体重は" + weight + "kgです」");

		System.out.println("「好きな食べ物は" + food + "です」" + "\n");

		// 問7 BMIの計算式		
		System.out.println("「ＢＭＩは" + String.format("%.1f",weight / ((height * height) / 10000)) + "です」" + "\n");

		// 問8 宣言した変数に再代入		
		name = "鈴木一郎";

		age = 24;

		height = 168.5;

		weight = 64.2;

		food = "オムライス";

		System.out.println("初めまして" + name + "です");

		System.out.println("年齢は" + age + "歳です");

		System.out.println("身長は" + height + "ｃｍです");

		System.out.println("体重は" + weight + "kgです");

		System.out.println("好きな食べ物は" + food + "です");

		System.out.println("ＢＭＩは" + String.format("%.1f",weight / ((height * height) / 10000)) + "です" + "\n");

		// 問9 和算で自己代入		
		name = "鈴木一郎";

		age = 24;
		age += 24;

		height = 168.5;
		height += 168.5;

		weight = 64.2;
		weight += 64.2;

		food = "オムライス";

		System.out.println("初めまして" + name + "です");

		System.out.println("年齢は" + age + "歳です");

		System.out.println("身長は" + height + "ｃｍです");

		System.out.println("体重は" + weight + "kgです");

		System.out.println("好きな食べ物は" + food + "です");

		System.out.println("ＢＭＩは" + String.format("%.1f",weight / ((height * height) / 10000)) + "です" + "\n");

		// 問10 25歳以上ならtrueが出力		
		age = 24;
		boolean isAbove25 = age >= 25;

		System.out.println(isAbove25 + "\n");

		// 問11 年齢・身長・体重を文字列型に型変換し繋げて出力	
		height = 168.5;
		weight = 64.2;

		String age1 = Integer.toString(age);

		String height1 = String.valueOf(height);

		String weight1 = String.valueOf(weight);

		System.out.println(age1 + height1 + weight1 + "\n");

		// 問12 年齢・身長を文字列型から整数型に変換		
		int numage = Integer.parseInt(age1);

		int numheight = (int)Double.parseDouble(height1);

		System.out.println(numage);

		System.out.println(numheight + "\n");

		// 問13 年齢が25歳以上または身長が160センチ以上の条件をチェック
		boolean result = age >= 25 || height >= 160;

		// 結果を出力
		System.out.println(result);
	}

}
