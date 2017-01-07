import java.util.ArrayList;

/**
* This class inherits from the building class and is used to create a School object which is more specific than a building through the specification of occupants.
* @author Josiah Gallegos
* @version 1.00, 06 January 2017
*/
public class School extends Building{
  ArrayList<Person> occupants;
  /**
  * Creates a school with the specified name, address and occupants.
  * @param n specifies the name of the school
  * @param a specifies the address of the school
  * @param o specifies the occupants of the school
  */
  public School(String n, int a, ArrayList<Person> o){
    super(n, a);
    occupants = o;
  }
}
