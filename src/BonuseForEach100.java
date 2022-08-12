public class BonuseForEach100 {
    public static void main(String[] args) {
        int balance0 = 100; //начальный счет
        int amount = 1001; //сумма пополнения
        int balance1 = balance0 + amount; // баланс

        int b;
        if (amount > 1000) {
            b = amount / 100;
        } else {
            b = 0;
        }
        System.out.println("Баланс счета:" + balance1);
        System.out.println("Начисленные бонусы:" + b);

    }
}
