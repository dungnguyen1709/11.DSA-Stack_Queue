package li_thuyet;

public class HocVien {
    private int mhv;
    private String tenhv;

    public HocVien(int mhv, String tenhv) {
        this.mhv = mhv;
        this.tenhv = tenhv;
    }

    public int getMhv() {
        return mhv;
    }

    public void setMhv(int mhv) {
        this.mhv = mhv;
    }

    public String getTenhv() {
        return tenhv;
    }

    public void setTenhv(String tenhv) {
        this.tenhv = tenhv;
    }

//    @Override
//    public String toString() {
//        return this.mhv + "-" + this.tenhv;
//    }
    public void display(){
        System.out.println(this.mhv+ "-" + this.tenhv);
    }
}
