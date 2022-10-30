/*
 * Library class 
 * Assignment 6: Use What Your Parent (Class) Gave You
 * @author Vivian Wei
 * @version 30 October 2022
 */
import java.util.Hashtable;

public class Library extends Building{
    /* Subclass attributes */
    private Hashtable<String, Boolean> collection;//An hashtable containing each book's title and author and its availability to check out
    
    /* Constructor
     * @param name
     * @param address
     * @param nFloors
     */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);//Inherited attributes from parent class
      this.collection = new Hashtable<String, Boolean>();//initialize an empty hashtable
    }

    /* Add book's author and title to the library's collection
     * @param title
     */
    public void addTitle(String title){
      this.collection.put(title,true);
      System.out.println("Adding "+title+" to collection...");
    }
    
    /* Remove the book from the  library's collection and return the title that we removed
     * @return title
     */
    public String removeTitle(String title){
      this.collection.remove(title);
      return title;
    } 

    /* Check out the book from the library's collection
     * @param title
     */
    public void checkOut(String title){
      this.collection.replace(title,false);//replace the bolean to false for the specified key
      System.out.println("Checking out "+title+"...");
    }

    /* Return the book to the library's collection
     * @param title
     */
    public void returnbook(String title){
      this.collection.replace(title,true);//replace the bolean to true for the specified key
      System.out.println("Returning "+title+"...");
    }

    /* Check if the collection contains the book
     * @param title
     * @return true if the title appears as a key in the Libary's collection, false otherwise 
     */
    public boolean containsTitle(String title){
      return this.collection.containsKey(title);
    } 

    /* Check if the book is available for check out
     * @param title
     * @return true if the title is currently available, false otherwise 
     */
    public boolean isAvailable(String title){
      if (this.collection.get(title).equals(true)){
        return true;
      }else{
        return false;
      }
    }

    /* prints out the entire collection in an easy-to-read way (including checkout status) */
    public void printCollection(){
      System.out.println("The entire collection: "+this.collection.toString());
    }

    /* Main method for testing */
    public static void main(String[] args) {
      Library myLibrary = new Library("Nielson Library", "7 Nielson Drive",4);
      System.out.println("You have built a library: 📖");
      System.out.println(myLibrary);
      myLibrary.addTitle("The Lorax by Dr. Seuss");
      System.out.println("This book exist in the collection: "+myLibrary.containsTitle("The Lorax by Dr. Seuss"));
      myLibrary.checkOut("The Lorax by Dr. Seuss");
      System.out.println("This book is available to checkout: "+myLibrary.isAvailable("The Lorax by Dr. Seuss"));
      myLibrary.returnbook("The Lorax by Dr. Seuss");
      myLibrary.printCollection();
      System.out.println("removing "+myLibrary.removeTitle("The Lorax by Dr. Seuss"));
    }
  }