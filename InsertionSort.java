public class InsertionSort{
	static int arr[]={3,1,4,1,5,9,2,6,5};
	static boolean sorted=false;
	static int sort_(){
		int temp=0;
		for(int n=1;n<arr.length;n++){
			while(arr[n]<arr[n-1]){
				temp=arr[n];
				arr[n]=arr[n-1];
				arr[n-1]=temp;
				if(n!=1){
					n-=1;
				}
			}
			if(n==arr.length-1){
				sorted=true;
			}
		}
		return 1;
	}
	static public void main(String[] args){
		if(sorted==false){
			for(int n=0;n<arr.length;n++){
				if(n==0){System.out.println("The unsorted array is: ");}
				System.out.print(arr[n]+", ");
			}
			sort_();
		}
		if(sorted==true){
			for(int n=0;n<arr.length;n++){
				if(n==0){System.out.println("\nThe sorted array is: ");}
				System.out.print(arr[n]+", ");
			}
		}
	}
}