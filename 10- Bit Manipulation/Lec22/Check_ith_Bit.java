package Lec22;

public class Check_ith_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84; 
		int i = 3;
		// if we shift one with ith value and then we can compare with n to find the
		// answer
		System.out.println(isSet(n, i));

	}

	public static boolean isSet(int n, int i) {
		int mask = (1 << i);
		// criteria of & operator -->
		// If both bits are 1, the result is 1.
		// If either bit (or both) is 0, the result is 0.
		if ((n & mask) != 0) {
			return true;
		} else {
			return false;
		}
	}
}
