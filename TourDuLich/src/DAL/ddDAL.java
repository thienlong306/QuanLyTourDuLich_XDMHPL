package DAL;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.ResultSetMetaData;

import Enity.DiaDiem;
import Enity.Doan;
import Enity.Tour;
import GUI.Main;

public class ddDAL extends DbManager {
	static ArrayList<DiaDiem> list = new ArrayList<>();
public static void DdDAL() {
	
	connectDB("localhost","3306","dulich","root","");
}

public static ArrayList<DiaDiem> getAllDd(){
	String sql = "SELECT * FROM tour_diadiem ";
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
			DiaDiem s = new DiaDiem();
				for(int i=0;i<=numCol;i++) {
				s.setDiadiemId(rs.getString(1));
				s.setTourId(rs.getString(2));
				s.setDiadiemTen(rs.getString(3));
				}
				list.add(s);	
				
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
}

public static void insertDd(DiaDiem r) {
	String sql = "INSERT INTO `tour_diadiem`(`dd_id`, `tour_id`, `dd_ten`) VALUES (null,'" + r.getTourId() + "','" + r.getDiadiemTen() + "')"; 
	setSQL(sql);
	update();
}

public static void deleteDd(DiaDiem r) {
	String sql = "DELETE FROM `tour_diadiem` WHERE `dd_id` =" + r.getDiadiemId();
	setSQL(sql);
	update();
}

public static ArrayList<DiaDiem> findDd(int index,String ten){
	String sql=null;
	if (index == 0) {sql = "SELECT * FROM `tour_diadiem` WHERE `dd_id` =" + ten ;}
	if (index == 1) {sql = "SELECT * FROM `tour_diadiem` WHERE `tour_id` = '" + ten + "'" ;}
	if (index == 2) {sql = "SELECT * FROM `tour_diadiem` WHERE `dd_ten` ='" + ten + "'"  ;}
	setSQL(sql);
	getTable();
	return list;
}

public static ArrayList<DiaDiem> findDdAuto(int index,String ten){
	String sql=null;
	if (index == 0) {sql = "SELECT * FROM `tour_diadiem` WHERE `dd_id` LIKE '%" + ten + "%'" ;}
	if (index == 1) {sql = "SELECT * FROM `tour_diadiem` WHERE `tour_id` LIKE '%" + ten + "%'" ;}
	if (index == 2) {sql = "SELECT * FROM `tour_diadiem` WHERE `dd_ten` LIKE '%" + ten + "%'"  ;}
	setSQL(sql);
	getTable();
	return list;
}

public static void editDd(DiaDiem r) {
	String sql= "UPDATE `tour_diadiem` SET `tour_id`='" + r.getTourId() + "',`dd_ten`='" + r.getDiadiemTen() +  "' WHERE `dd_id`=" + r.getDiadiemId();
	setSQL(sql);
	update();
}

}
