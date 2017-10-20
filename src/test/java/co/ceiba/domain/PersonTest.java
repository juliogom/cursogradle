package co.ceiba.domain;

import org.junit.Test;

import co.ceiba.domain.Person;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Julio","Gómez");
        assertEquals("Julio", person.getName());
    }
}
