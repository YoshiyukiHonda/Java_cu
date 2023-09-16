package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 21; j++) {
				// 3桁で出力するために、printfメソッドを使用
				System.out.printf("%03d * %03d = %03d", j, i, (j * i));

				// 最終列以外に||を出力
				if (j !=20) {
					System.out.print("||");	
				}
			}
			// 行の終わりに改行
			System.out.println("");	
		}
	}

}