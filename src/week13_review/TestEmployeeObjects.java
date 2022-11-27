package week13_review;

import java.util.ArrayList;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee;

        employee =  new Tester("Josh", 35, 'M', "A01", "Manual Tester", 100000);

        employee.work();
       // employee.smokeTesting(); // reference type decides what's accessible

       // Tester tester =(Tester)employee;
        ( (Tester)employee ).smokeTesting();

      //  ( (Developer)employee ).unitTesting();

        employee.setSalary(200000);

        System.out.println(employee);

        System.out.println("-----------------------------");

        employee =  new Developer("Bella", 30, 'F', "A02", "Java Developer", 100000);

        employee.work();
        ((Developer) employee).unitTesting();
     //   ((Tester) employee).smokeTesting(); // Developer IS NOT A Tester


        System.out.println("-----------------------------");

        employee =  new Teacher("Jimmy", 36, 'M', "A03", 100000);

        employee.work();
        ( (RemoteJob)employee ).workFromHome();

        System.out.println(employee);

        System.out.println("-----------------------------");

        employee =  new Driver("Aaron", 40, 'M', "B01", 110000, 'A');

        employee.work();
        System.out.println(employee);

        System.out.println("-----------------------------");

        employee = new Janitor("Daniel", 38, 'M', "C01", 90000);

        employee.work();
        System.out.println(employee);

        System.out.println("-----------------------------");

        Employee[] employees = {
                new Tester("Josh", 35, 'M', "A01", "Manual Tester", 100000),
                new Developer("Bella", 30, 'F', "A02", "Java Developer", 100000),
                new Teacher("Jimmy", 36, 'M', "A03", 100000),
                new Driver("Aaron", 40, 'M', "B01", 110000, 'A'),
                new Janitor("Daniel", 38, 'M', "C01", 90000)
        };

        int countTesters = 0;
        for(Employee each : employees){

            each.work();

            if(each instanceof Tester){
                countTesters++;
            }


        }





    }

}
