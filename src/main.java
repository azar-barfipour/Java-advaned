
public class main {

	public static void main(String[] args) {
		int[] arr = {5,6};
		display(arr);

		
		int[] arr2 = new int[10];//10 spaces
		arr2[5]=10;
		
		System.out.println(arr2[5]);
		
		float[] floatArr = {0.0f,1.2f,3.4f};
		
//		for(data_type var: array) {//body of the loop}
		for(float i:floatArr)
		{System.out.println(i);
		}
		

	}
	
	static void display(int a[]) {
		for(int i:a)
		{System.out.println(i);
		}
	}

}
