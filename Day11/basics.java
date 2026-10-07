class basics
{
    public static void main(String[] args)
    {
        int a = 20;
        int b = 0;

        // Exception handling using try-catch block
        // An exception is an abnormal condition that occurs during program execution and interrupts the normal flow of the program. Exception handling allows us to handle that situation and control what happens next.
        // This is called execption handling

        // We can't use the try and catch alone, we need to use them together. The code that may throw an exception is placed inside the try block, and the code that handles the exception is placed inside the catch block.
        try
        {
            int result = a / b;
            System.out.println("Result: " + result);
        }

        // Execption e (e) is a variable that holds the execption object. 
        // The (e) can be anything ex: Execption error, Execption ex, Execption exception, Execption probleam ext..
        catch(Exception e)
        {
            // e.getMessage() - gives us information about what went wrong.
            // e,getMessage() - Give me the message associated with this exception
            System.out.println(e.getMessage());
            System.out.println("Cannot divide by zero");
            System.out.println(e);
        }

        System.out.println("Program completed");
    }
}