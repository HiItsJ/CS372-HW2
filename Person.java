/**
* This class represents a general person and contains the characteristics of a person such as their name, age, and phonenumber.
* @author Josiah Gallegos
* @version 1.00, 06 January 2017
*/
public class Person{

  protected String name;
  protected int age;
  protected int phoneNumber;
  static int lastID = 11111111;
  protected int ID;
  /**
  * Creates a Person object with their specified name, age and phone number.
  * @param n specifies the name of the person.
  * @param a specifies the age of the person.
  * @param pn specifies the phone number of the person.
  */
  public Person(String n, int a, int pn){
    name = n;
    age = a;
    phoneNumber = pn;
    ID = lastID;
    lastID++;
  }
  /**
  * Returns the name of the person
  * @return the name the person has
  */
  public String getName(){
    return name;
  }
}
