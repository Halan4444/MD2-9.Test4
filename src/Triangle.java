import java.util.Scanner;

public class Triangle {
    public static String phanLoaiTamGiac (int a, int b, int c) {
        String triangle = "";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a: ");
//        a = sc.nextInt();
//        System.out.println("Enter b: ");
//        b = sc.nextInt();
//        System.out.println("Enter c: ");
//        c = sc.nextInt();
        if(a == b && a == c){
            triangle = "tamgiacdeu";
        }else if(a == b && b != c || b == c && c != a || c ==a && a != b) {
            triangle = "tamgiaccan";
        }else if(a * a + b * b == c * c) {
            triangle = "tamgiacvuong";
        }else if(a <= 0 || b <= 0 || c <=0){
            triangle = " ";
        }
        return triangle;
    }
}
