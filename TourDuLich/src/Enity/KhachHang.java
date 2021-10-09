package Enity;

public class KhachHang {
	private String khId;
	private String doanId;
	private String khTen;
	private String khSdt;
	private String khCmnd;
	
	public KhachHang() {};
	
	public KhachHang(String khId,String doanId, String khTen, String khSdt, String khCmnd) {
		this.khId = khId;
		this.doanId = doanId;
		this.khTen = khTen;
		this.khSdt = khSdt;
		this.khCmnd = khCmnd;
	}

	public String getKhId() {
		return khId;
	}

	public void setKhId(String khId) {
		this.khId = khId;
	}

	public String getDoanId() {
		return doanId;
	}

	public void setDoanId(String doanId) {
		this.doanId = doanId;
	}

	public String getKhTen() {
		return khTen;
	}

	public void setKhTen(String khTen) {
		this.khTen = khTen;
	}

	public String getKhSdt() {
		return khSdt;
	}

	public void setKhSdt(String khSdt) {
		this.khSdt = khSdt;
	}

	public String getKhCmnd() {
		return khCmnd;
	}

	public void setKhCmnd(String khCmnd) {
		this.khCmnd = khCmnd;
	}

	
	}
