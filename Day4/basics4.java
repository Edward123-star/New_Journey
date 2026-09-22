import java.util.Scanner;
class basics4{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of testcases to be excicuted: ");
        int testcases = scan.nextInt();
        boolean[]testresult = new boolean[testcases];
        int pass= 0;
        int fail= 0;
        for(int i=0; i<testcases; i++)
        {
            System.out.println("Enter the Test result (True/False)");
            System.out.print("TestResult " +(i+1)+": ");
            testresult[i] = scan.nextBoolean();
             if(testresult[i])
        {
            pass++;
        }
        else{
            fail++;
        }
        }
       
        System.out.println("Total test cases excuted " + testresult.length);
        System.out.println(" Total testcases passed " + pass);
        System.out.println(" Total testcases failed " + fail);
    }
}