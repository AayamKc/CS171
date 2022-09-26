package cs171.employee;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeTesterArrayList {

    public static void main(String[] args) {
        Employee e1 = new Employee("David");
        Employee e2 = new Employee("Fardeen");
        Employee e3 = new Employee("Junil");
        Employee e4 = new Employee("Charlington");
        Employee e5 = new Employee("Eric");
        Employee e6 = new Employee("Ruan");
        Employee e7 = new Employee("Ariana");

        ArrayList<Employee> company = new ArrayList<>();
        company.add(e1);
        company.add(e2);
        company.add(e3);
        company.add(e4);
        company.add(1, e5);
        System.out.println(company);

        Iterator<Employee> compItr = company.iterator();
        while(compItr.hasNext()){
           Employee temp = compItr.next();
            if (temp.getName().equals("Fardeen")){
                compItr.remove();
            }
        }
        System.out.println(company);
    }
}
