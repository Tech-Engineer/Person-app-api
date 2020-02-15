package com.person.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.person.model.PersonModel;

public class PersonDAO {
	private static final Map<String, PersonModel> personData = new HashMap<String, PersonModel>();
	 
    static {
        initializePersonData();
    }
 
    private static void initializePersonData() {
    	
        PersonModel person1 = new PersonModel("John", "Wick", 29, "red", new String[] {"shopping", "football"});
        PersonModel person2 = new PersonModel("Sarah", "Raven", 54, "blue", new String[] {"chess"});        
 
        personData.put(person1.getFirst_name().toLowerCase()+person1.getLast_name().toLowerCase(), person1);
        personData.put(person2.getFirst_name().toLowerCase()+person2.getLast_name().toLowerCase(), person2);        
    }
 
    public static PersonModel getPersonDetails(String fName, String lName) {
    	String keyName = (fName+lName).toLowerCase();
    	if(personData.get(keyName) != null)
    		return personData.get(keyName);
    	
    	return new PersonModel();
    }
 
    public static String addPersonDetails(PersonModel pm) {
    	String keyName = (pm.getFirst_name()+pm.getLast_name()).toLowerCase();
        personData.put(keyName, pm);
        return "Details added successfully";
    }
 
    public static String updatePersonDetails(PersonModel pm) {
    	String keyName = (pm.getFirst_name()+pm.getLast_name()).toLowerCase();
    	if(personData.get(keyName) != null) {
    		personData.put(keyName, pm);
            return "Details updated successfully";
    	}
    	
    	return "Person details not available in the database for updation.";
    }
 
    public static String deletePersonDetails(String fName, String lName) {
    	String keyName = (fName+lName).toLowerCase();
    	if(!personData.get(keyName).equals(null)) {
    		personData.remove(keyName);
    		return "Details deleted successfully";
    	}
    	
    	return "Details not present in database for deletion";
    }
 
    public static List<PersonModel> getAllPersonDetails() {
        Collection<PersonModel> c = personData.values();
        List<PersonModel> list = new ArrayList<PersonModel>();
        list.addAll(c);
        return list;
    }       
}
