package ru.dikhasiya;

public class OverFlow {
    public static void main(String[] args) {

        // тип byte
        byte numberOneByte = 10;
        byte numberTwoByte = 110;
        byte sumByte = (byte) (numberOneByte + numberTwoByte);
        System.out.println("Сумма чисел 10 и 110 типа byte равна " + sumByte);

        // тип short (16 бит)
        short numberOneShort = 32766;
        short numberTwoShort = 32767;
        short productShort = (short) (numberOneShort * numberTwoShort);
        System.out.println("Произведение чисел 32766 и 32767 типа short равно " + productShort);

        // тип int (32 бит)
        int numberOneInt = -2147483640;
        int numberTwoInt = 10000000;
        int sumInt = numberOneInt + numberTwoInt;
        System.out.println("Сумма чисел -2147483640 и 10000000 типа int равна " + sumInt);

        // тип long (64 бит)
        long numberOneLong = -90000000000000000L;
        long numberTwoLong =  90000000000000000L;
        long differenceLong = numberOneLong - numberTwoLong;
        System.out.println("Разница чисел -90000000000000000 и -90000000000000000 типа long равна " + differenceLong);

    }
}
