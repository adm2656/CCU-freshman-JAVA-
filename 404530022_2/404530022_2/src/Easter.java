
public class Easter {
	public static String calculateEaster(int aYear) {
		String easter;
		int year = aYear;
		int day;
		int a, b, c, k, p, q, M, N, d, e;

		a = year % 19;
		b = year % 4;
		c = year % 7;
		k = year / 100;//Math.floor(), -2
		p = (13 + 8 * k) / 25;//Math.floor()
		q = k / 4;//Math.floor()
		M = (15 - p + k - q) % 30;
		N = (4 + k - q) % 7;
		d = (19 * a + M) % 30;
		e = (2 * b + 4 * c + 6 * d + N) % 7;

		//或許把return寫在最後會更精簡?
		if (22 + d + e <= 31) {
			day = 22 + d + e;
			easter = " Easter Sunday is: month = 3 and day = " + day;
			return easter;
		} else {
			if (d == 29 && e == 6) {
				easter = " Easter Sunday is: month = 4 and day = 19";
				return easter;
			}
			//條件不完全, (11 * M +11) % 30 < 19, -3
			if (d == 28 && e == 6 && (11 * M) % 30 < 19) {
				easter = " Easter Sunday is: month = 4 and day = 18";
				return easter;
			} else {
				day = d + e - 9;
				easter = " Easter Sunday is: month = 4 and day = " + day;
				return easter;
			}
		}
	}
}
