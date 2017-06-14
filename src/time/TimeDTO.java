package time;


public class TimeDTO {

	private String date;
	private String IN;
	private String OUT;
	private String todaytotal;
	private String totaltime;
	private String totalattend;

	public TimeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TimeDTO(String date, String iN, String oUT, String todaytotal, String totaltime, String totalattend) {
		super();
		this.date = date;
		IN = iN;
		OUT = oUT;
		this.todaytotal = todaytotal;
		this.totaltime = totaltime;
		this.totalattend = totalattend;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getIN() {
		return IN;
	}

	public void setIN(String iN) {
		IN = iN;
	}

	public String getOUT() {
		return OUT;
	}

	public void setOUT(String oUT) {
		OUT = oUT;
	}

	public String getTodaytotal() {
		return todaytotal;
	}

	public void setTodaytotal(String todaytotal) {
		this.todaytotal = todaytotal;
	}

	public String getTotaltime() {
		return totaltime;
	}

	public void setTotaltime(String totaltime) {
		this.totaltime = totaltime;
	}

	public String getTotalattend() {
		return totalattend;
	}

	public void setTotalattend(String totalattend) {
		this.totalattend = totalattend;
	}

	@Override
	public String toString() {
		return "TimeDTO [date=" + date + ", IN=" + IN + ", OUT=" + OUT + ", todaytotal=" + todaytotal + ", totaltime="
				+ totaltime + ", totalattend=" + totalattend + "]";
	}

}
