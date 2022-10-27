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
    public boolean nResidents(){
      if(this.residents.size()>0){
        return true;
      }else{
        return false;
      }
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
      myHouse.moveIn("Vivian");
      System.out.println(myHouse.isResident("Vivian"));
      myHouse.moveOut("Vivian");
      System.out.println(myHouse.isResident("Vivian"));
    }

}