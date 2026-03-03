package array;

public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m-1;
		int j = n-1;
		int k = m+n-1;
		
		while(i>=0 && j >=0) {
			if(nums1[i]>nums2[j]) {
				nums1[k]=nums1[i];
				i--;
				k--;
			}
			else {
				nums1[k]= nums2[j];
				j--;
				k--;
			}
		}
//		while(j>=0) {
//			nums1[k]=nums2[j];
//			j--;
//			k--;
//		}
		
		for(int a = 0 ; a < m+n;a++) {
			System.out.println(nums1[a]+" ");
		}
    }
	
	public static void main(String[] args) {
		int m = 3;
		int[] nums1 = {1,2,3,0,0,0};
		int n = 3;
		int[] nums2 = {2,5,6};
		merge(nums1, m, nums2, n);
	}
}
