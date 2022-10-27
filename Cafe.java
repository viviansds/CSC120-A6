/* This is a stub for the Cafe class */
public class Cafe extends Building{

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name,String address,int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 100;
        this.nSugarPackets = 100;
        this.nCreams = 100;
        this.nCups =100;   
    }
    // is it okay to change parameters name?
    public void sellCoffee(int size, int sugar, int cream){
         // first check inventory,restock if needed, and sell coffee
        if (nCoffeeOunces<=size || nSugarPackets<=nSugarPackets || nCreams<=nCreams ||nCups<=1) {
            System.out.println("low in stock, restocking");
            restock(100, 100,100,10);
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= sugar;
            this.nCreams -= cream;
            this.nCups -= 1;
            System.out.println("remaining inventory: "+ nCoffeeOunces+" ounces of cofee,"+nSugarPackets+" sugar packets,"+nCreams +" number of creams, and "+nCups+"cups");
        }else{
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= sugar;
            this.nCreams -= cream;
            this.nCups -= 1;
            System.out.println("remaining inventory: "+ nCoffeeOunces+" ounces of cofee,"+nSugarPackets+" sugar packets,"+nCreams +" number of creams, and "+nCups+"cups");
           
        }
    }
      
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }

    public static void main(String[] args) {
        Cafe myCafe = new Cafe("Campus Cafe", "1 Chapin Way",1);
        System.out.println("You have built a cafe: ☕");
        System.out.println(myCafe);
        myCafe.sellCoffee(101,2,3);
    }
    
}
