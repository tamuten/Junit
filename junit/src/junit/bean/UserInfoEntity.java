package junit.bean;

/**
 * ユーザー情報エンティティクラス。
 * @author answer
 *
 */
public class UserInfoEntity {

	/**
	 * ID。
	 */
	private int id;

	/**
	 * 社員番号。
	 */
	private int employe_no;

	/**
	 * パスワード。
	 */
	private String password;

	/**
	 * 名前。
	 */
	private String name;

	/**
	 * 所属部署。
	 */
	private String station_name;

	/**
	 * 性別。
	 */
	private int sex;

	/**
	 * 年齢。
	 */
	private int age;

	/**
	 * IDを返却する。
	 * @return ID
	 */
	public int getId() {
		return id;
	}

	/**
	 * IDをセットする。
	 * @param id ID
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 社員番号を返却する。
	 * @return 社員番号
	 */
	public int getEmploye_no() {
		return employe_no;
	}

	/**
	 * 社員番号をセットする。
	 * @param employe_no 社員番号
	 */
	public void setEmploye_no(int employe_no) {
		this.employe_no = employe_no;
	}

	/**
	 * パスワードを返却する。
	 * @return パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワードをセットする。
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 名前を返却する。
	 * @return 名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * 名前をセットする。
	 * @param name 名前
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 所属部署を返却する。
	 * @return 所属部署
	 */
	public String getStation_name() {
		return station_name;
	}

	/**
	 * 所属部署をセットする。
	 * @param station_name 所属部署
	 */
	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}

	/**
	 * 性別を返却する。
	 * @return 性別 0:女/1:男
	 */
	public int getSex() {
		return sex;
	}

	/**
	 * 性別をセットする。
	 * @param sex 性別
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}

	/**
	 * 年齢を返却する。
	 * @return 年齢
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 年齢をセットする。
	 * @param age 年齢
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
