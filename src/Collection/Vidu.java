package Collection;

import java.util.ArrayList;

public class Vidu {
	public static void main(String[] args) {
//		String[] ar=new String[100];
		ArrayList<String> a = new ArrayList<String>(100);
		a.add("An");
		a.add("Nam");
		a.add("Linh");
		a.add("Hung");
		// in:
		System.out.println(a);

		a.remove(0);
		System.out.println(a);

		a.set(0, "Nữ");
		System.out.println(a);

		if (a.contains("Linh"))
			System.out.println("Co Linh trong ds");
		else
			System.out.println("Khong Co Linh trong ds");

		int vt = a.indexOf("Linh");
		if (vt == -1)
			System.out.println("Khong Co Linh trong ds");
		else
			System.out.println("Co Linh trong ds, tại vị trí:" + vt);
	}
}
