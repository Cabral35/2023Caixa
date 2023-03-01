package pt.tiagocabral.caixa;

public class Main {

	public static void main(String[] args) {
		createbox(4,4);
		createbox(8,8);
		createbox(5,5);
	}
	
	public static void createbox(int width, int height) {
		if(width < 4) {
		   width = 4;
		}
		if(width < 4) {
			width = 4;
		}
		printTopOrBottom(width);
		printLeftandRight(width,height - 2);
		printTopOrBottom(width);		
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
