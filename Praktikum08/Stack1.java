package Praktikum08;

public class Stack1 {
    int size;
    int top;
    Pakaian01 data[];

    public Stack1(int size) {
        this.size = size;
        data = new Pakaian01[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Pakaian01 pkn) {
        if (!isFull()) {
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Pakaian01 x = data[top];
            top--;
            System.out.println(
                    "Data yang keluar: " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("Stack masih kosong!");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen teratas: " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " "
                    + data[top].ukuran + " " + data[top].harga);
        } else {
            System.out.println("Stack masih kosong!");
        }
    }

    public void print() {
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " "
                    + data[i].harga + " ");
        }
        System.out.println("");
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan!");
        } else {
            System.out.println("Stack masih kosong!");
        }
    }
}
