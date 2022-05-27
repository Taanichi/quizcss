package cc.shinbi.shindan.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shindan {
	private List<Result> results;
	private List<Question> questions;

	Shindan() {
		this.results = new ArrayList<Result>();
		this.questions = new ArrayList<Question>();
	}

	public List<Result> getResults() {
		return results;
	}

	public List<Question> getQuestions() {
		return questions;
	}


	private static List<Result> getResultList() {
		Result[] results = { new Result("A型", "あなたの"),
							 new Result("B型", "あなたの"),
							 new Result("O型", "あなたの"),
							 new Result("AB型", "あなたの"), };

		List<Result> list = Arrays.asList(results);
		return list;
	}

	private static List<Question> getQuestionList() {
		List<Question> list = new ArrayList<Question>();

		Question question1 = new Question("q1", "a");
		question1.addItem(0, "a");
		question1.addItem(1, "b");
		question1.addItem(2, "c");
		question1.addItem(3, "d");
		list.add(question1);

		Question question2 = new Question("q2", "e");
		question2.addItem(0, "f");
		question2.addItem(1, "g");
		question2.addItem(2, "h");
		question2.addItem(3, "i");
		list.add(question2);

		Question question3 = new Question("q3", "j");
		question3.addItem(0, "k");
		question3.addItem(1, "l");
		question3.addItem(2, "m");
		question3.addItem(3, "n");
		list.add(question3);

		Question question4 = new Question("q4", "o");
		question4.addItem(0, "p");
		question4.addItem(1, "q");
		question4.addItem(2, "r");
		question4.addItem(3, "s");
		list.add(question4);

		Question question5 = new Question("q5", "t");
		question5.addItem(0, "u");
		question5.addItem(1, "v");
		question5.addItem(2, "w");
		question5.addItem(3, "x");
		list.add(question5);

		return list;
	}

	public static Shindan createShindan() {

		Shindan shindan = new Shindan();
		List<Result> results = getResultList();
		shindan.getResults().addAll(results);

		List<Question> questions = getQuestionList();
		shindan.getQuestions().addAll(questions);

		return shindan;

	}

	public Result check(List<Integer> answers) {
		int[] counters = new int[this.results.size()];
		Arrays.fill(counters, 0);

		for (Integer index : answers) {
			counters[index]++;
		}

		int index = 0;
		int maxCount = 0;
		for (int i = 0; i < counters.length; i++) {
			int counter = counters[i];
			if (counter > maxCount) {
				index = i;
				maxCount = counter;
			}
		}

		return this.results.get(index);

	}

}
