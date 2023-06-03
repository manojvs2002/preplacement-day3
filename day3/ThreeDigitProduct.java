package day3;

import java.util.Arrays;

public class ThreeDigitProduct {

	static int product(int nums[],int target) {
		Arrays.sort(nums);
		int closetsum=nums[0]+nums[1]+nums[2];
		int n=nums.length;
		for(int i=0;i<n-2;i++) {
			int left=i+1;
			int right=n-1;
			while(left<right) {
				int sum=nums[i]+nums[left]+nums[right];
				if(Math.abs(sum-target)<Math.abs(closetsum-target)) {
					closetsum=sum;
					
				}
				else if(sum<target) {
					left++;
				}
				else if(sum>target) {
					right--;
					
				}
				else return sum;
			}
			
		}
		return closetsum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {-1,2,3,4,5};
		int x=120;
		int res=product(a,x);
		System.out.println(res);
	}

}
