package Homework12javacore9v1v3;

public enum Months {
	 January(31, Seasons.Winter) , February(28, Seasons.Winter) ,  March(31, Seasons.Spring) , April(30, Seasons.Spring) ,
     May(31, Seasons.Spring) , June(30, Seasons.Summer) , July(31, Seasons.Summer) , August(31, Seasons.Summer) ,
     September(30, Seasons.Autumn) , October(31, Seasons.Autumn) , November(30, Seasons.Autumn) , December(31, Seasons.Winter) ;

	 int numberOfDays;
	 Seasons seasons;
	 
	 Months(int numberOfDays, Seasons seasons ) {
		 this.numberOfDays = numberOfDays ;
		 this.seasons = seasons ;
    }

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public Seasons getSeasons() {
		return seasons;
	}

	public void setSeasons(Seasons seasons) {
		this.seasons = seasons;
	}
		 
 }

