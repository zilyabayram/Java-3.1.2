public class BonuseForEach100 {
    public static void main(String[] args) {
        int x = 100; //начальный счет
        int y = 1001; //сумма пополнения
        int z = x + y; // баланс

        int b;
        if (y > 1000) {
            b = y / 100;
        } else {
            b = 0;
        }
        System.out.println("Баланс счета:" + z);
        System.out.println("Начисленные бонусы:" + b);

    }
}
