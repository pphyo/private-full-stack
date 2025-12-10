package tech.codoverse;

public class Player {

	private int id;
	private String name;
	private int no;
	private int wages;

	public Player() {
	}

	public Player(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Player(int id, int no) {
		this.id = id;
		this.no = no;
	}

	public Player(int id, String name, int no, int wages) {
		this.id = id;
		this.name = name;
		this.no = no;
		this.wages = wages;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getNo() {
		return no;
	}

	public int getWages() {
		return wages;
	}

	@Override
	public Player clone() {
		return this;
	}

}
