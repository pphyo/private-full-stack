package tech.codoverse;

public enum Season {
	SUMMER("High"), MONSOON("Low"), WINTER("Meidum");

	private final String traffic;

	private Season(final String traffic) {
		this.traffic = traffic;
	}

	public String getTraffic() {
		return traffic;
	}
}
