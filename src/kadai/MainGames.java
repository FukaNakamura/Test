package kadai;

import java.util.ArrayList;

class Game {
	String name;
	String type;
	int sale;

	public Game(String n, String t, int s) {
		name = n;
		type = t;
		sale = s;
	}

	public void show() {
		System.out.println("ゲーム名：" + name + "、ジャンル：" + type + "、販売本数：" + sale + "万");
	}
}


public class MainGames {

	public static void main(String[] args) {

		ArrayList<Game> games = new ArrayList<>();

		// addの中にインスタンスを入れてあげる
		games.add(new Game("スプラトゥーン2", "アクションシューティングゲーム", 712));
		games.add(new Game("モンスターハンターワールド", "アクションロールプレイングゲーム", 936));
		games.add(new Game("ドラゴンクエストⅪ", "ロールプレイングゲーム", 317));

		//で、showで呼び出す
		for(Game game : games) {
			game.show();
		}

	}


}
