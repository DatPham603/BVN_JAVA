import java.util.Scanner;
public class PhuongTrinhBac2 {
    private double a;
    private double b;
    private double c;

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double tinhDelta() {
        return b * b - 4 * a * c;
    }
    public void tinhNghiem() {
        double delta = tinhDelta();
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: x =" + x);
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phương trình bậc hai
        System.out.print("Nhập số lượng phương trình bậc hai: ");
        int n = scanner.nextInt();

        PhuongTrinhBac2[] mangPhuongTrinh = new PhuongTrinhBac2[n];

        // Nhập thông tin cho mỗi phương trình
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho phương trình thứ " + (i + 1) + ":");
            System.out.print("Nhập hệ số a: ");
            double a = scanner.nextDouble();
            System.out.print("Nhập hệ số b: ");
            double b = scanner.nextDouble();
            System.out.print("Nhập hệ số c: ");
            double c = scanner.nextDouble();

            mangPhuongTrinh[i] = new PhuongTrinhBac2(a, b, c);
        }

        // Hiển thị thông tin mảng phương trình
        System.out.println("Thông tin mảng phương trình bậc hai:");
        System.out.println("-----------------------------------------------------");
        System.out.println("STT  |  a     |  b     |  c     |  Delta  |  Nghiệm");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < n; i++) {
            PhuongTrinhBac2 pt = mangPhuongTrinh[i];
            double delta = pt.tinhDelta();
            System.out.printf("%-4d |  %-5.2f |  %-5.2f |  %-5.2f |  %-6.2f |  ", (i + 1), pt.a, pt.b, pt.c, delta);
            pt.tinhNghiem();
        }
        System.out.println("-----------------------------------------------------");

        scanner.close();
    }
}
