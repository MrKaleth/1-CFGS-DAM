package boletín0;

public class Traza1 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("Bucle externo, i=" +i);
			int j = 1;
			
			while(j<= i) {
				System.out.println("...Bucle Interno, j=" + j);
				j++;
			}
		}
	}
}
