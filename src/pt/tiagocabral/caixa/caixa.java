package pt.tiagocabral.caixa;

public class caixa {
	
		private int width;
		private int height;

		public caixa(int widthParam, int heightParam) {

			width = widthParam;
			height = heightParam;
		}
		
		public void print() {
			if (width < 4) {
				width = 4;
			}
			if (width < 4) {
				width = 4;
			}
			printTopOrButtom(width);
			printLeftAndRight(width, height - 2);
			printTopOrButtom(width);
		}

		private static void printTopOrButtom(int size) {
			for (int i = 0; i < size; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		private static void printLeftAndRight(int width, int height) {
			for (int i = 0; i < height; i++) {
				System.out.print("*");
				for (int j = 0; j < width - 2; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
	}