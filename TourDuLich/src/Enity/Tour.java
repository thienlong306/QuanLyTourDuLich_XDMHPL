package Enity;

public class Tour {
	private String tourId;
	private String tourTen;
	private String tourMoTa;
	private String loaiId;
	private String giaId;
	
	public Tour() {};
	
	public Tour(String tourId, String tourTen, String tourMoTa, String loaiId, String giaId) {
		this.tourId = tourId;
		this.tourTen = tourTen;
		this.tourMoTa = tourMoTa;
		this.loaiId = loaiId;
		this.giaId = giaId;
	}

	public String getTourId() {
		return tourId;
	}

	public void setTourId(String tourId) {
		this.tourId = tourId;
	}

	public String getTourTen() {
		return tourTen;
	}

	public void setTourTen(String tourTen) {
		this.tourTen = tourTen;
	}

	public String getTourMoTa() {
		return tourMoTa;
	}

	public void setTourMoTa(String tourMoTa) {
		this.tourMoTa = tourMoTa;
	}

	public String getLoaiId() {
		return loaiId;
	}

	public void setLoaiId(String loaiId) {
		this.loaiId = loaiId;
	}

	public String getGiaId() {
		return giaId;
	}

	public void setGiaId(String giaId) {
		this.giaId = giaId;
	}
	
	}
