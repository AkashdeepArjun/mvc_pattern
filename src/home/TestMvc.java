package home;

import home.controllers.PersonController;
import home.models.Person;
import home.ui.PersonUi;

public class TestMvc {

    public static void main(String[] args){

        Person akash=new Person();
        PersonUi ui = new PersonUi();

        PersonController controller = new PersonController(akash, ui);
        controller.setPersonName("akash");
        controller.setPersonAge(29);
        controller.updateUi();


    }
    
    
}
