package btl_store.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
    long maKH;
    String tenKH;
    String phone;
    String addr;
    Date ngaySinh;

    public Customer(long maKH, String tenKH, String phone, Date ngaySinh, String addr) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.phone = phone;
        this.ngaySinh = ngaySinh;
        this.addr = addr;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    
    public long getMaKH() {
        return maKH;
    }

    public void setMaKH(long maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String converseDate(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        return dateFormat.format(date);
    }
    public Object[] toObject(){
        return new Object[]{
          this.maKH, this.tenKH, this.addr, converseDate(this.ngaySinh),  this.phone
        };
    }
}
