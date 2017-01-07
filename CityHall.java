import java.util.ArrayList;

/**
* This class inherits from the building class and creates a CityHall object which is more specific than a builing through the specification of the occupants.
* @author Josiah Gallegos
* @version 1.00, 06 January 2017
*/
public class CityHall extends Building{
  ArrayList<Person> occupants;
  /**
  * Creates a CityHall object with the specified name, address and list of occupants
  * @param n specifies the name of the hall
  * @param a specifies the address of the hall
  * @param o specifies the occupants of the hall
  */
  public CityHall(String n, int a, ArrayList<Person> o){
    super(n, a);
    occupants = o;
  }
}
