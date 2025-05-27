//Full Name: Ethan E. Lopez
//Student ID: 2425516
//Chapman Email: etlopez@chapman.edu
//Course Number And Section: CPSC-231-01
//Assignment Or Exercise Number: MP 2: Chipotle Ordering System

/**
 * This class serves as the driver class to the Burrito and BurritoOrder classes.
 * ChipotleDriver contains a main method for processing classes, class methods, and outputting customer information.
 * It also allows Chipotle employees to input and change contents in each burrito throughout the processs of receving the order.
 * 
 * @author Ethan E. Lopez
 * @version 1.0.0
 * @see Burrito
 * @see BurritoOrder
 */

public class ChipotleDriver {

    /**
     * main method creates objects from each class and invokes methods that are specified within the class;
     * these objects include those of type Burrito with customizable and default inputs / contents;
     * orders may also also created through the BurritoOrder class where the addBurrito method inputs burritos into the order array
     * 
     * @param args is of type String[] and permits the classes to be called in the Chipotle system
     */
    public static void main(String[] args) {

        Burrito defaultBurrito = new Burrito();

        // veggieBurrito: regular, veggie, white rice, pinto beans, guacamole, lettuce, tomatillo 
        Burrito veggieBurrito = new Burrito("regular", "veggie", "white", "pinto", true, true, false, false, true);

        Burrito veggieBurrito2 = new Burrito(veggieBurrito);
        // Same as veggieBurrito, uses copy constructor

        Burrito  defaultBurrito2 = new Burrito(defaultBurrito);
        // Same as defaultBurrito, uses copy constructor

        BurritoOrder order = new BurritoOrder(3);
        // creates an order of THREE Burritos

        // adds defaultBurrito to the order
        System.out.println(order.addBurrito(defaultBurrito));

        // adds veggieBurrito to the order 
        System.out.println(order.addBurrito(veggieBurrito));

        // adds veggieBurrito2 to the order
        System.out.println(order.addBurrito(veggieBurrito2));

        // adds defaultBurrito2 to the order – what happens here? 
        System.out.println(order.addBurrito(defaultBurrito2));
        // defaultBurrito2 returns -1 after the method is called
        // adding the burrito failed because the maximum limit was reached in the BurritoOrder array

        // are veggieBurrito and veggieBurrito2 the same? should be!
        System.out.print("are veggieBurrito and veggieBurrito2 the same? ");
        System.out.println(veggieBurrito.equals(veggieBurrito2));
        // returns true
        // are veggieBurrito and defaultBurrito the same? shouldn't be...
        System.out.print("are veggieBurrito and defaultBurrito the same? ");
        System.out.println(veggieBurrito.equals(defaultBurrito));
        // returns false

        // Should call order’s toString methods
        System.out.println(order);
        // prints the contents of all three burritos into a readable receipt format
    }
}
