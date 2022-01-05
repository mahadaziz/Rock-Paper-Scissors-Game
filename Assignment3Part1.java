import java.util.Scanner;

public class Assignment3Part1 {
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
    loop as long as the expression is different from the expression that is returned from
    the expReplacer function. After the loop ends it returns to main the String "VALID"
    or the String "INVALID" based on the length of the expression.
    @param expression: The String that contains the expression
    @return course: Returns "VALID" if the expression has a length of 1 and returns
    "INVALID" if the expression has a length that is not equal to 1
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
            // Returns the String "VALID" to main
            return "VALID";
        }
        // If the length of the expression after the loop is not equal to 1 then the user input
        // is invalid
        else {
            // Returns the String "INVALID" to main
            return "INVALID";
        }
    }

    /*
    expReplacer
    This method takes the expression and checks if it contains the various R,P, and S
    combinations. If the combination does appear within the expression then it is replaced
    with the corresponding winner and returned. If there is no possible combinations then
    it just returns the expression that was sent to it.
    @param expression: The String that contains the expression
    @return expression: Returns the expression that contains the expression
    */
    public static String expReplacer (String expression) {
        // If the expression contains "(R&P)" then it is replaced with "P" and the new
        // expression is returned
        if (expression.contains("(R&P)")) {
            return expression.replace("(R&P)", "P");
        }
        // If the expression contains "(P&R)" then it is replaced with "P" and the new
        // expression is returned
        else if (expression.contains("(P&R)")) {
            return expression.replace("(P&R)", "P");
        }
        // If the expression contains "(R&S)" then it is replaced with "R" and the new
        // expression is returned
        else if (expression.contains("(R&S)")) {
            return expression.replace("(R&S)", "R");
        }
        // If the expression contains "(S&R)" then it is replaced with "R" and the new
        // expression is returned
        else if (expression.contains("(S&R)")) {
            return expression.replace("(S&R)", "R");
        }
        // If the expression contains "(P&S)" then it is replaced with "S" and the new
        // expression is returned
        else if (expression.contains("(P&S)")) {
            return expression.replace("(P&S)", "S");
        }
        // If the expression contains "(S&P)" then it is replaced with "S" and the new
        // expression is returned
        else if (expression.contains("(S&P)")) {
            return expression.replace("(S&P)", "S");
        }
        // If the expression contains "(R&R)" then it is replaced with "R" and the new
        // expression is returned
        else if (expression.contains("(R&R)")) {
            return expression.replace("(R&R)", "R");
        }
        // If the expression contains "(P&P)" then it is replaced with "P" and the new
        // expression is returned
        else if (expression.contains("(P&P)")) {
            return expression.replace("(P&P)", "P");
        }
        // If the expression contains "(S&S)" then it is replaced with "S" and the new
        // expression is returned
        else if (expression.contains("(S&S)")) {
            return expression.replace("(S&S)", "S");
        }
        // If expression doesn't contain any of the expression combinations then the
        // original expression is returned
        return expression;
    }
}
