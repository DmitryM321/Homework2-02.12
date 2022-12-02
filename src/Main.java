public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 2");
        int a1 = 1;
        int b1 = 8;
        int a2 = 2;
        int b2 = 9;
        if (b1 == a2) {
            System.out.println("Точка пересечения " + b1);
        } else if (a2 > b1) {
            System.out.println("Пересечения нет");
        } else if (b2 == a2) {
            System.out.println(b2);
        } else if (a1 >= a2 && b1 >= b2) {
            System.out.println("Координаты отрезка "+ a1 + " " + b2);
        } else if (a1 <= a2 && b1 >= b2) {
            System.out.println("Координаты отрезка "+ a2 + " " + b2);
        } else if (a1 <= a2 && b1 <= b2) {
            System.out.println("Координаты отрезка "+ a2 + " " + b1);
              }
    }
}
