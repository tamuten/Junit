package junit.bean;

/**
 * メンバークラス。
 * @author answer
 *
 */
public class MemberBean {

	/**
	 * 番号。
	 */
	private int no;

	/**
	 * 名前。
	 */
	private String name;

	/**
	 * 年齢。
	 */
	private int age;

	/**
	 * 性別。
	 * 0:女/1:男
	 */
	private int sex;

	/**
	 * ポイント。
	 */
	private int point;

	/**
	 * フラグ。
	 */
	private boolean flag;

	/**
	 * 番号を返却する。
	 * @return 番号
	 */
	public int getNo() {
		return no;
	}

	/**
	 * 番号をセットする。
	 * @param no 番号
	 */
	public void setNo(int no) {
		this.no = no;
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
	 * ポイントを返却する。
	 * @return ポイント
	 */
	public int getPoint() {
		return point;
	}

	/**
	 * ポイントをセットする。
	 * @param point ポイント
	 */
	public void setPoint(int point) {
		this.point = point;
	}

	/**
	 * フラグを返却する。
	 * @return true/false
	 */
	public boolean isFlag() {
		return flag;
	}

	/**
	 * フラグをセットする。
	 * @param flag フラグ
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
