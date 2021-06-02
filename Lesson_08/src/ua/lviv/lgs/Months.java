package ua.lviv.lgs;

public enum Months {
	JANUARY(31, Seasons.WINTER), FEBRUARY(28, Seasons.WINTER), MARCH(31, Seasons.WINTER), APRIL(30, Seasons.SPRING),
	MAY(31, Seasons.SPRING), JUNE(30, Seasons.SPRING), JULY(31, Seasons.SUMME), AUGUST(31, Seasons.SUMME),
	SEPTEMBER(30, Seasons.SUMME), OCTOBER(31, Seasons.FALL), NOVEMBER(30, Seasons.FALL), DECEMBER(31, Seasons.FALL);

	int numberOfDays;
	Seasons season;

	Months(int numberOfDays, Seasons season) {
		this.numberOfDays = numberOfDays;
		this.season = season;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public Seasons getSeason() {
		return season;
	}
}