import java.time.DayOfWeek;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newObject = new Scanner(System.in);
        //Exercise 1
        float moneyInBankPr = 0;
        int numberOfMonth = 0;
        while (moneyInBankPr < 2459000) {
            moneyInBankPr += 29000;
            moneyInBankPr += (moneyInBankPr * 0.01);
            numberOfMonth += 1;
            System.out.println("Месяц " + numberOfMonth + ", сумма накоплений равна " + moneyInBankPr + " рублей");
        }
        System.out.println("----------------------");
        //Exercise 2
        byte number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number += 1;
        }
        System.out.println();
        for (number = 10; number >= 1; number--) {
           System.out.print(number + " ");
        }
        System.out.println("\n----------------------");
        //Exercise 3
        int numberOfHuman = 12000000;
        int numberOfDeadHuman;
        int numberOfBornHuman;
        for (int i = 1; i < 11; i++) {
            numberOfBornHuman = (numberOfHuman / 1000) * 17;
            numberOfDeadHuman = (numberOfHuman / 1000) * 8;
            //А можно лучше numberOfHuman = numberOfHuman + (numberOfHuman / 1000) * 11;
            numberOfHuman = numberOfHuman + numberOfBornHuman - numberOfDeadHuman;
            System.out.println("Год " + i + ", численность населени составляет " + numberOfHuman);
        }
        System.out.println("----------------------");
        //Exercise 4
        int moneyInBank = 15000;
        int numberOfMonth2 = 1;
        while (moneyInBank < 1000000) {
            System.out.println("Месяц " + numberOfMonth2 + ", сумма на счёте равна " + moneyInBank);
            moneyInBank += (moneyInBank * 0.07);
            numberOfMonth2 += 1;
        }
        System.out.println("----------------------");
        //Exercise 5
        int moneyInBank2 = 15000;
        int numberOfMonth3 = 1;
        while (moneyInBank2 < 1000000) {
            if (numberOfMonth3 % 6 == 0) {
                System.out.println("Месяц " + numberOfMonth3 + ", сумма на счёте равна " + moneyInBank2);
            }
            moneyInBank2 += (moneyInBank2 * 0.07);
            numberOfMonth3 += 1;
        }
        System.out.println("----------------------");
        //Exercise 6
        int bankMoney = 15000;
        int month = 1;
        while (month <= 108) {
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма на счёте равна " + bankMoney);
            }
            bankMoney += (bankMoney * 0.07);
            month += 1;
        }
        System.out.println("----------------------");
        //Exercise 7
        System.out.println("Введите дату первой пятницы: ");
        int dayOfWeek = newObject.nextInt();
        while (dayOfWeek < 31) {
            System.out.println("Сегодня пятница, " + dayOfWeek + "-е число. Необходимо подготовить отчет");
            dayOfWeek += 7;
        }
        System.out.println("----------------------");
        //Exercise 8
        System.out.println("Введите год пролёта кометы: ");
        int yearOfCom = newObject.nextInt();
        while (yearOfCom <= 2023) {
            yearOfCom += 79;
            System.out.println(yearOfCom);
        }
    }
}