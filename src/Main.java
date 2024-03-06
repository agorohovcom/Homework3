public class Main {
    public static void main(String[] args) {

        // Задача 1

        int myInt1 = 1_111_111;
        byte myByte1 = 111;
        short myShort1 = 11_111;
        long myLong1 = 1_111_111_111_111_111_111L;
        float myFloat1 = 111.111f;
        double myDouble1 = 111_111.111;

        System.out.printf("Значение переменной %s с типом %s равно %d\n", "myInt1", "int", myInt1);
        System.out.printf("Значение переменной %s с типом %s равно %d\n", "myByte1", "byte", myByte1);
        System.out.printf("Значение переменной %s с типом %s равно %d\n", "myShort1", "short", myShort1);
        System.out.printf("Значение переменной %s с типом %s равно %d\n", "myLong1", "long", myLong1);
        System.out.printf("Значение переменной %s с типом %s равно %f\n", "myFloat1", "float", myFloat1);
        System.out.printf("Значение переменной %s с типом %s равно %f\n\n", "myDouble1", "double", myDouble1);

        // Задача 2

        float myFloat2 = 27.12f;
        long myLong2 = 987_678_965_549L;
        float myFloat22 = 2.786f;
        short myShort2 = 569;
        short myShort22 = -159;
        short myShort222 = 27897;
        byte myByte2 = 67;

        // Задача 3

        short papersTotal = 480;
        byte ludmilaPavlovnaClass = 23;
        byte annaSergeevnaClass = 27;
        byte ekaterinaAndreevnaClass = 30;
        int papersToStudent = papersTotal / (ludmilaPavlovnaClass + annaSergeevnaClass + ekaterinaAndreevnaClass);

        System.out.printf("На каждого ученика рассчитано %d листов бумаги\n\n", papersToStudent);

        // Задача 4

        byte bottlesPerMinute = 16 / 2;
        int bottlesPer20Minutes = bottlesPerMinute * 20;
        int bottlesPerDay = bottlesPerMinute * 60 * 24;
        int bottlesPer3Days = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 30;

        System.out.printf("За %s машина произвела %d штук бутылок\n", "20 минут", bottlesPer20Minutes);
        System.out.printf("За %s машина произвела %d штук бутылок\n", "сутки", bottlesPerDay);
        System.out.printf("За %s машина произвела %d штук бутылок\n", "3 дня", bottlesPer3Days);
        System.out.printf("За %s машина произвела %d штук бутылок\n\n", "1 месяц", bottlesPerMonth);

        // Задача 5

        byte cansOfPaint = 120;
        byte whitePaintToClass = 2;
        byte brownPaintToClass = 4;
        int classes = cansOfPaint / (whitePaintToClass + brownPaintToClass);
        int totalWhiteCansOfPaint = classes * whitePaintToClass;
        int totalBrownCansOfPaint = classes * brownPaintToClass;

        System.out.printf("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски\n\n", classes, totalWhiteCansOfPaint, totalBrownCansOfPaint);

        // Задача 6

        short bananasWeight = 5 * 80;
        float milkWeight = (105.0f / 100) * 200;
        short iceCreamWeight = 2 * 100;
        short eggsWeight = 4 * 70;
        int totalWeight = (int) (bananasWeight + milkWeight + iceCreamWeight + eggsWeight);

        System.out.println(totalWeight);
        System.out.println((float) totalWeight / 1000);
        System.out.println();

        // Задача 7

        byte unnecessaryWeightKg = 7;
        short minWeightDrop = 250;
        short maxWeightDrop = 500;
        int minDaysToDropWeight = (7 * 1000) / minWeightDrop;
        int maxDaysToDropWeight = (7 * 1000) / maxWeightDrop;
        int averageDaysToDropWeight = (minDaysToDropWeight + maxDaysToDropWeight) / 2;
        System.out.println(minDaysToDropWeight);
        System.out.println(maxDaysToDropWeight);
        System.out.println(averageDaysToDropWeight);
        System.out.println();

        // Задача 8

        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;
        byte upSalary = 10;
        int mashaSalaryUp10Percent = mashaSalary + ((mashaSalary * upSalary) / 100);
        int denisSalaryUp10Percent = denisSalary + ((denisSalary * upSalary) / 100);
        int kristinaSalaryUp10Percent = kristinaSalary + ((kristinaSalary * upSalary) / 100);
        int mashaYearDifference = (mashaSalaryUp10Percent - mashaSalary) * 12;
        int denisYearDifference = (denisSalaryUp10Percent - denisSalary) * 12;
        int kristinaYearDifference = (kristinaSalaryUp10Percent - kristinaSalary) * 12;
        System.out.printf("Маша теперь получает %d рублей. Годовой доход вырос на %d рублей\n", mashaSalaryUp10Percent, mashaYearDifference);
        System.out.printf("Денис теперь получает %d рублей. Годовой доход вырос на %d рублей\n", denisSalaryUp10Percent, denisYearDifference);
        System.out.printf("Кристина теперь получает %d рублей. Годовой доход вырос на %d рублей\n", kristinaSalaryUp10Percent, kristinaYearDifference);

    }
}