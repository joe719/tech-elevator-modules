package com.techelevator;

public class Lecture {
    /*
    1. This method is named returnNotOne and it returns an int. Change
    it so that it returns something other than a 1.
    */
	
	//
	
	//public: access modifier
	// int: output data type, "return type"
	// returnNotOne: mthod name
	// (): where input goes - in this case empty
	// {}: code block
	// return: what to output
	
    public int returnNotOne() { //method header or method signature
        return 6;
    }
    
    
    
    // () needs specified data type
    // inputs can be varied
    
    //public int fOfXExample(int x) {
    //	return x * x;
    //}
    
    // () inputs seperated by ","
    
    //public int multiplyTogether(int x, int y) {
    //	return x * y;
    //}

    /*
    2. This method is named returnNotHalf and it returns a double. Change
    it so that it returns something other than a 0.5.
    */
    public double returnNotHalf() {
        return .55;
    }

    /*
    3. This method needs to return a String. Fix it to return a valid String.
    */
    public String returnName() {
        return "error jordan";
    }

    /*
    4. This method currently returns an int. Change it so that it returns a double.
    */
    public double returnDoubleOfTwo() {
        return 2.0;
    }

    /*
    5. This method should return the language that you're learning. Change
    it so that it does that.
    */
    public String returnNameOfLanguage() {
        return "Java";
    }

    /*
    6. This method uses an if statement to define what to return. Have it
    return true if the if statement passes.
    */
    
    // () boolean statement
    
    public boolean returnTrueFromIf() {
        if (true) {
            return true;
        }

        return false;
    }

    /*
    7. This method uses an if to check to make sure that one is equal
    to one. Make sure it returns true when one equals one.
    */
    
    //return statement is the end of the code block
    // first return - if true
    // second return - if false
    
    public boolean returnTrueWhenOneEqualsOne() {
        if (1 == 1) {
            return true;
        }

        return false;
    }

    /*
    8. This method checks a parameter (parameter = input value or argument) passed to the method to see if it's
    greater than 5 and returns true if it is.
    */
    
    //don't really need an else statement in this example - would default to false if not true in this example
    
    public boolean returnTrueWhenGreaterThanFive(int number) {
        if (number > 5) {
        	return true;
        		
        } else {
        	return false;
        }
    }

    /*
    9. If you think about it, we really don't need the if statement above.
    How can we rewrite exercise 8 to have only one line of code?
    */
    
    //
    
    public boolean returnTrueWhenGreaterThanFiveInOneLine(int number) {
        return number > 5; // What can we put here that returns a boolean that we want?
    }

    /*
    10. This method will take a number and do the following things to it:
    * If addThree is true, we'll add three to that number
    * If addFive is true, we'll add five to that number
    * We'll then return the result
    */
    public int returnNumberAfterAddThreeAndAddFive(int number, boolean addThree, boolean addFive) {
        if (addThree) {
            number = number + 3;
        }

        // We can't use an else here. They could both be true, so we have to check each one.

        if (addFive) {
            number += 5;
            // number = number + 5;
        }

        return number;
    }

    /*
    11. Write an if statement that returns "Fizz" if the parameter is 3 and returns an empty String for anything else.
    */
    
    // if() - () is condition
    
    public String returnFizzIfThree(int number) {
    	if(number == 3) {
    		return "Fizz";
    	}
    	
        return "";
    }

    /*
    12. Now write the above using the Ternary operator ?:. If you're not sure what this is, you can Google it.
    */
    
    // ? = I'm going to ask a boolean question - "if condition is true"
    // : = "otherwise"
    // used together
    
    public String returnFizzIfThreeUsingTernary(int number) {
        return number == 3 ? "Fizz" : "";
    }

    /*
    13. Write an if/else statement that returns "Fizz" if the parameter is 3, "Buzz" if the parameter is 5 and an empty String for anything else.
    */
    public String returnFizzOrBuzzOrNothing(int number) {
        return "";
    }

    /*
    14. Write an if statement that checks if the parameter number is either equal to or greater than 18. Return "Adult" if it is or "Minor" if it's not.
    */
    public String returnAdultOrMinor(int number) {
        if (true) {
            return "Adult";
        } else {
            return "Minor";
        }
    }

    /*
    15. Now, do it again with a different boolean opeation.
    */
    public String returnAdultOrMinorAgain(int number) {
        if (true) {
            return "Adult";
        } else {
            return "Minor";
        }
    }

    /*
    16. Return as above, but also return "Teen" if the number is between 13 and 17 inclusive.
    */
    public String returnAdultOrMinorOrTeen(int age) {
        if (age >= 18) {
            return "Adult";
        } else if (age >= 13) {
            return "Teen";
        } else {
            return "Minor";
        }
    }

}