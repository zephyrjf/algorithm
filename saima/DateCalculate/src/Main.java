/*
 * �ھ��á��Ƽ����淢��Ľ��죬���Ƕ�ʱ��İ���Խ��Խ�ϸ񣬶���һ��һ��Ӱ�����Ĺ�˾�ĸ߹���˵��������Ҫ���Լ����г���ǰ���ŵ��¸��¡�
 * ������ͨ����˵����Ҳ���ܽ�����֮��İ����Ѿ���ǰ���á�
 * �����һ�����������������δ����ĳһ�컹ʣ�����졣
 * ���������2015��10��18�ա�
 * */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String date = sc.nextLine();
			
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//			Date p = sdf.parse(date);
//			Date b = sdf.parse("2015-10-18");
//			System.out.println(((long)(p.getTime() - b.getTime()))/(long)(24*3600*1000));
			
			System.out.println(countTotalDays(date) - countTotalDays("2015-10-18"));
		}
		
	}
	
	private static int[][] monthDays = {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
										,{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
	private static boolean isLeapYear(int year) {
		if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private static int getYearDays(int year) {
		if (isLeapYear(year)) {
			return 366;
		} else {
			return 365;
		}
	}
	
	private static int countYearDays(int year) {
		int days = 0;
		for (int i = 2015; i < year; i++) {
			days += getYearDays(i);
		}
		return days;
	}
	
	private static int countMonthDays(int year, int month) {
		int days = 0;
		int row = 0;
		if (isLeapYear(year)) {
			row = 1;
		}
		for (int i = 0; i < month-1; i++) {
			days += monthDays[row][i];
		}
		return days;
	}
	
	private static int countTotalDays(String date) {
		String[] ymd = date.split("-");
		int year = Integer.valueOf(ymd[0]);
		int month = Integer.valueOf(ymd[1]);
		int day = Integer.valueOf(ymd[2]);
		return countYearDays(year) + countMonthDays(year, month) + day;
	}
}
