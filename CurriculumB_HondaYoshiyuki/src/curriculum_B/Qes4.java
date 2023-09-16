package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				// 2桁で出力するために、printfメソッドを使用
				System.out.printf("%02d * %02d = %02d", i, j, (i * j));

				// 最終列以外に||を出力
				if(j !=9) {
					System.out.print("||");	
				}
			}
			// 行の終わりに改行
			System.out.println("");	
		}
	}

}