import java.util.Hashtable;
/* This is a stub for the Library class */

public class Library extends Building{

    private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();


    }
    public void addTitle(String title){
      this.collection.put(title,true);
    }
    /* return the title that we removed */
    public String removeTitle(String title){
      this.collection.remove(title);
      return title;
    } 

    public void checkOut(String title){
      this.collection.replace(title,false);
    }

    public void returnbook(String title){
      this.collection.replace(title,true);
    }
    /* returns true if the title appears as a key in the Libary's collection, false otherwise */
    public boolean containsTitle(String title){
      return this.collection.containsKey(title);
    } 
    // /*returns true if the title is currently available, false otherwise */
    // public boolean isAvailable(String title){
    //   if {this.collection.get(title)=true
    // } 
    // public void printCollection(); // prints out the entire collection in an easy-to-read way (including checkout status)
    // public static void main(String[] args) {
      System.out.println("You have built a library: 📖");
      Library myLibrary = new Library("Nielson Library", "7 Nielson Drive",4);
      System.out.println(myLibrary);
      myLibrary.addTitle("The Lorax by Dr. Seuss");
      System.out.println(myLibrary.containsTitle("The Lorax by Dr. Seuss"));
      myLibrary.checkOut("The Lorax by Dr. Seuss");
      myLibrary.returnbook("The Lorax by Dr. Seuss");
      System.out.println("removing "+myLibrary.removeTitle("The Lorax by Dr. Seuss"));

    }
  
  }