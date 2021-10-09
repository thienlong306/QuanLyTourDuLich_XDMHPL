package DAL;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.ResultSetMetaData;

import Enity.Tour;
import GUI.Main;

public class tourDAL extends DbManager {
	static ArrayList<Tour> list = new ArrayList<>();
public static void TourDAL() {
	
	connectDB("localhost","3306","dulich","root","");
}

public static ArrayList<Tour> getAllTour(){
	String sql = "SELECT * FROM tours ";
	setSQL(sql);
	getTable();
	return list;
}

private static void getTable() {
	query();
	try {
		ResultSetMetaData rd = (ResultSetMetaData) rs.getMetaData();
		int numCol =  rd.getColumnCount();
		list.clear();
		while (rs.next()) {
				Tour s = new Tour();
				for(int i=0;i<=numCol;i++) {
				s.setTourId(rs.getString(1));
				s.setTourTen(rs.getString(2));
				s.setTourMoTa(rs.getString(3));
				s.setLoaiId(rs.getString(4));
				s.setGiaId(rs.getString(5));
				}
				list.add(s);	
				
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
}

public static void insertTour(Tour r) {
	String sql = "INSERT INTO `tours`(`tour_id`, `tour_ten`, `tour_mota`, `loai_id`, `gia_id`) VALUES (null,'" + r.getTourTen() + "','" + r.getTourMoTa() + "','" + r.getLoaiId() + "','" + r.getGiaId() + "')"; 
	setSQL(sql);
	update();
}

public static void deleteTour(Tour r) {
	String sql = "DELETE FROM `tours` WHERE `tour_id` =" + r.getTourId();
	setSQL(sql);
	update();
}

public static ArrayList<Tour> findTour(int index,String ten){
	String sql = null;
	if (index == 0) {sql = "SELECT * FROM tours WHERE `tour_id` =" + ten ;}
	if (index == 1) {sql = "SELECT * FROM tours WHERE `tour_ten` = '" + ten + "'" ;}
	if (index == 2) {sql = "SELECT * FROM tours WHERE `tour_mota` = '" + ten + "'"  ;}
	if (index == 3) {sql = "SELECT * FROM tours WHERE `loai_id` = '" + ten + "'" ;}
	if (index == 4) {sql = "SELECT * FROM tours WHERE `gia_id` = '" + ten + "'" ;}
	setSQL(sql);
	getTable();
	return list;
}

public static ArrayList<Tour> findTourAuto(int index,String ten){
	String sql = null;
	if (index == 0) {sql = "SELECT * FROM tours WHERE `tour_id` LIKE '%" + ten + "%'";}
	if (index == 1) {sql = "SELECT * FROM tours WHERE `tour_ten` LIKE '%" + ten + "%'" ;}
	if (index == 2) {sql = "SELECT * FROM tours WHERE `tour_mota`LIKE '%" + ten + "%'"  ;}
	if (index == 3) {sql = "SELECT * FROM tours WHERE `loai_id` LIKE '%" + ten + "%'" ;}
	if (index == 4) {sql = "SELECT * FROM tours WHERE `gia_id` LIKE '%" + ten + "%'" ;}
	setSQL(sql);
	getTable();
	return list;
}

public static void editTour(Tour r) {
	String sql= "UPDATE `tours` SET `tour_ten`='" + r.getTourTen() + "',`tour_mota`='" + r.getTourMoTa() + "',`loai_id`='" + r.getLoaiId() + "',`gia_id`='" + r.getGiaId() + "' WHERE `tour_id`=" + r.getTourId();
	setSQL(sql);
	update();
}

public static ArrayList<Tour> getAllThongKeTour(){
	String sql = "SELECT * FROM tours ";
	setSQL(sql);
	query();
	getTable();
	
	for(Tour tour : list) {
		sql = "SELECT COUNT(*) as soDoan FROM tour_doan WHERE tour_id =  " + tour.getTourId();
		setSQL(sql);
		query();
		try {
			while (rs.next()) {
				tour.setTourMoTa(rs.getString("soDoan"));
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	for(Tour tour : list) {
		sql = "SELECT COUNT(*) as soKh\r\n" + 
				"FROM tour_khachhang\r\n" + 
				"INNER JOIN tour_doan\r\n" + 
				"USING (doan_id)\r\n" + 
				"INNER JOIN tours\r\n" + 
				"USING (tour_id)\r\n" + 
				"WHERE tour_id =  " + tour.getTourId();
		setSQL(sql);
		query();
		try {
			while (rs.next()) {
				int i=Integer.parseInt(tour.getGiaId());  
				String j=Integer.toString(rs.getInt("soKh")*i);
				tour.setLoaiId(j);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	for(int i=0;i<list.size();i++) {
		sql = "SELECT cp_gia\r\n" + 
				"FROM tour_chiphi\r\n" + 
				"INNER JOIN tour_doan\r\n" + 
				"USING (doan_id)\r\n" + 
				"INNER JOIN tours\r\n" + 
				"USING (tour_id)\r\n" + 
				"WHERE tour_id = " + list.get(i).getTourId();
		setSQL(sql);
		query();
		int cp=0;
		try {
			while (rs.next()) {
				cp=cp+rs.getInt(1);
				list.get(i).setGiaId(Integer.toString(cp));
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	return list;
}



}
