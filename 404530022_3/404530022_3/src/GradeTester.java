/*
 * [A]100
 * [TA's Advise]
 * 1. 沒什麼太大問題, 二維陣列的寫法很不錯.
 * 2. 建議可以加上一些提示訊息.
 * */

import javax.swing.JOptionPane;

public class GradeTester {
	public static void main(String[] args) {

		String input = "";
		double grade = 0;
		int a = 0;

		GradeAnalyzer x = new GradeAnalyzer();

		while (true) {
			input = JOptionPane.showInputDialog("Please enter grade");// 輸入數字
			if (input.equals("Q") || input.equals("q")) {
				break;
			}
			try {
				grade = Double.parseDouble(input); // 轉換為double
				x.addGrade(grade);
			} catch (Exception e)// 以防輸入錯誤格式
			{

			}
		}
		if (x.count >= 2) {
			x.analyzeGrades();
			System.out.println("You entered" + x.count + "valid grades from 0 to 110. Invalid grades are ignored! ");
			System.out.println("The average = " + x.average + " with a standard deviation = " + x.deviation);
			System.out.println("The grade distribution is: ");
			System.out.println(x.toString());
		}
	}
}
