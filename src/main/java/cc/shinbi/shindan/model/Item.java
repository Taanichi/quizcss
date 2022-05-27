package cc.shinbi.shindan.model;

//（Item）回答の選択肢のクラス
public class Item {
//	問題番号
	private int id;
//	問題文
	private String text;
	
	
	public Item(int id, String text) {
		this.id = id;
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
