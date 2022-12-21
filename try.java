import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner x= new Scanner(System.in);
        System.out.print("birinci kenarı giriniz: ");
        a = x.nextInt();
        System.out.print("ikinci kenarı giriniz: ");
        b=x.nextInt();
        c = (a*a)+(b*b);
        c=Math.sqrt(c = (a*a)+(b*b));
        System.out.println("hipotenüs: " + c);
    }
}
