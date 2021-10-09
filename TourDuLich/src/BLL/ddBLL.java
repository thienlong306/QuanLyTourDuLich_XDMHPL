package BLL;

import java.util.ArrayList;

import DAL.ddDAL;
import DAL.doanDAL;
import Enity.DiaDiem;
import Enity.Doan;

public class ddBLL {
	
	public static Object[][] showAllDiaDiem() {
		ddDAL.DdDAL();
		ArrayList<DiaDiem> list = ddDAL.getAllDd();
		int n = list.size();
		
		Object[][] t = new Object [n][3];
		for (int i=0;i<n;i++) {
		t[i][0]=list.get(i).getDiadiemId();
		t[i][1]=list.get(i).getTourId();
		t[i][2]=list.get(i).getDiadiemTen();
		}
		return t;
		
	}
	
	public static Object[][] showFindDd( int index, String ten) {
		ddDAL.DdDAL();
		ArrayList<DiaDiem> list = ddDAL.findDd(index,ten);
		int n = list.size();
		Object[][] t = new Object [n][3];
		for (int i=0;i<n;i++) {
			t[i][0]=list.get(i).getDiadiemId();
			t[i][1]=list.get(i).getTourId();
			t[i][2]=list.get(i).getDiadiemTen();
		}
		return t;
		
	}
	
	public static Object[][] showFindDdAuto( int index, String ten) {
		ddDAL.DdDAL();
		ArrayList<DiaDiem> list = ddDAL.findDdAuto(index,ten);
		int n = list.size();
		Object[][] t = new Object [n][3];
		for (int i=0;i<n;i++) {
			t[i][0]=list.get(i).getDiadiemId();
			t[i][1]=list.get(i).getTourId();
			t[i][2]=list.get(i).getDiadiemTen();
		}
		return t;
		
	}

}
