package mainPackage;

public class FirefightersList extends Person implements Firefighterable {

     protected FirefightersList(String name, String surname, String theFunction) {
          super(name, surname, theFunction);
     }


     @Override
     public FirefightersList list(String name, String surname, String theFunction) {
          System.out.println(" A firefighter ready to drive is : " + name + " " + surname + " " + theFunction);
          return null;
     }

}


