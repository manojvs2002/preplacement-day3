package day3;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
	
	static List<String>  numbermissing(int[]  a,int low,int high){
		
		int n=a.length;
		List<String> object = new ArrayList<>();
		
		if(a[0]>low) {
			object.add(getRange(low,a[0]-1));
		}
		for(int i=1;i<n;i++) {
			if(a[i]>a[i-1]+1)
				object.add(getRange(a[i-1]+1, a[i]-1));
		}
		
		if(a[n-1]<high)
			object.add(getRange(a[n-1]+1, high));
		
		return object;
		
	}

	private static String getRange(int low, int high) {
		// TODO Auto-generated method stub
		if(high==low)
			return String.valueOf(low);
		else
			return low+"->"+high;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {1,3,5,67,99};
		int lower=0,higher=98;
		List<String> res=numbermissing(a, lower, higher);
		System.out.println(res);
	}

}
