public class Chief extends Employee {

    public Chief(String name, String midName, String surName, String phone, String position, int salary, int birth) {
        super(name, midName, surName, phone, position, salary, birth);
        
    }
    
    public static void increaseSalary(int amount, Employee [] emps){

        for (Employee employee : emps) {
            if(employee.getClass()!= Chief.class){
                employee.setSalary(employee.getSalary()+amount);
            }
            
        }

    }

}
