/*
 * [A]95
 * [TA's Advise]
 * 1.�`�����ƾ�method�i�H�O�@�U: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 * 2.����i�H���զbjavadoc���g�@�ǵ���.
 * 3.�t��k��@���󤣧���, �Цh�`�N.
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
