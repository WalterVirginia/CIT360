package hibernate_360;

import java.util.*;

public class run_hibernate {

    public static void main (String[] args){

        DAO_try try = DAO_try.getInstance();

        List<Student> s = try.getStudent();
        for (Student i : s) {
            System.out.println(i);
        }


    }



}
