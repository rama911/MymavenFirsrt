import java.util.Scanner;

public class Pallandrome {
	
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Malayalam";
//		StringBuilder sb = new StringBuilder();
//		sb.append(str);
//		System.out.println(sb.reverse());
		
//		char Char[] = str.toCharArray();
//		
//		for (int i= Char.length-1 ; i>=0 ; i--) {
//			
//			 System.out.print(Char[i]);
//		}
////			
//			Scanner in = new Scanner(System.in);
//			System.out.println("Enter your string");
//			str = in.nextLine();
//			String[] token = str.split("");
//			for(int i=token.length-1; i>=0; i--)
//			{
//			System.out.print(token[i] + "");
//			}

            int x,temp, y; 
            System.out.println("Enter x and y ");
            Scanner in = new Scanner(System.in);
            x = in.nextInt();
            y = in.nextInt(); 
            System.out.println("Numbers before swap "+ x + y);
            temp = x ;
            x = y;
            y = temp;
            System.out.println("After Reversing " + x + y);
            
            
			
		
	}
}
