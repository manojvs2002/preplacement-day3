package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	
	static List<List<Integer>> subset(int a[],int target) {
		int n=a.length;
		Arrays.sort(a);
		
		List<List<Integer>> all=new ArrayList<>();
		
		for(int i=0;i<n-3;i++) {
			for(int j=i+1;j<n-2;j++) {
				int start=j+1,end=n-1;
				int sum=target-(a[i]+a[j]);
				while(start<end) {
					int t=a[start]+a[end];
					if(t==sum) {
						all.add(Arrays.asList(a[start],a[end],a[i],a[j]));
						start++;
						end--;
					}
					else if(t<sum)
						start++;
					else end--;
						
				}
			}
		}
		return all;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,9,2,6,3,8};
		int sum=11;
		System.out.println(subset(a,sum));

	}

}
