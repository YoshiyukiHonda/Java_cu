package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// スキャナーオブジェクトの作成
		Scanner scanner = new Scanner(System.in);

		// 生徒の人数を入力するプロンプトの表示
		System.out.print("生徒の人数を入力してください（2以上）: ");
		int numStudents = scanner.nextInt();

		// 2人以上の生徒が必要な条件を確認
		while (numStudents < 2) {
			System.out.println("2人以上の生徒が必要です。もう一度入力してください。");
			System.out.print("生徒の人数を入力してください（2以上）: ");
			numStudents = scanner.nextInt();
		}

		// 各教科の点数を格納するための配列の初期化
		double[] englishScores = new double[numStudents];
		double[] mathScores = new double[numStudents];
		double[] scienceScores = new double[numStudents];
		double[] socialScores = new double[numStudents];

		// 各生徒の点数を入力
		for (int i = 0; i < numStudents; i++) {
			System.out.print((i + 1) + "人目の『英語』の点数を入力してください: ");
			englishScores[i] = scanner.nextDouble();
			System.out.print((i + 1) +"人目の『数学』の点数を入力してください: ");
			mathScores[i] = scanner.nextDouble();
			System.out.print((i + 1) +"人目の『理科』の点数を入力してください: ");
			scienceScores[i] = scanner.nextDouble();
			System.out.print((i + 1) +"人目の『社会』の点数を入力してください: ");
			socialScores[i] = scanner.nextDouble();
			System.out.print("\n");
		}

		// スキャナーをクローズ
		scanner.close();

		// 各生徒の平均点を計算して出力
		System.out.println();
		for (int i = 0; i < numStudents; i++) {
			double average = (englishScores[i] + mathScores[i] + scienceScores[i] + socialScores[i]) / 4.0;
			System.out.printf((i + 1) + "人目の平均点は%.2f点です。\n", average);
		}

		// 各教科の平均点を計算して出力
		System.out.println();
		printSubjectAverage("英語", englishScores);
		printSubjectAverage("数学", mathScores);
		printSubjectAverage("理科", scienceScores);
		printSubjectAverage("社会", socialScores);

		// 全体の平均点を計算して出力
		System.out.println();
		double overallAverage = calculateOverallAverage(englishScores, mathScores, scienceScores, socialScores);
		System.out.printf("全体の平均点は%.2f点です。\n", overallAverage);
	}

	private static void printSubjectAverage(String subject, double[] scores) {
		// 科目ごとの平均点を計算して表示するメソッド
		double subjectAverage = calculateAverage(scores);
		System.out.printf("%sの平均点は%.2f点です。\n", subject, subjectAverage);
	}

	private static double calculateAverage(double[] scores) {
		// スコアの平均値を計算するメソッド
		double sum = 0.0;
		for (double score : scores) {
			sum += score;
		}
		return sum / scores.length;
	}

	private static double calculateOverallAverage(double[] englishScores, double[] mathScores, double[] scienceScores, double[] socialScores) {
		// すべての科目の平均点の平均値を計算するメソッド
		double sum = calculateAverage(englishScores) + calculateAverage(mathScores) + calculateAverage(scienceScores) + calculateAverage(socialScores);
		return sum / 4.0;
	}

}