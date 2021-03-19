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
				    break; // 다음주에는 if문으로 바꾸지 않을까 싶습니다. 
				           // case 1실행 후, 2로 넘어간다는걸 몰랐습니다.
				   
				 case 2:
				    System.out.println("옷을 삭제하실겁니까 ? 삭제하시려면 password를 입력   :");
				    int Answer = input.nextInt();   /*Stirng으로 하여 y/n으로 받아 실행하려 
				                                      했지만 실패하여 int로 password 변수를 활용했습니다 */
				    if(Answer == password) {
					Clothes_Name = "Deleted files"; 
					System.out.println("Clothes_Name :\t" + Clothes_Name);
					Clothes_Size = 0;  // 정수값은 없어졌다는걸 어떻게 표현할지 몰라 0이라 했습니다.
					System.out.println("Clothes_Size :\t" + Clothes_Size + "\n");
					break;
				    }
				    else 
				    	break;
					
				case 3:
					System.out.print("수정하려는 Clothes_Name을 입력 해주세요");
					String Clothes_Name2 = input.next();
					Clothes_Name = Clothes_Name2 ;   /* 처음부터 case 1에 옷이라는 변수를
					                                   structures로 해야할거 같습니다. */
					System.out.println("Clothes_Name :\t" + Clothes_Name);
					break;
					
				case 4:
					/*
					System.out.println("Clothes_Name :\t" + Clothes_Name);            
				    System.out.println("Clothes_Size :\t" + Clothes_Size + "\n");
					
					 여기까지 와서 보니 옷이름,옷사이즈 라는 변수를 각 case 때 마다 선언을해줘야 하는거 같음
				     내가 원하는건 뭔가 옷이라는 이름으로 저장해둬서 그 옷 안의 값들을 switch로 더해주고 
				     뺴주고 하고싶은데 뭔가 안됨 
				     나중에 함수를 불러서 해야하는건지, structure이라는걸 아직 똑바로 이해하진 않았는데
				     이를 이용해야할지 모르겟음. 
				     다음 주차에 해결이 가능하지 않을까 싶습니다.
				    */
				    
				case 5:
					continue;
					
				
		    }	  //swich(num)의 브라켓
			
		} //while(num !=6)의 괄호 
		
	} //main의 괄호

}// class의 괄호
