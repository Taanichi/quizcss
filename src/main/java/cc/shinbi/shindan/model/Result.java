package cc.shinbi.shindan.model;

//問題文の回答
public class Result {
//	問題文の答え
	private String name;
//	答えの解説
	private String description;

	public Result(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
}
