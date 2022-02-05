package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        /*Task 4*/
        System.out.println("******************* Task 4 ***************************");


        for (int i = 1; i <= 30; ++i) {
            System.out.print(i + ": ");
            if (i % 3 == 0) {
                System.out.print("ping ");
            }
            if (i % 5 == 0) {
                System.out.print("pong");
            }
            System.out.println();
        }

        System.out.println("******************* Task 5 ***************************");

        /*Task 5*/
        int fibonacciNumber1 = 0;
        int fibonacciNumber2 = 0;
        int temp = 1;
        for (int i = 0; i < 10; i++) {
            fibonacciNumber1 += fibonacciNumber2;
            System.out.print(fibonacciNumber1 + " ");
            fibonacciNumber2 = temp;
            temp = fibonacciNumber1;
        }

        System.out.println("\n******************* Task 6 ***************************");

        /*Task 6*/
        int age = 19;
        int salary = 58_000;
        double increasingTheLimit = 1;

        if (salary >= 50_000 && salary < 80_000) {
            increasingTheLimit = 1.2;
        } else if (salary >= 80_000) {
            increasingTheLimit = 1.5;
        }

        if (age < 23) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 * increasingTheLimit + " рублей");
        }
        if (age >= 23) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 * increasingTheLimit + " рублей");
        }

        System.out.println("******************* Task 7 ***************************");

        /*Task 7*/
        age = 25;
        salary = 60_000;
        int wantedSum = 330_000;
        double baseRate = 10;
        int creditPeriod = 12;
        double maxMonthlyPayment = salary * 0.5;

        if (age < 23) {
            baseRate += 1;
        } else if (age >= 23 && age < 30) {
            baseRate += 0.5;
        }

        if (salary > 80_000) {
            baseRate -= 0.7;
        }

        double monthlyPayment = (wantedSum + (wantedSum * baseRate / 100)) / creditPeriod;

        if (monthlyPayment > maxMonthlyPayment) {
            System.out.println("Максимальный платеж при ЗП " + salary +
                    " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " +
                    monthlyPayment + " рублей. Oтказано");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary +
                    " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " +
                    monthlyPayment + " рублей. Одобрено");
        }
    }
}
