import java.util.Scanner;

public class BenhNhan {
	private String HoTen, QueQuan;
	private int NamSinh;

	public BenhNhan(String hoTen, String queQuan, int namSinh) {
		super();
		HoTen = hoTen;
		QueQuan = queQuan;
		NamSinh = namSinh;
	}
	
	public BenhNhan() {
		super();
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getQueQuan() {
		return QueQuan;
	}

	public void setQueQuan(String queQuan) {
		QueQuan = queQuan;
	}

	public int getNamSinh() {
		return NamSinh;
	}

	public void setNamSinh(int namSinh) {
		NamSinh = namSinh;
	}

	public void NhapThongTin(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho Ten: ");
		HoTen = sc.nextLine();
		System.out.print("Que Quan: ");
		QueQuan =sc.nextLine();
		System.out.print("Nam sinh: ");
		NamSinh =sc.nextInt();
	}
	
	public void XuatThongTin() {
		System.out.print("Ho Ten: "+HoTen+", Que Quan: "+QueQuan+", Nam sinh: "+NamSinh+", "); 
	}
	
	
}
