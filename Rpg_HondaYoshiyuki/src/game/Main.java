// メインクラス: Main
package game;

import java.util.Scanner;

import characters.Player;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 名前を入力
		System.out.print("名前を入力してください: ");
		String playerName = scanner.nextLine();

		// Playerクラスのインスタンスを生成し、コンストラクタでランダムなステータスを生成
		Player player = new Player(playerName);

		// ステータスを表示
		player.displayStatus();

		// Scannerを閉じる
		scanner.close();
	}

}