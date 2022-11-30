package pack1;
public class SpecialNum 
{
	public static int numSpecial(int[] arr)
	{
		int arrayLength = arr.length;
		int tempNumDigitF = 0;
		for(int i =0 ;i<arrayLength-1;i++)
		{
		int tempNum=arr[i];
		while(tempNum>0)
		{
			tempNumDigitF = tempNum%10;		
			}
		}
		System.out.println(tempNumDigitF);
		return 0;
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {123,345,1};
		System.out.println(numSpecial(arr));
		
	}

}
