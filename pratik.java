package first;
import javax.swing.plaf.synth.SynthToolBarUI;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int mat,sos,fen,tr;
        System.out.print("matematik netinizi giriniz: ");
        mat= input.nextInt();
        System.out.print("sosyal netinizi giriniz: ");
        sos= input.nextInt();
        System.out.print("fen netinizi giriniz: ");
        fen=input.nextInt();
        System.out.print("türkçe netlerinizi girniz: ");
        tr=input.nextInt();
        System.out.println(mat + fen + sos + tr);

