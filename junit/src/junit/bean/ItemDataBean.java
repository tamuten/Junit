package junit.bean;

/**
 * 商品データクラス。
 * @author answer
 *
 */
public class ItemDataBean {

	/**
	 * 商品番号。
	 */
	private int itemNo;

	/**
	 * 商品名。
	 */
	private String name;

	/**
	 * 値段。
	 */
	private int value;

	/**
	 * 種別。
	 */
	private int category;

	/**
	 * 在庫数。
	 */
	private int stock;

	/**
	 * セールフラグ。
	 */
	private boolean saleFlag;

	/**
	 * おすすめフラグ。
	 */
	private boolean recommendFlag;

	/**
	 * 商品番号を返却する。
	 * @return 商品番号
	 */
	public int getItemNo() {
		return itemNo;
	}

	/**
	 * 商品番号をセットする。
	 * @param itemNo 商品番号
	 */
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}

	/**
	 * 商品名を返却する。
	 * @return 商品名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 商品名をセットする。
	 * @param name 商品名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 値段を返却する。
	 * @return 値段
	 */
	public int getValue() {
		return value;
	}

	/**
	 * 値段をセットする。
	 * @param value 値段
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * 種別を返却する。
	 * @return 種別 0:食品/1:衣料品/2:日用品/3:その他
	 */
	public int getCategory() {
		return category;
	}

	/**
	 * 種別をセットする。
	 * @param category 種別
	 */
	public void setCategory(int category) {
		this.category = category;
	}

	/**
	 * 在庫数を返却する。
	 * @return 在庫数
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * 在庫数をセットする。
	 * @param stock 在庫数
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * セールフラグを返却する。
	 * @return セールフラグ
	 */
	public boolean isSaleFlag() {
		return saleFlag;
	}

	/**
	 * セールフラグをセットする。
	 * @param saleFlag セールフラグ
	 */
	public void setSaleFlag(boolean saleFlag) {
		this.saleFlag = saleFlag;
	}

	/**
	 * おすすめフラグを返却する。
	 * @return おすすめフラグ
	 */
	public boolean isRecommendFlag() {
		return recommendFlag;
	}

	/**
	 * おすすめフラグをセットする。
	 * @param recommendFlag おすすめフラグ
	 */
	public void setRecommendFlag(boolean recommendFlag) {
		this.recommendFlag = recommendFlag;
	}

}
