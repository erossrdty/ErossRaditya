import java.util.Scanner;
public class soalsatu { 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka :");
        int angka = input.nextInt();
        int a = 0;

        for (int index=1; index<=angka; index++){
        if (angka%index==0)
        a=a+1; }
        
        if (a==2)
        System.out.printf("Bilangan Prima");
        else
        System.out.printf("Bukan Bilangan Prima");
    }
}
