package packageone;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks Obtained:");
		int mark = sc.nextInt();
		String grade = "";
		mark = mark / 10;
		switch (mark) {
		case 9:
			grade = "S";
			break;
		case 8:
			grade = "E";
			break;
		case 7:
			grade = "A";
			break;
		case 6:
			grade = "B";
			break;
		case 5:
			grade = "C";
			break;
		case 4:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		System.out.println("Grade is " + grade);
	}

}
