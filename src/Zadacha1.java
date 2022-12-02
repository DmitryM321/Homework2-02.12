public class Zadacha1 {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int c = 7;
        double a = 8.5;
        double b = 9.45;
        double x = c;
        boolean z = (x - a) > (x - b);
        if (c <= a || c <= b) {
            System.out.println("Ошибка");
        } else if (z) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}

