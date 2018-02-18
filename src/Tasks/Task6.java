package Tasks;

public class Task6 {

	public static void main(String[] args) {
		// В двумерном массиве натуральных случайных чисел от 0 до 199 найти количество всех двузначных чисел, 
		//у которых сумма цифр кратна 2.
		
		int mas[][] = new int[5][5];
		int num = 0;
		int buf;
		
		//заполняем и выводим массив натуральных чисел от 0 до 199
		for(int i=0; i < mas.length; i++){
			for(int j=0; j<mas[i].length; j++){
				do{
					buf = (int)(Math.random()*1000);
				}while (buf > 200);
				mas[i][j] = buf;
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		
		//найти количество всех двузначных чисел, у которых сумма цифр кратна 2
		System.out.println("Подходящие под условие числа: ");
		for(int i=0; i<mas.length; i++){
			for(int j=0; j<mas[i].length; j++){
				if(mas[i][j]<100 && mas[i][j]>9){
					int n1 = Math.floorDiv(mas[i][j],10);
					int n2 = mas[i][j]%10;
					int n = n1 + n2;
					if(n % 2 == 0){
						System.out.print(mas[i][j] + " ");
						num += 1;
					}			
				}
			}
		}
		
		System.out.println("\nКоличество подходящих чисел равно: " + num);
	}
}
