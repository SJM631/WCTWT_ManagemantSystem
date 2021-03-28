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

			if (num==1) {
				addClothes();
			}
			else if (num==2) {
				deleteClothes();
			}
			else if (num==3) {
				editClothes();
			}
			else if (num==4) {
				viewClothes();
			}
			else {
				continue; //ū �ǹ� �����ô����� �����ϴϱ�
			}
		} //while(num !=6)�� ��ȣ 
	} //main�� ��ȣ

	public static void addClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Clothes_Name");
		String Clothes_Name = input.next();
		System.out.println("Clothes_Name :\t" + Clothes_Name);
		System.out.print("Clothes_Size");
		int Clothes_Size = input.nextInt();
		System.out.println("Clothes_Size :\t" + Clothes_Size + "\n");
	} // 1�� �Լ� �ø������

	public static void deleteClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Clothes_Name");
		String Clothes_Name = input.next();
		System.out.println("Clothes_Name :\t" + Clothes_Name);
		System.out.print("Clothes_Size");
		int Clothes_Size = input.nextInt();
		System.out.println("Clothes_Size :\t" + Clothes_Size + "\n");
	} // 2�� �Լ� �ø������

	public static void editClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Clothes_Name");
		String Clothes_Name = input.next();
		System.out.println("Clothes_Name :\t" + Clothes_Name);
		System.out.print("Clothes_Size");
		int Clothes_Size = input.nextInt();
		System.out.println("Clothes_Size :\t" + Clothes_Size + "\n");
	} // 3���Լ� �ø������

	public static void viewClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Clothes_Name");
		String Clothes_Name = input.next();
		System.out.println("Clothes_Name :\t" + Clothes_Name);
		System.out.print("Clothes_Size");
		int Clothes_Size = input.nextInt();
		System.out.println("Clothes_Size :\t" + Clothes_Size + "\n");
	} // 4���Լ� �ø������

/*
���� �Լ��� ��ݸ� ������ �ϼż� �������. 
return���� �� �����ְ� �� �Լ��� �ǹ��ְ� ������ �� ������ ������,
���� int�� String�� ������ void�� �� ������ �𸣰���
������ ���� String���� �ٲ��ڴ� ���߿� ���� ���������� ������ 
������ �����غ���
*/

}// class�� ��ȣ
