package day3;

import java.util.Arrays;

public class AddingOneToLast {

	static int[] function(int a[]) {
		
		int n=a.length;
		int carry=1;
		for(int i=n-1;i>=0 && carry>0;i--) {
			a[i]=a[i]+carry;
			carry=a[i]/10;
			a[i]%=10;
		}
		if(carry>0) {
			int res[]=new int[n+1];
			res[0]=carry;
			//System.arraycopy(a, 0, res, 1, n);
			return res;
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		int res[]=function(a);
		System.out.println(Arrays.toString(res));

	}

}
