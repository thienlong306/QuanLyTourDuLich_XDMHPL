package DAL;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.ResultSetMetaData;

import Enity.Doan;
import Enity.Tour;
import GUI.Main;

public class doanDAL extends DbManager {
	static ArrayList<Doan> list = new ArrayList<>();
public static void DoanDAL() {
	
	connectDB("localhost","3306","dulich","root","");
}

public static ArrayList<Doan> getAllTour(){
	String sql = "SELECT * FROM tour_doan ";
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
				Doan s = new Doan();
				for(int i=0;i<=numCol;i++) {
				s.setDoanId(rs.getString(1));
				s.setTourId(rs.getString(2));
				s.setDoanTen(rs.getString(3));
				s.setDoanKhoiHanh(rs.getString(4));
				}
				list.add(s);	
				
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
}

public static void insertDoan(Doan r) {
	String sql = "INSERT INTO `tour_doan`(`doan_id`, `tour_id`, `doan_ten`,`doan_khoihanh`) VALUES (null,'" + r.getTourId() + "','" + r.getDoanTen() + "','" + r.getDoanKhoiHanh() +  "')"; 
	setSQL(sql);
	update();
}

public static void deleteDoan(Doan r) {
	String sql = "DELETE FROM `tour_doan` WHERE `doan_id` =" + r.getDoanId();
	setSQL(sql);
	update();
}

public static ArrayList<Doan> findDoan(int index,String ten){
	String sql=null;
	if (index == 0) {sql = "SELECT * FROM `tour_doan` WHERE `doan_id` =" + ten ;}
	if (index == 1) {sql = "SELECT * FROM `tour_doan` WHERE `tour_id` = '" + ten + "'" ;}
	if (index == 2) {sql = "SELECT * FROM `tour_doan` WHERE `doan_ten` ='" + ten + "'"  ;}
	if (index == 3) {sql = "SELECT * FROM `tour_doan` WHERE `doan_khoihanh` ='" + ten + "'"  ;}
	setSQL(sql);
	getTable();
	return list;
}

public static ArrayList<Doan> findDoanAuto(int index,String ten){
	String sql=null;
	if (index == 0) {sql = "SELECT * FROM `tour_doan` WHERE `doan_id` LIKE '%" + ten + "%'" ;}
	if (index == 1) {sql = "SELECT * FROM `tour_doan` WHERE `tour_id` LIKE '%" + ten + "%'" ;}
	if (index == 2) {sql = "SELECT * FROM `tour_doan` WHERE `doan_ten` LIKE'%" + ten + "%'"  ;}
	if (index == 3) {sql = "SELECT * FROM `tour_doan` WHERE `doan_khoihanh` LIKE'%" + ten + "%'"  ;}
	setSQL(sql);
	getTable();
	return list;
}

public static ArrayList<Doan> getAllTourThongKeFind(String ten){
	String sql = "SELECT * FROM tour_doan WHERE `tour_id`= " + ten;
	setSQL(sql);
	getTable();
	
	for(Doan doan : list){
		sql = "SELECT kh_id,doan_id,tour_id,gia_id\r\n" + 
				"FROM tour_khachhang\r\n" + 
				"INNER JOIN tour_doan\r\n" + 
				"USING(doan_id)\r\n" + 
				"INNER JOIN tours\r\n" + 
				"USING (tour_id)\r\n" + 
				"WHERE doan_id  = " + doan.getDoanId();
	
		setSQL(sql);
		query();
		int dt=0;
		doan.setTourId("0");
		try {
			while (rs.next()) {
				dt=dt+rs.getInt(4);
			
				doan.setTourId(Integer.toString(dt));
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	for(Doan doan : list){
		sql = "SELECT *\r\n" + 
				"FROM tour_chiphi\r\n" + 
				"WHERE doan_id =" + doan.getDoanId();
	
		setSQL(sql);
		query();
		int cp=0;
		doan.setDoanKhoiHanh("0");
		try {
			while (rs.next()) {
				cp=cp+rs.getInt(4);
				doan.setDoanKhoiHanh(Integer.toString(cp));
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
	
	return list;
}

public static void editDoan(Doan r) {
	String sql= "UPDATE `tour_doan` SET `tour_id`='" + r.getTourId() + "',`doan_ten`='" + r.getDoanTen() + "',`doan_khoihanh`='" + r.getDoanKhoiHanh() +  "' WHERE `doan_id`=" + r.getDoanId();
	setSQL(sql);
	update();
}

public static ArrayList<Doan> getAllTourThongKe(){
	String sql = "SELECT * FROM tour_doan ";
	setSQL(sql);
	getTable();
	
	for(Doan doan : list){
		sql = "SELECT kh_id,doan_id,tour_id,gia_id\r\n" + 
				"FROM tour_khachhang\r\n" + 
				"INNER JOIN tour_doan\r\n" + 
				"USING(doan_id)\r\n" + 
				"INNER JOIN tours\r\n" + 
				"USING (tour_id)\r\n" + 
				"WHERE doan_id  = " + doan.getDoanId();
	
		setSQL(sql);
		query();
		int dt=0;
		doan.setTourId("0");
		try {
			while (rs.next()) {
				dt=dt+rs.getInt(4);
			
				doan.setTourId(Integer.toString(dt));
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	for(Doan doan : list){
		sql = "SELECT *\r\n" + 
				"FROM tour_chiphi\r\n" + 
				"WHERE doan_id =" + doan.getDoanId();
	
		setSQL(sql);
		query();
		int cp=0;
		doan.setDoanKhoiHanh("0");
		try {
			while (rs.next()) {
				cp=cp+rs.getInt(4);
				doan.setDoanKhoiHanh(Integer.toString(cp));
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
	
	return list;
}

}
