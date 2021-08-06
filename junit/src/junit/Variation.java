package junit;

import java.util.ArrayList;
import java.util.List;

import junit.bean.ItemDataBean;
import junit.bean.MemberBean;

/**
 * 様々な処理をするクラス。
 * @author answer
 *
 */
public class Variation {

	/**
	 * 引数で渡された配列の要素を昇順でソートする。
	 * @param data int型の配列
	 * @return ソート処理を施した配列
	 */
	public int[] sortData(int[] data) {

		// データの入れ替えを行い昇順にソートする
		for (int i = 1;i < data.length -1;i++) {
			for(int j = i;j < data.length;j++) {
				// 値を比較してデータの入れ替えを行う
				if (data[i] > data[j]) {
					// 交換
					int num = data[i];
					data[i] = data[j];
					data[j] = num;
				}
			}
		}

		return data;
	}

	/**
	 * 引数で渡された年数が閏年か判定して結果を返却する。
	 * @param year 年数
	 * @return 閏年:true/平年:false
	 */
	public boolean isLeapYear(int year) {

		boolean result;

		// 閏年かチェックする
		if (year % 100 == 0) {
			// 年数が100の倍数の場合
			// 400で割り切れるかチェックする
			if (year % 400 == 0) {
				// 年数が400で割る切れた場合は閏年
				result = true;
			} else {
				// 割り切れない場合は平年
				result = false;
			}
		} else {
			// 年数が100の倍数ではない時
			// 4で割り切れるかチェックする
			if (year % 4 == 0) {
				// 年数が4で割り切れた場合は閏年
				result = true;
			} else {
				// 割り切れなかった場合は平年
				result = false;
			}
		}

		return result;
	}

	/**
	 * 引数で渡されたリストから該当条件を満たしていないメンバーを削除し、
	 * 新たに該当条件に合致するメンバーのリストを作成し返却する。
	 * 該当条件に合致するメンバーがいない場合は空のリストを返却する。
	 * @param list メンバーリスト
	 * @return 該当条件に合致するメンバーリスト
	 * @throws IllegalArgumentException 不正な引数の場合
	 */
	public List<MemberBean> removeMemberList(List<MemberBean> list) throws IllegalArgumentException {

		// nullチェック
		if(list == null) {
			// nullの場合は例外を発生させる
			throw new IllegalArgumentException("不正な引数です。");
		}

		// 結果返却用リスト
		List<MemberBean> resultList = new ArrayList<MemberBean>();

		// 該当条件を満たしていないメンバーを削除する
		if(!list.isEmpty()) {
			// リストにメンバーが格納されている場合
			// メンバーの数分ループ
			for(MemberBean member : list) {
				// フラグチェック
				if(member.isFlag()) {
					// フラグがtrueの場合
					// 性別、ポイントチェック
					if(member.getSex() == 1 && member.getPoint() >= 5000) {
						// 性別が1:男で5000ポイント以上保有している場合
						// リストに格納
						resultList.add(member);
					} else if(member.getSex() == 0 && member.getPoint() >= 2000) {
						// 性別が0:女で2000ポイント以上保有している場合
						// リストに格納
						resultList.add(member);
					}
				} else {
					// フラグがfalseの場合
					// 性別、ポイントチェック
					if (member.getPoint() >= 10000) {
						// 性別問わず10000ポイント以上保有している場合
						// リストに追加
						resultList.add(member);
					} else if(member.getSex() == 0 && member.getPoint() >= 3000) {
						// 性別が0:女で3000ポイント以上保有している場合
						// リストに格納
						resultList.add(member);
					}
				}
			}
		}

		return resultList;
	}

	/**
	 * セール商品か判別し、セールフラグをセットする。
	 * @param itemDataBean 商品データ
	 * @return 商品データ
	 */
	public ItemDataBean setSaleFlag(ItemDataBean itemDataBean) {

		// セールする商品か判別する
		if(isSaleFlag(itemDataBean)) {
			// セール商品の場合
			itemDataBean.setSaleFlag(true);
		} else {
			// セール商品ではない場合
			itemDataBean.setSaleFlag(false);
		}

		return itemDataBean;
	}

	/**
	 * セール商品か判別する。
	 * @param itemDataBean 商品データ
	 * @return true:セール商品/false:セール外商品
	 */
	private boolean isSaleFlag(ItemDataBean itemDataBean) {

		boolean result = false;

		// セール商品か判別する
		if(!itemDataBean.isRecommendFlag()) {
			// おすすめ商品ではない場合
			if(itemDataBean.getCategory() == 0 || itemDataBean.getCategory() == 2) {
				// 種別が0:食品または2:日用品の場合
				if(itemDataBean.getStock() >= 10) {
					// 在庫数が10以上の場合
					result = true;
				}
			} else {
				// 種別が0、2以外の場合
				if(itemDataBean.getStock() >= 5 && itemDataBean.getValue() >= 1000) {
					// 在庫数が5以上で値段が1000円以上の場合
					result = true;
				}
			}
		}
		return result;
	}
}
