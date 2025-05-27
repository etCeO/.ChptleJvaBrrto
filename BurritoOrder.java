//Full Name: Ethan E. Lopez
//Student ID: 2425516
//Chapman Email: etlopez@chapman.edu
//Course Number And Section: CPSC-231-01
//Assignment Or Exercise Number: MP 2: Chipotle Ordering System

/**
 * Represents the collection of all burritos to be called in a single Chipotle party.
 * BurritoOrder calls methods from the Burrito class to set the contents of each burrito and add them into the order.
 * 
 * @author Ethan E. Lopez
 * @version 1.0.0
 * @see Burrito
 */

public class BurritoOrder {

    /**
     * a 1D array of base type Burrito;
     * Each element saved in this array should be a Burrito object.
     * m_order represents the order that stores everyone's burritos.
     */
    private Burrito[] m_order;
    /**
     * tells how many Burritos are currently in the order;
     * m_numBurritos is of type int
     */
    private int m_numBurritos;
    /**
     * tells how many Burritos there will be in the order total;
     * m_numBurritosMax is of type int and represents the Max size of the m_order array
     */
    private int m_numBurritosMax;

    /**
     * Default constructor which defaults to an order of a single default Burrito;
     * m_order array is set to size 1, where one default burrito is stored at index 0;
     * m_numBurritos and m_numBurritosMax are both set to value 1 because no other burritos are taken in;
     * Default constructors take in no parameters
     */
    public BurritoOrder() {
        Burrito b = new Burrito(); 
        m_order = new Burrito[1]; 
        m_order[0] = b; 
        m_numBurritos = 1;
        m_numBurritosMax = 1;
    }

    /**
     * Overloaded constructor that tells how many burritos will be added to the order;
     * initializes the order instance variable to an empty Burrito array of that size;
     * m_numBurritos is initialized to 0 to represent 0 burritos in the array (this value changes incrementally when a burrito is added);
     * m_numBurritosMax is assigned with the parameter to represent the max amount of burritos in the order
     * 
     * @param i is of type int and represents the final size of the order
     */
    public BurritoOrder(int i) {
        m_order = new Burrito[i];
        m_numBurritos = 0;
        m_numBurritosMax = i;
    }

    /**
     * adds burritos and their contents into the order;
     * in this case, the order is represented by BurritoOrder's m_order variable, a 1D array that accepts Burritos at each index;
     * once the order is full it is not possible to add more Burritos 
     * 
     * @param b is of type Burrito and represents each individual burrito added from the Burrito class
     * @return 1 when the addition is a success 
     * @return -1 if unsuccessful because the m_order array is full
     */
    public int addBurrito(Burrito b) {
        if (m_numBurritos < m_numBurritosMax) {
        // when the burrito number is less than the max number of burritos, this means it's ok to add (success)
            m_order[m_numBurritos] = b; // Burrito b is added to the m_order index matching its number
            m_numBurritos += 1; // m_numBurritos is incremented by 1 every time a burrito is added to keep track of how many burritos are in the order
            return 1;
        }
        else {
            return -1;
        }
    }

    /**
     * calculates the total cost of the order by adding up the prices of each Burrito; 
     * for each Burrito object in the m_order array, the calcCost method from the Burrito class is called;
     * calcCost() calculates the cost of each individual burrito and adds this into the totalCost variable;
     * calcTotal() is a method that takes in no parameters

     * @return totalCost of type double that sums all accumulated prices
     */
    public double calcTotal() {
        double totalCost = 0.00; // totalCost is initialized to 0 to represent the order's cost before burritos are added
        for (int i = 0; i < m_order.length; i++) { // for every index (burrito) in m_order array
            totalCost += m_order[i].calcCost(); // add the cost of the burrito (calcCost()) to totalCost
        }
        return totalCost;
        // return totalCost as the cost of all burritos
    }

    /**
     * returns a String representing the order so that the Chipotle employee can repeat back before sending it to be prepared; 
     * This method begins by calling calcTotal() so that the total price of the order is displayed at the top.
     * Then, it lists all of the details of all Burritos in the order by calling the toString() method from the Burrito class.
     * toString() is a method that takes in no parameters

     * @return s of type String, including all subtotals and contents of the burritos
     */
    public String toString() {
        String s = ""; // empty string for storage
        s += "\n"; // newline for space and neatness
        s += "YOUR TOTAL COST IS $" + calcTotal() + "!\n"; // concatenates total cost
        s += "-------------------------- \n"; // line for receipt barriers
        for (int i = 0; i < m_order.length; i++) { // for every burrito in the order
            if (i < m_numBurritos) { // will ensure that no null values are output
            // if index i is less than the m_numBurritos (# of burritos added), then contents will be put because the burrito exists in the array
                s += "\n"; // newline for space and neatness
                s += "BURRITO " + (i+1) + "\n"; // actual burrito # (Burrito 0 doesn't exist)
                s += m_order[i].toString();
            }
        }
        s += "\n"; // newline for space and neatness
        s += "END OF ORDER" + "\n";
        s += "------------" + "\n"; // line for receipt barriers
        s += "Thank You :)" + "\n";
        return s;
        // s is all concatenated strings put together
    }
    
}
