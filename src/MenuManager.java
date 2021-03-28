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
				continue; //큰 의미 없으시다지만 허전하니깐
			}
		} //while(num !=6)의 괄호 
	} //main의 괄호

	public static void addClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Clothes_Name");
		String Clothes_Name = input.next();
		System.out.println("Clothes_Name :\t" + Clothes_Name);
		System.out.print("Clothes_Size");
		int Clothes_Size = input.nextInt();
		System.out.println("Clothes_Size :\t" + Clothes_Size + "\n");
	} // 1번 함수 컬리브라켓

	public static void deleteClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Clothes_Name");
		String Clothes_Name = input.next();
		System.out.println("Clothes_Name :\t" + Clothes_Name);
		System.out.print("Clothes_Size");
		int Clothes_Size = input.nextInt();
		System.out.println("Clothes_Size :\t" + Clothes_Size + "\n");
	} // 2번 함수 컬리브라켓

	public static void editClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Clothes_Name");
		String Clothes_Name = input.next();
		System.out.println("Clothes_Name :\t" + Clothes_Name);
		System.out.print("Clothes_Size");
		int Clothes_Size = input.nextInt();
		System.out.println("Clothes_Size :\t" + Clothes_Size + "\n");
	} // 3번함수 컬리브라켓

	public static void viewClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Clothes_Name");
		String Clothes_Name = input.next();
		System.out.println("Clothes_Name :\t" + Clothes_Name);
		System.out.print("Clothes_Size");
		int Clothes_Size = input.nextInt();
		System.out.println("Clothes_Size :\t" + Clothes_Size + "\n");
	} // 4번함수 컬리브라켓

/*
아직 함수로 골격만 잡으라 하셔서 여기까지. 
return으로 값 돌려주고 각 함수를 의미있게 동작할 수 있을것 같은데,
당장 int와 String이 섞여서 void에 뭘 넣을지 모르겠음
사이즈 값을 String으로 바꾸자니 나중에 뭔가 불편해질거 같은데 
다음에 생각해보자
*/

}// class의 괄호
