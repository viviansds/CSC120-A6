import java.util.ArrayList;
/* This is a stub for the House class */
public class House extends Building {

    private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
    private boolean hasDiningRoom;

    public House(String name,String address,int nFloors) {
      super(name, address, nFloors);
      this.residents = new ArrayList<String>();
      this.hasDiningRoom = true;
      // how can we construct eithe true/false? do we add a parameter?
    }

    public boolean hasDiningRoom(){
      return this.hasDiningRoom;
    }
    public int nResidents(){
      return this.residents.size();
    }

    public void moveIn(String name){
      this.residents.add(name);
    }

    public String moveOut(String name){
      this.residents.remove(name);
      return name;
    } // return the name of the person who moved out  

    public boolean isResident(String person){
      return this.residents.contains(person);
    }
    public static void main(String[] args) {
      System.out.println("You have built a house: 🏠");
      House myHouse = new House("Chapin","3 Chapin Way",4);
      System.out.println(myHouse);
      System.out.println("Does this house has a dining room?");
      System.out.println(myHouse.hasDiningRoom());
      System.out.println("There are "+myHouse.nResidents()+" residents");
      myHouse.moveIn("Vivian");
      System.out.println("Does Vivian lives here?");
      System.out.println(myHouse.isResident("Vivian"));
      System.out.println(myHouse.moveOut("Vivian")+" has moved out");
      System.out.println(myHouse.isResident("Vivian"));
    }

}