package Praktikum08;

import java.util.Scanner;

public class StackMain01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack1 stk = new Stack1(5);

        int pilihan;
        do {
            System.out.println("Menu Operasi Stack:");
            System.out.println("1. Push Data");
            System.out.println("2. Pop Data");
            System.out.println("3. Peek Data");
            System.out.println("4. Print Data");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda (1-5) : ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Jenis ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna   : ");
                    String warna = sc.nextLine();
                    System.out.print("Merk          : ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran        : ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga         : ");
                    double harga = sc.nextDouble();

                    Pakaian01 p = new Pakaian01(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }
}
