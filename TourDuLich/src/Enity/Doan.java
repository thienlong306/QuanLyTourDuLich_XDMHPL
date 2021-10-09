package Enity;

public class Doan {
	private String doanId;
	private String tourId;
	private String doanTen;
	private String doanKhoiHanh;
	
	public Doan() {};
	
	public Doan(String doanId, String tourId, String doanTen,String doanKhoiHanh) {
		this.doanId = doanId;
		this.tourId = tourId;
		this.doanTen = doanTen;
		this.doanKhoiHanh = doanKhoiHanh;
	}

	public String getDoanId() {
		return doanId;
	}

	public void setDoanId(String doanId) {
		this.doanId = doanId;
	}

	public String getTourId() {
		return tourId;
	}

	public void setTourId(String tourId) {
		this.tourId = tourId;
	}

	public String getDoanTen() {
		return doanTen;
	}

	public void setDoanTen(String doanTen) {
		this.doanTen = doanTen;
	}

	public String getDoanKhoiHanh() {
		return doanKhoiHanh;
	}

	public void setDoanKhoiHanh(String doanKhoiHanh) {
		this.doanKhoiHanh = doanKhoiHanh;
	}
	
	
	}
