import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		ArrayList<BenhAn> list = new ArrayList<BenhAn>();
		Scanner sc = new Scanner (System.in);
		
		// 1. nhap danh sach N benh an
		System.out.println("so benh an can nhap: ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			BenhAn ba = new BenhAn();
			ba.NhapThongTin();
			list.add(ba);
		}
		System.out.println();
		
		// 2. sap xep danh sach theo tuoi giam dan cua cac benh nhan
		System.out.println("danh sach benh nhan: ");
		BenhAn x = new BenhAn();
		for (int i=0; i<list.size(); i++) {
			for (int j=i; j<list.size(); j++) {
				if (list.get(i).TuoiHienTai()<list.get(j).TuoiHienTai()) {
					x= list.get(i);
					list.set(i, list.get(j));
					list.set(j, x);
				}
			}
		}
		for (BenhAn y : list) {
			y.XuatThongTin();
		}
		System.out.println();
		
		// 3. hien ra man hinh danh sach cac benh nhan <=10 tuoi
		System.out.println("danh sach cac benh nhan <=10 tuoi");
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).TuoiHienTai()<=10) {
				list.get(i).XuatThongTin();
			}
		}
		System.out.println();
		
		// 4. benh nhan co tien vien phi cao nhat
		System.out.println("thong tiin ve benh nhan co tien vien phi cao nhat: ");
		int max =0;
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getVienPhi()>max)
				max = list.get(i).getVienPhi();
		}
		
		for (int i=0; i<list.size(); i++) {
			if (max == list.get(i).getVienPhi())
				list.get(i).XuatThongTin();
		}
	}
}
