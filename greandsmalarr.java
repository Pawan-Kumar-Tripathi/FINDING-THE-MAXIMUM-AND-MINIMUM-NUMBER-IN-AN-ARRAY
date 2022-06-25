import java.util.*;
class greandsmalarr
{
    public void main()
    {
    Scanner sc = new Scanner(System.in);
        int size,i,j;
    size= sc.nextInt();
    int arr[]= new int[size];
    int max = arr[0];
    int min = arr[0];
    for( i =0;i<size;i++)
    {
        System.out.println("please enter the element");
        arr[i]= sc.nextInt();
        
        if(max<arr[i])
        {
            max=arr[i];
        }
        
    }
    
    System.out.println("the maximum no is ="+ max);
    System.out.println("the minimum no is ="+ min);
}
        }
    
        
        
    
    
