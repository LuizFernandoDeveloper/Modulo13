package model.LegalPerson;

import model.Person.Person;

public class LegalPerson extends Person {
    private String CNPJ;

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }
}
