package junit_test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import junit.Calculation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Calculationクラスのテストクラス。
 *
 * JUnit4を使用し各メソッドのテストを行う。
 * @author answer
 *
 */
public class CalculationTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * {@link Calculation#sum(int, int)}のためのテストメソッド。
	 * 引数に渡す値は30、20とする。
	 */
	@Test
	public void sumTest() {
		int sum = Calculation.sum(30, 20);
		assertThat(50, is(sum));
	}

	/**
	 * {@link Calculation#sub(int, int)}のためのテストメソッド。
	 * 引数に渡す値は10、5とする。
	 */
	@Test
	public void subTest() {
		Calculation calc = new Calculation();
		int sub = calc.sub(10, 5);
		assertThat(5, is(sub));
	}

	/**
	 * {@link Calculation#mutiply()}のためのテストメソッド。
	 * 引数に渡す値は30、5とする。
	 */
	@Test
	public void multiply() {
		Calculation calc = new Calculation(30, 5);
		int mul = calc.mutiply();
		assertThat(150, is(mul));
	}

	/**
	 * {@link Calculation#divide()}のためのテストメソッド。
	 * 引数に渡す値は10、2とする。
	 */
	@Test
	public void divide() {
		Calculation calc = new Calculation(10, 2);
		double div = calc.divide();
		assertThat(5.0, is(div));
	}

	/**
	 * {@link Calculation#isEvenNumber(int)}のためのテストメソッド。
	 * 引数に渡す値は奇数、偶数それぞれ一回ずつ。
	 */
	@Test
	public void isEvenNumberTest() {
		Calculation calc = new Calculation();
		int odd = 3;
		int even = 4;
		assertThat(false, is(calc.isEvenNumber(odd)));
		assertThat(true, is(calc.isEvenNumber(even)));
	}

	/**
	 * {@link Calculation#average(int[])}のためのテストメソッド。
	 * 引数に渡す値はint型の配列、値は{20,40,90}の三要素とする。
	 */
	@Test
	public void averageTest() {
		Calculation calc = new Calculation();
		int[] array = { 20, 40, 90 };
		assertThat(50.0, is(calc.average(array)));
	}

}
