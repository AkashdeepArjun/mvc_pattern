package home.ui;

import home.models.*;
import java.lang.String;

public class PersonUi {
    
    public void showPersonDetails(Person person){

        System.out.println("person name is "+person.getName());
        System.out.println("person age is "+String.valueOf(person.getAge()));
    }



}
