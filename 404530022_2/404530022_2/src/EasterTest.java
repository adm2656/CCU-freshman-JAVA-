/*
 * [A]95
 * [TA's Advise]
 * 1.常見的數學method可以記一下: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 * 2.之後可以嘗試在javadoc中寫一些註解.
 * 3.演算法實作條件不完全, 請多注意.
 * */
public class EasterTest {
	public static void main(String[] args) {
		String easterStr1, easterStr2;
		easterStr1 = Easter.calculateEaster(2001);
		easterStr2 = Easter.calculateEaster(2012);

		System.out.println("In 2001, " + easterStr1);
		System.out.println("In 2012, " + easterStr2);
	}
}
