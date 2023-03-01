package pt.tiagocabral.caixa;

public class Main {

	public static void main(String[] args) {
		printTopOrBottom(4);
		printLeftandRight(4,2);
		printTopOrBottom(4);
	}
	
	public static void printTopOrBottom(int size){
		for( int i = 0; i < size; i++) {
		System.out.print("*");
		}
		System.out.println();
	}
	
	  public static void printLeftandRight(int width, int height) {
	        for (int i = 0; i < height; i++) {
	            System.out.print("*");
	            for (int j = 0; j < width -2; j++) {
	                System.out.print(" ");
	            }
	            System.out.println("*");
	        }
	    }		 

}
