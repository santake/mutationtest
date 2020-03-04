package jp.takeshi.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jp.takeshi.Person;

public class PersonTest {
    
    @Test
    public void testSetterGetters() {
	Person p = new Person();
	p.setId("A");
	assertNotNull(p.getId());
	assertNotEquals("", p.getId());
	assertEquals("A", p.getId());
	
	p.setAge(10);
	assertEquals(10, p.getAge());
	
	p.setFirstName("B");
	assertEquals("B", p.getFirstName());
	
	p.setMiddleName("C");
	assertEquals("C", p.getMiddleName());
	
	p.setLastName("D");
	assertEquals("D", p.getLastName());
	
    }

}
