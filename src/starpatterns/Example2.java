package starpatterns;

public class Example2 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int x=5;x>=i;x--){
					System.out.print(" ");	
				}
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("\n");
		}

	}
}


