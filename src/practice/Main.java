package practice;

import java.time.LocalDate;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		DanhSachSinhVien a = new DanhSachSinhVien();
		a.themSV(new SinhVien(21000121, "Truong Dai Loc",LocalDate.of(2003, 11, 12)));
		a.themSV(new SinhVien(19000232, "Truong Tan Nghia", LocalDate.of(1995, 6, 14)));
		a.themSV(new SinhVien(22003043, "Tran Thi Ky", LocalDate.of(1990, 12, 20)));
		System.out.println(a);
		
//		int maxoa = 21000121;
//		
//		a.xoaSV(maxoa);
		
//		System.out.println(a);
//		
//		a.xoaSV_theoNamSinh(1990);
		
		int ma_can_tim = 21000121;
		String name_moi = "Nguyen Thanh Tung";
		LocalDate date_moi = LocalDate.of(2002, 9, 12);
		
		if(a.suaSV(ma_can_tim,name_moi,date_moi)) {
			System.out.println("Da sua xong");
			System.out.println(a);
		}
		else {
			System.out.println("Khong co ma sv can sua");
		}
		
	}
}

