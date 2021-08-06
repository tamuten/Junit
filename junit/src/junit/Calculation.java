package junit;

/**
 * 計算クラス
 * @author kurosawa
 *
 */
public class Calculation {

	/**
	 * 数値1
	 */
	private int num1;

	/**
	 * 数値2
	 */
	private int num2;

	/**
	 * コンストラクタ。
	 */
	public Calculation() {
	}

	/**
	 * コンストラクタ。
	 * @param num1 数値1
	 * @param num2 数値2
	 */
	public Calculation(int num1, int num2) {

		this.num1 = num1;
		this.num2 = num2;

	}

	/**
	 * 引数で渡された数値を元に足し算を行い結果を返却する。
	 * @param num1 数値1
	 * @param num2 数値2
	 * @return 足し算結果
	 */
	public static int sum(int num1, int num2) {

		return num1 + num2;

	}

	/**
	 * 引数で渡された数値を元に引き算をして結果を返却する。
	 * @param num1 数値1
	 * @param num2 数値2
	 * @return 引き算結果
	 */
	public int sub(int num1, int num2) {

		return num1 - num2;

	}

	/**
	 * 掛け算をして結果を返却する。
	 * @return 掛け算結果
	 */
	public int mutiply() {

		return num1 * num2;
	}

	/**
	 * 割り算をして結果を返却する。
	 * @return 割り算結果
	 */
	public double divide() {

		return num1 / num2;

	}

	/**
	 * 引数で渡された数値が偶数か判別し結果を返却する。
	 * @param num 数値
	 * @return 判別した結果 偶数:true/奇数:false
	 */
	public boolean isEvenNumber(int num) {

		// 結果格納変数
		boolean result;

		// 偶数か判定する
		if(num % 2 == 0) {
			// 偶数の場合結果にtrueを格納
			result = true;
		} else {
			// 奇数の場合結果にfalseを格納
			result = false;
		}

		return result;
	}

	/**
	 * 引数で渡された数値の平均値を算出して返却する。
	 * @param array 数値
	 * @return 平均値
	 */
	public double average(int[] array) {

		// 合計値格納変数
		int sum = 0;

		// 合計値を求める
		for(int i = 0;i < array.length;i++) {
			sum += array[i];
		}

		// 平均値を算出して返却
		return sum / array.length;

	}

}
