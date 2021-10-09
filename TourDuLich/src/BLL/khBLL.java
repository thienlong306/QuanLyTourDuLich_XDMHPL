package BLL;

import java.util.ArrayList;

import DAL.khDAL;
import DAL.tourDAL;
import Enity.KhachHang;
import Enity.Tour;

public class khBLL {
	
	public static Object[][] showAllKhachHang() {
		khDAL.khDAL();
		ArrayList<KhachHang> list = khDAL.getAllKhachHang();
		int n = list.size();
		Object[][] t = new Object [n][5];
		for (int i=0;i<n;i++) {
		t[i][0]=list.get(i).getKhId();
		t[i][1]=list.get(i).getDoanId();
		t[i][2]=list.get(i).getKhTen();
		t[i][3]=list.get(i).getKhSdt();
		t[i][4]=list.get(i).getKhCmnd();
		}
		return t;
		
	}
	
	public static Object[][] showFindKh( int index,String ten) {
		khDAL.khDAL();
		ArrayList<KhachHang> list = khDAL.findKhachHang(index,ten);
		int n = list.size();
		Object[][] t = new Object [n][5];
		for (int i=0;i<n;i++) {
			t[i][0]=list.get(i).getKhId();
			t[i][1]=list.get(i).getDoanId();
			t[i][2]=list.get(i).getKhTen();
			t[i][3]=list.get(i).getKhSdt();
			t[i][4]=list.get(i).getKhCmnd();
		}
		return t;	
	}
	
	public static Object[][] showFindKhAuto( int index,String ten) {
		khDAL.khDAL();
		ArrayList<KhachHang> list = khDAL.findKhachHangAuto(index,ten);
		int n = list.size();
		Object[][] t = new Object [n][5];
		for (int i=0;i<n;i++) {
			t[i][0]=list.get(i).getKhId();
			t[i][1]=list.get(i).getDoanId();
			t[i][2]=list.get(i).getKhTen();
			t[i][3]=list.get(i).getKhSdt();
			t[i][4]=list.get(i).getKhCmnd();
		}
		return t;	
	}

}
