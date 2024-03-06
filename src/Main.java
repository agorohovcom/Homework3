public class Main {
    public static void main(String[] args) {

        int myInt = 1_111_111;
        byte myByte = 111;
        short myShort = 11_111;
        long myLong = 1_111_111_111_111_111_111L;
        float myFloat = 111.111f;
        double myDouble = 111_111.111;

        System.out.printf("Значение переменной %s с типом %s равно " + myInt + "\n", "myInt", "int");
        System.out.printf("Значение переменной %s с типом %s равно " + myByte + "\n", "myByte", "byte");
        System.out.printf("Значение переменной %s с типом %s равно " + myShort + "\n", "myShort", "short");
        System.out.printf("Значение переменной %s с типом %s равно " + myLong + "\n", "myLong", "long");
        System.out.printf("Значение переменной %s с типом %s равно " + myFloat + "\n", "myFloat", "float");
        System.out.printf("Значение переменной %s с типом %s равно " + myDouble + "\n", "myDouble", "double");


    }
}