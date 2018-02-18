package Tasks;

public class Task3 {

	public static void main(String[] args) {
		// Дана матрица (двумерный массив). Поменять местами две любые ее
		// строки.

		int mas[][] = new int[][] { { 18, 11, 5, 4, 11 }, 
			                      { 18, 1, 6, 7, 2 }, 
			                      { 2, 14, 14, 10, 12 },
				                  { 13, 5, 11, 19, 19 }, 
				                  { 6, 6, 13, 13, 16 }, 
				                  { 0, 17, 14, 6, 0 }, 
				                  { 14, 0, 2, 11, 7 } };
		
		int n = 1;
		int m = 6;
		int buf = 0;

		for (int j = 0; j < mas[n].length; j++){
			buf = mas[n][j];
			mas[n][j] = mas[m][j];
			mas[m][j] = buf;
		}
		
		for (int i = 0; i < mas.length; i++){
			for (int j: mas[i])
				System.out.print(" " + j);
			System.out.println();
		}
			

	}

}
