/* chapter one
 *  the way java works
 *  source --> compiler --> bytecode --> virtual machines
 *
 *  java 1.02 --> 250 classes
 *  java 1.1 --> 500 classes
 *  java 2 (1.2 -.1.4) --> 2300 classes
 *  java 5.0 (1.5 and up) --> 3500 classes
 *
 *  Statements: declaratons, assignments, method class, etc ...
 *  	int x = 3;
 *  	String name = "Dirk";
 *  	x = x * 17;
 *  	system.out.print("x is " + x);
 *  	double d = Math.random();
 *  // this is a comment
 *
 *  Looping and looping and ..
 *  	while, do-while, and for loops.
 *
 *  *** A boolean and an integer are not compatible types in java, so you
 *  can't do boolean test on integer.
 *
 *
 * */

public class Main {
	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";

		while (beerNum > 0) {

			System.out.println(beerNum + " " + word + " of beer on the wall.");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			beerNum = beerNum - 1;

			if (beerNum == 1) {
				word = "bottle"; // singular, as in ONE bottle.
			}

			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall.");
			} else {
				System.out.println("No more bottles of beer on the wall.");
			} // end else
		} // end while loop
	} // end main method
} // end class
