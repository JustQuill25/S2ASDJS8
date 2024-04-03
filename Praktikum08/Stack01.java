package Praktikum08;

public class Stack01 {
    private int data[];
    private int size;
    private int top;

    public Stack01(int size) {
        this.size = size;
        data = new int[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int dt) {
        if (!isFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack Penuh (Stack Full)");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            int x = data[top];
            top--;
            System.out.println("Data yang dikeluarkan dari stack : " + x);
        } else {
            System.out.println("Stack Masih Kosong (Stack is Empty)");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen teratas stack : " + data[top]);
        } else {
            System.out.println("Stack Masih Kosong (Stack is Empty)");
        }
    }

    public void print() {
        System.out.println("Isi Stack : ");
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                System.out.println(data[i] + " ");
            }
        } else {
            System.out.println("Stack Kosong ");
        }
        System.out.println();
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan (Stack cleared)");
        } else {
            System.out.println("Stack masih kosong (Stack is already empty)");
        }
    }
}
