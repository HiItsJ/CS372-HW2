import java.util.ArrayList;

/**
* This class creates buildings and people and assigns certain people to certain buildings as well as displays the people of the city and the buildings of the city and pays employees.
* @author Josiah Gallegos
* @version 1.00, 06 January 2017
*/
public class City{
  /**
  * The main method runs all that was mentioned in the class summary.
  * @param args runs the arguments inputed to the main method
  */
  public static void main(String[] args){

    ArrayList<Building> buildings = new ArrayList();

    ArrayList<Person> schoolppl = new ArrayList();
    schoolppl.add(new Teacher("Ms. Johnson", 32, 4567890, 2, "master's"));
    schoolppl.add(new Teacher("Mr. Stelton", 50, 1234567, 6, "master's"));
    schoolppl.add(new Kid("Billy", 5, 2657865, "KitKat"));
    schoolppl.add(new Kid("Johnny", 10, 8672435, "Jawbreaker"));
    schoolppl.add(new Kid("Tom", 9, 5769843, "Hersheys Chocolate"));
    School elementary = new School("Spokane Elementary", 12345, schoolppl);
    buildings.add(elementary);

    ArrayList<Person> cityHallppl = new ArrayList();
    cityHallppl.add(new Police("Mr. Burtin", 45, 5673452, Police.Role.Patrol));
    cityHallppl.add(new Police("Mr. Higgins", 22, 7756731, Police.Role.Patrol));
    CityHall hall = new CityHall("Spokane CityHall", 46753, cityHallppl);
    buildings.add(hall);

    System.out.println("People at Spokane Elementary:");
    for (Person p: schoolppl){
      System.out.println(p.getName());
    }
    System.out.println("People at Spokane CityHall:");
    for (Person p: cityHallppl){
      System.out.println(p.getName());
    }
    System.out.println("Buildings in this city of Spokane:");
    for (Building b: buildings){
      System.out.println(b.getName());
    }

    for (int x=0; x<schoolppl.size(); x++){
      if (schoolppl.get(x) instanceof Employee)
        schoolppl.get(x).givePay(1000);
    }
    for (int x=0; x<cityHallppl.size(); x++){
      if (cityHallppl.get(x) instanceof Employee)
        cityHallppl.get(x).givePay(1500);
    }
  }
}
