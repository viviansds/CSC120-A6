/*
 * Cafe class 
 * Assignment 6: Use What Your Parent (Class) Gave You
 * @author Vivian Wei
 * @version 30 October 2022
 */
public class Cafe extends Building{

    /* Subclass attributes */
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
    
    /* Constructor
     * @param name
     * @param address
     * @param nFloors
     * @param nCoffeeOunces
     * @paramn SugarPackets
     * @param nCreams
     * @param nCups
     * @param
     */
    public Cafe(String name,String address,int nFloors,int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);//Inherited attributes from parent class
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups =nCups;   
    }

    /* Decrease the remaining inventory when the Cafe sells a cup of coffee
     * @param size: the number of coffee ounces requested
     * @param sugar: the numer of sugar packets requested
     * @param cream: the number of cream splashes
     */
    public void sellCoffee(int size, int sugar, int cream){
         // first check inventory,restock if needed, and sell coffee
        if (nCoffeeOunces<=size || nSugarPackets<=sugar || nCreams<=cream ||nCups<=1){//true when at least one condiion is met
            System.out.println("Low in stock, restocking");
            restock(100, 100,100,10);//call the restock method
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= sugar;
            this.nCreams -= cream;
            this.nCups -= 1;//always decrease number of cups by 1 when coffee sold
            System.out.println("Coffee Sold! Please Enjoy...");
            System.out.println("remaining inventory: "+ nCoffeeOunces+" ounces of cofee,"+
                                nSugarPackets+" sugar packets,"+
                                nCreams +" number of creams, and "+
                                nCups+"cups");
        }else{//when all conditions are not met
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= sugar;
            this.nCreams -= cream;
            this.nCups -= 1;
            System.out.println("Coffee Sold! Please Enjoy...");
            System.out.println("remaining inventory: "+ nCoffeeOunces+" ounces of cofee,"+
                                nSugarPackets+" sugar packets,"+
                                nCreams +" number of creams, and "+
                                nCups+"cups");
        }
    }
    
    /* Restocking the amount of Coffee, Sugar, and Creams
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
    */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }
    /* Main method for testing */
    public static void main(String[] args) {
        Cafe myCafe = new Cafe("Campus Cafe", "1 Chapin Way",1,
                            100,100,100,100);
        System.out.println("You have built a cafe: ☕");
        System.out.println(myCafe);
        myCafe.sellCoffee(101,2,3);
        myCafe.sellCoffee(20,2,3);
    }
    
}
