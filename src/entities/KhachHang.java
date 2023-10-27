package entities;

public class KhachHang {
    private String name;
    private int houseNumber;
    private int idelectrical;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getIdelectrical() {
        return idelectrical;
    }

    public void setIdelectrical(int idelectrical) {
        this.idelectrical = idelectrical;
    }

    public KhachHang(String name, int houseNumber, int electrical) {
        this.name = name;
        this.houseNumber = houseNumber;
        this.idelectrical = electrical;

    }
}
