public class Main {
    public static void main(String[] args) {
        //Exercise 1
        int sumMoney = 0;
        int month = 0;
        while (sumMoney <= 2459000) {
            sumMoney += 15000;
            month += 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sumMoney + " рублей");
        }
    }
}