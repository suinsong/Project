package assssss;

public class MemberDTO {

	private int number;
	private String memname;
	private String memid;
	private String mempw1;
	private String mempw2;
	private String memaddr;
	private String memtel;
	private String memgender;

	public MemberDTO() {
		super();
	}

	public MemberDTO(int number, String memname, String memid, String mempw1, String mempw2, String memaddr,
			String memtel, String memgender) {
		super();
		this.number = number;
		this.memname = memname;
		this.memid = memid;
		this.mempw1 = mempw1;
		this.mempw2 = mempw2;
		this.memaddr = memaddr;
		this.memtel = memtel;
		this.memgender = memgender;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getMemname() {
		return memname;
	}

	public void setMemname(String memname) {
		this.memname = memname;
	}

	public String getMemid() {
		return memid;
	}

	public void setMemid(String memid) {
		this.memid = memid;
	}

	public String getMempw1() {
		return mempw1;
	}

	public void setMempw1(String mempw1) {
		this.mempw1 = mempw1;
	}

	public String getMempw2() {
		return mempw2;
	}

	public void setMempw2(String mempw2) {
		this.mempw2 = mempw2;
	}

	public String getMemaddr() {
		return memaddr;
	}

	public void setMemaddr(String memaddr) {
		this.memaddr = memaddr;
	}

	public String getMemtel() {
		return memtel;
	}

	public void setMemtel(String memtel) {
		this.memtel = memtel;
	}

	public String getMemgender() {
		return memgender;
	}

	public void setMemgender(String memgender) {
		this.memgender = memgender;
	}

	@Override
	public String toString() {
		return "MemberDTO [number=" + number + ", memname=" + memname + ", memid=" + memid + ", mempw1=" + mempw1
				+ ", mempw2=" + mempw2 + ", memaddr=" + memaddr + ", memtel=" + memtel + ", memgender=" + memgender
				+ "]";
	}

}
