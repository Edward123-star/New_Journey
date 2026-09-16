import java.util.Scanner; 
class practice5{     
    public static void main (String [] args)     
    {         
        Scanner scan = new Scanner(System.in);         
        System.out.print("Please Enter bug platform: ");         
        String platform = scan.nextLine();         
        if (platform .equals("PC") || platform .equals("PS5") || platform .equals("Xbox"))         
            {             
                System.out.println("Please Enter the severity of the bug: ");             
                String severity = scan.nextLine();             
                if(severity .equals("Critical") || severity .equals("Major") || severity .equals("Minor"))             
                    {                 
                        System.out.println( "Is that the bug is reproducable (true/false) " );                 
                        boolean reproduce = scan.nextBoolean();                 
                        if (severity .equals("Critical") || severity .equals("Major") && reproduce)                 
                            {                     
                                System.out.println("Bug requires immediate escalation");                 
                            }                 
                            else{             
                                System.out.println("Bug does not require immediate escalation");         
                            }             
                        }             
                        else{             
                            System.out.println("Bug does not require immediate escalation");         
                        }         
                    }         
                    else{             
                        System.out.println("Bug does not require immediate escalation");         
                    }     
                } 
            }