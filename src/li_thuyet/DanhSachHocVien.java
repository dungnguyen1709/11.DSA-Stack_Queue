package li_thuyet;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class DanhSachHocVien {
  ArrayList <HocVien> dsHocVien = new ArrayList();
//    ArrayList<HocVien> dsHocVien = new ArrayList<>();

    public void inputList() {
        dsHocVien.add(new HocVien(1, "Dung"));
        dsHocVien.add(new HocVien(2, "Tuyen"));
        dsHocVien.add(new HocVien(3, "Binh"));
    }

    public void display() {
        Iterator <HocVien> iterator = dsHocVien.iterator();
        while (iterator.hasNext()) {
           // System.out.println(iterator.next());
//            ((HocVien)iterator.next()).display();
            iterator.next().display();

        }
    }
}
