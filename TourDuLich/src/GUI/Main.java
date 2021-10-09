package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import BLL.cpBLL;
import BLL.ddBLL;
import BLL.doanBLL;
import BLL.khBLL;
import BLL.nvBLL;
import BLL.tourBLL;
import DAL.cpDAL;
import DAL.ddDAL;
import DAL.doanDAL;
import DAL.khDAL;
import DAL.nvDAL;
import DAL.tourDAL;
import Enity.ChiPhi;
import Enity.DiaDiem;
import Enity.Doan;
import Enity.KhachHang;
import Enity.NhanVien;
import Enity.Tour;

import javax.swing.JTabbedPane;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.ImageIcon;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private DefaultTableModel model;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTable table_1;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTable table_2;
	private JTextField textField_10;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTable table_3;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTable table_4;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTable table_5;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTable table_6;
	private JTable table_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					
					Main frame = new Main();
					
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private void loadAllTourToModel() {
		
		Object [][] listtour = tourBLL.showAllTour();
		String[] col= {"Id Tour","Tên Tour","Mô tả","Loại Tour","Giá Tour"};
		model = new DefaultTableModel(listtour,col);
		table.setModel(model);
	}
	private void loadAllKhachHangToModel() {
		
		Object [][] listkh = khBLL.showAllKhachHang();
		String[] col= {"Id Khách Hàng","Id Đòan","Tên Khách Hàng","SĐT Khách Hàng","CMND Khách Hàng"};
		model = new DefaultTableModel(listkh,col);
		table_1.setModel(model);
	}
	private void loadAllDoanToModel() {
		
		Object [][] listdoan = doanBLL.showAllDoan();
		String[] col= {"Id Đoàn","Id Tour","Tên Đoàn","Khởi Hành"};
		model = new DefaultTableModel(listdoan,col);
		table_2.setModel(model);
	}
	private void loadAllNhanVienToModel() {
		
		Object [][] listnv = nvBLL.showAllNhanVien();
		String[] col= {"Id NhânViên","Id Đoàn","Tên NhânViên","SĐT NhânViên","Công Việc"};
		model = new DefaultTableModel(listnv,col);
		table_3.setModel(model);
	}
	private void loadAllChiPhiToModel() {
		
		Object [][] listcp = cpBLL.showAllChiPhi();
		String[] col= {"Id ChiPhí","Id Đoàn","Chi Tiết","Giá"};
		model = new DefaultTableModel(listcp,col);
		table_4.setModel(model);
	}
	private void loadAllDiaDiemToModel() {
		
		Object [][] listdd = ddBLL.showAllDiaDiem();
		String[] col= {"Id Địa Điểm","Id Tour","Tên Địa Điểm"};
		model = new DefaultTableModel(listdd,col);
		table_5.setModel(model);
	}
	private void loadAllThongKeToModel() {
		Object [][] listdoan = doanBLL.showAllDoanThongKe();
		String[] col1= {"Id Đoàn","Tên Đoàn","Doanh Thu","Chi phí","Lãi"};
		model = new DefaultTableModel(listdoan,col1);
		table_7.setModel(model);
		
		Object [][] listdd = tourBLL.showAllThongKeTour();
		String[] col= {"Id Tour","Tên Tour","Tổng sô đoàn đi","Tổng doanh du","Tổng chi phí","Lãi"};
		model = new DefaultTableModel(listdd,col);
		table_6.setModel(model);
		
		
	}
	
	public Main() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 1152, 633);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(213, -24, 916, 657);
		contentPane.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Trang Chủ", null, panel_6, null);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Quản lý Tour Du Lịch");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 60));
		panel_6.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Tour", null, panel_1, null);
		panel_1.setLayout(null);
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(8, 10, 145, 35);
		comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id Tour","Tên Tour","Mô tả","Loại Tour","Giá Tour" }));
		panel_1.add(comboBox);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int index = comboBox.getSelectedIndex();
				String t = textField.getText();
				if(!t.equals("")) {
				Object [][] listtour = tourBLL.showFindTourAuto(index,t);
				String[] col= {"Id Tour","Tên Tour","Mô tả","Loại Tour","Giá Tour"};
				model = new DefaultTableModel(listtour,col);
				table.setModel(model);
				}
				else loadAllTourToModel();
			}
		});
		textField.setBounds(163, 10, 200, 35);
		panel_1.add(textField);
		textField.setColumns(10);
		JButton btnNewButton_2 = new JButton("Tìm kiếm");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = comboBox.getSelectedIndex();
				String t = textField.getText();
				if(!t.equals("")) {
				Object [][] listtour = tourBLL.showFindTour(index,t);
				String[] col= {"Id Tour","Tên Tour","Mô tả","Loại Tour","Giá Tour"};
				model = new DefaultTableModel(listtour,col);
				table.setModel(model);
				}
				else loadAllTourToModel();
			}
		});
		btnNewButton_2.setBounds(373, 10, 98, 35);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Thêm");
		btnNewButton_2_1.setBackground(Color.WHITE);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tour r = new Tour (null,textField_2.getText(),textField_3.getText(),textField_4.getText(),textField_5.getText());
				tourDAL.insertTour(r);
				loadAllTourToModel();
			}
		});
		btnNewButton_2_1.setBounds(481, 10, 98, 35);
		panel_1.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("Xóa");
		btnNewButton_2_1_1.setBackground(Color.WHITE);
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tour r = new Tour(textField_1.getText(),null,null,null,null);
				tourDAL.deleteTour(r);
				loadAllTourToModel();
			}
		});
		btnNewButton_2_1_1.setBounds(589, 10, 98, 35);
		panel_1.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1_2 = new JButton("Sửa");
		btnNewButton_2_1_2.setBackground(Color.WHITE);
		btnNewButton_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tour r = new Tour(textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),textField_5.getText());
				tourDAL.editTour(r);
				loadAllTourToModel();
			}
		});
		btnNewButton_2_1_2.setBounds(697, 10, 98, 35);
		panel_1.add(btnNewButton_2_1_2);
		
		JButton btnNewButton_2_1_3 = new JButton("Làm mới");
		btnNewButton_2_1_3.setBackground(Color.WHITE);
		btnNewButton_2_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadAllTourToModel();
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
			}
		});
		btnNewButton_2_1_3.setBounds(805, 10, 98, 35);
		panel_1.add(btnNewButton_2_1_3);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(113, 78, 233, 35);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(113, 123, 233, 35);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(113, 168, 233, 35);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(562, 78, 233, 35);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(562, 123, 233, 35);
		panel_1.add(textField_5);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 277, 893, 340);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int SelectedRowIndex = table.getSelectedRow();
				textField_1.setText(model.getValueAt(SelectedRowIndex, 0).toString());
				textField_2.setText(model.getValueAt(SelectedRowIndex, 1).toString());
				textField_3.setText(model.getValueAt(SelectedRowIndex, 2).toString());
				textField_4.setText(model.getValueAt(SelectedRowIndex, 3).toString());
				textField_5.setText(model.getValueAt(SelectedRowIndex, 4).toString());
			}
		});
		scrollPane.setViewportView(table);
		
		
		JLabel lblNewLabel = new JLabel("Id Tour");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 78, 99, 35);
		panel_1.add(lblNewLabel);
		
		JLabel lblMT = new JLabel("Tên Tour");
		lblMT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMT.setBounds(10, 123, 99, 35);
		panel_1.add(lblMT);
		
		JLabel lblLoiTour = new JLabel("Mô Tả");
		lblLoiTour.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoiTour.setBounds(10, 168, 99, 35);
		panel_1.add(lblLoiTour);
		
		JLabel lblDanhSchCc = new JLabel("Loại Tour");
		lblDanhSchCc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDanhSchCc.setBounds(373, 78, 179, 35);
		panel_1.add(lblDanhSchCc);
		
		JLabel lblXemGi = new JLabel("Giá Tour");
		lblXemGi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblXemGi.setBounds(373, 121, 99, 35);
		panel_1.add(lblXemGi);
		
		JButton btnNewButton_3 = new JButton("Địa điểm của Tour đã chọn");
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = 1;
				String t = textField_1.getText();
				if(!t.equals("")) {
				Object [][] listdd = ddBLL.showFindDd(index,t);
				String[] col= {"Id Địa Điểm","Id Tour","Tên Địa Điểm"};
				model = new DefaultTableModel(listdd,col);
				table_5.setModel(model);
				textField_28.setText(t);
				tabbedPane.setSelectedIndex(6);
				}
				
				
			}
		});
		btnNewButton_3.setBounds(10, 224, 233, 43);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Đoàn của Tour đã chọn");
		btnNewButton_3_1.setBackground(Color.WHITE);
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = 1;
				String t = textField_1.getText();
				if(!t.equals("")) {
				Object [][] listtour = doanBLL.showFindDoan(index,t);
				String[] col= {"Id Đoàn","Id Tour","Tên Đoàn","Khởi Hành"};
				model = new DefaultTableModel(listtour,col);
				table_2.setModel(model);
				textField_8.setText(t);
				tabbedPane.setSelectedIndex(2);
				}
				
			}
		});
		btnNewButton_3_1.setBounds(253, 224, 233, 43);
		panel_1.add(btnNewButton_3_1);
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Đoàn", null, panel_2, null);
		panel_2.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 10, 145, 35);
		comboBox_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id Đoàn","Id Tour","Tên Đoàn","Khởi Hành" }));
		panel_2.add(comboBox_1);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int index = comboBox_1.getSelectedIndex();
				String t = textField_6.getText();
				if(!t.equals("")) {
				Object [][] listtour = doanBLL.showFindDoanAuto(index,t);
				String[] col= {"Id Đoàn","Id Tour","Tên Đoàn","Khởi Hành"};
				model = new DefaultTableModel(listtour,col);
				table_2.setModel(model);
				}
				else loadAllDoanToModel();
			}
		});
		textField_6.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				
			}
		});
		textField_6.setColumns(10);
		textField_6.setBounds(165, 10, 200, 35);
		panel_2.add(textField_6);
		
		
		
		JButton btnNewButton_2_2 = new JButton("Tìm kiếm");
		btnNewButton_2_2.setBackground(Color.WHITE);
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = comboBox_1.getSelectedIndex();
				String t = textField_6.getText();
				if(!t.equals("")) {
				Object [][] listtour = doanBLL.showFindDoan(index,t);
				String[] col= {"Id Đoàn","Id Tour","Tên Đoàn","Khởi Hành"};
				model = new DefaultTableModel(listtour,col);
				table_2.setModel(model);
				}
				else loadAllDoanToModel();
			}
		});
		btnNewButton_2_2.setBounds(375, 10, 98, 35);
		panel_2.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_1_4 = new JButton("Thêm");
		btnNewButton_2_1_4.setBackground(Color.WHITE);
		btnNewButton_2_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Doan r = new Doan (null,textField_8.getText(),textField_9.getText(),textField_25.getText());
				doanDAL.insertDoan(r);
				loadAllDoanToModel();
				
			}
		});
		btnNewButton_2_1_4.setBounds(483, 10, 98, 35);
		panel_2.add(btnNewButton_2_1_4);
		
		JButton btnNewButton_2_1_1_1 = new JButton("Xóa");
		btnNewButton_2_1_1_1.setBackground(Color.WHITE);
		btnNewButton_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Doan r = new Doan(textField_7.getText(),null,null,null);
				doanDAL.deleteDoan(r);
				loadAllDoanToModel();
				
			}
		});
		btnNewButton_2_1_1_1.setBounds(591, 10, 98, 35);
		panel_2.add(btnNewButton_2_1_1_1);
		
		JButton btnNewButton_2_1_2_1 = new JButton("Sửa");
		btnNewButton_2_1_2_1.setBackground(Color.WHITE);
		btnNewButton_2_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Doan r = new Doan(textField_7.getText(),textField_8.getText(),textField_9.getText(),textField_25.getText());
				doanDAL.editDoan(r);
				loadAllDoanToModel();
			}
		});
		btnNewButton_2_1_2_1.setBounds(699, 10, 98, 35);
		panel_2.add(btnNewButton_2_1_2_1);
		
		JButton btnNewButton_2_1_3_1 = new JButton("Làm mới");
		btnNewButton_2_1_3_1.setBackground(Color.WHITE);
		btnNewButton_2_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadAllDoanToModel();
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_25.setText("");
			}
		});
		btnNewButton_2_1_3_1.setBounds(807, 10, 98, 35);
		panel_2.add(btnNewButton_2_1_3_1);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(115, 78, 233, 35);
		panel_2.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(115, 123, 233, 35);
		panel_2.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(115, 168, 233, 35);
		panel_2.add(textField_9);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 277, 893, 340);
		panel_2.add(scrollPane_1);
		
		table_2 = new JTable();
		table_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int SelectedRowIndex = table_2.getSelectedRow();
				textField_7.setText(model.getValueAt(SelectedRowIndex, 0).toString());
				textField_8.setText(model.getValueAt(SelectedRowIndex, 1).toString());
				textField_9.setText(model.getValueAt(SelectedRowIndex, 2).toString());
				textField_25.setText(model.getValueAt(SelectedRowIndex, 3).toString());
			}
		});
		scrollPane_1.setViewportView(table_2);
		
		JLabel lblIdon = new JLabel("Id Đoàn");
		lblIdon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdon.setBounds(12, 78, 99, 35);
		panel_2.add(lblIdon);
		
		JLabel lblIdTour = new JLabel("Id Tour");
		lblIdTour.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdTour.setBounds(12, 123, 99, 35);
		panel_2.add(lblIdTour);
		
		JLabel lblTn = new JLabel("Tên Đoàn");
		lblTn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTn.setBounds(12, 168, 99, 35);
		panel_2.add(lblTn);
		
		JLabel lblKhiHnh = new JLabel("Khởi Hành");
		lblKhiHnh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKhiHnh.setBounds(461, 78, 99, 35);
		panel_2.add(lblKhiHnh);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(564, 78, 233, 35);
		panel_2.add(textField_25);
		
		JButton btnNewButton_3_2 = new JButton("Nhân viên của Đoàn");
		btnNewButton_3_2.setBackground(Color.WHITE);
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = 1;
				String t = textField_7.getText();
				if(!t.equals("")) {
				Object [][] listnv = nvBLL.showFindNv(index,t);
				String[] col= {"Id NhânViên","Id Đoàn","Tên NhânViên","SĐT NhânViên","Công Việc"};
				model = new DefaultTableModel(listnv,col);
				table_3.setModel(model);
				textField_31.setText(t);
				tabbedPane.setSelectedIndex(4);
				}
				
			}
		});
		btnNewButton_3_2.setBounds(10, 213, 233, 43);
		panel_2.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_3 = new JButton("Khách hàng của Đoàn");
		btnNewButton_3_3.setBackground(Color.WHITE);
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = 1;
				String t = textField_7.getText();
				if(!t.equals("")) {
				Object [][] listkh= khBLL.showFindKh(index,t);
				String[] col= {"Id Khách Hàng","Id Đoàn","Tên Khách Hàng","SĐT Khách Hàng","CMND Khách Hàng"};
				model = new DefaultTableModel(listkh,col);
				table_1.setModel(model);
				textField_30.setText(t);
				tabbedPane.setSelectedIndex(3);
				}
				
			}
		});
		btnNewButton_3_3.setBounds(251, 213, 233, 43);
		panel_2.add(btnNewButton_3_3);
		
		JButton btnNewButton_3_4 = new JButton("Chi phí của Đoàn");
		btnNewButton_3_4.setBackground(Color.WHITE);
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = 1;
				String t = textField_7.getText();
				if(!t.equals("")) {
				Object [][] listcp = cpBLL.showFindCp(index,t);
				String[] col= {"Id ChiPhí","Id Đoàn","Chi Tiết","Giá"};
				model = new DefaultTableModel(listcp,col);
				table_4.setModel(model);
				textField_22.setText(t);
				tabbedPane.setSelectedIndex(5);
				}
			
			}
		});
		btnNewButton_3_4.setBounds(494, 213, 233, 43);
		panel_2.add(btnNewButton_3_4);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 216, 633);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setForeground(Color.BLACK);
		tabbedPane.addTab("Khách", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton bt_AddKh = new JButton("Thêm");
		bt_AddKh.setBackground(Color.WHITE);
		bt_AddKh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KhachHang r = new KhachHang (null,textField_30.getText(),textField_14.getText(),textField_15.getText(),textField_16.getText());
				khDAL.insertKh(r);
				loadAllKhachHangToModel();
				
			}
		});
		bt_AddKh.setBounds(481, 10, 98, 35);
		panel_3.add(bt_AddKh);
		
		JButton bt_DeKh = new JButton("Xóa");
		bt_DeKh.setBackground(Color.WHITE);
		bt_DeKh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KhachHang r = new KhachHang(textField_13.getText(),null,null,null,null);
				khDAL.deleteKh(r);
				loadAllKhachHangToModel();
			}
		});
		bt_DeKh.setBounds(589, 10, 98, 35);
		panel_3.add(bt_DeKh);
		
		JButton bt_EdKh = new JButton("Sửa");
		bt_EdKh.setBackground(Color.WHITE);
		bt_EdKh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KhachHang r = new KhachHang(textField_13.getText(),textField_30.getText(),textField_14.getText(),textField_15.getText(),textField_16.getText());
				khDAL.editKh(r);
				loadAllKhachHangToModel();
			}
		});
		bt_EdKh.setBounds(697, 10, 98, 35);
		panel_3.add(bt_EdKh);
		
		JButton bt_ReKh = new JButton("Làm mới");
		bt_ReKh.setBackground(Color.WHITE);
		bt_ReKh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadAllKhachHangToModel();
				textField_10.setText("");
				textField_30.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
			}
		});
		bt_ReKh.setBounds(805, 10, 98, 35);
		panel_3.add(bt_ReKh);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(113, 78, 233, 35);
		panel_3.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(113, 168, 233, 35);
		panel_3.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(562, 123, 233, 35);
		panel_3.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(562, 78, 233, 35);
		panel_3.add(textField_16);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 277, 893, 340);
		panel_3.add(scrollPane_2);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int SelectedRowIndex = table_1.getSelectedRow();
				textField_13.setText(model.getValueAt(SelectedRowIndex, 0).toString());
				textField_30.setText(model.getValueAt(SelectedRowIndex, 1).toString());
				textField_14.setText(model.getValueAt(SelectedRowIndex, 2).toString());
				textField_15.setText(model.getValueAt(SelectedRowIndex, 3).toString());
				textField_16.setText(model.getValueAt(SelectedRowIndex, 4).toString());
			}
		});
		scrollPane_2.setViewportView(table_1);
		
		JLabel lblIdKhchHng = new JLabel("Id Khách");
		lblIdKhchHng.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdKhchHng.setBounds(10, 78, 99, 35);
		panel_3.add(lblIdKhchHng);
		
		JLabel lblTnKhch = new JLabel("Tên Khách");
		lblTnKhch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTnKhch.setBounds(10, 168, 99, 35);
		panel_3.add(lblTnKhch);
		
		JLabel lblStKhch = new JLabel("SĐT Khách");
		lblStKhch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStKhch.setBounds(373, 121, 99, 35);
		panel_3.add(lblStKhch);
		
		JLabel lblCmndKhch = new JLabel("CMND Khách");
		lblCmndKhch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCmndKhch.setBounds(373, 78, 179, 35);
		panel_3.add(lblCmndKhch);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(10, 10, 145, 35);
		comboBox_1_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id Khách Hàng","Id Đoàn","Tên Khách Hàng","SĐT Khách Hàng","CMND Khách Hàng" }));
		panel_3.add(comboBox_1_1);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int index = comboBox_1_1.getSelectedIndex();
				String t = textField_10.getText();
				if(!t.equals("")) {
				Object [][] listkh= khBLL.showFindKhAuto(index,t);
				String[] col= {"Id Khách Hàng","Id Đoàn","Tên Khách Hàng","SĐT Khách Hàng","CMND Khách Hàng"};
				model = new DefaultTableModel(listkh,col);
				table_1.setModel(model);
				}
				else loadAllKhachHangToModel();
			}
		});
		textField_10.setColumns(10);
		textField_10.setBounds(165, 10, 200, 35);
		panel_3.add(textField_10);
		
		
		
		JButton btnNewButton_2_2_1 = new JButton("Tìm kiếm");
		btnNewButton_2_2_1.setBackground(Color.WHITE);
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = comboBox_1_1.getSelectedIndex();
				String t = textField_10.getText();
				if(!t.equals("")) {
				Object [][] listkh= khBLL.showFindKh(index,t);
				String[] col= {"Id Khách Hàng","Id Đoàn","Tên Khách Hàng","SĐT Khách Hàng","CMND Khách Hàng"};
				model = new DefaultTableModel(listkh,col);
				table_1.setModel(model);
				}
				else loadAllKhachHangToModel();
			}
		});
		btnNewButton_2_2_1.setBounds(373, 10, 98, 35);
		panel_3.add(btnNewButton_2_2_1);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(113, 123, 233, 35);
		panel_3.add(textField_30);
		
		JLabel lblIdon_2 = new JLabel("Id Đoàn");
		lblIdon_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdon_2.setBounds(10, 123, 99, 35);
		panel_3.add(lblIdon_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("NViên", null, panel_4, null);
		panel_4.setLayout(null);
		
		JButton bt_AddKh_1 = new JButton("Thêm");
		bt_AddKh_1.setBackground(Color.WHITE);
		bt_AddKh_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NhanVien r = new NhanVien (null,textField_31.getText(),textField_18.getText(),textField_19.getText(),textField_20.getText());
				nvDAL.insertNv(r);
				loadAllNhanVienToModel();
			}
		});
		bt_AddKh_1.setBounds(481, 10, 98, 35);
		panel_4.add(bt_AddKh_1);
		
		JButton bt_DeKh_1 = new JButton("Xóa");
		bt_DeKh_1.setBackground(Color.WHITE);
		bt_DeKh_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NhanVien r = new NhanVien(textField_17.getText(),null,null,null,null);
				nvDAL.deleteNv(r);
				loadAllNhanVienToModel();
			}
		});
		bt_DeKh_1.setBounds(589, 10, 98, 35);
		panel_4.add(bt_DeKh_1);
		
		JButton bt_EdKh_1 = new JButton("Sửa");
		bt_EdKh_1.setBackground(Color.WHITE);
		bt_EdKh_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NhanVien r = new NhanVien(textField_17.getText(),textField_31.getText(),textField_18.getText(),textField_19.getText(),textField_20.getText());
				nvDAL.editNv(r);
				loadAllNhanVienToModel();
			}
		});
		bt_EdKh_1.setBounds(697, 10, 98, 35);
		panel_4.add(bt_EdKh_1);
		
		JButton bt_ReKh_1 = new JButton("Làm mới");
		bt_ReKh_1.setBackground(Color.WHITE);
		bt_ReKh_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadAllNhanVienToModel();
				textField_21.setText("");
				textField_17.setText("");
				textField_31.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
			}
		});
		bt_ReKh_1.setBounds(805, 10, 98, 35);
		panel_4.add(bt_ReKh_1);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(113, 78, 233, 35);
		panel_4.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(113, 168, 233, 35);
		panel_4.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(562, 123, 233, 35);
		panel_4.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(562, 78, 233, 35);
		panel_4.add(textField_20);
		
		JScrollPane scrollPane_2_1 = new JScrollPane();
		scrollPane_2_1.setBounds(10, 277, 893, 340);
		panel_4.add(scrollPane_2_1);
		
		table_3 = new JTable();
		table_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int SelectedRowIndex = table_3.getSelectedRow();
				textField_17.setText(model.getValueAt(SelectedRowIndex, 0).toString());
				textField_31.setText(model.getValueAt(SelectedRowIndex, 1).toString());
				textField_18.setText(model.getValueAt(SelectedRowIndex, 2).toString());
				textField_19.setText(model.getValueAt(SelectedRowIndex, 3).toString());
				textField_20.setText(model.getValueAt(SelectedRowIndex, 4).toString());
			}
		});
		scrollPane_2_1.setViewportView(table_3);
		
		JLabel lblIdNhanvien = new JLabel("Id NhânViên");
		lblIdNhanvien.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdNhanvien.setBounds(10, 78, 99, 35);
		panel_4.add(lblIdNhanvien);
		
		JLabel lblTnNhnVin = new JLabel("Tên NhânViên");
		lblTnNhnVin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTnNhnVin.setBounds(10, 168, 99, 35);
		panel_4.add(lblTnNhnVin);
		
		JLabel lblStNhnvin = new JLabel("SĐT NhânViên");
		lblStNhnvin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStNhnvin.setBounds(373, 121, 99, 35);
		panel_4.add(lblStNhnvin);
		
		JLabel lblCmndNhnvin = new JLabel("Công Việc");
		lblCmndNhnvin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCmndNhnvin.setBounds(373, 78, 179, 35);
		panel_4.add(lblCmndNhnvin);
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setBounds(10, 10, 145, 35);
		comboBox_1_1_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id NhânViên","Id Đoàn","Tên NhânViên","SĐT NhânViên","Công Việc" }));
		panel_4.add(comboBox_1_1_1);
		textField_21 = new JTextField();
		textField_21.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int index = comboBox_1_1_1.getSelectedIndex();
				String t = textField_21.getText();
				if(!t.equals("")) {
				Object [][] listnv = nvBLL.showFindNvAuto(index,t);
				String[] col= {"Id NhânViên","Id Đoàn","Tên NhânViên","SĐT NhânViên","Công Việc"};
				model = new DefaultTableModel(listnv,col);
				table_3.setModel(model);
				}
				else loadAllNhanVienToModel();
			}
		});
		textField_21.setColumns(10);
		textField_21.setBounds(165, 10, 200, 35);
		panel_4.add(textField_21);
		
		
		
		JButton btnNewButton_2_2_1_1 = new JButton("Tìm kiếm");
		btnNewButton_2_2_1_1.setBackground(Color.WHITE);
		btnNewButton_2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = comboBox_1_1_1.getSelectedIndex();
				String t = textField_21.getText();
				if(!t.equals("")) {
				Object [][] listnv = nvBLL.showFindNv(index,t);
				String[] col= {"Id NhânViên","Id Đoàn","Tên NhânViên","SĐT NhânViên","Công Việc"};
				model = new DefaultTableModel(listnv,col);
				table_3.setModel(model);
				}
				else loadAllNhanVienToModel();
			}
		});
		btnNewButton_2_2_1_1.setBounds(373, 10, 98, 35);
		panel_4.add(btnNewButton_2_2_1_1);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(113, 123, 233, 35);
		panel_4.add(textField_31);
		
		JLabel lblIdon_3 = new JLabel("Id Đoàn");
		lblIdon_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdon_3.setBounds(10, 123, 99, 35);
		panel_4.add(lblIdon_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Chi Phí", null, panel_5, null);
		panel_5.setLayout(null);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(10, 10, 145, 35);
		comboBox_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id ChiPhí","Id Đoàn","Chi Tiết","Giá" }));
		panel_5.add(comboBox_2);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int index = comboBox_2.getSelectedIndex();
				String t = textField_11.getText();
				if(!t.equals("")) {
				Object [][] listcp = cpBLL.showFindCpAuto(index,t);
				String[] col= {"Id ChiPhí","Id Đoàn","Chi Tiết","Giá"};
				model = new DefaultTableModel(listcp,col);
				table_4.setModel(model);
				}
				else loadAllChiPhiToModel();
			}
			
		});
		textField_11.setColumns(10);
		textField_11.setBounds(165, 10, 200, 35);
		panel_5.add(textField_11);
		
		
		JButton btnNewButton_2_3 = new JButton("Tìm kiếm");
		btnNewButton_2_3.setBackground(Color.WHITE);
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = comboBox_2.getSelectedIndex();
				String t = textField_11.getText();
				if(!t.equals("")) {
				Object [][] listcp = cpBLL.showFindCp(index,t);
				String[] col= {"Id ChiPhí","Id Đoàn","Chi Tiết","Giá"};
				model = new DefaultTableModel(listcp,col);
				table_4.setModel(model);
				}
				else loadAllChiPhiToModel();
			}
		});
		btnNewButton_2_3.setBounds(375, 10, 98, 35);
		panel_5.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_1_5 = new JButton("Thêm");
		btnNewButton_2_1_5.setBackground(Color.WHITE);
		btnNewButton_2_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChiPhi r = new ChiPhi (null,textField_22.getText(),textField_23.getText(),textField_24.getText());
				cpDAL.insertCp(r);
				loadAllChiPhiToModel();
			}
		});
		btnNewButton_2_1_5.setBounds(483, 10, 98, 35);
		panel_5.add(btnNewButton_2_1_5);
		
		JButton btnNewButton_2_1_1_2 = new JButton("Xóa");
		btnNewButton_2_1_1_2.setBackground(Color.WHITE);
		btnNewButton_2_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChiPhi r = new ChiPhi(textField_12.getText(),null,null,null);
				cpDAL.deleteCp(r);
				loadAllChiPhiToModel();
			}
		});
		btnNewButton_2_1_1_2.setBounds(591, 10, 98, 35);
		panel_5.add(btnNewButton_2_1_1_2);
		
		JButton btnNewButton_2_1_2_2 = new JButton("Sửa");
		btnNewButton_2_1_2_2.setBackground(Color.WHITE);
		btnNewButton_2_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChiPhi r = new ChiPhi(textField_12.getText(),textField_22.getText(),textField_23.getText(),textField_24.getText());
				cpDAL.editCp(r);
				loadAllChiPhiToModel();
			}
		});
		btnNewButton_2_1_2_2.setBounds(699, 10, 98, 35);
		panel_5.add(btnNewButton_2_1_2_2);
		
		JButton btnNewButton_2_1_3_2 = new JButton("Làm mới");
		btnNewButton_2_1_3_2.setBackground(Color.WHITE);
		btnNewButton_2_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadAllChiPhiToModel();
				textField_11.setText("");
				textField_12.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");
			}
		});
		btnNewButton_2_1_3_2.setBounds(807, 10, 98, 35);
		panel_5.add(btnNewButton_2_1_3_2);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(115, 78, 233, 35);
		panel_5.add(textField_12);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(115, 123, 233, 35);
		panel_5.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(115, 168, 233, 35);
		panel_5.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(564, 78, 233, 35);
		panel_5.add(textField_24);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(12, 277, 893, 340);
		panel_5.add(scrollPane_3);
		
		table_4 = new JTable();
		table_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int SelectedRowIndex = table_4.getSelectedRow();
				textField_12.setText(model.getValueAt(SelectedRowIndex, 0).toString());
				textField_22.setText(model.getValueAt(SelectedRowIndex, 1).toString());
				textField_23.setText(model.getValueAt(SelectedRowIndex, 2).toString());
				textField_24.setText(model.getValueAt(SelectedRowIndex, 3).toString());	
			}
		});
		scrollPane_3.setViewportView(table_4);
		
		JLabel lblIdChiPh = new JLabel("Id Chi Phí");
		lblIdChiPh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdChiPh.setBounds(12, 78, 99, 35);
		panel_5.add(lblIdChiPh);
		
		JLabel lblIdon_1 = new JLabel("Id Đoàn");
		lblIdon_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdon_1.setBounds(12, 123, 99, 35);
		panel_5.add(lblIdon_1);
		
		JLabel lblChiTitChi = new JLabel("Chi Tiết");
		lblChiTitChi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblChiTitChi.setBounds(12, 168, 99, 35);
		panel_5.add(lblChiTitChi);
		
		JLabel lblGiChiPh = new JLabel("Giá");
		lblGiChiPh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGiChiPh.setBounds(375, 78, 179, 35);
		panel_5.add(lblGiChiPh);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Địa Điểm", null, panel_7, null);
		panel_7.setLayout(null);
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setBounds(10, 10, 145, 35);
		comboBox_1_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id Địa Điểm","Id Tour","Tên Địa Điểm" }));
		panel_7.add(comboBox_1_2);
		
		textField_26 = new JTextField();
		textField_26.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int index = comboBox_1_2.getSelectedIndex();
				String t = textField_26.getText();
				if(!t.equals("")) {
				Object [][] listdd = ddBLL.showFindDdAuto(index,t);
				String[] col= {"Id Địa Điểm","Id Tour","Tên Địa Điểm"};
				model = new DefaultTableModel(listdd,col);
				table_5.setModel(model);
				
				}
				else loadAllDiaDiemToModel();
			}
		});
		textField_26.setColumns(10);
		textField_26.setBounds(165, 10, 200, 35);
		panel_7.add(textField_26);
		
		
		
		JButton btnNewButton_2_2_2 = new JButton("Tìm kiếm");
		btnNewButton_2_2_2.setBackground(Color.WHITE);
		btnNewButton_2_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = comboBox_1_2.getSelectedIndex();
				String t = textField_26.getText();
				if(!t.equals("")) {
				Object [][] listdd = ddBLL.showFindDd(index,t);
				String[] col= {"Id Địa Điểm","Id Tour","Tên Địa Điểm"};
				model = new DefaultTableModel(listdd,col);
				table_5.setModel(model);
				
				}
				else loadAllDiaDiemToModel();
			}
		});
		btnNewButton_2_2_2.setBounds(375, 10, 98, 35);
		panel_7.add(btnNewButton_2_2_2);
		
		JButton btnNewButton_2_1_4_1 = new JButton("Thêm");
		btnNewButton_2_1_4_1.setBackground(Color.WHITE);
		btnNewButton_2_1_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DiaDiem r = new DiaDiem (null,textField_28.getText(),textField_29.getText());
				ddDAL.insertDd(r);
				loadAllDiaDiemToModel();
			}
		});
		btnNewButton_2_1_4_1.setBounds(483, 10, 98, 35);
		panel_7.add(btnNewButton_2_1_4_1);
		
		JButton btnNewButton_2_1_1_1_1 = new JButton("Xóa");
		btnNewButton_2_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_2_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DiaDiem r = new DiaDiem(textField_27.getText(),null,null);
				ddDAL.deleteDd(r);
				loadAllDiaDiemToModel();
			}
		});
		btnNewButton_2_1_1_1_1.setBounds(591, 10, 98, 35);
		panel_7.add(btnNewButton_2_1_1_1_1);
		
		JButton btnNewButton_2_1_2_1_1 = new JButton("Sửa");
		btnNewButton_2_1_2_1_1.setBackground(Color.WHITE);
		btnNewButton_2_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DiaDiem r = new DiaDiem(textField_27.getText(),textField_28.getText(),textField_29.getText());
				ddDAL.editDd(r);
				loadAllDiaDiemToModel();
			}
		});
		btnNewButton_2_1_2_1_1.setBounds(699, 10, 98, 35);
		panel_7.add(btnNewButton_2_1_2_1_1);
		
		JButton btnNewButton_2_1_3_1_1 = new JButton("Làm mới");
		btnNewButton_2_1_3_1_1.setBackground(Color.WHITE);
		btnNewButton_2_1_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loadAllDiaDiemToModel();
				textField_26.setText("");
				textField_27.setText("");
				textField_28.setText("");
				textField_29.setText("");
			}
		});
		btnNewButton_2_1_3_1_1.setBounds(807, 10, 98, 35);
		panel_7.add(btnNewButton_2_1_3_1_1);
		
		textField_27 = new JTextField();
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBounds(115, 78, 233, 35);
		panel_7.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(115, 123, 233, 35);
		panel_7.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(115, 168, 233, 35);
		panel_7.add(textField_29);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(12, 277, 893, 340);
		panel_7.add(scrollPane_1_1);
		
		table_5 = new JTable();
		table_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int SelectedRowIndex = table_5.getSelectedRow();
				textField_27.setText(model.getValueAt(SelectedRowIndex, 0).toString());
				textField_28.setText(model.getValueAt(SelectedRowIndex, 1).toString());
				textField_29.setText(model.getValueAt(SelectedRowIndex, 2).toString());
			
			}
		});
		scrollPane_1_1.setViewportView(table_5);
		
		JLabel lblIdaim = new JLabel("Id Địa Điểm");
		lblIdaim.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdaim.setBounds(12, 78, 99, 35);
		panel_7.add(lblIdaim);
		
		JLabel lblIdTour_1 = new JLabel("Id Tour");
		lblIdTour_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdTour_1.setBounds(12, 123, 99, 35);
		panel_7.add(lblIdTour_1);
		
		JLabel lblTnaim = new JLabel("Tên Địa Điểm");
		lblTnaim.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTnaim.setBounds(12, 168, 99, 35);
		panel_7.add(lblTnaim);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Thống kê", null, panel_8, null);
		panel_8.setLayout(null);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(12, 10, 893, 217);
		panel_8.add(scrollPane_5);
		
		table_6 = new JTable();
		table_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int SelectedRowIndex = table_6.getSelectedRow();
				Object [][] listdoan = doanBLL.showAllDoanThongKeFind(model.getValueAt(SelectedRowIndex, 0).toString());
				String[] col1= {"Id Đoàn","Tên Đoàn","Doanh Thu","Chi phí","Lãi"};
				model = new DefaultTableModel(listdoan,col1);
				table_7.setModel(model);
				
				Object [][] listdd = tourBLL.showAllThongKeTour();
				String[] col= {"Id Tour","Tên Tour","Tổng sô đoàn đi","Tổng doanh du","Tổng chi phí","Lãi"};
				model = new DefaultTableModel(listdd,col);
			
			}
		});
		scrollPane_5.setViewportView(table_6);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(12, 237, 893, 380);
		panel_8.add(scrollPane_6);
		
		table_7 = new JTable();
		scrollPane_6.setViewportView(table_7);
		
		JButton btnNewButton = new JButton("Danh s\u00E1ch Tour");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loadAllTourToModel();
				tabbedPane.setSelectedIndex(1);
				
			}
		});
		btnNewButton.setBounds(10, 183, 196, 42);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Danh sách Đoàn");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loadAllDoanToModel();
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_1.setBounds(10, 235, 196, 42);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Danh sách Khách hàng");
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadAllKhachHangToModel();
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnNewButton_1_1.setBounds(10, 287, 196, 42);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Danh sách Nhân viên");
		btnNewButton_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadAllNhanVienToModel();
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnNewButton_1_1_1.setBounds(10, 339, 196, 42);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Danh sách Chi Phí");
		btnNewButton_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadAllChiPhiToModel();
				tabbedPane.setSelectedIndex(5);
				
			}
		});
		btnNewButton_1_1_1_1.setBounds(10, 391, 196, 42);
		panel.add(btnNewButton_1_1_1_1);
		
		JButton btnTrangCh = new JButton("Trang Chủ");
		btnTrangCh.setBackground(Color.WHITE);
		btnTrangCh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnTrangCh.setBounds(10, 131, 196, 42);
		panel.add(btnTrangCh);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("Địa Điểm");
		btnNewButton_1_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadAllDiaDiemToModel();
				tabbedPane.setSelectedIndex(6);
			}
		});
		btnNewButton_1_1_1_1_1.setBounds(10, 449, 196, 42);
		panel.add(btnNewButton_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1_1 = new JButton("Thống kê");
		btnNewButton_1_1_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(7);
				loadAllThongKeToModel();
			}
		});
		btnNewButton_1_1_1_1_1_1.setBounds(10, 501, 196, 42);
		panel.add(btnNewButton_1_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1_1_1 = new JButton("Thoát");
		btnNewButton_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_1_1_1_1_1_1_1.setBounds(10, 553, 196, 42);
		panel.add(btnNewButton_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(Main.class.getResource("/img/Untitled-1.png")));
		lblNewLabel_2.setBounds(10, 10, 196, 111);
		
		panel.add(lblNewLabel_2);
	
		
		
	}
}
