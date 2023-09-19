package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	// "printHello"関数は指定された回数だけ指定されたテキストを出力します。
	public static void printHello(int num, String text) {
		for (int i = 0; i < num; i++) {
			System.out.println(text + "\n");
		}
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	// "multiply"関数は2つの整数を掛け算し、その結果を出力します。
	public static void multiply(int a, int b) {
		int result = a * b;
		System.out.println(result + "\n");
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	// "printArray"関数は整数の配列を受け取り、各要素を出力します。
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.println(num);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	// "add"関数は2つの倍精度浮動小数点数を足し算し、その結果を出力します。
	public static void add(double a, double b) {
		double result = a + b;
		System.out.println(result + "\n");
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	// "generateRandomArray"関数は指定された数だけ乱数を生成し、それらの乱数を含む配列を返します。
	public static int[] generateRandomArray(int count) {
		int[] randomArray = new int[count];
		Random rand = new Random();

		for (int i = 0; i < count; i++) {
			int randomNum = rand.nextInt(100) + 1; // 1から100までのランダムな数
			System.out.println(randomNum);
			randomArray[i] = randomNum;
		}
		return randomArray;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	// "printAverage"関数は整数の配列の平均値を計算し、その結果を出力します。
	public static void printAverage(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		double average = (double) sum / arr.length;
		System.out.println(average + "\n");
	}


	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	// "isAbove50"関数は整数の配列の平均値が50以上であるかどうかを判定します。
	public static boolean isAbove50(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		double average = (double) sum / arr.length;
		return average >= 50;
	}


	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		// Q1
		// "printHello"関数を呼び出してテキストを出力します。
		printHello(1, "Hello JavaSE 11");

		// Q2
		// "multiply"関数を呼び出して2つの整数の積を出力します。
		multiply(6, 9);

		// Q3
		// 整数の配列を作成し、"printArray"関数を呼び出して配列の要素を出力します。
		int[] numbers = { 1, 2, 3, 4, 5 };
		printArray(numbers);
		System.out.println("\n");

		// Q4
		// "add"関数を呼び出して2つの倍精度浮動小数点数の和を出力します。
		add(6.9, 8.1);

		// Q5
		// "generateRandomArray"関数を呼び出して乱数を生成し、それを含む配列を出力します。
		int[] randomNumbers = generateRandomArray(3);
		System.out.println("\n");

		// Q6
		// "printAverage"関数を呼び出して乱数の平均値を出力します。
		printAverage(randomNumbers);

		// Q7
		// "isAbove50"関数を呼び出して平均値が50以上かどうかを判定し、結果を出力します。
		boolean above50 = isAbove50(randomNumbers);
		System.out.println(above50);
	}

}