package Mod3Week1HW1;

public class Homework1 {

	public static boolean getUp(boolean squaking, int currentHour) {
		
		//squaking is a boolean and represent the parrot if false the parrot is not squaking;
		//currentHour is an integer that represents the hours of the day

		if (squaking) {
			if (currentHour < 0 || currentHour > 23) {
				return false;
			} else if (currentHour < 6 || currentHour > 22) {
				return true;
			} else
				return false;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {		
			System.out.println("Get up? "+ getUp(true,5));
	}
}
