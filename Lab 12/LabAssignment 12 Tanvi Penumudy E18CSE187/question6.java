package lab12;

import java.util.Arrays;

public class question6 {
	public static int remdup(int[] nums) {
		  boolean inclump = false;
		  int dup = 0;
		  for (int i = 1; i < nums.length; i++) {
		      if (nums[i] == nums[i - 1]) {
		          if (!inclump) {
		              inclump = true;
		              dup++;
		          }
		      } else {
		          inclump = false;
		      }
		  }
		  return nums.length - dup;
		}
	public static void main(String args[]) {
		int arr[] = {20, 19, 34, 53, 53, 0, 11} ;
		System.out.println(Arrays.toString(arr));
		System.out.println("Unique Elements : " + remdup(arr));
		
	}
}