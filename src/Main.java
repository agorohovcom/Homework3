public class Main {
    public static void main(String[] args) {

        // Задача 1

        int myInt1 = 1_111_111;
        byte myByte1 = 111;
        short myShort1 = 11_111;
        long myLong1 = 1_111_111_111_111_111_111L;
        float myFloat1 = 111.111f;
        double myDouble1 = 111_111.111;

        System.out.printf("Значение переменной %s с типом %s равно " + myInt1 + "\n", "myInt1", "int");
        System.out.printf("Значение переменной %s с типом %s равно " + myByte1 + "\n", "myByte1", "byte");
        System.out.printf("Значение переменной %s с типом %s равно " + myShort1 + "\n", "myShort1", "short");
        System.out.printf("Значение переменной %s с типом %s равно " + myLong1 + "\n", "myLong1", "long");
        System.out.printf("Значение переменной %s с типом %s равно " + myFloat1 + "\n", "myFloat1", "float");
        System.out.printf("Значение переменной %s с типом %s равно " + myDouble1 + "\n\n", "myDouble1", "double");

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


    }
}