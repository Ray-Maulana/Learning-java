import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

//        System.out.println(true || false);
//        System.out.println(true && false);

        int a = 50;
        int b = 50;
        int result = a - b;

        System.out.println("Tintin dapat nilai " + result);

        if (a == b && result == 0) {
            System.out.println("Buang-buang waktu banget deh lu belajar");
        } else if (result < 0) {
                System.out.println("Tintin sangatlah tidak pintar");
        } else if (result < 60) {
                System.out.println("Pantesan aja jelek, KOCAK LO!");
        } else {
                System.out.println("Biasa aja sih");
        }

//        String outp = "aduh";
//        System.out.println(outp);

//        for (int i = 1; i <= 10; i++) {
//            String lol = i + " ";
//            System.out.println(lol + i);
//        }

        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukkan nilai " + sc.nextInt());
        System.out.print("Masukan nama: ");
        String name = sc.nextLine();

        if (name.equals("Ray")) {
            System.out.println("Ganteng lu Ray");
        } else {
            System.out.println("SIAPA SIH LO?");
        }
//
//        sc.close();


//        int c = 5;
//        int d = 10;

        System.out.print("test-----");

//        Scanner cal = new Scanner(System.in);
//        while (true) {
//            System.out.print("5 + 10 = " + sc.nextInt());
//            String angka = cal.nextLine();
//
//            if (angka.equals("15")) {
//                break;
//            }
//        }

        Scanner cal = new Scanner(System.in);
        boolean kondisi = true;
        Scanner scanner;
        while (kondisi) {
            System.out.print("masukan c: ");
            int c = integer.parseInt(scanner.nextLine());
            System.out.print("masukan d: ");
            int d = integer.parseInt(scanner.nextLine());
            System.out.print("Masukan operator: ");
            String op = scanner.nextLine();

            if (op.equals("+")){
                System.out.print(c+d);
            }else if (op.equals("-")){
                System.out.print(c-d);
            }else if (op.equals("x")){
                System.out.print(c*d);
            }else if (op.equals(":")){
                System.out.print(c/d);
            }else if (op.equals("%")){
                System.out.print(c%d);
            }
            else{
                System.out.print("hinput tidak valid");
            }

            System.out.print("Lanjut?");
            String tanya = scanner.nextLine();
            if(tanya.equals("ya")){
                kondisi = true;
            }else {
                kondisi = false;
            }
        }

        cal.close();
    }
}