package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
    	if(year % 4 ==0 && year % 100 !=0 || year % 400 == 0) {
    		System.out.println("leap");
    	} else {
    		System.out.println("not leap");
    	}
    	
    }
    public static void main(String[] args) {
    	LeapYearPrinter leap = new LeapYearPrinter();
    	leap.isLeapYear(2024);
    }
}

// Un año es bisiesto si es divisible por 4 pero no por 100, o si es divisible por 400.