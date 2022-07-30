package Prog4;

public class TryCatch {
	public static void main(String[] args) {
		System.out.println("begin");
		try {
			System.out.println(5/0);
			int arr[]= {67};
			System.out.println(arr[2]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("cant");
			
		}
		
		System.out.println("end");
	}

}
