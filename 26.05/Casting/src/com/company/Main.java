package com.company;

public class Main {

    public static void main(String[] args) {
	    byte byteNumber = 1;
	    byte max = Byte.MAX_VALUE;
        short asd = 7;
	    int integerNumber = 100000;
	    int integerShort = 10;
	    float floatNumber = 1.5f;

	    int fromByte = byteNumber;
		System.out.println(fromByte);

		byte fromInt = (byte) integerShort;
		byte fromLongIng = (byte) integerNumber;

		System.out.println(max);
		System.out.println(max+200);
		System.out.println(fromLongIng);

		int maxInt = Integer.MAX_VALUE;
		System.out.println(maxInt+1);
		int uusMax = maxInt + 1;
		System.out.println("Uus int maksimum " +uusMax);

		int fromFloat = (int) floatNumber;
		float fromShortInt = integerShort;

		String number = "123";
		int numberToInt = Integer.parseInt(number);
		String numberToString = String.valueOf(numberToInt);
		System.out.println(numberToString);
    }
}
