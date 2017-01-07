/**
* This class represents a general building and contains the characteristics of a building such as their nameand address.
* @author Josiah Gallegos
* @version 1.00, 06 January 2017
*/
public class Building{
  String name;
  int address;
  /**
  * Creates a building with the specified name and address
  * @param n specifies the name of the building
  * @param a specifies the address of the building
  */
  public Building(String n, int a){
    name = n;
    address = a;
  }
  /**
  * Returns the name of the buildings
  * @return returns the name the building has
  */
  public String getName(){
    return name;
  }
}
