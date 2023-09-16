package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// ユーザー名を初期化
		String userName = null;

		while (true) {
			// ユーザー名を入力
			userName = scanner.nextLine();

			// ユーザー名の文字数チェック
			if (userName == null || userName.length() == 0) {
				System.out.println("「名前を入力してください」");
			} else if (userName.length() > 10) {
				System.out.println("「名前を10文字以内にしてください」");
			} else if (!userName.matches("^[a-zA-Z0-9]+$")) {
				System.out.println("「半角英数字のみで名前を入力してください」");
			} else {
				System.out.println("ユーザー名「" + userName + "」を登録しました");

				// 正常な値が入力された場合、ループを終了
				break;
			}
		}

		// じゃんけんを行った回数のカウント
		int totalAttempts = 0;

		// 乱数の準備
		Random random = new Random();

		while (true) {
			// ユーザーの手をランダムに選択
			int userChoice = random.nextInt(3);

			// コンピュータの手をランダムに選択
			int computerChoice = random.nextInt(3);

			// ユーザーとコンピュータの手を表示
			System.out.println(userName + "の手は「" + getChoiceName(userChoice) + "」");
			System.out.println("相手の手は「" + getChoiceName(computerChoice) + "」");

			// じゃんけんの勝敗を判定
			int result = ( 3 + userChoice - computerChoice) % 3;

			if (result == 0) {
				// あいこの場合
				System.out.println("DRAW あいこ もう一回しましょう！" + "\n");
			} else if (result == 1) {
				if (computerChoice == 0) {
					// グーで負けた場合
					System.out.println("俺の勝ち！");
					System.out.println("負けは次につながるチャンスです！");
					System.out.println("ネバーギブアップ！" + "\n");
				} else if (computerChoice == 1) {
					// チョキで負けた場合
					System.out.println("俺の勝ち！");
					System.out.println("たかがじゃんけん、そう思ってないですか？");
					System.out.println("それやったら次も、俺が勝ちますよ" + "\n");
				} else if (computerChoice == 2) {
					// パーで負けた場合
					System.out.println("俺の勝ち！");
					System.out.println("なんで負けたか、明日まで考えといてください。");
					System.out.println("そしたら何かが見えてくるはずです" + "\n");
				}
			} else {
				// ユーザーの勝ち
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて" + "\n");

				// 勝利した場合、ループを終了
				break;
			}

			totalAttempts++;
		}

		// じゃんけんを行った回数を表示
		System.out.println("じゃんけんを行った回数は" + (totalAttempts + 1) + "回です。");

		// Scannerを閉じる
		scanner.close();
	}

	// 選択肢の番号から手の名前を取得
	public static String getChoiceName(int choice) {
		switch (choice) {
		case 0:
			return "グー";
		case 1:
			return "チョキ";
		case 2:
			return "パー";
		default:
			return "無効な選択";
		}
	}
}