import java.util.Scanner;

public class MenuManager {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	    int num = 0;
		int password = 1213;
	    
		while(num != 6){
			System.out.println("1. Add Clothes");
			System.out.println("2. Delete Clothes");
			System.out.println("3. Edit Clothes");
			System.out.println("4. View Clothes");
			System.out.println("5. Show menu");
			System.out.println("6. Exit");
			System.out.println("Choose numbers between 1~6");
			num = input.nextInt();
		
			switch(num) {
			
				case 1:
					System.out.print("Clothes_Name");
					String Clothes_Name = input.next();
					System.out.println("Clothes_Name :\t" + Clothes_Name);
					System.out.print("Clothes_Size");
					int Clothes_Size = input.nextInt();
				    System.out.println("Clothes_Size :\t" + Clothes_Size + "\n");
				    break; // �����ֿ��� if������ �ٲ��� ������ �ͽ��ϴ�. 
				           // case 1���� ��, 2�� �Ѿ�ٴ°� �������ϴ�.
				   
				 case 2:
				    System.out.println("���� �����Ͻǰ̴ϱ� ? �����Ͻ÷��� password�� �Է�   :");
				    int Answer = input.nextInt();   /*Stirng���� �Ͽ� y/n���� �޾� �����Ϸ� 
				                                      ������ �����Ͽ� int�� password ������ Ȱ���߽��ϴ� */
				    if(Answer == password) {
					Clothes_Name = "Deleted files"; 
					System.out.println("Clothes_Name :\t" + Clothes_Name);
					Clothes_Size = 0;  // �������� �������ٴ°� ��� ǥ������ ���� 0�̶� �߽��ϴ�.
					System.out.println("Clothes_Size :\t" + Clothes_Size + "\n");
					break;
				    }
				    else 
				    	break;
					
				case 3:
					System.out.print("�����Ϸ��� Clothes_Name�� �Է� ���ּ���");
					String Clothes_Name2 = input.next();
					Clothes_Name = Clothes_Name2 ;   /* ó������ case 1�� ���̶�� ������
					                                   structures�� �ؾ��Ұ� �����ϴ�. */
					System.out.println("Clothes_Name :\t" + Clothes_Name);
					break;
					
				case 4:
					/*
					System.out.println("Clothes_Name :\t" + Clothes_Name);            
				    System.out.println("Clothes_Size :\t" + Clothes_Size + "\n");
					
					 ������� �ͼ� ���� ���̸�,�ʻ����� ��� ������ �� case �� ���� ����������� �ϴ°� ����
				     ���� ���ϴ°� ���� ���̶�� �̸����� �����صּ� �� �� ���� ������ switch�� �����ְ� 
				     ���ְ� �ϰ������ ���� �ȵ� 
				     ���߿� �Լ��� �ҷ��� �ؾ��ϴ°���, structure�̶�°� ���� �ȹٷ� �������� �ʾҴµ�
				     �̸� �̿��ؾ����� �𸣰���. 
				     ���� ������ �ذ��� �������� ������ �ͽ��ϴ�.
				    */
				    
				case 5:
					continue;
					
				
		    }	  //swich(num)�� �����
			
		} //while(num !=6)�� ��ȣ 
		
	} //main�� ��ȣ

}// class�� ��ȣ
