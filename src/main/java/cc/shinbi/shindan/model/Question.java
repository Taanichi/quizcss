package cc.shinbi.shindan.model;

import java.util.ArrayList;
import java.util.List;

//（Question）質問のクラス
public class Question {
//	システムを動かすパラメーター名
	private String key;
	private String question;
//	回答の選択肢をList化
	private List<Item> items;

	public Question(String key, String question) {
		this.key = key;
		this.question = question;
		this.items = new ArrayList<Item>();
	}

	public String getKey() {
		return key;
	}

	public String getQuestion() {
		return question;
	}

	public List<Item> getItems() {
		return items;
	}
	
	
	
	public void addItem(int id, String description) {
		Item item = new Item(id, description);
		this.items.add(item);
	}
	
}
