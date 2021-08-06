package co_test.jp;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import co.jp.Sample;

public class SampleTest {

	@Test
	public void testUnitSample1() {

		Sample ins = new Sample();
		int re = ins.unitSample(2);
		assertEquals(1, re);
		assertThat(4, is(re));
		int three = ins.unitSample(3);
		assertThat(9, is(three));
		int other = ins.unitSample(4);
		assertThat(-1, is(other));
		beforeAfter("2, 3, 4", "4, 9, -1");
	}

	void assertUnitSample(int num, int expected) {
		Sample ins = new Sample();
		int re = ins.unitSample(num);
		assertEquals(expected, re);
	}

	void beforeAfter(String input, String expected_output) {
		String[] inputArr = input.replaceAll(",", "")
			.split(" ");
		List<Integer> iList = Arrays.stream(inputArr)
			.map(i -> Integer.valueOf(i))
			.collect(Collectors.toList());

		for (String is : inputArr) {

		}
		//		int[] input = new int[3];
		//		for (int i = 0; i < input.length; i++) {
		//			int args = input[i];
		//			int expect = expected[i];
		//			assertUnitSample(args, expect);
		//		}
	}

	//	@Test
	//	public void testUnitSample2() {
	//
	//		Sample ins = new Sample();
	//		int re = ins.unitSample(3);
	//		assertThat(9, is(re));
	//	}

}
