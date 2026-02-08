# Chipotle Ordering System

- A simulation of Chipotle’s burrito ordering system that allows users to customize their orders, calculates the total cost including itemized selections, and generates a detailed receipt, modeling real-world point-of-sale and order-processing functionality.

## Author Info

- Full Name: Ethan E. Lopez
- Chapman Email: etlopez@chapman.edu

## Usage

1. Compile (if necessary) or run the program in the development environment (Java).
2. Proceed to choose the type of burrito base, protein, and other extras through the menu prompts.
3. Once the order is complete, the program calculates the total cost and displays a receipt.
4. Users can repeat the same procedure to create mutliple orders.

## Input Format

- Orders are received via console input.
- Users will select their options from predefined menus under various categories such as base, protein, toppings, etc.
- Inputs must be matching the choices; if not, the user is prompted to enter requests again.

## Example Input Flow:

- Select your base: Burrito, Bowl, Salad
- Choose your protein: Chicken, Steak, Vegetarian
- Add toppings: Cheese, Salsa, Guacamole
- Include extras: Chips, Drink

## Implementation Details

- The program follows structured programming and object-oriented class designs.
- Menus and prices are internally represented as lists or dictionaries for ease of access and computation.
- The program keeps track of items selected, calculates the total cost, and provides an itemized receipt.
- Input validation helps to avoid the selection of unavailable options, as the system will handle sequential orders.
