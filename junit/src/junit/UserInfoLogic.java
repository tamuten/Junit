package junit;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.bean.UserInfoDto;
import junit.bean.UserInfoEntity;
import junit.dao.UserInfoDao;

/**
 * ユーザー情報を検索、DTOクラスに格納するクラス。
 * @author answer
 *
 */
public class UserInfoLogic {

	/**
	 * 性別：男
	 */
	private static final String MAN = "男";

	/**
	 * 性別：女
	 */
	private static final String WOMAN = "女";

	/**
	 * ユーザー情報を取得し、ユーザー情報DTOクラスに格納して返却する。
	 * ユーザー情報が取得できない場合はnullを返却する。
	 * @param userInfoDto ユーザー情報DTO
	 * @return ユーザー情報DTO
	 */
	public UserInfoDto selectUserInfo(UserInfoDto userInfoDto) throws IllegalArgumentException {

		// 引数判別
		if(userInfoDto == null) {
			// nullの場合は例外を発生させる
			throw new IllegalArgumentException("引数が不正です。");
		}

		// UserInfoDaoのインスタンス生成
		UserInfoDao userInfoDao = new UserInfoDao();

		// 結果返却用変数
		UserInfoEntity userInfoEntity = null;;
		try {
			userInfoEntity = userInfoDao.selectUserInfo(userInfoDto.getId());
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}

		UserInfoDto resultUserInfoDto = null;
		if(userInfoEntity != null) {
			// UserInfoDtoのインスタンス生成
			resultUserInfoDto = new UserInfoDto();
			// データをDTOに詰め替え
			resultUserInfoDto = setUserInfoDto(userInfoEntity, userInfoDao);
		}

		return resultUserInfoDto;
	}

	/**
	 * 全ユーザー情報を取得し、ユーザー情報DTOリストに格納して返却する。
	 * @return ユーザー情報DTOリスト
	 */
	public List<UserInfoDto> selectAllUserInfo() {

		// UserInfoDaoのインスタンス生成
		UserInfoDao userInfoDao = new UserInfoDao();

		// 検索結果格納リスト
		List<UserInfoEntity> userInfoEntityList = null;
		try {
			userInfoEntityList = userInfoDao.selectAllUserInfo();
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}

		// 返却用リスト
		List<UserInfoDto> userInfoDtoList = new ArrayList<UserInfoDto>();
		if(userInfoEntityList != null) {
			// データをDTOに詰め替え
			for(UserInfoEntity userInfoEntity : userInfoEntityList) {
				// UserInfoDtoのインスタンス生成
				UserInfoDto userInfoDto = new UserInfoDto();
				// データをDTOに詰め替え
				userInfoDto = setUserInfoDto(userInfoEntity, userInfoDao);
				// 返却用リストに追加
				userInfoDtoList.add(userInfoDto);
			}
		}
		return userInfoDtoList;
	}

	/**
	 * 引数で渡された所属部署のユーザー情報を検索し、所属部署毎に分類したユーザー情報DTOリストをマップに格納し返却する。
	 * @param stationNameList 所属部署名リスト
	 * @return 所属部署毎に分類したユーザー情報DTOリストのマップ
	 */
	public Map<String, List<UserInfoDto>> selectStationUserInfo(
			List<String> stationNameList) throws IllegalArgumentException {

		// 引数判別
		if(stationNameList == null || stationNameList.isEmpty()) {
			// nullまたは空のリストの場合は例外を発生させる
			throw new IllegalArgumentException("引数が不正です。");
		}

		// UserInfoDaoのインスタンス生成
		UserInfoDao userInfoDao = new UserInfoDao();

		// 検索結果格納リスト
		List<UserInfoEntity> userInfoEntityList = null;
		try {
			userInfoEntityList = userInfoDao.selectStationUserInfo(stationNameList);
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}

		// 返却用リスト
		List<UserInfoDto> userInfoDtoList = new ArrayList<UserInfoDto>();
		if(userInfoEntityList != null) {
			// データをDTOに詰め替え
			for(UserInfoEntity userInfoEntity : userInfoEntityList) {
				// UserInfoDtoのインスタンス生成
				UserInfoDto userInfoDto = new UserInfoDto();
				// データをDTOに詰め替え
				userInfoDto = setUserInfoDto(userInfoEntity, userInfoDao);
				// 返却用リストに追加
				userInfoDtoList.add(userInfoDto);
			}
		}
		// 所属部署毎のマップを作成して返却
		return createStationMap(stationNameList, userInfoDtoList);
	}


