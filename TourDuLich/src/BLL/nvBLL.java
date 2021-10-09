package BLL;

import java.util.ArrayList;

import DAL.nvDAL;
import Enity.NhanVien;

public class nvBLL {
	
	public static Object[][] showAllNhanVien() {
		nvDAL.nvDAL();
		ArrayList<NhanVien> list = nvDAL.getAllNhanVien();
		int n = list.size();
		Object[][] t = new Object [n][5];
		for (int i=0;i<n;i++) {
		t[i][0]=list.get(i).getNvId();
		t[i][1]=list.get(i).getDoanId();
		t[i][2]=list.get(i).getNvTen();
		t[i][3]=list.get(i).getNvSdt();
		t[i][4]=list.get(i).getNvCmnd();
		}
		return t;
		
	}
	
	public static Object[][] showFindNv( int index,String ten) {
		nvDAL.nvDAL();
		ArrayList<NhanVien> list = nvDAL.findNhanVien(index,ten);
		int n = list.size();
		Object[][] t = new Object [n][5];
		for (int i=0;i<n;i++) {
			t[i][0]=list.get(i).getNvId();
			t[i][1]=list.get(i).getDoanId();
			t[i][2]=list.get(i).getNvTen();
			t[i][3]=list.get(i).getNvSdt();
			t[i][4]=list.get(i).getNvCmnd();
		}
		return t;	
	}
	
	public static Object[][] showFindNvAuto( int index,String ten) {
		nvDAL.nvDAL();
		ArrayList<NhanVien> list = nvDAL.findNhanVienAuto(index,ten);
		int n = list.size();
		Object[][] t = new Object [n][5];
		for (int i=0;i<n;i++) {
			t[i][0]=list.get(i).getNvId();
			t[i][1]=list.get(i).getDoanId();
			t[i][2]=list.get(i).getNvTen();
			t[i][3]=list.get(i).getNvSdt();
			t[i][4]=list.get(i).getNvCmnd();
		}
		return t;	
	}

}
