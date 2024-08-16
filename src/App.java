import java.time.LocalDate;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        
        Employee [] employees = {new Employee("Psychodrill", "Absent", "Absent", "666", "developer", 1000, 1987),
                                new Employee("Haellraiser", "Absent", "Absent", "999", "developer", 1200, 1986),
                                new Employee("CyberSatan", "Absent", "Absent", "000", "developer", 1500, 1989),
                                new Chief("Daemon", "Demonical", "Satan", "000", "developer", 1100, 1982)};
        // Employee emp = new Employee("Psychodrill", "Absent", "Absent", "666", "developer", 0, 1987);
        // //Boolean isGreater = Employee.compareDates(null, null);
        // LocalDate ld = LocalDate.now();
        Boolean value =Employee.compareDates(LocalDate.parse("2000-11-28"), LocalDate.parse("1998-07-17"));
        System.out.println(String.format("%s",value));
        Chief.increaseSalary(300, employees);
        System.out.println(Arrays.toString(employees));
    }
}
