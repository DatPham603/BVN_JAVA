public class HinhTron {
    private double banKinh;
    // Constructor
    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    // Getter và Setter cho các thuộc tính
    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    // Main method để kiểm tra
    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron(5);
        System.out.println("Bán kính: " + hinhTron.getBanKinh());
        System.out.println("Chu vi: " + hinhTron.tinhChuVi());
        System.out.println("Diện tích: " + hinhTron.tinhDienTich());
    }
}
