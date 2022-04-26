package home.controllers;

import home.models.Person;
import home.ui.PersonUi;
public class PersonController{

        private Person person;
        private PersonUi person_ui;

        public PersonController(Person person,PersonUi person_ui){
            this.person=person;
            this.person_ui=person_ui;
        }

        public void setPersonName(String name){
            person.setName(name);
        }

        public void setPersonAge(int age){
            person.setAge(age);
        }


        public void updateUi(){
            person_ui.showPersonDetails(this.person);
        }
}