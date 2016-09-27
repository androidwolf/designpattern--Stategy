package Strategy;

public class Application {

	public static void main(String[] args) {
		GymnasticsGame game = new GymnasticsGame();
		game.setStrategy(new StrategyOne());
		Person zhang = new Person();
		zhang.setName("����");
		double[] a = { 9.12, 9.25, 8.87, 9.99, 6.99, 7.88 };
		Person li = new Person();
		li.setName("����");
		zhang.setScore(game.getPersonScore(a));
		li.setScore(game.getPersonScore(a));
		System.out.println("the first strategy :" + zhang.getScore());
		System.out.println("the first strategy :" + li.getScore());

		game.setStrategy(new StrategyThree());
		zhang.setScore(game.getPersonScore(a));
		li.setScore(game.getPersonScore(a));
		System.out.println("the third strategy :" + zhang.getScore());
		System.out.println("the third strategy :" + li.getScore());
	}
}

class Person {
	String name;
	double score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
}
