/**
* This class inherits from the Person and class and implements the Employee interface and is used to create Teacher objects, more specific than person objects through the specification of a grade level and certification and the fact that they can earn money.
* @author Josiah Gallegos
* @version 1.00, 06 January 2017
*/
public class Teacher extends Person implements Employee{
  int gradeLevel;
  String certification;
  int money = 0;
  /**
  * Creates a teacher object with the specified name, age, phone number, grade level and certification
  * @param n specifies the name of the teacher
  * @param a specifies the age of the teacher
  * @param pn specifies the phone number of the teacher
  * @param gl specifies the grade level the teacher teaches at
  * @param c specifies the certification the teacher has
  */
  public Teacher(String n, int a, int pn, int gl, String c){
    super(n, a, pn);
    gradeLevel = gl;
    certification = c;
  }
  /**
  * Pays the teacher the specified amount by adding to the teacher's total money
  * @param m specifies the amount of money to be paid to the teacher
  */
  public void givePay(int m){
    money+=m;
  }
  /**
  * Returns the ID of the teacher
  * @return returns the ID the teacher has
  */
  public int askID(){
    return ID;
  }
}
