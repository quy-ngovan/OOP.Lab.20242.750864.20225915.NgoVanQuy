import java.util.Scanner;
import java.lang.Math;

public class assignment226_solve_equation {
    public static void linear_equation() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a == 0) {
            if (b == 0) System.out.println("Phuong trinh co vo so nghiem");
            else System.out.printf("Phuong trinh vo nghiem\n");
        } else {
            System.out.printf("Phuong trinh co nghiem duy nhat x = %.2f", -1f * b / a);
        }
        sc.close();
    }

    public static void linear_system() {
        /* 
            B1: Tính các định thức: (anh bạn cầm bát ăn cơm)
                D = a11 * a22 - a21 * a12
                Dx = b1 * a22 - b2 * a12
                Dy = a11 * b2 - a12 * b1
            B2: Xét hai trường hợp
                TH1: D != 0 ==> HPT có nghiệm duy nhất
                    x = Dx / D, y = Dy / D
                TH2: D == 0
                    if (Dx == Dy == D) ==> hệ có vô số nghiệm
                    else ==> hệ vô nghiệm 
        */
        Scanner sc = new Scanner(System.in);
        int a11, a12, a21, a22, b1, b2;
        a11 = sc.nextInt();
        a12 = sc.nextInt();
        b1 = sc.nextInt();
        a21 = sc.nextInt();
        a22 = sc.nextInt();
        b2 = sc.nextInt();
        int D = a11 * a22 - a21 * a12;
        int Dx = a12 * b2 - a22 * b1;
        int Dy = a11 * b2 - a21 * b1;
        if (D != 0) {
            System.out.printf("HPT co nghiem duy nhat (x, y) = (%.2f, %.2f)\n", 1f * Dx / D, 1f * Dy / D);
        } else {
            if (Dx == 0 && Dy == 0) System.out.printf("HPT co vo so nghiem\n");
            else System.out.printf("HPT vo nghiem\n"); 
        }
        sc.close();
    }

    public static void quadratic_equation() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                System.out.printf("Phuong trinh co nghiem duy nhat x = %.2f", -1f * c / a);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.printf("Phuong trinh vo nghiem\n");
            } else if (delta == 0) {
                System.out.printf("Phuong trinh co nghiem kep x = %.2f", -1f * b / (2 * a));
            } else {
                double tmp = Math.sqrt(delta);
                System.out.printf("Phuong trinh co hai nghiem phan biet: x1 = %.2f, x2 = %.2f", (-b + tmp) / (2 * a), (-b - tmp) / (2 * a));
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        // linear_equation();
        // quadratic_equation();
        linear_system();
    }
}