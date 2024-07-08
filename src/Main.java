import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    int year;
        Scanner input = new Scanner(System.in);

        System.out.print("yıl giriniz: ");
        year = input.nextInt();

        if(year%4==0){
            System.out.println(year + " artik yıldır");
        }
        else{
            System.out.println("artik yıl değil.");
        }



    }
}