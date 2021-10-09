package DAL;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.ResultSetMetaData;

import Enity.KhachHang;
import Enity.Tour;
import GUI.Main;

public class khDAL extends DbManager {
	static ArrayList<KhachHang> list = new ArrayList<>();
public static void khDAL() {
	
	connectDB("localhost","3306","dulich","root","");
}

public static ArrayList<KhachHang> getAllKhachHang(){
	String sql = "SELECT * FROM tour_khachhang ";
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
				KhachHang s = new KhachHang();
				for(int i=0;i<=numCol;i++) {
				s.setKhId(rs.getString(1));
				s.setDoanId(rs.getString(2));
				s.setKhTen(rs.getString(3));
				s.setKhSdt(rs.getString(4));
				s.setKhCmnd(rs.getString(5));
				}
				list.add(s);	
				
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
}

public static void insertKh(KhachHang r) {
	String sql = "INSERT INTO `tour_khachhang`(`kh_id`,`doan_id`, `kh_ten`, `kh_sdt`, `kh_cmnd`) VALUES (null,'" + r.getDoanId() + "','" + r.getKhTen() + "','" + r.getKhSdt() + "','" + r.getKhCmnd() + "')"; 
	setSQL(sql);

	update();
}

public static void deleteKh(KhachHang r) {
	String sql = "DELETE FROM `tour_khachhang` WHERE `kh_id` =" + r.getKhId();
	setSQL(sql);
	update();
}

public static ArrayList<KhachHang> findKhachHang(int index,String ten){
	String sql=null;
	if (index == 0) {sql = "SELECT * FROM `tour_khachhang` WHERE `kh_id` =" + ten ;}
	if (index == 1) {sql = "SELECT * FROM `tour_khachhang` WHERE `doan_id` =" + ten ;}
	if (index == 2) {sql = "SELECT * FROM `tour_khachhang` WHERE `kh_ten` = '" + ten + "'" ;}
	if (index == 3) {sql = "SELECT * FROM `tour_khachhang` WHERE `kh_sdt` ='" + ten + "'"  ;}
	if (index == 4) {sql = "SELECT * FROM `tour_khachhang` WHERE `kh_cmnd` ='" + ten + "'"  ;}
	setSQL(sql);
	getTable();
	return list;
}

public static ArrayList<KhachHang> findKhachHangAuto(int index,String ten){
	String sql=null;
	if (index == 0) {sql = "SELECT * FROM `tour_khachhang` WHERE `kh_id` LIKE '%" + ten + "%'";}
	if (index == 1) {sql = "SELECT * FROM `tour_khachhang` WHERE `doan_id` LIKE '%" + ten + "%'";}
	if (index == 2) {sql = "SELECT * FROM `tour_khachhang` WHERE `kh_ten` LIKE '%" + ten + "%'" ;}
	if (index == 3) {sql = "SELECT * FROM `tour_khachhang` WHERE `kh_sdt` LIKE '%" + ten + "%'"  ;}
	if (index == 4) {sql = "SELECT * FROM `tour_khachhang` WHERE `kh_cmnd` LIKE '%" + ten + "%'"  ;}
	setSQL(sql);
	getTable();
	return list;
}

public static void editKh(KhachHang r) {
	String sql= "UPDATE `tour_khachhang` SET `doan_id`='" + r.getDoanId()+ "',`kh_ten`='" + r.getKhTen() + "',`kh_sdt`='" + r.getKhSdt() + "',`kh_cmnd`='" + r.getKhCmnd() + "' WHERE `kh_id`=" + r.getKhId();
	setSQL(sql);
	System.out.println(sql);
	update();
}

}
