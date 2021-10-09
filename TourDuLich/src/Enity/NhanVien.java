package Enity;

public class NhanVien {
	private String nvId;
	private String doanId;
	private String nvTen;
	private String nvSdt;
	private String nvCmnd;
	
	public NhanVien() {};
	
	public NhanVien(String nvId,String doanId,String nvTen, String nvSdt, String nvCmnd) {
		this.nvId = nvId;
		this.doanId = doanId;
		this.nvTen = nvTen;
		this.nvSdt = nvSdt;
		this.nvCmnd = nvCmnd;
	}

	public String getNvId() {
		return nvId;
	}

	public void setNvId(String nvId) {
		this.nvId = nvId;
	}

	public String getDoanId() {
		return doanId;
	}

	public void setDoanId(String doanId) {
		this.doanId = doanId;
	}

	public String getNvTen() {
		return nvTen;
	}

	public void setNvTen(String nvTen) {
		this.nvTen = nvTen;
	}

	public String getNvSdt() {
		return nvSdt;
	}

	public void setNvSdt(String nvSdt) {
		this.nvSdt = nvSdt;
	}

	public String getNvCmnd() {
		return nvCmnd;
	}

	public void setNvCmnd(String nvCmnd) {
		this.nvCmnd = nvCmnd;
	}

	


	}
