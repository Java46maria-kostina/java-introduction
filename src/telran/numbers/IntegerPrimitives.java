package telran.numbers;

public class IntegerPrimitives {

	public static byte getMaxByte() {
		byte res = 1;
		while (res > 0) {
			res = (byte) (res * 2);

		}
		return (byte) (res - 1);
	}

	public static byte getMinByte() {
	
		return (byte) (getMaxByte() +1) ;
	}

	public static int getLengthByte() {
		// TODO
		// 1. solution of copy/paste
		// Bonus solution with call the method getLength with passing some value
		return -1;
	}

	public static char getMaxChar() {
		char res = 1;
		while (res > 0) {
			res = (char) (res * 2);

		}
		return (char) (res - 1);
	}

	public static char getMinChar() {

		return (char) (getMaxChar() + 1);
	}

	public static int getLengthChar() {
		// TODO
		// 1. solution of copy/paste
		// Bonus solution with call the method getLength with passing some value
		return -1;
	}

	public static short getMaxShort() {
		short res = 1;
		while (res > 0) {
			res = (short) (res * 2);
		}
		return (short) (res - 1);
	}

	public static short getMinShort() {
		// TODO Auto-generated method stub
		return -1;
	}

	public static int getLengthShort() {
		// TODO
		// 1. solution of copy/paste
		// Bonus solution with call the method getLength with passing some value
		return -1;
	}

	public static int getMaxInt() {
		// TODO Auto-generated method stub
		return -1;
	}

	public static int getMinInt() {
		// TODO Auto-generated method stub
		return -1;
	}

	public static int getLengthInt() {
		// TODO
		// 1. solution of copy/paste
		// Bonus solution with call the method getLength with passing some value
		return -1;
	}

	public static long getMaxLong() {
		long res = 1;
		while (res > 0) {
			res = res * 2;
		}
		return res - 1;
	}

	public static long getMinLong() {
		// TODO Auto-generated method stub
		return -1;
	}

	public static int getLengthLong() {
		// TODO
		// 1. solution of copy/paste
		// Bonus solution with call the method getLength with passing some value
		return -1;
	}

	/**
	 * 
	 * @param x you should understand what x is
	 * @return length of any type in accordance to the x length is number of bytes
	 *         for any type
	 */
	private static int getLength(long x) {
		
		
		// TODO

		return -1;
	}

}
