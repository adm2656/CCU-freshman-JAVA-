/*
 * [A]100
 * [TA's Advise]
 * 1. �S����Ӥj���D, �G���}�C���g�k�ܤ���.
 * 2. ��ĳ�i�H�[�W�@�Ǵ��ܰT��.
 * */

import javax.swing.JOptionPane;

public class GradeTester {
	public static void main(String[] args) {

		String input = "";
		double grade = 0;
		int a = 0;

		GradeAnalyzer x = new GradeAnalyzer();

		while (true) {
			input = JOptionPane.showInputDialog("Please enter grade");// ��J�Ʀr
			if (input.equals("Q") || input.equals("q")) {
				break;
			}
			try {
				grade = Double.parseDouble(input); // �ഫ��double
				x.addGrade(grade);
			} catch (Exception e)// �H����J���~�榡
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
