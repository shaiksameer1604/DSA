public class Binary_search {

	public static void binary(int arr[],int search) 
	{
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		int val=-1;
		while(start<=end)
		{
			mid=(start+end)/2;
			if(search==arr[mid]) {
				val=1;
				System.out.println("Value is present:"+arr[mid]);
				break;
			}
			else if(search<arr[mid])
			{
				end=mid-1;
			}
			else if(search>arr[mid])
			{
				start=mid+1;
			}
		}
		if(val!=1)
		{
			System.out.println("Value is not present");
		}
	}
	
public static void main(String[] args) {
	int arr[]= {1,5,9,11,15,18,78};
	int search=78;
	binary(arr,search);
}
}
