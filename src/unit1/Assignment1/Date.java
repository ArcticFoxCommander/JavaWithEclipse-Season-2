package unit1.Assignment1;

public class Date {

	public int month = 12;
	public int day = 31;
	public int year = 1999;
	
	Date() {
		
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int newMonth) {
		month = newMonth;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int newDay) {
		day = newDay;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int newYear) {
		year = newYear;
	}
	
	public String displayDate() {
		if (month > 12 || day > 31 || month < 1 || day < 1)
			return "Invalid Date";
			else
		return "Displaying the date \n" + year + "/" + month + "/" + day + "\n";
	}
}
