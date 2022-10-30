package week09_review;

import java.time.LocalDate;
import java.util.ArrayList;

public class AppleInc {

    public static void main(String[] args) {

        Tester[] testers = {
                new Tester("Sajjad", 'M', LocalDate.of(1998, 3, 4), "A01", "QA", 100000),
                new Tester("Serhan", 'M', LocalDate.of(1997, 7, 4), "A02", "SDET", 105000),
                new Tester("Ana", 'F', LocalDate.of(1996, 9, 4), "A03", "QE", 110000),
        };


        Developer[] developers = {
                new Developer("Hilal", 'F', LocalDate.of(1982,12,4), "9874","Front end Developer",110000),
                new Developer("Mahmut", 'M', LocalDate.of(1989,4,14), "3265","Back end Developer",120000),
                new Developer("Ediz", 'M', LocalDate.of(2001,10,28), "9563","Developer",130000),
                new Developer("Hamid",'M',LocalDate.of(1989,10,10),"303","Developer",200000),
                new Developer("Serhan",'M',LocalDate.of(1990,11,25),"308","Developer",160000)
        };

        Developer dev2 = new Developer("Halima", 'F', LocalDate.of(1997, 12, 4), "1224", "Swift Developer", 150000);

        ScrumTeam scrum1 = new ScrumTeam("Nazar", "Olzhas", "Kudret", 14);
        scrum1.addTesters(testers);
        scrum1.addDevelopers(developers);
        scrum1.addDeveloper(dev2);

        System.out.println(scrum1);


        scrum1.removeDeveloper("9563");

        System.out.println(scrum1);

        scrum1.removeTester("A02");

        System.out.println(scrum1);


        System.out.println("------------------------------------------");

        for (Tester eachTester : scrum1.testers) {
            System.out.println(eachTester.name +" : "+eachTester.salary);
        }

        System.out.println("------------------------------------------");

        for (Developer eachDev : scrum1.developers) {
            System.out.println(eachDev.name +" : "+eachDev.salary);
        }

        System.out.println("------------------------------------------");


        ScrumTeam scrum2;

        ScrumTeam scrum3;


        System.out.println("------------------------------------------");

       // ArrayList<ScrumTeam> scrums = new ArrayList<>();
      //  ScrumTeam[] scrumTeams = {scrum1};



    }

}

/*
4.create a class called AppleInc:
            1. create an array of Testers and add the testers from your group
            2. create an array of developers add the developers from your group
            3. create an object of ScrumTeam named scrum1 and store the testers & developers above to the scrum team
            4. Display the full infos of the scrum team
            5. Create another object of ScrumTeam named scrum2 and store 2 testers & 5 develoeprs objects
            6. Create an array of ScrumTeam and store all the scum objects (scrum1 & scrum2)
 */