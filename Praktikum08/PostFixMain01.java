package Praktikum08;

import java.util.Scanner;

public class PostFixMain01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix) : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ") ";

        int total = Q.length();

        PostFix01 post = new PostFix01(total);
        P = post.konversi(Q);
        System.out.println("Posftix: " + P);
    }
}
