package btl_store.model;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Item {
    long maSP;
    String tenSP;
    String loaiSP;
    String image;
    String status;
    long gia;

    public Item(long maSP, String tenSP, String loaiSP, String image, String status, long gia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.image = image;
        this.status = status;
        this.gia = gia;
    }
    
    public long getMaSP() {
        return maSP;
    }

    public void setMaSP(long maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String converseMoney(long money){
        Locale locale = new Locale("vi","VN");
        NumberFormat format = NumberFormat.getInstance();
        return format.format(money);
    }
    public Object[] toObject(){
        return new Object[]{
            this.maSP, this.tenSP, this.loaiSP, this.status, converseMoney(this.gia)
        };
    }
}
