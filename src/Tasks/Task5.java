package Tasks;

public class Task5 {

	public static void main(String[] args) {
		// � ��������� ������� ����� ����� ����������, ������� ��� � ��� ����������� ������� �� ��������� X.
		
		int mas[][] = new int[5][5];
		int x = 7;
		int num = 0;
		
		System.out.println("�������� �������: ");
		
		
		for(int i=0; i<mas.length; i++){
			for(int j=0; j<mas[i].length; j++){
				mas[i][j] = (int)(Math.random()*10);
				System.out.print(mas[i][j] + " ");
				if(mas[i][j] == x)
					num +=1;
			}
			System.out.println();
		}
		
		System.out.println("����� " + x + " ����������� � ������� " + num + " ���(�)");		
	}

}
