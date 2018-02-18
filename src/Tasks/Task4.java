package Tasks;

public class Task4 {

	public static void main(String[] args) {
		// Найти максимальный элемент для каждого столбца матриц размерностью NxN.
		int mas[][] = new int [5][5];
		int max[] = new int [5];
		
		for (int i=0; i < mas.length; i++){
		     for(int j=0; j < mas[i].length; j++){
		    	 mas[i][j] = (int)(Math.random()*10);
		    	 System.out.print(mas[i][j] + " ");
			}
		     System.out.println();
		}
		
		for (int i=0; i<mas.length; i++){
			max[i] = mas[i][0];
			for(int j=1; j<mas[i].length; j++){
				if(mas[i][j] > max[i])
					max[i] = mas[i][j];
			}
		}
		
		System.out.println("Максимальные числа строк: ");
		for (int i=0; i<max.length; i++)
			System.out.print(max[i] + " ");

	}

}
