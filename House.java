import java.util.ArrayList;

public class House extends Building {

    /* Subclass attributes */
    private ArrayList<String> residents; // An ArrayList containing the residents' name living in the house
    private boolean hasDiningRoom;//Whether this house has a dining room

    /* Constructor
     * @param name
     * @param address
     * @param nFloors
     * @param hasDR
     */
    public House(String name,String address,int nFloors, boolean hasDR) {
      super(name, address, nFloors);//Inherited attributes from parent class
      this.residents = new ArrayList<String>();//initialize an empty arraylist
      this.hasDiningRoom = hasDR;
    }
    /* Accesor for hasDiningRoom
     * @return true if the house has dining room, false otherwise
     */
    public boolean hasDiningRoom(){
      return this.hasDiningRoom;
    }

    /* Accesor for nResidents
     * @return number of residents living in the house
     */
    public int nResidents(){
      return this.residents.size();
    }

    /* Add resident's name to the house
     * @param name
     */
    public void moveIn(String name){
      this.residents.add(name);
      System.out.println(name+" has moved in");
    }

    /* Remove resident's name from the house
     * @param name 
     * @return the name of the person who moved out  
     */
    public String moveOut(String name){
      this.residents.remove(name);
      return name;
    } 
    
    /* Check whether or not a given person is a resident of the House
     * @param person
     * @return true if the person's name is contained in the residents arraylist, false otherwise
     */
    public boolean isResident(String person){
      return this.residents.contains(person);
    }

    /* Main method for testing */
    public static void main(String[] args) {
      House myHouse = new House("Chapin","3 Chapin Way",4,true);
      System.out.println("You have built a house: 🏠");
      System.out.println(myHouse);
      System.out.println("Does this house has a dining room?");
      System.out.println(myHouse.hasDiningRoom());
      System.out.println("There are "+myHouse.nResidents()+" residents");
      myHouse.moveIn("Vivian");
      System.out.println("Does Vivian lives here?");
      System.out.println(myHouse.isResident("Vivian"));
      System.out.println(myHouse.moveOut("Vivian")+" has moved out");
      System.out.println("Does Vivian lives here?");
      System.out.println(myHouse.isResident("Vivian"));
    }

}