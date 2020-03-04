package jp.takeshi;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonManager {
    
    private Map<String, Person> persons;
    
    public PersonManager() {
	this.persons = new HashMap<>();
    }
    
    public PersonManager add(Person p) {
	this.persons.put(p.getId(), p);
	return this;
    }
    
    public int count() {
	return this.persons.size();
    }
    
    
    public boolean exists(String personId) {
	return this.persons.containsKey(personId);
    }
    
    public Optional<Person> get(String personId) {
	if (personId == null || personId.trim().length() < 1) {
	    return Optional.empty();
	} 
	return Optional.ofNullable(this.persons.get(personId));
    }

    public Optional<Person> find(String name) {
	Person person = null;
    	for (Person p : this.persons.values()) {
    	    String firstName = p.getFirstName();
    	    String lastName = p.getLastName();
    	    String middleName = p.getMiddleName();
    	    if (firstName.equalsIgnoreCase(name) 
    		    || lastName.equalsIgnoreCase(name)
    		    || middleName.equalsIgnoreCase(name)) {
    		person = p;
    		break;
    	    }
    	}
    	return Optional.ofNullable(person);
    }

}
