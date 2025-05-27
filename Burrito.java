//Full Name: Ethan E. Lopez
//Student ID: 2425516
//Chapman Email: etlopez@chapman.edu
//Course Number And Section: CPSC-231-01
//Assignment Or Exercise Number: MP 2: Chipotle Ordering System

/**
 * Represents the contents of a burrito to be called in a Chipotle order.
 * A single burrito may be added to an order of burritos within the BurritoOrder class.
 * 
 * @author Ethan E. Lopez
 * @version 1.0.0
 * @see BurritoOrder
 */

public class Burrito {

    /**
     * size of the Burrito (either kids or regular);
     * String m_size represents the burrito size the customer requests for
     */
    private String m_size;
    /**
     * The protein (chicken, steak, veggie);
     * String m_protein represents the kind of meat the customer requests
     */
    private String m_protein;
    /**
     * The type of rice (white, brown, no rice);
     * String m_rice represents the rice type of a customer's order
     */
    private String m_rice;
    /**
     * The type of beans (black, pinto, no beans);
     * String m_beans represents the kind of beans in a customer's burrito
     */
    private String m_beans;

    /**
     * boolean m_guac identifies if a burrito has guacamole or not
     */
    private boolean m_guac;
    /**
     * boolean m_tomatillo identifies when a burrito has tomatillo or not
     */
    private boolean m_tomatillo;
    /**
     * boolean m_sourCream identifies if sour cream is in the burrito
     */
    private boolean m_sourCream;
    /**
     * boolean m_cheese identifies when a customer's order requests cheese or not
     */
    private boolean m_cheese;
    /**
     * boolean m_lettuce identifies if a customer has lettuce in their burrito
     */
    private boolean m_lettuce;

    /**
     * This default constructor sets the contents of a burrito to default values.
     * A default burrito is regular-sized with chicken, white rice, black beans, lettuce and sour cream.
     * Default constructors take in no parameters.
     */
    public Burrito() {
        m_size = "regular";
        m_protein = "chicken";
        m_rice = "white";
        m_beans = "black";
        m_guac = false;
        m_tomatillo = false;
        m_sourCream = true;
        m_cheese = false;
        m_lettuce = true;
    }

    /**
     * A fully specified, overloaded constructor that sets all of the member variables as given;
     * Size, protein, rice, and beans are type String;
     * Guacamole, tomatillo, sour cream, cheese, and lettuce are of type boolean
     * 
     * @param sz is the size of the burrito
     * @param pro is the protein type
     * @param rc is the rice type
     * @param bn is the beans type
     * @param g checks if the burrito has guacamole
     * @param tma checks for tomatillo
     * @param src checks for sour cream
     * @param c checks for cheese
     * @param lt checks for lettuce
     */
    public Burrito(String sz, String pro, String rc, String bn, boolean g, boolean tma, boolean src, boolean c, boolean lt) {
        m_size = sz;
        m_protein = pro;
        m_rice = rc;
        m_beans = bn;
        m_guac = g;
        m_tomatillo = tma;
        m_sourCream = src;
        m_cheese = c;
        m_lettuce = lt;
    }

    /**
     * A copy constructor using the appropriate shallow or deep copies for member variables;
     * If you want a second copy of a burrito you already ordered, this class ensures you can get it without inputting parameters
     * 
     * @param order is of type Burrito, representing a burrito that's already in the system
     */
    public Burrito(Burrito order) {
        m_size = order.m_size;
        m_protein = order.m_protein;
        m_rice = order.m_rice;
        m_beans = order.m_beans;
        m_guac = order.m_guac;
        m_tomatillo = order.m_tomatillo;
        m_sourCream = order.m_sourCream;
        m_cheese = order.m_cheese;
        m_lettuce = order.m_lettuce;
    }
    // order in dot notation for each member variable retrieves the inputted values for the original burrito
    // assigning these to the values in a deep copy constructor creates an exact copy of the burrito you call into the parameter

    /**
     * accesses the value of a burrito's size
     * 
     * @return m_size as type String
     */
    public String getSize() {
        return m_size;
    }

    /**
     * accesses the value of a burrito's protein
     * 
     * @return m_protein as type String
     */
    public String getProtein() {
        return m_protein;
    }

    /**
     * accesses the value of a burrito's rice
     * 
     * @return m_rice as type String
     */
    public String getRice() {
        return m_rice;
    }

    /**
     * accesses the value of a burrito's beans
     * 
     * @return m_beans as type String
     */
    public String getBeans() {
        return m_beans;
    }

    // size, protein, rice, and beans are the foundations of a burrito before adding any extras
    // I thought it appropriate to assign accessor methods to these while extras were assigned to set methods
    // that way, if someone wanted to remove or add an extra in the middle, they could without removing the entire burrito
    // working in Taco Bell and Chick-Fil-A before, this was the way extras were often addressed in orders

    /**
     * will replace current value of m_guac with new value;
     * used in case a customer decides to add or remove guacamole from the original burrito
     * 
     * @param g is the customer's change in type boolean
     */
    public void setGuac(boolean g) {
        m_guac = g;
    }

