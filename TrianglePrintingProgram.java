public class TrianglePrintingProgram {
	public static void main(String [] args) {

		int size = 10;
		char[][] pattern = new char[size][4 * (size + 2)];

		 for (int a = 0; a < size; a++) {
           		 for (int b = 0; b < 4 * (size + 2); b++) {
             		 	 pattern[a][b] = ' ';
          		}
        	}

	
		// pattern (a)
		for (int a = 1; a <= size; a++) {
			for (int b = 0; b <= size; b++) {
			pattern[a][b] = '*';
			}		
		}	

		// pattern (b)
		for (int a = 0; a < size; a++) {
			for (int b = 0; b < size - a; b++) {
			 pattern[a][b] = '*';

			}
		}	
		
		// pattern (c)
		for (int a = 0; a < size; a++) {
			for (int b = 0; b < size; b++) {
			pattern[a][b] = '*';

			}
		}	

		// pattern (d)
		for (int a = 0; a < size; a++) {
			for (int b = 0; b <= a; b++) {
			 pattern[a][b + 3 * (size +2) + size - 1 - 1] = '*';	
			
			}
		
		}	
		
		 // Print patterns
        	for (int i = 0; i < size; i++) {
            		for (int j = 0; j < 4 * (size + 2); j++) {
                	System.out.print(pattern[i][j]);
            }
            System.out.println();
        }

	}
}