import java.util.Arrays;
import java.util.Scanner;

public class demo
{

    public static void main(String arg[])
    {
            
            Scanner sc = new Scanner(System.in);


            System.out.println("\nEnter the number of element in array:-");
            int arrlen = sc.nextInt();
            int arr[] = new int[arrlen];
            int push[] ={1,2,3,4,5};
            
            System.out.println("Enter the elements:-");
            for(int ArrCnt=0;ArrCnt<arr.length;ArrCnt++)
            {
                arr[ArrCnt]=sc.nextInt();

            }

            //System.out.println("Enter")
            //int arr[] = {1,2,4,6};

while(true)
{
            try {
                    System.out.println("Enter the element to search from given array:-");
                    int Input= sc.nextInt();
                    //int Input = 2;
                       
                      
                    for(int iCnt=0 ;iCnt<=arr.length;iCnt++ )
                    {
                        if(Input==arr[iCnt])
                        {
                            System.out.println("The number "+arr[iCnt]+" is preset at "+iCnt+" location of the array");
                            
                            int[] newArray = Arrays.copyOf(push,push.length + 1);
                                newArray[newArray.length - 1] = Input;
                                    push = newArray;
                            
                                    // for(int i =0;i<push.length;i++)
                                    // {
                                    //     System.out.println(push[i]);
                                    // }
    
                            System.out.println("Updated Array: " + Arrays.toString(push));
                            break;
                        }
                        
                    }
                

            } 
            catch (Exception e) 
            {
                    System.out.println("Sorry the number is not present in the array");
            }
            finally
            {
                System.out.println("Program has been executed!");
            }

            System.out.println("Do you want to search for another element? (yes/no)");
            
            String choice = sc.next();
            if (choice.equalsIgnoreCase("yes")) 
            {
                System.out.println("Program terminated!");
                sc.close();//closing connection
                break;
            }
        }
    }
}