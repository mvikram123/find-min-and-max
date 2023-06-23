
// find minimum and maximum no in unsorted array
public class Main{
    public static void main(String args[])
    {
        int arr[]={4,5,1,6,7,8,3};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);
        }
        System.out.println("maximum number is "+max);
        System.out.println("minimum number is  "+min);
    }
}
