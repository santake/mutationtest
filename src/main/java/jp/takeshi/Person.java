package jp.takeshi;

public class Person {
    private String id;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    
    public Person() {
	//default
    }
    
    public Person(
	    String id, 
	    String firstName, String middleName, String lastName,
	    int age
	    ) {
	this.setId(id);
	this.setFirstName(firstName);
	this.setMiddleName(middleName);
	this.setLastName(lastName);
	this.setAge(age);
    }
    
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
