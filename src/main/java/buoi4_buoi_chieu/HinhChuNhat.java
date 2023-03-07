package buoi4_buoi_chieu;

public class HinhChuNhat {
    private double chieuDai =1.0;
    private  double chieuRong=1.0;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        if(chieuDai<=0 || chieuRong<=0)
        {
            throw new RuntimeException("canh phai la so duong");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
        if(chieuDai<=0)
        {
            throw new RuntimeException("canh phai la so duong");
        }
    }

    public void setChieuRong(double chieuRong) {
        if (chieuRong<=0)
        {
            throw new RuntimeException("canh phai la so duong");
        }
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }
    public  double tinhChuVi()
    {
        return (chieuDai+chieuRong)*2;
    }
    public  double tinhDienTich()
    {
        return (chieuDai*chieuRong);
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                "chu vi=" + tinhChuVi() +
                ", dien tich=" + tinhDienTich() +
                '}';
    }
}
