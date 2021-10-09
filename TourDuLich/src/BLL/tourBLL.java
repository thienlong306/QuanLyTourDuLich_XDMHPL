package BLL;

import java.util.ArrayList;

import DAL.tourDAL;
import Enity.Tour;

public class tourBLL {
	
	public static Object[][] showAllTour() {
		tourDAL.TourDAL();
		ArrayList<Tour> list = tourDAL.getAllTour();
		int n = list.size();
		
		Object[][] t = new Object [n][5];
		for (int i=0;i<n;i++) {
		t[i][0]=list.get(i).getTourId();
		t[i][1]=list.get(i).getTourTen();
		t[i][2]=list.get(i).getTourMoTa();
		t[i][3]=list.get(i).getLoaiId();
		t[i][4]=list.get(i).getGiaId();
		}
		return t;
		
	}
	
	public static Object[][] showFindTour( int index, String ten) {
		tourDAL.TourDAL();
		ArrayList<Tour> list = tourDAL.findTour(index,ten);
		int n = list.size();
		Object[][] t = new Object [n][5];
		for (int i=0;i<n;i++) {
		t[i][0]=list.get(i).getTourId();
		t[i][1]=list.get(i).getTourTen();
		t[i][2]=list.get(i).getTourMoTa();
		t[i][3]=list.get(i).getLoaiId();
		t[i][4]=list.get(i).getGiaId();
		}
		return t;
	}
	
	public static Object[][] showFindTourAuto( int index, String ten) {
		tourDAL.TourDAL();
		ArrayList<Tour> list = tourDAL.findTourAuto(index,ten);
		int n = list.size();
		Object[][] t = new Object [n][5];
		for (int i=0;i<n;i++) {
		t[i][0]=list.get(i).getTourId();
		t[i][1]=list.get(i).getTourTen();
		t[i][2]=list.get(i).getTourMoTa();
		t[i][3]=list.get(i).getLoaiId();
		t[i][4]=list.get(i).getGiaId();
		}
		return t;
	}
	
	public static Object[][] showAllThongKeTour() {
		tourDAL.TourDAL();
		ArrayList<Tour> list = tourDAL.getAllThongKeTour();
		int n = list.size();
		
		Object[][] t = new Object [n][6];
		for (int i=0;i<n;i++) {
		t[i][0]=list.get(i).getTourId();
		t[i][1]=list.get(i).getTourTen();
		t[i][2]=list.get(i).getTourMoTa();
		t[i][3]=list.get(i).getLoaiId();
		
		if(list.get(i).getTourMoTa().equals("0") || list.get(i).getLoaiId().equals("0") )
		{
			t[i][4]=0;
			t[i][5]=0;
		} else {
			t[i][4]=list.get(i).getGiaId();
			t[i][5] = Integer.parseInt(list.get(i).getLoaiId()) - Integer.parseInt(list.get(i).getGiaId());
			
		}
		}
		return t;
		
	}
	
	
}
