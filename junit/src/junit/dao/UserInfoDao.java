package junit.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import junit.bean.UserInfoEntity;

/**
 * UserInfoDaoクラスのスタブ。
 * @author answer
 *
 */
public class UserInfoDao {

	/**
	 * 全ユーザー情報を検索し結果を返却する。
	 * @return 全ユーザー情報
	 * @throws SQLException DBエラー スタブではこのエラーは発生させられないのでテスト対象外とする
	 * また、検索結果がない場合などのテストも実施できないのでテスト対象外とする。
	 */
	public List<UserInfoEntity> selectAllUserInfo() throws SQLException {

		// 結果格納用のリスト
		List<UserInfoEntity> resultList = new ArrayList<UserInfoEntity>();

		// UserInfoEntityのインスタンス生成
		UserInfoEntity userInfoEntity1 = new UserInfoEntity();
		// データ作成１
		userInfoEntity1.setAge(30);
		userInfoEntity1.setEmploye_no(100);
		userInfoEntity1.setId(1);
		userInfoEntity1.setName("user1");
		userInfoEntity1.setPassword("aaaaaaa");
		userInfoEntity1.setSex(1);
		userInfoEntity1.setStation_name("営業");
		resultList.add(userInfoEntity1);

		// UserInfoEntityのインスタンス生成
		UserInfoEntity userInfoEntity2 = new UserInfoEntity();
		// データ作成２
		userInfoEntity2.setAge(23);
		userInfoEntity2.setEmploye_no(115);
		userInfoEntity2.setId(2);
		userInfoEntity2.setName("user2");
		userInfoEntity2.setPassword("bbbbbb");
		userInfoEntity2.setSex(0);
		userInfoEntity2.setStation_name("総務");
		resultList.add(userInfoEntity2);

		// UserInfoEntityのインスタンス生成
		UserInfoEntity userInfoEntity3 = new UserInfoEntity();
		// データ作成３
		userInfoEntity3.setAge(38);
		userInfoEntity3.setEmploye_no(101);
		userInfoEntity3.setId(3);
		userInfoEntity3.setName("user3");
		userInfoEntity3.setPassword("ccccccc");
		userInfoEntity3.setSex(1);
		userInfoEntity3.setStation_name("開発");
		resultList.add(userInfoEntity3);

		return resultList;
	}

	/**
	 * 引数で渡された所属部署名を元に該当するユーザー情報を検索し結果を返却する。
	 * @param stationNameList 所属部署名リスト
	 * @return ユーザー情報リスト
	 */
	public List<UserInfoEntity> selectStationUserInfo(List<String> stationNameList) throws SQLException {

		// 結果格納用のリスト
		List<UserInfoEntity> resultList = new ArrayList<UserInfoEntity>();

		// 検索時に例外が発生した場合
		if("検索例外".equals(stationNameList.get(0))) {
			throw new SQLException("検索例外");
		}

		// 検索結果０の場合
		if("検索０".equals(stationNameList.get(0))) {
			return resultList;
		}

		// UserInfoEntityのインスタンス生成
		UserInfoEntity userInfoEntity1 = new UserInfoEntity();
		// データ作成１
		userInfoEntity1.setAge(30);
		userInfoEntity1.setEmploye_no(100);
		userInfoEntity1.setId(1);
		userInfoEntity1.setName("user1");
		userInfoEntity1.setPassword("aaaaaaa");
		userInfoEntity1.setSex(1);
		userInfoEntity1.setStation_name("営業");
		resultList.add(userInfoEntity1);

		// UserInfoEntityのインスタンス生成
		UserInfoEntity userInfoEntity7 = new UserInfoEntity();
		// データ作成７
		userInfoEntity7.setAge(28);
		userInfoEntity7.setEmploye_no(118);
		userInfoEntity7.setId(7);
		userInfoEntity7.setName("user7");
		userInfoEntity7.setPassword("wwwwwww");
		userInfoEntity7.setSex(0);
		userInfoEntity7.setStation_name("営業");
		resultList.add(userInfoEntity7);

		// UserInfoEntityのインスタンス生成
		UserInfoEntity userInfoEntity8 = new UserInfoEntity();
		// データ作成８
		userInfoEntity8.setAge(33);
		userInfoEntity8.setEmploye_no(134);
		userInfoEntity8.setId(8);
		userInfoEntity8.setName("user8");
		userInfoEntity8.setPassword("fffffff");
		userInfoEntity8.setSex(0);
		userInfoEntity8.setStation_name("総務");
		resultList.add(userInfoEntity8);

		// UserInfoEntityのインスタンス生成
		UserInfoEntity userInfoEntity9 = new UserInfoEntity();
		// データ作成９
		userInfoEntity9.setAge(23);
		userInfoEntity9.setEmploye_no(204);
		userInfoEntity9.setId(9);
		userInfoEntity9.setName("user9");
		userInfoEntity9.setPassword("eeeeee");
		userInfoEntity9.setSex(0);
		userInfoEntity9.setStation_name("総務");
		resultList.add(userInfoEntity9);

		return resultList;
	}

	/**
	 * 引数で渡されたIDを元にユーザー情報を検索し結果を返却する。
	 * @param id ID
	 * @return ユーザー情報
	 * @throws SQLException DBエラー
	 */
	public UserInfoEntity selectUserInfo(int id) throws SQLException {

		// UserInfoEntityのインスタンス生成
		UserInfoEntity userInfoEntity = new UserInfoEntity();
		// idにより結果を変える
		if(id == 5) {
			userInfoEntity.setAge(45);
			userInfoEntity.setEmploye_no(67);
			userInfoEntity.setId(5);
			userInfoEntity.setName("user5");
			userInfoEntity.setPassword("pppppp");
			userInfoEntity.setSex(1);
			userInfoEntity.setStation_name("営業");
		} else if(id == 6) {
			userInfoEntity.setAge(32);
			userInfoEntity.setEmploye_no(302);
			userInfoEntity.setId(6);
			userInfoEntity.setName("user6");
			userInfoEntity.setPassword("vvvvvvv");
			userInfoEntity.setSex(0);
			userInfoEntity.setStation_name("庶務");
		} else if(id == 7) {
			userInfoEntity.setAge(31);
			userInfoEntity.setEmploye_no(178);
			userInfoEntity.setId(7);
			userInfoEntity.setName("user7");
			userInfoEntity.setPassword("rrrrrr");
			userInfoEntity.setSex(1);
			userInfoEntity.setStation_name("");
		} else {
			// 例外を発生させる
			throw new SQLException("DBエラー");
		}
		return userInfoEntity;
	}

	/**
	 * 引数で渡された所属部署名を元に、その所属部署のフロアを検索し返却する。
	 * @param stationName 所属部署
	 * @return フロア
	 * @throws SQLException DBエラー
	 */
	public String selectFloors(String stationName) throws SQLException  {

		// 結果返却用変数
		String resultStr;

		if(stationName.equals("営業")) {
			resultStr = "3F B-2";
		} else if(stationName.equals("総務")) {
			resultStr = "2F A-1";
		} else if(stationName.equals("開発")) {
			resultStr = "4F C-5";
		} else if(stationName.equals("庶務")) {
			resultStr = "";
		} else {
			throw new SQLException("DBエラー");
		}

		return resultStr;
	}
}
