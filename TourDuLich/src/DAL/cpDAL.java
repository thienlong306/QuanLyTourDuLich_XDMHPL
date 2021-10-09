package DAL;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.ResultSetMetaData;

import Enity.ChiPhi;
import Enity.KhachHang;
import Enity.Tour;
import GUI.Main;

public class cpDAL extends DbManager {
	static ArrayList<ChiPhi> list = new ArrayList<>();
public static void cpDAL() {
	
	connectDB("localhost","3306","dulich","root","");
}

public static ArrayList<ChiPhi> getAllChiPhi(){
	String sql = "SELECT * FROM tour_chiphi";
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
				ChiPhi s = new ChiPhi();
				for(int i=0;i<=numCol;i++) {
				s.setCpId(rs.getString(1));
				s.setDoanId(rs.getString(2));
				s.setCpCt(rs.getString(3));
				s.setCpGia(rs.getString(4));
				}
				list.add(s);	
				
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
}

public static void insertCp(ChiPhi r) {
	String sql = "INSERT INTO `tour_chiphi`(`cp_id`, `doan_id`, `cp_chitiet`, `cp_gia`) VALUES (null,'" + r.getDoanId()+ "','" + r.getCpCt() + "','" + r.getCpGia() + "')"; 
	setSQL(sql);
	update();
}

public static void deleteCp(ChiPhi r) {
	String sql = "DELETE FROM `tour_chiphi` WHERE `cp_id` =" + r.getCpId();
	setSQL(sql);
	update();
}

public static ArrayList<ChiPhi> findChiPhi(int index,String ten){
	String sql=null;
	if (index == 0) {sql = "SELECT * FROM `tour_chiphi` WHERE `cp_id` =" + ten ;}
	if (index == 1) {sql = "SELECT * FROM `tour_chiphi` WHERE `doan_id` = '" + ten + "'" ;}
	if (index == 2) {sql = "SELECT * FROM `tour_chiphi` WHERE `cp_chitiet` ='" + ten + "'"  ;}
	if (index == 3) {sql = "SELECT * FROM `tour_chiphi` WHERE `cp_gia` ='" + ten + "'"  ;}
	setSQL(sql);
	getTable();
	return list;
}

public static ArrayList<ChiPhi> findChiPhiAuto(int index,String ten){
	String sql=null;
	if (index == 0) {sql = "SELECT * FROM `tour_chiphi` WHERE `cp_id` LIKE '%" + ten + "%'" ;}
	if (index == 1) {sql = "SELECT * FROM `tour_chiphi` WHERE `doan_id` LIKE '%" + ten + "%'" ;}
	if (index == 2) {sql = "SELECT * FROM `tour_chiphi` WHERE `cp_chitiet` LIKE'%" + ten + "%'"  ;}
	if (index == 3) {sql = "SELECT * FROM `tour_chiphi` WHERE `cp_gia` LIKE'%" + ten + "%'"  ;}
	setSQL(sql);
	getTable();
	return list;
}

public static void editCp(ChiPhi r) {
	String sql= "UPDATE `tour_chiphi` SET `doan_id`='" + r.getDoanId() + "',`cp_chitiet`='" + r.getCpCt() + "',`cp_gia`='" + r.getCpGia() + "' WHERE `cp_id`=" + r.getCpId();
	setSQL(sql);
	System.out.println(sql);
	update();
}

}
