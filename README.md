# Chipotle Ordering System

- A simulation of Chipotle’s burrito ordering system that allows users to customize their orders, calculates the total cost including itemized selections, and generates a detailed receipt, modeling real-world point-of-sale and order-processing functionality.

## Author Info

- Full Name: Ethan E. Lopez
- Student ID: 2425516
- Chapman Email: etlopez@chapman.edu
- Course Number And Section: CPSC-231-01
- Assignment Or Exercise Number: MP 2: Chipotle Ordering System

## Usage

1. Compile (if necessary) or run the program in the development environment (e.g., Python interpreter).
2. Follow the on-screen prompts to select a burrito base, protein, toppings, and extras.
3. Once the order is complete, the program calculates the total cost and displays a detailed receipt.
4. Users may repeat the process to place multiple orders.

## Input Format

- Orders are entered via console input (keyboard).
- Users select options from predefined menus for each category (e.g., base, protein, toppings, extras).
- Inputs must match the options provided; invalid selections prompt the user to re-enter.

## Example Input Flow:

- Select your base: Burrito, Bowl, Salad
- Choose your protein: Chicken, Steak, Vegetarian
- Add toppings: Cheese, Salsa, Guacamole
- Include extras: Chips, Drink

## Implementation Details

- The program is implemented using structured programming (or object-oriented design if classes are used).
- Menus and prices are stored internally in lists or dictionaries for easy retrieval and calculation.
- The program tracks selected items, calculates the total cost dynamically, and formats a clear itemized receipt.
- Input validation ensures users cannot select unavailable options, and the system handles multiple orders sequentially.
