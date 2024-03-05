package unit2.Excercise1;

public class Time {	
	private long hour;
	private long minute;
	private long second;
	
	Time(long NewElapsedTime) {
		setTime(NewElapsedTime);
	}

	Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	Time() {
		this(System.currentTimeMillis());
	}
	
	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}
	
	public void setTime(long NewElapsedTime) {
        long totalSeconds = (NewElapsedTime / 1000);
        second = totalSeconds % 60;
        long totalMinutes = (totalSeconds / 60);
        minute = totalMinutes % 60;
        long totalHours = (totalMinutes / 60);
        hour = totalHours % 24;
        
	}
}
