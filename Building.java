/*
 * Building class 
 * Assignment 6: Use What Your Parent (Class) Gave You
 * @author Vivian Wei
 * @version 30 October 2022
 */
public class Building {
    /* Superclass attributes */
    private String name = "<Name Unknown>";
    private String address = "<Address Unknown>";
    private int nFloors = 1;
    /* Constructor
     * @param name
     * @param address
     * @param nFloors
     * @throw RuntimeException
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /* Accesor for Name
     * @return the name of the building
     */
    public String getName() {
        return this.name;
    }

    /* Accesor for Address
     * @return the address of the building
     */
    public String getAddress() {
        return this.address;
    }

    /* Accesor for nFloors
     * @return the number of floors of the building
     */
    public int getFloors() {
        return this.nFloors;
    }

    /* Overide the memory address to a description for the building 
     * @return String containing a description of the building in the format 
     *         [name] is a [nFloors]-story building located at [address]
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    /* Main method for testing */
    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}