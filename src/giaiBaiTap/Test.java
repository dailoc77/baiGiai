package giaiBaiTap;

public class Test {
	public static void main(String[] args) {
		DanhSachSinhVien a = new DanhSachSinhVien();
		a.themSV(new SinhVien(1, "An", 2000));
		a.themSV(new SinhVien(2, "Nam", 2000));
		a.themSV(new SinhVien(3, "Linh", 2001));
		a.themSV(new SinhVien(4, "Nam", 2000));
		a.themSV(new SinhVien(5, "Linh", 2001));
		System.out.println(a);

		DanhSachSinhVien kq = a.tim("Nữ");
		if (kq.getDs().size()!=0) {
			System.out.println("Tim thay");
			System.out.println(kq);
		} else
			System.out.println("Khong tim thay");
//		int ma=2;
//		String ten="Nữ";
//		int ns=2005;
//		if (a.sua(ma, ten, ns)) {
//			System.out.println("Da sua xong");
//			System.out.println(a);
//		}else {
//			System.out.println("Khong co ma sv can sua");
//		}

	}
}
