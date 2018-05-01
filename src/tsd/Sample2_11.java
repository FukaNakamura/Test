package tsd;

public class Sample2_11 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
//		きつねを追加
		System.out.println(sb.append("きつね"));
//		0番目に"きた"を追加
		System.out.println(sb.insert(0, "きた"));
//		きたきつねを反転表示
		System.out.println(sb.reverse());
//		3文字目～4文字目（5文字目手前）まで削除
		System.out.println(sb.delete(3, 5));
//		1文字目～1文字目（2文字目手前）までを"ま"に変換
		System.out.println(sb.replace(1, 2, "ま"));
//		0文字以上、2文字未満の文字を取り出す
		System.out.println(sb.substring(0, 2));
//		0番目の文字から取り出す
		System.out.println(sb.substring(0));
	}

}
//０１２３４５
//ねつきたき