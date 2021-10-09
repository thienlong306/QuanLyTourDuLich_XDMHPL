package Enity;

public class DiaDiem {
	private String diadiemId;
	private String tourId;
	private String diadiemTen;
	
	public DiaDiem() {};
	
	public DiaDiem(String diadiemId, String tourId, String diadiemTen) {
		this.diadiemId = diadiemId;
		this.tourId = tourId;
		this.diadiemTen = diadiemTen;

	}

	public String getDiadiemId() {
		return diadiemId;
	}

	public void setDiadiemId(String diadiemId) {
		this.diadiemId = diadiemId;
	}

	public String getTourId() {
		return tourId;
	}

	public void setTourId(String tourId) {
		this.tourId = tourId;
	}

	public String getDiadiemTen() {
		return diadiemTen;
	}

	public void setDiadiemTen(String diadiemTen) {
		this.diadiemTen = diadiemTen;
	}

	
	
	
	}
