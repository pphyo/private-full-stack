package tech.codoverse;

public class EnumApplication {

	void main() {
		runForOperator();
	}

	void runForOperator() {
		Operator ope = Operator.PLUS;
		IO.println(ope.apply(10, 20));
	}

	void runForSeason() {
		var season = Season.WINTER;

		IO.println(season.ordinal());

		for (var value : Season.values()) {
			IO.println("%d : %s".formatted(value.ordinal(), value));
		}
	}

	void setSeason(Season season) {
	}

}