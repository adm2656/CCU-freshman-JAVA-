import java.util.ArrayList;
import java.lang.Math;

public class GradeAnalyzer {

	int count = 0;
	double sum = 0, average = 0, deviation = 0, temp = 0;
	int[][] y = new int[3][4];

	ArrayList<Double> gradelist = new ArrayList<Double>();

	boolean isValidGrade(double Grade) {
		if (Grade <= 110 || Grade >= 0) {
			return true;
		} else {
			return false;
		}
	}

	void addGrade(double Grade) {
		if (isValidGrade(Grade)) {
			count += 1;
			sum = sum + Grade;
			gradelist.add(Grade);

			if (Grade >= 98) {
				y[0][0] += 1;
			} else if (Grade < 98 && Grade >= 92) {
				y[0][1] += 1;
			} else if (Grade < 92 && Grade >= 90) {
				y[0][2] += 1;
			} else if (Grade < 90 && Grade >= 88) {
				y[1][0] += 1;
			} else if (Grade < 88 && Grade >= 82) {
				y[1][1] += 1;
			} else if (Grade < 82 && Grade >= 80) {
				y[1][2] += 1;
			} else if (Grade < 80 && Grade >= 78) {
				y[2][0] += 1;
			} else if (Grade < 78 && Grade >= 72) {
				y[2][1] += 1;
			} else if (Grade < 72 && Grade >= 70) {
				y[2][2] += 1;
			} else if (Grade < 70 && Grade >= 60) {
				y[3][0] += 1;
			} else if (Grade < 60) {
				y[3][1] += 1;
			}
		}
	}

	void analyzeGrades() {
		average = sum / count;
		for (int i = 0; i < gradelist.size(); i++) {
			temp += (gradelist.get(i) - average) * (gradelist.get(i) - average);
		}

		deviation = Math.sqrt(temp / count);
	}

	public String toString() {

		String rlt = "";

		rlt += "A+ = " + y[0][0] + "\n";
		rlt += "A = " + y[0][1] + "\n";
		rlt += "A- = " + y[0][2] + "\n";
		rlt += "B+ = " + y[0][3] + "\n";
		rlt += "B = " + y[1][0] + "\n";
		rlt += "B- = " + y[1][1] + "\n";
		rlt += "C+ = " + y[1][2] + "\n";
		rlt += "C = " + y[1][3] + "\n";
		rlt += "C- = " + y[2][0] + "\n";
		rlt += "D = " + y[2][1] + "\n";
		rlt += "F = " + y[2][2] + "\n";

		return rlt;
	}
}
