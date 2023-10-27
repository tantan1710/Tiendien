package entities;



public class BienLai {


    private int money;
    private int electricalold;
    private int electricalnew;
    private KhachHang khachHang;

    public BienLai(int money, int electricalold, int electricalnew, KhachHang khachHang) {
        this.money = (electricalnew-electricalold)*750;
        this.electricalold = electricalold;
        this.electricalnew = electricalnew;
        this.khachHang = khachHang;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getElectricalold() {
        return electricalold;
    }

    public void setElectricalold(int electricalold) {
        this.electricalold = electricalold;
    }

    public int getElectricalnew() {
        return electricalnew;
    }

    public void setElectricalnew(int electricalnew) {
        this.electricalnew = electricalnew;
    }

    @Override
    public String toString() {
        return "BienLai{" +
                "money=" + money +
                ", electricalold=" + electricalold +
                ", electricalnew=" + electricalnew +
                ", khachHang=" + khachHang +
                '}';
    }
}
