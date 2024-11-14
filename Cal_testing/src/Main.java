
import java.util.Scanner;

//ray
class Biodata {
    String nama;
    String hobi;
    int umur;

    Biodata (String nama, String hobi, int umur) {
        this.nama = nama;
        this.hobi = hobi;
        this.umur = umur;
    }

    public static int test(){
        return 100;
    }

    public static void coba(int a){
        if (a == 7){
            System.out.println("oke");
        }
    }

    void menyapa(){
        System.out.println("Halo saya " + nama);
    }
}
//ray end

public class Main {
    public static void calc(int a, int b, String op){...}

    public static void main(String[] args){
        Biodata datasaya = new Biodata("Harry", "Potter", 5);

        datasaya.menyapa();
        System.out.println(datasaya.hobi);
        System.out.println(datasaya.test());
    }
    public static void calc(double a, double b, String operator) {
        if (operator.equals("+")) {
            System.out.println(a + b);
        } else if (operator.equals("-")) {
            System.out.println(a - b);
        } else if (operator.equals("x")) {
            System.out.println(a * b);
        } else if (operator.equals(":")) {
            System.out.println(a / b);
        } else if (operator.equals("%")) {
            System.out.println(a % b);
        } else if (operator.equals("*")) {
            System.out.println(a * b);
        } else {
            System.out.print("Input tidak valid");
        }
    }

    public static void main(String[] args) {
        /*
         * Buatkan kalkulator yang bisa menerima input
         * int a
         * int b
         * char operator tambah kurang
         * while
         * lanjut y = looping
         * kalau t = keluar
         * terima kasih
         * */
        Scanner kalkulator = new Scanner(System.in);
        boolean kondisi = true;

        while (kondisi) {
            System.out.print("Masukkan Angka1 :");
            double a = Integer.parseInt(kalkulator.nextLine());
            System.out.print("Masukkan Angka2 :");
            double b = Integer.parseInt(kalkulator.nextLine());
            System.out.print("Masukkan Operator :");
            String operator = kalkulator.nextLine();

            calc(a, b, operator);

            System.out.print("Apakah Anda mau lanjut? ");
            String tanya = kalkulator.nextLine();

            if (tanya.equals("ya")) {
                kondisi = true;
            } else {
                kondisi = false;
            }

        }
        kalkulator.close();
    }
}