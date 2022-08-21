public class Variables {
    public static void main(String[] args) {

        task1();

        System.out.println("Task 2:");
        task2();

        System.out.println("\nTask 3:");
        task3();

        System.out.println("\nTask 4:");
        task4();

        System.out.println("\nTask 5:");
        task5();

        System.out.println("\nTask 6:");
        task6();

        task7();

        task8();
    }

    @SuppressWarnings("unused")
    private static void task1() {
        byte b = 127;
        short s = 32;
        int i = 65535;
        long l = 65535L;

        float f = 0.1F;
        double d = 0.1;

        char c = 'C';

        boolean logic = false;
    }

    private static void task2() {
        float firstWeight = 78.2F;
        float secondWeight = 82.7F;

        double sumWeight = firstWeight + secondWeight;

        double diffWeight = Math.abs(firstWeight - secondWeight);

        System.out.printf("Total weight = %.2f kg\n", sumWeight);
        System.out.printf("Weight difference = %.2f kg\n", diffWeight);
    }

    private static void task3() {
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;

        int breakfastWeight = 5*bananaWeight + 2*milkWeight + 2*iceCreamWeight + 4*eggWeight;

        double breakfastWeightKg = breakfastWeight/1000.0;

        System.out.printf("Breakfast weight = %.2f kg\n", breakfastWeightKg);
    }

    private static void task4() {
        int excessWeightKg = 7;

        int maxDays = excessWeightKg*1000/250;
        int minDays = excessWeightKg*1000/500;

        int averageDays = (maxDays+minDays)/2;

        System.out.println("Maximum days for weight loss = " + maxDays);
        System.out.println("Minimum days for weight loss = " + minDays);
        System.out.println("Average days for weight loss = " + averageDays);
    }

    private static void task5() {
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;

        double newSalaryMasha = salaryMasha * 1.1;
        double newSalaryDenis = salaryDenis * 1.1;
        double newSalaryKristina = salaryKristina * 1.1;

        double yearSalaryMasha = salaryMasha * 12;
        double yearSalaryDenis = salaryDenis * 12;
        double yearSalaryKristina = salaryKristina * 12;

        double newYearSalaryMasha = newSalaryMasha * 12;
        double newYearSalaryDenis = newSalaryDenis * 12;
        double newYearSalaryKristina = newSalaryKristina * 12;

        double diffSalaryMasha = newYearSalaryMasha - yearSalaryMasha;
        double diffSalaryDenis = newYearSalaryDenis - yearSalaryDenis;
        double diffSalaryKristina = newYearSalaryKristina - yearSalaryKristina;

        System.out.printf("Masha now receives %.2f rubles. Annual income increased by %.2f rubles\n",
                newSalaryMasha, diffSalaryMasha);
        System.out.printf("Denis now receives %.2f rubles. Annual income increased by %.2f rubles\n",
                newSalaryDenis, diffSalaryDenis);
        System.out.printf("Kristina now receives %.2f rubles. Annual income increased by %.2f rubles\n",
                newSalaryKristina, diffSalaryKristina);
    }

    private static void task6() {
        int a = 12,
                b = 27,
                c = 44,
                d = 15,
                e = 9;

        int result = a * (b + (c - d * e));
        result = -result;

        System.out.println("result = " + result);
    }

    private static void task7() {
        int a = 5, b = 7;

        a += b;
        b = a - b;
        a -= b;
    }

    @SuppressWarnings("unused")
    private static void task8() {
        int a = 256;

        int b = (a/10)%10;
    }
}
