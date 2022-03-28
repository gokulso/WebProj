package java8streamtest;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;jaa

public class EmployeeTest {

    public static void main(String[] args) {

        List<Employee> empList  = getEmployee();

        /*List<Integer> bySal = empList.stream().map(e -> e.getSalary()).collect(Collectors.toList()); // get sal by natural order
        bySal.forEach(System.out::println);*/

        List<Employee> sal = empList.stream().sorted((e1, e2) -> e2.getSalary() - e1.getSalary()).collect(Collectors.toList());

        /*Optional<Employee> emp = empList.stream()    // second highest sal
                .sorted((e1, e2) -> e1.getSalary() - e2.getSalary())
                .skip(1)
                .findFirst();
        System.out.println(emp.get());*/

       /* List<Employee> eList = empList.stream()     // Reverse Order
                                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                .collect(Collectors.toList());
        eList.forEach(System.out::println);*/

        /*Optional<Employee> maxSalEmp = empList.stream().max(Comparator.comparing(Employee::getSalary));
        if (maxSalEmp.isPresent())                    // get Max or Min Emp by sal
            System.out.println(maxSalEmp.get());*/


        /*empList.stream()
                .reduce((e1, e2) -> (e1.getSalary() < e2.getSalary() ? e1 : e2)) //empl details with min or max using reduce
                .ifPresent(System.out::println);*/


    }

  public static List<Employee> getEmployee(){

        return Arrays.asList(new Employee(1, "John", 100),
                new Employee(2, "Mark", 200),
                new Employee(3, "Harry", 300),
                new Employee(4, "Katie", 400));

    }

}
