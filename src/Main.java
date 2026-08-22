//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Task 1");
        byte mice = 101;
        System.out.println("Значение переменной mice с типом целочисленные равно " + mice);
        short hamsters = 32;
        System.out.println("Значение переменной hamsters с типом целочисленные равно " + hamsters);
        int hedgehogs = 563;
        System.out.println("Значение переменной hedgehogs с типом целочисленные равно " + hedgehogs);
        long gophers = 1_234_567_890L;
        System.out.println("Значение переменной gophers с типом целочисленные равно " + gophers);
        float rabbits = 6.7f;
        System.out.println("Значение переменной rabbits с типом с плавающей точкой равно " + rabbits);
        double pigs = 465.234567;
        System.out.println("Значение переменной pigs с типом с плавающей точкой равно " + pigs);
    }

    public static void task2() {
        System.out.println("Task 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        int d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        int f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
    }

    public static void task3() {
        System.out.println("Task 3");
        byte pupilsOfLP = 23;
        byte pupilsOfAS = 27;
        byte pupilsOfEA = 30;
        short totalPaper = 480;
        short totalPupils = (short) (pupilsOfLP + pupilsOfAS + pupilsOfEA);
        byte paperPerPupil = (byte) (totalPaper / totalPupils);
        System.out.println("На каждого ученика рассчитано " + paperPerPupil + " листов бумаги.");

    }

    public static void task4() {
        System.out.println("Task 4");
        byte bottlesPerTwoMinutes = 16;
        int bottlePerOneMinute = (short) bottlesPerTwoMinutes / 2;
        int PerTwentyMinutes = bottlePerOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + PerTwentyMinutes + " штук бутылок.");
        int bottlePerDay = bottlePerOneMinute * 1440;
        System.out.println("За день машина произвела " + bottlePerDay + " штук бутылок.");
        int bottleThreeDays = bottlePerDay * 3;
        System.out.println("За три дня машина произвела " + bottleThreeDays + " штук бутылок.");
        int bottlesPerMonth = bottlePerDay * 30;
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок.");
    }

    public static void task5() {
        System.out.println("Task 5");
        byte painters = 120;
        byte whitePerClass = 2;
        byte brownPerClass = 4;
        byte totalPerClass = (byte) (whitePerClass + brownPerClass);
        byte amountOfClasses = (byte) (painters / totalPerClass);
        byte totalWhite = (byte) (amountOfClasses * whitePerClass);
        byte totalBrown = (byte) (amountOfClasses * brownPerClass);
        System.out.println("В школе, где " + amountOfClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");

    }

    public static void task6() {
        System.out.println("Task 6");
        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        short breakfast = (short) (bananas + milk + iceCream + eggs);
        float resultKg = (float) (breakfast * 0.001);
        System.out.println(resultKg);

    }

    public static void task7() {
        System.out.println("Task 7");
        short diet1 = 250;
        short diet2 = 500;
        short totalLossWeightKg = 7;
        float totalLossWeightGr = (float) (7 / 0.001);
        byte maxDays = (byte) (totalLossWeightGr / 250);
        System.out.println("Если спортсмен будет худеть на " + diet1 + " грамм в день, то на похудение уйдет " + maxDays + " дней.");
        byte minDays = (byte) (totalLossWeightGr / 500);
        System.out.println("Если спортсмен будет худеть на "  + diet2 + " грамм в день, то на похудение уйдет " + minDays + " дней.");
        byte averageDays = (byte) ((maxDays + minDays) / 2);
        System.out.println("В среднем спортсмену нужно " + averageDays + " дней.");
    }

    public static void task8() {
        System.out.println("Task 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int bonusMasha =(int) (salaryMasha * 0.1);
        int incomeMasha = salaryMasha + bonusMasha;
        int differencePerYearMasha = bonusMasha * 12;
        System.out.println("Маша теперь получает " + incomeMasha + " рублей. Годовой доход вырос на " + differencePerYearMasha + " рублей.");
        int bonusDenis =(int) (salaryDenis * 0.1);
        int incomeDenis = salaryDenis + bonusDenis;
        int differencePerYearDenis = bonusDenis * 12;
        System.out.println("Денис теперь получает " + incomeDenis + " рублей. Годовой доход вырос на " + differencePerYearDenis + " рублей.");
        double bonusKristina = salaryKristina * 0.1;
        double incomeKristina = salaryKristina + bonusKristina;
        double differencePerYearKristina = bonusKristina * 12;
        System.out.println("Кристина теперь получает " + incomeKristina + " рублей. Годовой доход вырос на " + differencePerYearKristina + " рублей.");

    }
}



