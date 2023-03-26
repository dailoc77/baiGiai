package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DanhSachSinhVien {
	private List<SinhVien> ds;
	
	public DanhSachSinhVien() {
		ds = new ArrayList<>();
	}

	public List<SinhVien> getDs() {
		return ds;
	}

	public boolean themSV(SinhVien sv) {
		if(ds.contains(sv))
			return false;
		return ds.add(sv);
	}
	
	public boolean xoaSV(int masv) {
		SinhVien del = new SinhVien(masv, "", null);
		return ds.remove(del);
	}
	
	public boolean xoaSV_theoNamSinh(int nam) {
		return ds.removeIf(sv->sv.getDate().getYear()==nam);
	}
	
	public boolean suaSV(int masv_can_tim, String name_moi , LocalDate date_moi ) {
		SinhVien sinhVienCanTim = new SinhVien(masv_can_tim, "", null); // temp
		int vt = ds.indexOf(sinhVienCanTim);
		if(vt == -1) return false;
		ds.set(vt, new SinhVien(masv_can_tim, name_moi, date_moi));
		return true;
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
