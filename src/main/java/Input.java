package util;
import java.util.Scanner;
import java.util.jar.JarOutputStream;
//    Create a class named Input that has a private property named scanner.
public class Input {
    private  Scanner scanner;//private property of scanner
    //   When an instance of this object (Input object) is created,
    // the scanner property should be set to a new instance of the Scanner class.
    public Input(){//constructor for input
        this.scanner = new Scanner(System.in);//creates a new instance of the scanner property
    }


//    The class should have the following methods, all of which return command line input from the user:
    public String getString(){
//        -----------------------------------------
//        String userName = this.scanner.next();
// can assign the value to a variable, but for a more broad use case for getting a users string:
//  ---------------------------------------
//        System.out.println(scanner.nextLine());//testing.
        return scanner.nextLine();//next line vs next because this allows the user to type in more than just a word.  again, for a broader use case of getting a string.
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public String getWord(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String input = scanner.next();//only needs to be next because the user will only enter a word or character.
        System.out.println(input);//want to see what they entered.
             if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
//            System.out.println("yesNo worked with yes");//sout anything here, so you can follow your code in case of error
            return true;
        }else{
//            System.out.println("yesNo worked with no");//sout in case of error.
            return false;
        }
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
            return true;
        }else{
            return false;
        }
    }

//    public int getInt(String prompt) {
//        System.out.println(prompt);
//        if (scanner.hasNextInt()) {
//            return scanner.nextInt();
//        } else {
//            System.out.println("invalid input.  Enter a valid integer.");
//            return getInt();//recursive.  but a loop works fine too.
//        }
//    }



//    public int getInt() {
////        System.out.println("Please enter a number");
////        int userInputInt = this.scanner.nextInt();
////        System.out.println("You entered " + userInputInt);
////        return userInputInt;
////        ------------------------------------
//        if (scanner.hasNextInt()) {
//            return scanner.nextInt();
//        } else {
//            System.out.println("invalid input.  Enter a valid integer.");
//            return getInt();//recursive.  but a loop works fine too.
//        }
//    }


    //USING EXCEPTION AND TRY CATCH:  ============================
    public int getInt() {
        try{
            return Integer.valueOf(getString());
        } catch (Exception e){
            System.out.println("Invalid input.");
            return getInt();
        }
    }
//    instructor solution: (I tried it this way, but couldn't figure it out:
//     public int getInt() {
//       String userInput = getString();
//    int userInt = Interger.valueof(userInput);
//    return userInt;
//    }
//    ADDING THE TRY CATCH
//public int getInt() {
//       String userInput = getString();
//   try{
//   int userInt = Interger.valueof(userInput);
//    return userInt;
//    } catch(NumberFormatException e) {
//    sout an error message;
//    return getInt();
//    }
    public double getDouble(){
        try{
           return Double.valueOf(getString());
        } catch (Exception e){
            System.out.println("Invalid input.");
            return getDouble();
        }
    }
//===========================================================================

    public int getInt(int min, int max) {
//        ------my solution - worked-------------------
//        int userInputRangeInt;
//        do {
//            System.out.println("Please enter an number between " + min + " and " + max);
//            userInputRangeInt = this.scanner.nextInt();
//        } while ( userInputRangeInt < min || userInputRangeInt > max);
//            System.out.println("Perfect!");
//            return userInputRangeInt;
//        ----------------------------------
        int userInt = getInt();
        if (userInt >= min && userInt <= max){
            return userInt;
        } else{
            System.out.println("Please enter an integer between " + min + " and " + max);
            return getInt(min, max);
        }

    }



//    public double getDouble(){
////        System.out.println("Please enter a decimal number");
////        double userInputDbl = this.scanner.nextDouble();
////        System.out.println("You entered " + userInputDbl);
////        return userInputDbl;
////        ----------------------------------------
//        if (scanner.hasNextDouble()){
//            return scanner.nextDouble();
//        } else{
//            System.out.println("Invalid input.  Enter a valid number.");
//            scanner.next();// clear the line for future use.
//            return getDouble();
//        }
//    }



    public double getDouble(double min, double max){
//        double userInputRangeDbl;
//        do {
//            System.out.println("Please enter an decimal number between " + min + " and " + max);
//            userInputRangeDbl = this.scanner.nextDouble();
//        } while ( userInputRangeDbl < min || userInputRangeDbl > max);
//        System.out.println("Perfect!");
//        return userInputRangeDbl;
//        -----------------------------------------------
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max){
            return userDouble;
        } else{
            System.out.println("Please enter a number between " + min + " and " + max);
            return getDouble(min, max);
        }
    }


//    public static void main(String[] args) {
//       Input user = new Input();
////       user.getString();
////       Input continue = new Input();
////       user.yesNo();
////       user.getInt(3, 15);
////       user.getInt();
//       user.getDouble(4.95, 100.50);
//       user.getDouble();
//    }

//    Instructor testing:
//public static void main(String[] args) {
//    Input in = new Input();//this is how you use the scanner input method.
////
//
////    String favSentence = in.getString("Please enter your favorite sentence!");
////    System.out.println(favSentence);
//
////        System.out.print("Will you continue? ");
////        boolean yesNo = in.yesNo();
////        System.out.println(yesNo);
//
//    System.out.print("Please enter a whole number: ");
//    int num = in.getInt();
//    System.out.println("You entered: " + num);
//
////        System.out.print("Please enter a whole number between 1 and 10: ");
////        int numInRange = in.getInt(1, 10);
////        System.out.println("You entered " + numInRange);
//
//    System.out.print("Please enter a number: ");
//    double dNum = in.getDouble();
//    System.out.println("You entered: " + dNum);
//
////        System.out.print("Please enter a whole number between 1 and 10: ");
////        double dNumInRange = in.getDouble(1, 10);
////        System.out.println("You entered " + dNumInRange);
//
//}
}
//}
//Create a package inside of src named util. Inside of util, create a class named Input that has a private property named scanner. When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:
//
//String getString()
//boolean yesNo()
//int getInt(int min, int max)
//int getInt()
//double getDouble(double min, double max)
//double getDouble()
//The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//
//The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
//
//Create another class named InputTest that has a static main method that uses all the methods from the Input class.
//
//Bonus
//
//Allow all of your methods for getting input to accept an optional String parameter named prompt. If passed, the method should show the given prompt to the user before parsing the input.