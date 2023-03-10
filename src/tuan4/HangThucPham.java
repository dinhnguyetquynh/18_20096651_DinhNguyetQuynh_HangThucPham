package tuan4;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class HangThucPham {
	private String maHang;
	private String tenHang;
	private Calendar ngaySanXuat,ngayHetHan;
	private double donGia;
	private int soLuong;
	//dong goi va rang buoc
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String ma) throws Exception {
		if(ma!=null) {
			this.maHang=ma;
		}else throw new Exception("ma hang khong duoc trong");
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String ten) throws Exception {
		if(ten!=null) {
			this.tenHang=ten;
		}else throw new Exception("ten khong duoc trong");
	}
	public Calendar getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(Calendar ngaySX) throws Exception {
		if(ngaySX!=null) {
			this.ngaySanXuat=ngaySX;
		}else throw new Exception("ngay khong de trong");
	}
	public Calendar getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(Calendar ngayHH) throws Exception {
		if(ngayHH!=null) {
			this.ngayHetHan=ngayHH;
		}else throw new Exception("ngay khong de trong");
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double gia) throws Exception {
		if(gia>0) {
			this.donGia=gia;
		}else throw new Exception("gia >0");
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int sl) throws Exception {
		if(sl>0) {
			this.soLuong=sl;
		}else throw new Exception("so luong >0");
	}
	//tao constructor
	public HangThucPham() {
		// TODO Auto-generated constructor stub
	}
	public HangThucPham(String ma, String ten, Calendar ngaySX, Calendar ngayHH, double gia,
			int sl) throws Exception {
		if(ma!=null) {
			this.maHang=ma;
		}else throw new Exception("ma hang khong duoc trong");
		
		if(ten!=null) {
			this.tenHang=ten;
		}else throw new Exception("ten khong duoc trong");
		
		if(ngaySX!=null) {
			this.ngaySanXuat=ngaySX;
		}else throw new Exception("ngay khong de trong");
		
		if(ngayHH!=null) {
			this.ngayHetHan=ngayHH;
		}else throw new Exception("ngay khong de trong");
		
		if(gia>0) {
			this.donGia=gia;
		}else throw new Exception("gia >0");
		
		if(sl>0) {
			this.soLuong=sl;
		}else throw new Exception("so luong >0");
		
	}
	public boolean checkHanSuDung() {
		Calendar ngayHT= Calendar.getInstance();
		if(ngayHT.getTime().getTime()>getNgayHetHan().getTime().getTime()) {
			return false;
		}
		return true;
	}
	//tao tieuDe
	public void tieuDe() {
		System.out.println("HANG THUC PHAM");
		System.out.println();
		for(int i=0;i<=100;i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%10s|%20s|%15s|%15s|%10s|%10s|","MaHang","TenHang","NgaySX","NgayHH","DonGia","SoLuong");
		System.out.println();
		for(int i=0;i<=100;i++) {
			System.out.printf("-");
		}
		System.out.println();
	}
	//dinh dang ngay, tien te
	Locale lc = new Locale("vi", "vn");
	DateFormat df= DateFormat.getDateInstance(0, lc);
	NumberFormat sf= NumberFormat.getCurrencyInstance(lc);
	//tao toString
	
	@Override
	public String toString() {
		String s="";
		s+=s.format("|%10s|%20s|%15s|%15s|%10s|%10s|", getMaHang(),getTenHang(),df.format(getNgaySanXuat().getTime()),
				df.format(getNgayHetHan().getTime()),sf.format(getDonGia()),sf.format(getSoLuong()));
		return s;
	}
	
	

}
