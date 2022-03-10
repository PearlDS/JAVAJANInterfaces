package be.intecbrussel.apps;

import be.intecbrussel.people.Aviva;
import be.intecbrussel.people.Jeremy;
import be.intecbrussel.people.Yana;
import be.intecbrussel.schools.CookingSchool;
import be.intecbrussel.schools.MathSchool;
import be.intecbrussel.trainings.CookingTraining;

public class MainApp {

    public static void main(String[] args) {

        Aviva aviva = new Aviva();
        Jeremy jeremy = new Jeremy();
        Yana yana = new Yana();

        CookingSchool [] chefs = {aviva, jeremy};

        for(CookingSchool student: chefs){
           // student.doCooking();
        }

        CookingTraining [] chefs2 = {aviva, jeremy, yana};

        for(CookingTraining student: chefs2){
            student.doCooking();
        }

        System.out.println();


    }
}
