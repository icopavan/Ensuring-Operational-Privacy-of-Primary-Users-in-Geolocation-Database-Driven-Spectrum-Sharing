/*
 * This class provides parameters that MTP function is going to use
 */
public class MTP {
	// public static double power;
	public static double times = 1;
	public static double d0 = 0 * times;
	public static double d1 = 8 * times;
	public static double d2 = 14 * times;
	public static double d3 = 25 * times;

	public static void ChangeMult(double mult) {
		times = mult;
		d0 = 0 * times;
		d1 = 8 * times;
		d2 = 14 * times;
		d3 = 25 * times;
	}
}