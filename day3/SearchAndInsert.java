package day3;

public class SearchAndInsert {

	static int search(int []a,int target) {
		
		int i=0,j=a.length-1;
		
		while(i<=j) {
			int mid=(i+j)/2;
			if(a[mid]==target)
				return mid;
			else if(a[mid]<target)
				i=mid+1;
			else
				j=mid-1;
		}
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3,4,5};
		int x=9;
		int flag=search(a,x);
		System.out.println(flag);
	}

}