    /**
     * will replace current value of m_tomatillo with new value;
     * used in case a customer decides to add or remove tomatillo from the original burrito
     * 
     * @param tma is the customer's change in type boolean
     */
    public void setTomatillo(boolean tma) {
        m_tomatillo = tma;
    }

    /**
     * will replace current value of m_sourCream with new value;
     * used in case a customer decides to add or remove sour cream from the original burrito
     * 
     * @param src is the customer's change in type boolean
     */
    public void setSourCream(boolean src) {
        m_sourCream = src;
    }

    /**
     * will replace current value of m_cheese with new value;
     * used in case a customer decides to add or remove cheese from the original burrito
     * 
     * @param c is the customer's change in type boolean
     */
    public void setCheese(boolean c) {
        m_cheese = c;
    }

    /**
     * will replace current value of m_lettuce with new value;
     * used in case a customer decides to add or remove lettuce from the original burrito
     * 
     * @param lt is the customer's change in type boolean
     */
    public void setLettuce(boolean lt) {
        m_lettuce = lt;
    }

    /**
     * calculates the Burrito Cost;
     * Burrito cost is determined by:
        The size:
            Kids: $7.00
            Regular: $9.00;
        The protein:
            +$0.50 for chicken
            $1.25 for steak
            $.50 for veggie;
        The extras:
            +$2.65 for Guacamole unless the protein is “veggie” in which case, guacamole is included.
            +$0 for Tomatillo salsa
            +$0.25 for Sour cream
            +$0.50 for Cheese
            +$0 for Lettuce;
        E.g. the “default” Burrito should come out to $9.75. With the following breakdown:
        Size → regular: + $9
        Chicken → + $0.50
        Sour cream → +$0.25
        Lettuce → + $0;
        calcCost() is a method that takes in no parameters

        @return a double that is the cost of the Burrito (burritoCost)
     */
    public double calcCost() {
        double burritoCost = 0.00; 
        // burritoCost is a double initialized to 0.00 or $0
        // this represents the customer's cost before the burrito's existence
        if (m_size == "kids") { // if kids size
            burritoCost += 7.00; // $7 added to cost
        }
        if (m_size == "regular") { // if regular size
            burritoCost += 9.00; // $9 added to cost
        }
        if (m_protein == "chicken") { // if chicken
            burritoCost += 0.50; // $0.50 added to cost
        }
        if (m_protein == "steak") { // if steak
            burritoCost += 1.25; // $1.25 added to cost
        }
        if (m_protein == "veggie") { // if veggie
            burritoCost += 0.50; // $0.50 added to cost
        }
        if (m_guac == true) { // when there's guacamole
            if (m_protein == "veggie") {
                burritoCost += 0.00; // $0 added to cost if it's a veggie burrito
            }
            else {
                burritoCost += 2.65; // $2.65 added to cost if it's a chicken or steak burrito
            }
        }
        if (m_sourCream == true) { // when there's sour cream
            burritoCost += 0.25; // $0.25 added to cost
        }
        if (m_cheese == true) { // when there's cheese
            burritoCost += 0.50; // $0.50 added to cost
        }
        // all other member variables (rice, beans, tomatillo, lettuce) are free, so there's no need to add them here
        return burritoCost; 
        // burritoCost is the total cost of the burrito after all foundations and extras are added
    }

    /**
     * A public method named toString() that converts all the contents of a burrito to type String; 
     * toString() takes in no parameters
     * 
     * @return a String containing the Burrito’s member variable values and cost as calculated by calcCost()
     */
    public String toString() {
        String s = ""; // empty String for storage
        s += "A " + m_size + " burrito --> ( " + m_protein + " / " + m_rice + " / " + m_beans + " )\n";
        // concatenates size of the burrito with foundation description
        s += "that contains the following extras: \n";
        // beginnings listing the extras in true/false values as they were put in
        s += "   Guacamole: " + m_guac + "\n";
        s += "   Tomatillo: " + m_tomatillo + "\n";
        s += "   Sour Cream: " + m_sourCream + "\n";
        s += "   Cheese: " + m_cheese + "\n";
        s += "   Lettuce: " + m_lettuce + "\n";
        s += "\n"; // newline for space and neatness
        s += "SubTotal --> $" + calcCost() + "\n";
        // I call this "subtotal" as the actual TOTAL is calculated and put out in the BurritoOrder class
        return s;
        // s is all concatenated strings put together
    }

    /**
     * A public method name equals() that compares the contents of the burritos;
     * Two Burritos are equal if they have all the same member variables;
     * equals() is a method that takes in no parameters
     * 
     * @param o is of type Object that takes in a burrito and compares it with the mentioned burrito in the method
     * @return true if the both burritos have the same memory address
     * @return false if the object is not of type burrito
     * @return a boolean with .equals() to determine if two Burritos are “equal”
     */
    public boolean equals(Object o) {
        if (this == o) { // checks if compared values have the same memory address
            return true; 
        }
        // if Object o is not a Burrito type object
        // we know it can't equal another burrito
        if (! (o instanceof Burrito)) { 
            return false;
        }
        // typecasts o as burrito b
        Burrito b = (Burrito) o;
        // string for burrito b (o) is compared with the string of the inputted burrito (this)
        // if both strings are exactly the same, this returns true
        // returns false otherwise 
        return this.toString().equals(b.toString());
    }

}
