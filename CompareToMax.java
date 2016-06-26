import java.lang.*; 


class CompareToMax{
	
	public static int CompareToMax(int array[], int n){
		if(n<=0){
		return 0;
		}
		else if(n==1) return array[0];
		else{
			int temp =-1;
			for(int i=0;i<n;i++){
				if(array[i]>temp){
					temp = array[i];
				}
			}
			return temp;
		}
}

	public static void main(String args[]){
		int[] array = new int[4];
		array[0] =3; 
		array[1] =6; 
		array[2] =1; 
		array[3] =4; 
		int n = array.length;
		System.out.println("result: "+ CompareToMax(array,n));

	}

}

