package Enity;

public class ChiPhi {
	private String cpId;
	private String doanId;
	private String cpCt;
	private String cpGia;
	
	public ChiPhi() {};
	
	public ChiPhi(String cpId, String doanId, String cpCt, String cpGia) {
		this.cpId = cpId;
		this.doanId = doanId;
		this.cpCt = cpCt;
		this.cpGia = cpGia;
	}

	public String getCpId() {
		return cpId;
	}

	public void setCpId(String cpId) {
		this.cpId = cpId;
	}

	public String getDoanId() {
		return doanId;
	}

	public void setDoanId(String doanId) {
		this.doanId = doanId;
	}

	public String getCpCt() {
		return cpCt;
	}

	public void setCpCt(String cpCt) {
		this.cpCt = cpCt;
	}

	public String getCpGia() {
		return cpGia;
	}

	public void setCpGia(String cpGia) {
		this.cpGia = cpGia;
	}

	
	}
