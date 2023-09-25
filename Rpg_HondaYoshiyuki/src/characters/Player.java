// スーパークラス: Player
package characters;

import java.util.Random;

public class Player {
	private String name;
	private int hp;
	private int mp;
	private int attack;
	private int agility;
	private int defense;

	// コンストラクタ
	public Player(String name) {
		if (name != "") {
			this.name = name;
		} else {
			// デフォルトの名前を設定
			this.name = "名無しの冒険者";
		}

		// ランダムな値でステータスを初期化
		this.hp = generateRandomStat();
		this.mp = generateRandomStat();
		this.attack = generateRandomStat();
		this.agility = generateRandomStat();
		this.defense = generateRandomStat();
	}

	// getterとsetter
	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	// ステータスをランダムに生成するメソッド
	private int generateRandomStat() {
		Random rand = new Random();
		return rand.nextInt(1000) + 1;
	}

	// ステータスを表示するメソッド
	public void displayStatus() {
		System.out.println("\nこんにちは「" + name + "」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + hp);
		System.out.println("MP：" + mp);
		System.out.println("攻撃力：" + attack);
		System.out.println("素早さ：" + agility);
		System.out.println("防御力：" + defense);
		System.out.println("\nさあ冒険に出かけよう！");
	}
}