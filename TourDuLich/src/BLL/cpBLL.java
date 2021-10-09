package BLL;

import java.util.ArrayList;

import DAL.cpDAL;
import DAL.khDAL;
import DAL.tourDAL;
import Enity.ChiPhi;
import Enity.KhachHang;
import Enity.Tour;

public class cpBLL {
	
	public static Object[][] showAllChiPhi() {
		cpDAL.cpDAL();
		ArrayList<ChiPhi> list = cpDAL.getAllChiPhi();
		int n = list.size();
		Object[][] t = new Object [n][5];
		for (int i=0;i<n;i++) {
		t[i][0]=list.get(i).getCpId();
		t[i][1]=list.get(i).getDoanId();
		t[i][2]=list.get(i).getCpCt();
		t[i][3]=list.get(i).getCpGia();
		}
		return t;
		
	}
	
	public static Object[][] showFindCp( int index,String ten) {
		cpDAL.cpDAL();
		ArrayList<ChiPhi> list = cpDAL.findChiPhi(index,ten);
		int n = list.size();
		Object[][] t = new Object [n][4];
		for (int i=0;i<n;i++) {
			t[i][0]=list.get(i).getCpId();
			t[i][1]=list.get(i).getDoanId();
			t[i][2]=list.get(i).getCpCt();
			t[i][3]=list.get(i).getCpGia();
		}
		return t;	
	}
	public static Object[][] showFindCpAuto( int index,String ten) {
		cpDAL.cpDAL();
		ArrayList<ChiPhi> list = cpDAL.findChiPhiAuto(index,ten);
		int n = list.size();
		Object[][] t = new Object [n][4];
		for (int i=0;i<n;i++) {
			t[i][0]=list.get(i).getCpId();
			t[i][1]=list.get(i).getDoanId();
			t[i][2]=list.get(i).getCpCt();
			t[i][3]=list.get(i).getCpGia();
		}
		return t;	
	}
	
}
