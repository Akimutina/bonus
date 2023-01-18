//Если клиент пополняет счёт более чем на 1000 рублей, то сотовый оператор дарит ему по 1 рублю за каждые полные 100 рублей пополнения.

public class Main {
    public static void main(String[] args) {

        int startingBalance = 100;
        int amount = 1100; // сумма пополнения
        int bonus = amount / 100;
        int finalBalance;

        if (amount > 1000) {
            System.out.println("Начисленный бонус: " + bonus + " руб.");
            finalBalance = startingBalance + amount + bonus;
        } else {
            System.out.println("Начисленный бонус: " + 0 + " руб.");
            finalBalance = startingBalance + amount;
        }

        System.out.println("Текущий баланс: " + finalBalance + " руб.");
    }

}

