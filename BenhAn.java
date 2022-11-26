import java.util.Scanner;
import java.lang.ProcessHandle.Info;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class BenhAn extends BenhNhan{
	private String TenBenhAn;
	private int SoTien, VienPhi;
	
	public BenhAn(String hoTen, String queQuan, int namSinh, String tenBenhAn, int soTien, int vienPhi) {
		super(hoTen, queQuan, namSinh);
		TenBenhAn = tenBenhAn;
		SoTien = soTien;
		VienPhi = vienPhi;
	}


	public BenhAn() {
		super();
	}

	public String getTenBenhAn() {
		return TenBenhAn;
	}

	public void setTenBenhAn(String tenBenhAn) {
		TenBenhAn = tenBenhAn;
	}

	public int getSoTien() {
		return SoTien;
	}

	public void setSoTien(int soTien) {
		SoTien = soTien;
	}

	public int getVienPhi() {
		return VienPhi;
	}

	public void setVienPhi(int vienPhi) {
		VienPhi = vienPhi;
	}
	
	public void NhapThongTin() {
		super.NhapThongTin();
		Scanner sc= new Scanner (System.in);
		System.out.print("Ten Benh An: ");
		TenBenhAn=sc.nextLine();
		System.out.print("So Tien: ");
		SoTien=sc.nextInt();
		System.out.print("Vien phi: ");
		VienPhi=sc.nextInt();
	}
	
	public void XuatThongTin() {
		super.XuatThongTin();
		System.out.print("Ten Benh An: "+TenBenhAn+", So Tien: "+SoTien+", Vien phi: "+VienPhi); 
		System.out.println();
	}
	
	public int TuoiHienTai() {
		return 2022-super.getNamSinh();
	 }	
}
