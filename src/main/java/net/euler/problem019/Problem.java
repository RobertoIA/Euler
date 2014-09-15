package net.euler.problem019;

/**
 * You are given the following information, but you may prefer to do some
 * research for yourself.
 * 
 * 1 Jan 1900 was a Monday. Thirty days has September, April, June and November.
 * All the rest have thirty-one, Saving February alone, Which has twenty-eight,
 * rain or shine. And on leap years, twenty-nine. A leap year occurs on any year
 * evenly divisible by 4, but not on a century unless it is divisible by 400.
 * How many Sundays fell on the first of the month during the twentieth century
 * (1 Jan 1901 to 31 Dec 2000)?
 */
public class Problem {

	enum Months {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	}

	enum Weekdays {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static void main(String[] args) {
		Problem problem = new Problem();
		System.out.println(problem.countFirstSundays(1900, 2000));
	}

	int countFirstSundays(int firstYear, int lastYear) {
		Month currMonth = new Month(Months.JANUARY, Weekdays.MONDAY, firstYear);
		int count = 0;
		
		while (currMonth.year <= lastYear) {
			if(currMonth.isSundayFirst()) count++;
			currMonth = currMonth.getNextMonth();
		}

		return count;
	}

	class Month {

		Months month;
		Weekdays firstDay;
		int year;

		Month(Months month, Weekdays firstDay, int year) {
			this.month = month;
			this.firstDay = firstDay;
			this.year = year;
		}

		Month getNextMonth() {
			return this;
		}

		boolean isSundayFirst() {
			return false;
		}

		private boolean isLeapYear(int year) {
			if (year % 4 != 0)
				return false;
			if (year % 100 != 0)
				return true;
			if (year % 400 != 0)
				return false;
			return true;
		}
	}
}
