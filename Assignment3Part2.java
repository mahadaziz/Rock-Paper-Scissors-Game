import java.util.Scanner;

public class Assignment3Part2 {
    public static void main(String[] args) {
        // Calls userInput method to take user input and stores it in the variable input
        String input = userInput();
        // Sends the user input to RPSWinner to determine if string is valid or not
        System.out.println(RPSWinner(input));
    }

    /*
    userInput
    This method takes the user's input and returns it to the main function.
    @return input: Returns the user's input
    */
    public static String userInput () {
        // Initialize scanner for user input
        Scanner keyboard = new Scanner(System.in);
        // Takes user input
        String input = keyboard.nextLine();
        // Returns user input to main
        return input;
    }

    /*
    RPSWinner
    This method takes the String that contains the expression and repeatedly sends it
    to the expReplacer function through the use of a while loop. The while loop continues to
    loop as long as the expression is different to the expression that is returned from
    the expReplacer function. After the loop ends it returns to main the expression or the
    String "INVALID" based on the length of the expression.
    @param expression: The String that contains the expression
    @return course: Returns the expression if the expression has a length of 1 and
    returns "INVALID" if the expression has a length that is not equal to 1
    */
    public static String RPSWinner (String expression) {
        // Goes through loop if expression has changed after having the expReplacer method
        // called on it
        while (expression != expReplacer(expression)) {
            // Reassigns the new expression to the variable that held the old expression
            expression = expReplacer(expression);
        }
        // If the length of the expression after the loop is equal to 1 then the user input
        // is valid
        if (expression.length() == 1) {
            // Returns expression to main
            return expression;
        }
        // If the length of the expression after the loop is not equal to 1 then the user input
        // is invalid
        else {
            // Returns the string "INVALID" to main
            return "INVALID";
        }
    }

    /*
    expReplacer
    This method takes the string and checks if it contains the various R,P, and S
    combinations. If the combination does appear within the string then it is replaced
    with the corresponding winner and returned. If there is no possible combinations then
    it just returns the string that was sent to it.
    @param string: The String that contains the expression
    @return string: Returns the string that contains the expression
    */
    public static String expReplacer (String string) {
        // If the string contains "(R&P)" then it is replaced with "P" and the new string
        // is returned
        if (string.contains("(R&P)")) {
            return string.replace("(R&P)", "P");
        }
        // If the string contains "(P&R)" then it is replaced with "P" and the new string
        // is returned
        else if (string.contains("(P&R)")) {
            return string.replace("(P&R)", "P");
        }
        // If the string contains "(R&S)" then it is replaced with "R" and the new string
        // is returned
        else if (string.contains("(R&S)")) {
            return string.replace("(R&S)", "R");
        }
        // If the string contains "(S&R)" then it is replaced with "R" and the new string
        // is returned
        else if (string.contains("(S&R)")) {
            return string.replace("(S&R)", "R");
        }
        // If the string contains "(P&S)" then it is replaced with "S" and the new string
        // is returned
        else if (string.contains("(P&S)")) {
            return string.replace("(P&S)", "S");
        }
        // If the string contains "(S&P)" then it is replaced with "S" and the new string
        // is returned
        else if (string.contains("(S&P)")) {
            return string.replace("(S&P)", "S");
        }
        // If the string contains "(R&R)" then it is replaced with "R" and the new string
        // is returned
        else if (string.contains("(R&R)")) {
            return string.replace("(R&R)", "R");
        }
        // If the string contains "(P&P)" then it is replaced with "P" and the new string
        // is returned
        else if (string.contains("(P&P)")) {
            return string.replace("(P&P)", "P");
        }
        // If the string contains "(S&S)" then it is replaced with "S" and the new string
        // is returned
        else if (string.contains("(S&S)")) {
            return string.replace("(S&S)", "S");
        }
        // If string doesn't contain any of the string combinations then the original string
        // is returned
        return string;
    }
}
