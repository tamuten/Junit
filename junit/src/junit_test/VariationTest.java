package junit_test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import junit.Variation;
import junit.bean.ItemDataBean;
import junit.bean.MemberBean;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Variationクラスのテストクラス。
 *
 * JUnit4を使用し各メソッドのテストを行う。
 * @author answer
 *
 */
public class VariationTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * {@link Variation#sortData(int[])}のためのテストメソッド。
	 * 引数で渡す値はint型の配列、値は{31, 41, 59, 26, 53, 58. 97, 93, 23, 84}とする。
	 *
	 * 尚、このメソッドにはバグが含まれているためテストを実行するとエラーになる。
	 * デバッグ機能などを使用してどこにバグがあるのか発見し、修正したのちに再びテストを行う。
	 *
	 */
	@Test
	public void sortDataTest() {
		int[] array = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
		Variation var = new Variation();
		var.sortData(array);

	}

	/**
	 * {@link Variation#isLeapYear(int)}のためのテストメソッド。
	 * 引数で渡す値は年数（数値）、値は任意でよいが全分岐を網羅すること。
	 */
	@Test
	public void isLeapYearTest() {
		Variation var = new Variation();
		assertThat(false, is(var.isLeapYear(3)));
		assertThat(true, is(var.isLeapYear(4)));
		assertThat(false, is(var.isLeapYear(5)));
		assertThat(false, is(var.isLeapYear(99)));
		assertThat(false, is(var.isLeapYear(100)));
		assertThat(false, is(var.isLeapYear(101)));
		assertThat(false, is(var.isLeapYear(399)));
		assertThat(true, is(var.isLeapYear(400)));
		assertThat(false, is(var.isLeapYear(401)));
	}

	/**
	 * {@link Variation#removeMemberList(List)}のためのテストメソッド。
	 * 引数で渡す値はリスト、MemberBeanクラスを格納する。
	 * 全分岐を網羅し、ポイントの境界値もテストする。
	 */

	/**
	 * {@link Variation#removeMemberList(List)}の例外のためのテストメソッド。
	 */
	@Test(expected = IllegalArgumentException.class)
	public void removeMemberListExceptionTest() {
		Variation var = new Variation();
		var.removeMemberList(null);
	}

	/**
	 * {@link Variation#isSaleFlag(ItemDataBean)}のためのテストメソッド。
	 * 引数で渡す値はItemDataBeanクラス。
	 * このメソッドはprivateメソッドだが直接呼出してテストを行う。
	 * privateメソッドを直接呼び出す方法は各自で調査すること。
	 */

	/**
	 * setSaleFlagのテストメソッド。
	 */

}
