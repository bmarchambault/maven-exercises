import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.ls.LSOutput;

import java.lang.Object;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//    }
//        Input in = new Input();
//        String userInput = "";


//       public String getUserStr() {
//           userInput = in.getString("Please enter a sentence");
//           if (!StringUtils.isNumeric(userInput)) {
//               System.out.println("here is your sentence in reverse: " + StringUtils.reverse(userInput));
//               System.out.println("Look, I changed the capital lettering: " + StringUtils.swapCase(userInput));
//           } else if (StringUtils.isNumeric(userInput)) {
//               System.out.println("Input is invalid, please enter a string");
//               getUserString();
//           }
//           return userInput;
//       }
//       INSTRUCTOR SOLUTION:
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter something");
        String something = sc.nextLine();
        System.out.println("you entered:  " + something);
        System.out.println(something + returnNumMessage(something));
        System.out.println("Flipped Case" + StringUtils.swapCase(something));
        System.out.println("reversed: " + StringUtils.reverse(something));
    }
    public static String returnNumMessage(String input){
        return(StringUtils.isNumeric(input)) ? "is a number" : "is not a number";
    }
//************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
}
