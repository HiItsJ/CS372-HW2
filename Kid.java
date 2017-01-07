/**
* This class inherits from the Person class and creates a Kid object which is more specific than a person object through the specification of a favorite candy.
* @author Josiah Gallegos
* @version 1.00, 06 January 2017
*/
public class Kid extends Person{
  String favCandy;
  /**
  * Creates a Kid object withe specified name, age, phone number and favorite candy.
  * @param n specifies the name of the Kid
  * @param a specifies the age of the Kid
  * @param pn specifies the phone number of the Kid
  * @param fc specifies the Kid's favorite candy.
  */
  public Kid(String n, int a, int pn, String fc){
    super(n, a, pn);
    favCandy = fc;
  }
}
