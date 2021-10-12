public class Main {
    public static void main(String[] args) {
        int currentAmount = 200;
        int rechargeAmount = 1200;
        int totalAmount = currentAmount + rechargeAmount;

        int bonus;

        if (rechargeAmount >= 1000) {
            bonus = rechargeAmount / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счет" + totalAmount);
        System.out.println(bonus + "бонус");
    }
}

