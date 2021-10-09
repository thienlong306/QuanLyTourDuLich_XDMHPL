package BLL;

import java.util.ArrayList;

import DAL.doanDAL;
import Enity.Doan;

public class doanBLL {
	
	public static Object[][] showAllDoan() {
		doanDAL.DoanDAL();
		ArrayList<Doan> list = doanDAL.getAllTour();
		int n = list.size();
		
		Object[][] t = new Object [n][4];
		for (int i=0;i<n;i++) {
		t[i][0]=list.get(i).getDoanId();
		t[i][1]=list.get(i).getTourId();
		t[i][2]=list.get(i).getDoanTen();
		t[i][3]=list.get(i).getDoanKhoiHanh();
		}
		return t;
		
	}
	
	public static Object[][] showFindDoan( int index, String ten) {
		doanDAL.DoanDAL();
		ArrayList<Doan> list = doanDAL.findDoan(index,ten);
		int n = list.size();
		Object[][] t = new Object [n][4];
		for (int i=0;i<n;i++) {
		t[i][0]=list.get(i).getDoanId();
		t[i][1]=list.get(i).getTourId();
		t[i][2]=list.get(i).getDoanTen();
		t[i][3]=list.get(i).getDoanKhoiHanh();
		}
		return t;
		
	}
	
	public static Object[][] showFindDoanAuto( int index, String ten) {
		doanDAL.DoanDAL();
		ArrayList<Doan> list = doanDAL.findDoanAuto(index,ten);
		int n = list.size();
		Object[][] t = new Object [n][4];
		for (int i=0;i<n;i++) {
		t[i][0]=list.get(i).getDoanId();
		t[i][1]=list.get(i).getTourId();
		t[i][2]=list.get(i).getDoanTen();
		t[i][3]=list.get(i).getDoanKhoiHanh();
		}
		return t;
		
	}
	
	public static Object[][] showAllDoanThongKe() {
		doanDAL.DoanDAL();
		ArrayList<Doan> list = doanDAL.getAllTourThongKe();
		int n = list.size();
		
		Object[][] t = new Object [n][5];
		for (int i=0;i<n;i++) {
		t[i][0]=list.get(i).getDoanId();
		t[i][1]=list.get(i).getDoanTen();
		t[i][2]=list.get(i).getTourId();
		t[i][3]=list.get(i).getDoanKhoiHanh();
		t[i][4] = Integer.parseInt(list.get(i).getTourId())  - Integer.parseInt(list.get(i).getDoanKhoiHanh());
		}
		return t;
		
	}
	
	public static Object[][] showAllDoanThongKeFind(String ten) {
		doanDAL.DoanDAL();
		ArrayList<Doan> list = doanDAL.getAllTourThongKeFind(ten);
		int n = list.size();
		
		Object[][] t = new Object [n][5];
		for (int i=0;i<n;i++) {
		t[i][0]=list.get(i).getDoanId();
		t[i][1]=list.get(i).getDoanTen();
		t[i][2]=list.get(i).getTourId();
		t[i][3]=list.get(i).getDoanKhoiHanh();
		t[i][4] = Integer.parseInt(list.get(i).getTourId())  - Integer.parseInt(list.get(i).getDoanKhoiHanh());
		}
		return t;
		
	}

}
