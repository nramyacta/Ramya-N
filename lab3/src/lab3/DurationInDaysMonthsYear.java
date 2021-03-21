/**
*Name: Ramya N
*Description: Accept the date and print duration in days months and years with respect to current date.
*Date: 3/19/2021
*/
package lab3;
import java.time.*;
import java.util.*;
public class DurationInDaysMonthsYear {

	public static void main(String[] args) {
		LocalDate pdate=LocalDate.of(2019, 03, 18);
		LocalDate now=LocalDate.now();
		Period diff=Period.between(pdate, now);
		System.out.println("Difference in year is: "+diff.getYears()+" Years "+diff.getMonths()+" Months "+diff.getDays()+" Days ");

	}

}
