package Prog2;

public class SelectionSort {
	public static void selectionSort(int sort_arr[] , int len) {
		 for (int i=0;i<len-1;i++){

	            for(int j=i+1;j<len-i-1; j++){

	                if(sort_arr[i]>sort_arr[j]){

	                    int swap = sort_arr[j];
	                    sort_arr[j] = sort_arr[i];
	                    sort_arr[i] = swap;

	                }
	            }
	        }
	}
	
	
	
	public static void main(String[] args) {
		  int [] array = {11,5,9,1,24,18};
	      int len = array.length;
	      selectionSort(array,len);

	      for(int i = 0; i<len; ++i){
	          System.out.print(array[i] + " ");
	      }
	}



	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		int temp;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}
	}


