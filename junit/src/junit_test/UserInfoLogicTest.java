package junit_test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import junit.UserInfoLogic;
import junit.bean.UserInfoDto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * UserInfoLogicクラスのテストクラス。
 *
 * JUnit4を使用し各メソッドのテストを行う。
 * @author answer
 *
 */
public class UserInfoLogicTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * {@link UserInfoLogic#selectUserInfo(UserInfoDto)}のためのテストメソッド。
	 * 全分岐を網羅し、例外のテストも行う。
	 */


	/**
	 *  {@link UserInfoLogic#selectUserInfo(UserInfoDto)}の例外のためのテストメソッド。
	 */


	/**
	 * {@link UserInfoLogic#selectAllUserInfo()}のためのテストメソッド。
	 * 全分岐を網羅すること。
	 * 例外、検索結果がないなどのテストは行わなくてよい。
	 */


	/**
	 * {@link UserInfoLogic#selectStationUserInfo(List)}のためのテストメソッド。
	 * 全分岐を網羅し、例外のテストも行う。
	 * 検索結果がない場合などのテストも実施する。
	 */


	/**
	 * {@link UserInfoLogic#selectStationUserInfo(List)}の例外のためのテストメソッド。
	 * 引数がnullの場合
	 */


	/**
	 * {@link UserInfoLogic#selectStationUserInfo(List)}の例外のためのテストメソッド。
	 * 引数が空のリストの場合
	 */

}