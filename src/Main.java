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

    public static void task1 () {
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
System.out.println("Значение переменной pigs с типом с плавающей точкой равно "+ pigs);
    }
    public static void task2 () {
        System.out.println("Task 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        int d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
    }
    public static void task3 () {
        System.out.println("Task 3");
        byte pupilsOfLP = 23;
        byte pupilsOfAS = 27;
        byte pupilsOfEA = 30;
        short totalPaper = 480;
        int totalPupils = pupilsOfLP + pupilsOfAS + pupilsOfEA;
        int paperPerPupil = totalPaper / totalPupils;
        System.out.println("На каждого ученика рассчитано " + paperPerPupil + " листов бумаги.");

    }
    public static void task4 () {
        System.out.println("Task 4");
byte bottlesPerTwoMinutes = 16;
int bottlePerOneMinute = (byte) bottlesPerTwoMinutes/2;
int PerTwentyMinutes = bottlePerOneMinute * 20;
System.out.println("За 20 минут машина произвела " + PerTwentyMinutes + " штук бутылок." );
int bottlePerDay = bottlePerOneMinute * 1440;
System.out.println("За день машина произвела " + bottlePerDay + " штук бутылок.");
int bottleThreeDays = bottlePerDay * 3;
System.out.println("За три дня машина произвела " + bottleThreeDays + " штук бутылок.");
long bottlesThreeMonths = bottlePerDay * 90;
System.out.println("За три месяца машина произвела " + bottlesThreeMonths + " штук бутылок.");
    }
    public static void task5 () {
        System.out.println("Task 5");
    }
    public static void task6 () {
        System.out.println("Task 6");
    }
    public static void task7 () {
        System.out.println("Task 7");
    }
    public static void task8 () {
        System.out.println("Task 8");
    }
}

