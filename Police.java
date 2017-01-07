/**
* This class inherits from the Person class and implements the Employee interfacce and is used to create Police objects, more specific than person objects through the specification of a Role and the fact that they can earn money.
* @author Josiah Gallegos
* @version 1.00, 06 January 2017
*/
public class Police extends Person implements Employee{
  public enum Role{Patrol, Sargent, Captain, Chief};
  private Role role;
  int money = 0;
  /**
  * Creates a Police object with the specified name, age, phone number, and role
  * @param n specifies the name of the police officer
  * @param a specifies the age of the police officer
  * @param pn specifies the phone number of the officer
  * @param r specifies the role of the officer
  */
  public Police(String n, int a, int pn, Role r){
    super(n, a, pn);
    role = Role.Patrol;
  }
  /**
  * Pays the police officer the specified amount by adding to the officer's total money
  * @param m specifies the amount of money to be paid to the officer
  */
  public void givePay(int m){
    money+=m;
  }
  /**
  * Returns the ID of the officer
  * @return returns the ID the officer has
  */
  public int askID(){
    return ID;
  }
}
