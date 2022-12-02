public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int c = 10;
        double a = 8.5;
        double b = 9.45;
        double x = c;
        boolean z = (x - a) > (x - b);
        if (z) {
            System.out.println(b);
        } else {
            System.out.println(a);

        }

        System.out.println("Задача 2");
        int a1 = 2;
        int b1 = 10;
        int a2 = 9;
        int b2 = 16;
        if (b1 == a2) {
        System.out.println(b1);
        } else if (a2 < b1)
    {
        System.out.println(a2 + " " + b1);
    } else if (a2 > b1) {
        System.out.println("Пересечения нет");
    }
    }
}
