package DAL;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.ResultSetMetaData;

import Enity.KhachHang;
import Enity.NhanVien;
import Enity.Tour;
import GUI.Main;

public class nvDAL extends DbManager {
	static ArrayList<NhanVien> list = new ArrayList<>();
public static void nvDAL() {
	
	connectDB("localhost","3306","dulich","root","");
}

public static ArrayList<NhanVien> getAllNhanVien(){
	String sql = "SELECT * FROM tour_nhanvien ";
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
			NhanVien s = new NhanVien();
				for(int i=0;i<=numCol;i++) {
				s.setNvId(rs.getString(1));
				s.setDoanId(rs.getString(2));
				s.setNvTen(rs.getString(3));
				s.setNvSdt(rs.getString(4));
				s.setNvCmnd(rs.getString(5));
				}
				list.add(s);	
				
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
}

public static void insertNv(NhanVien r) {
	String sql = "INSERT INTO `tour_nhanvien`(`nv_id`,`doan_id`, `nv_ten`, `nv_sdt`, `nv_cmnd`) VALUES (null,'"+ r.getDoanId() + "','" + r.getNvTen() + "','" + r.getNvSdt() + "','" + r.getNvCmnd() + "')"; 
	setSQL(sql);
	update();
}

public static void deleteNv(NhanVien r) {
	String sql = "DELETE FROM `tour_nhanvien` WHERE `nv_id` =" + r.getNvId();
	setSQL(sql);
	update();
}

public static ArrayList<NhanVien> findNhanVien(int index,String ten){
	String sql=null;
	if (index == 0) {sql = "SELECT * FROM `tour_nhanvien` WHERE `nv_id` =" + ten ;}
	if (index == 1) {sql = "SELECT * FROM `tour_nhanvien` WHERE `doan_id` =" + ten ;}
	if (index == 2) {sql = "SELECT * FROM `tour_nhanvien` WHERE `nv_ten` = '" + ten + "'" ;}
	if (index == 3) {sql = "SELECT * FROM `tour_nhanvien` WHERE `nv_sdt` ='" + ten + "'"  ;}
	if (index == 4) {sql = "SELECT * FROM `tour_nhanvien` WHERE `nv_cmnd` = '" + ten + "'" ;}
	setSQL(sql);
	getTable();
	return list;
}

public static ArrayList<NhanVien> findNhanVienAuto(int index,String ten){
	String sql=null;
	if (index == 0) {sql = "SELECT * FROM `tour_nhanvien` WHERE `nv_id` LIKE '%" + ten + "%'" ;}
	if (index == 1) {sql = "SELECT * FROM `tour_nhanvien` WHERE `doan_id` LIKE '%" + ten + "%'" ;}
	if (index == 2) {sql = "SELECT * FROM `tour_nhanvien` WHERE `nv_ten` LIKE '%" + ten + "%'" ;}
	if (index == 3) {sql = "SELECT * FROM `tour_nhanvien` WHERE `nv_sdt` LIKE '%" + ten + "%'"  ;}
	if (index == 4) {sql = "SELECT * FROM `tour_nhanvien` WHERE `nv_cmnd` LIKE '%" + ten + "%'" ;}
	setSQL(sql);
	getTable();
	return list;
}

public static void editNv(NhanVien r) {
	String sql= "UPDATE `tour_nhanvien` SET `doan_id`='" + r.getDoanId() +"',`nv_ten`='" + r.getNvTen()  +"',`nv_sdt`='" + r.getNvSdt() + "',`nv_cmnd`='" + r.getNvCmnd() + "' WHERE `nv_id`=" + r.getNvId();
	setSQL(sql);
	update();
}

}
