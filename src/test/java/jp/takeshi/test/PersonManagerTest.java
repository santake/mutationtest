package jp.takeshi.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jp.takeshi.Person;
import jp.takeshi.PersonManager;

public class PersonManagerTest {

    @Test
    public void testInit() {
	PersonManager pm = this.initPersonManager();
	assertNotNull(pm);
	assertTrue(pm.count() > 0);
    }
    
    @Test
    public void testGet() {	
	PersonManager pm = this.initPersonManager();
	assertNotNull(pm);
	assertTrue(pm.exists("JSB"));
	assertTrue(pm.get("JSB").isPresent());

	assertFalse(pm.exists("A"));
	assertFalse(pm.get("A").isPresent());

	assertFalse(pm.exists(null));
	assertFalse(pm.get(null).isPresent());
	assertFalse(pm.exists(""));
	assertFalse(pm.get("").isPresent());
	
    }
    

    @Test
    public void testFind() {
	PersonManager pm = this.initPersonManager();
	assertNotNull(pm);
	
	assertTrue(pm.find("jack").isPresent());
	assertTrue(pm.find("S").isPresent());
	assertTrue(pm.find("benjamin").isPresent());
	
	assertFalse(pm.find("Q").isPresent());
	
    }
    
    
    
    private PersonManager initPersonManager() {
	PersonManager pm = new PersonManager();
	assertNotNull(pm.add(new Person("CCC", "Charlie", "C", "Chanon", 89)));
	return pm
		.add(new Person("JSB", "Jack","S","Benjamin", 39))
		.add(new Person("TPY", "Tarou","P","Yamada", 18))
		.add(new Person("HAW", "Hanako","A","Wada", 52))
		.add(new Person("MKC", "Mike","K","Clapp", 12));
    }
    
}
