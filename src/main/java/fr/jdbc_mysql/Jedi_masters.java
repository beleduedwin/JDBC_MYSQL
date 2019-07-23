package fr.jdbc_mysql;

import java.io.Serializable;

public class Jedi_masters{
    private String name;
    private String surname;

    //.....Constructeur
    public Jedi_masters() {
        this.name = name;
        this.surname = surname;
    }

    //Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Jedi{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
