package giaiBaiTap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachSinhVien {
//	private  SinhVien[] ds;
//	private int count;

	private List<SinhVien> ds;

	
	public List<SinhVien> getDs() {
		return ds;
	}

	public DanhSachSinhVien() {
		ds = new ArrayList<>();
	}

	public boolean themSV(SinhVien sv) {
		// kiem tra them trung:
		if (ds.contains(sv))
			return false;
		return ds.add(sv);
	}

	public boolean xoa(int masv) {
		//cach 0:
		//duyet mảng
		
		// cach 1:
//		SinhVien svxoa = new SinhVien(masv, "", 0);
//		return ds.remove(svxoa);
		// cach 2:
		return ds.removeIf(sv->sv.getMa()==masv); //bieu thuc lambda
	}

	public boolean xoaTheoNamSinh(int namsinh) {
		//cach 1:
//		return ds.removeIf(sv->sv.getNamSinh()==namsinh);
		
		//cach 2:
		List<SinhVien> lstXoa=new ArrayList<SinhVien>();
		for (SinhVien sinhVien : ds) {
			if (sinhVien.getNamSinh()==namsinh)
				lstXoa.add(sinhVien);
		}
		return ds.removeAll(lstXoa);
	}
	
	public boolean sua(int ma, String hoten_moi, int namsinh_moi) {
		//tim vi tri:
		SinhVien temp=new SinhVien(ma, "", 0);
		int vtsua= ds.indexOf(temp);
		if (vtsua==-1) return false;
		ds.set(vtsua,new SinhVien(ma, hoten_moi, namsinh_moi));
		return true;
	}
	
	public DanhSachSinhVien tim(String ten) {
		DanhSachSinhVien kq=new DanhSachSinhVien();
		for (SinhVien sinhVien : ds) {
			if (sinhVien.getHoTen().contains(ten))
				kq.themSV(sinhVien);
		}
		return kq;		
	}
	public List<SinhVien> sapXepMaTangDan() {
		List<SinhVien> kq=new ArrayList<SinhVien>();
		//chep cac phan tu trong ds vao kq
		//...
		Collections.sort(kq, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		return kq;
	}
	
	@Override
	public String toString() {
		String s = "";
		for (SinhVien sinhVien : ds) {
			s += sinhVien + "\n";
		}
		return s;
	}

}
