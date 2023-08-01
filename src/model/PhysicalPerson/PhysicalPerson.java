package model.PhysicalPerson;

import model.Person.Person;

public class PhysicalPerson extends Person {
    private String CPF;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }
}
