import java.util.Scanner;
public class PhuongTien {
    private double giaXe;
    private double dungTichXylanh;

    // Constructor
    public PhuongTien(double giaXe, double dungTichXylanh) {
        this.giaXe = giaXe;
        this.dungTichXylanh = dungTichXylanh;
    }

    // Phương thức tính thuế trước bạ
    public double tinhThueTruocBa() {
        if (dungTichXylanh < 100) {
            return giaXe * 0.01;
        } else if (dungTichXylanh >= 100 && dungTichXylanh <= 200) {
            return giaXe * 0.03;
        } else {
            return giaXe * 0.05;
        }
    }

    // Getter và Setter cho các thuộc tính
    public double getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(double giaXe) {
        this.giaXe = giaXe;
    }

    public double getDungTichXylanh() {
        return dungTichXylanh;
    }

    public void setDungTichXylanh(double dungTichXylanh) {
        this.dungTichXylanh = dungTichXylanh;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhuongTien[] danhSachXe = null;;
        int choice;

        do {
            System.out.println("MENU:");
            System.out.println("1. Nhập thông tin và tạo danh sách các xe");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
            System.out.println("3. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng xe: ");
                    int n = scanner.nextInt();
                    danhSachXe = new PhuongTien[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thông tin xe thứ " + (i + 1) + ":");
                        System.out.print("Nhập giá xe: ");
                        double giaXe = scanner.nextDouble();
                        System.out.print("Nhập dung tích xylanh: ");
                        double dungTichXylanh = scanner.nextDouble();
                        danhSachXe[i] = new PhuongTien(giaXe, dungTichXylanh);
                    }
                    break;

                case 2:
                    if (danhSachXe == null) {
                        System.out.println("Chưa có thông tin về các xe.");
                    } else {
                        System.out.println("Bảng kê khai tiền thuế trước bạ của các xe:");
                        System.out.printf("%-20s%-20s%-20s\n", "STT", "Giá xe", "Thuế trước bạ");
                        for (int i = 0; i < danhSachXe.length; i++) {
                            double thue = danhSachXe[i].tinhThueTruocBa();
                            System.out.printf("%-20d%-20.2f%-20.2f\n", (i + 1), danhSachXe[i].getGiaXe(), thue);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Đã thoát.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 3);
    }
}
