package be.intecbrussel.people;

import be.intecbrussel.schools.CookingSchool;
import be.intecbrussel.schools.MathSchool;
import be.intecbrussel.trainings.CookingTraining;
import be.intecbrussel.trainings.ProgrammingTraining;

public class Yana extends MathSchool implements CookingTraining, ProgrammingTraining {

    @Override
    public void doMath() {
        System.out.println("does Math perfectly");
    }



    @Override
    public void doProgramming() {
        System.out.println("programming Java");
    }

    @Override
    public void doCooking() {
        System.out.println("makes breakfast");
    }
}
