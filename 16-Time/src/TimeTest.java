
public class TimeTest {
	public static void main(String[] args) {
		Time time1 = new Time(16, 32, 47);
		Time time2 = new Time(10, 16, 40);

		Time sumTime = addTimeObjects(time1, time2);
		System.out.println(sumTime);
	}

	private static Time addTimeObjects(Time time1, Time time2) {
		Time tempTime=new Time();
		
		tempTime.setSecond(time1.getSecond()+time2.getSecond());
		tempTime.setMinutes(time1.getMinutes()+time2.getMinutes());
		tempTime.setHours(time1.getHours()+time2.getHours());
		correctSeconds(tempTime);
		correctMinutes(tempTime);
		correctHours(tempTime);
		
		
		return tempTime;
	}

	private static void correctHours(Time tempTime) {
		if(tempTime.getHours()>23) {
			tempTime.setHours(tempTime.getHours()%24);
		}
	}

	private static void correctMinutes(Time tempTime) {
		while(tempTime.getMinutes()>60) {
			tempTime.setMinutes(tempTime.getMinutes()-60);
			tempTime.setHours(tempTime.getHours()+1);
		}
	}

	private static void correctSeconds(Time tempTime) {
		while(tempTime.getSecond()>60) {
			tempTime.setSecond(tempTime.getSecond()-60);
			tempTime.setMinutes(tempTime.getMinutes()+1);
		}
		
	}
}
