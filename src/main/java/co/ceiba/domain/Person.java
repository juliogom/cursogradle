package co.ceiba.domain;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    
	private final String name;
    private String lastName;
    
    public Person(String name,String lastName) {
    	
        this.name = name;
        this.lastName=lastName;
        
        new GrowthList();
    }

    public String getName() {
        return name;
    }
    
    public String getLastName() {
        return lastName;
    }
}