	/**
	 * 引数で渡された値を元に所属部署毎に分類したユーザー情報DTOリストをマップに格納し返却する。
	 * @param stationNameList 所属部署名リスト
	 * @param userInfoDtoList ユーザー情報DTOリスト
	 * @return 所属部署毎に分類したユーザー情報DTOリストを格納したマップ
	 */
	private Map<String, List<UserInfoDto>> createStationMap(
			List<String> stationNameList, List<UserInfoDto> userInfoDtoList) {

		// 結果返却用マップ
		Map<String, List<UserInfoDto>> resultMap = new HashMap<String, List<UserInfoDto>>();

		// 所属部署名でループ
		for(String strStationName : stationNameList) {
			// 部署毎にユーザー情報を格納する
			List<UserInfoDto> stationUserInfoDtoList = new ArrayList<UserInfoDto>();
			// ユーザー情報リストでループ
			for(UserInfoDto userInfoDto : userInfoDtoList) {
				// 所属部署を判別
				if(strStationName.equals(userInfoDto.getStation_name())) {
					// 一致する所属部署の場合
					// リストに追加
					stationUserInfoDtoList.add(userInfoDto);
				}
			}
			// 所属部署名をキーにマップに追加
			resultMap.put(strStationName, stationUserInfoDtoList);
		}
		return resultMap;
	}

	/**
	 * 引数で渡されたユーザー情報エンティティクラスからユーザー情報DTOクラスへデータの設定を行う。
	 * @param userInfoEntity ユーザー情報エンティティクラス
	 * @param userInfoDao UserInfoDaoクラス
	 * @return ユーザー情報DTOクラス
	 */
	private UserInfoDto setUserInfoDto(UserInfoEntity userInfoEntity, UserInfoDao userInfoDao) {

		// データをDTOに詰め替え
		// UserInfoDtoのインスタンス生成
		UserInfoDto resultUserInfoDto = new UserInfoDto();
		// 年齢
		resultUserInfoDto.setAge(userInfoEntity.getAge());
		// 社員番号
		resultUserInfoDto.setEmploye_no(userInfoEntity.getEmploye_no());
		// ID
		resultUserInfoDto.setId(userInfoEntity.getId());
		// 名前
		resultUserInfoDto.setName(userInfoEntity.getName());
		// パスワード
		resultUserInfoDto.setPassword(userInfoEntity.getPassword());
		// 性別
		String strSex = changeDispSex(userInfoEntity.getSex());
		resultUserInfoDto.setSex(strSex);
		// 所属部署
		String strStationName = userInfoEntity.getStation_name();
		resultUserInfoDto.setStation_name(strStationName);
		// フロア
		String strFloors = "";
		try {
			strFloors = userInfoDao.selectFloors(strStationName);
		} catch(SQLException sqle) {
			sqle.printStackTrace();
			strFloors = "不明";
		}
		resultUserInfoDto.setFloors(strFloors);

		return resultUserInfoDto;
	}

	/**
	 * 引数で渡された数値に対応する性別を返却する。
	 * @param iSex 性別の数値
	 * @return 性別
	 */
	private String changeDispSex(int iSex) {

		String resultStr;

		// 数値に対応した性別を判別する
		if(iSex == 0) {
			resultStr = WOMAN;
		} else {
			resultStr = MAN;
		}

		return resultStr;
	}
}
