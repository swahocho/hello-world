package com.ikhlas.exercises;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class TestPerson {
    public static void main(String [] args){
        Person tstPerson = new Person();

       // write another test class with main method. with four test cases.
       // use setter methods to set the first name, last name and age
        //test case 1: first name empty, last name empty, age = 20
        tstPerson.setAge(20);
        tstPerson.setFirstName("");
        tstPerson.setLastName("");
       // System.out.println("Test 1: Is teen: "+ tstPerson.isTeen(20));
       // System.out.println(" Person name is: "+ tPerson.getFullName();;
      //  System.out.println(tstPerson.getFirstName()+" " + tstPerson.getLastName());
        System.out.println("Test 1: Is teen: "+ tstPerson.isTeen(20)+ " Person name is: "+ tstPerson.getFirstName()+" " + tstPerson.getLastName());

        //test case 1: first name Muhammad, last name empty, age = 15
        tstPerson.setAge(15);
        tstPerson.setFirstName("Mohammad");
        tstPerson.setLastName("");
        System.out.println("Test 2: Is teen: "+ tstPerson.isTeen(15)+ " Person name is: "+ tstPerson.getFirstName()+" " + tstPerson.getLastName());

        //   test case 3: first name Muhammad, last name Shamsi, age = 15
        //    expected result: full name: Muhammad Shamsi, isTeen returns true
        tstPerson.setAge(15);
        tstPerson.setFirstName("Mohammad");
        tstPerson.setLastName("Shamsi");
        System.out.println("Test 3: Is teen: "+ tstPerson.isTeen(15)+ " Person name is: "+ tstPerson.getFirstName()+" " + tstPerson.getLastName());

        //    test case 4: first name empty, last name Shamsi, age = 40
        //    expected result: full name: Shamsi, isTeen returns false
        tstPerson.setAge(40);
        tstPerson.setFirstName("");
        tstPerson.setLastName("Shamsi");
        System.out.println("Test 4: Is teen: "+ tstPerson.isTeen(40)+ " Person name is: "+ tstPerson.getFirstName()+" " + tstPerson.getLastName());

        //need to know how to avoid passing age again in the sysout call. 
    }
}
