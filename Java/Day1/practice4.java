import java.util.Scanner; 
class practice4
{ 
    public static void main (String [] args) 
    { 
        Scanner scan = new Scanner(System.in); 
        System.out.print("Please Enter Candidate experience: "); 
        int experience = scan.nextInt(); 
        scan.nextLine(); 
        if (experience >= 1 && experience <= 5) 
            { 
                System.out.println("Please Enter the known coding language of the Candidate: "); 
                String language = scan.nextLine(); 
                if(language .equals("Java")) 
                    { 
                        System.out.println( "Is that Candidate pass the exam: " ); 
                        boolean testResult = scan.nextBoolean(); 
                        if (testResult) 
                            { 
                                System.out.println("This Candidate is eligible for this position"); 
                            } 
                            else{ 
                                System.out.println("This Candidate is not eligible for this position"); 
                            }
                         }
                         else{ 
                            System.out.println("This Candidate is not eligible for this position"); 
                        }
                     }
                      else{ 
                        System.out.println("This Candidate is not eligible for this position"); 
                    } 
                } 
            }