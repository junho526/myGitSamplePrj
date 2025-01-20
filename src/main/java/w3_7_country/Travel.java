package w3_7_country;

import java.util.Scanner;

class Country{
    public static String nameCountry;
    public String positionCountry;

    public Country(String nameCountry, String positionCountry){
        Country.nameCountry = nameCountry;
        this.positionCountry = positionCountry;
    }
}


class Nation{
    public String nameNation;
    public Integer ageNation;
    public Country nationCountry;
    public Nation(String nameNation, Integer ageNation, Country country){
        this.nameNation = nameNation;
        this.ageNation = ageNation;
        this.nationCountry = country;
    }
}

class Person{
    public String namePerson;
    public Integer agePerson;
    public boolean country;
    public Person(String namePerson, Integer agePerson, Country country){
        this.namePerson = namePerson;
        this.agePerson = agePerson;
        this.country = country.equals(false);
    }

}

interface travel{
    Country nameCountry();
    Nation country();
}

class enterCountry implements travel{

    Scanner sc = new Scanner(System.in);

    @Override
    public Country nameCountry() {
        return null;
    }

    @Override
    public Nation country() {
        return null;
    }
}

public class Travel {
    public static void main(String[] args) {

    }

}
