package practice;

import java.time.LocalDate;
import java.util.Objects;

public class SinhVien {
	private int maSV;
	private String name;
	private LocalDate date;
	
	public SinhVien(int maSV, String name, LocalDate date) {
		super();
		this.maSV = maSV;
		this.name = name;
		this.date = date;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maSV);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return maSV == other.maSV;
	}
	
	public String toString() {
		return String.format("%5d %10s %6s", maSV, name,date);
	}
	
	
	
	
	
	
	
}
