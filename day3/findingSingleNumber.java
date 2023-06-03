package day3;

public class findingSingleNumber {
	
	static int find(int[] a) {
		int res=0;
		for(int b:a) {
			res^=b;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,1,2,2,3,3,3,3};
		int res=find(a);
		System.out.println(res);
	}

}
