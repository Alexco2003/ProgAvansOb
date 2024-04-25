package org.example.lab9.src.jdbc;

import org.example.lab9.src.jdbc.config.DataSetup;
import org.example.lab9.src.jdbc.exception.InvalidPersonException;
import org.example.lab9.src.jdbc.model.Person;
import org.example.lab9.src.jdbc.service.PersonService;

import java.sql.SQLException;
import java.util.List;

public class MainApp {

    private DataSetup dataSetup = new DataSetup();
    private PersonService service = new PersonService();

    public static void main(String[] args) {

        MainApp mainApp = new MainApp();

        mainApp.setUpData();

        mainApp.addPerson();
        mainApp.getPersons();
        mainApp.getPersonById(1);
        mainApp.updatePersonNameForId(1, "Elena");
    }

    private void setUpData() {
        try {
            dataSetup.createTableAndStoredProcedure();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void addPerson() {
        try {
            service.registerNewPerson("Maria", 23);
        } catch (InvalidPersonException e) {
            System.out.println(e.getMessage());
        }
    }

    private void getPersons() {
        System.out.println("Retrieving all the persons from database:");
        List<Person> personList = service.getAllPersons();
        for (Person person : personList) {
            System.out.println("\t" + person);
        }
    }

    private void getPersonById(int id) {
        System.out.println("Retrieving the person with id: " + id);
        Person person = service.getPersonById(id);
        System.out.println("\t" + person);
    }

    private void updatePersonNameForId(int id, String name) {
        try {
            System.out.println("Updating the person with id: " + id);
            service.updatePersonNameForId(name, id);
        } catch (InvalidPersonException e) {
            System.out.println(e.getMessage());
        }
    }

}