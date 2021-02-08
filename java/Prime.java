import java.io.*;
public class Prime{
	public static void main(String[] args) throws IOException{
		int i,flag=0;
		DataInputStream in = new DataInputStream(System.in);
 		System.out.println("Enter the number:");
		int num=Integer.parseInt(in.readLine());
		if(num==0||num==1){
			System.out.println(num+"is not a prime number");
		}else{
			for(i=2;i<=num/2;i++){
				if(num%i==0){
					System.out.println(num+"is not a prime number");
					flag=1;
					break;
				}
			}
		
		if(flag==0){
			System.out.println(num+"is a prime number");
			}
		}
	}
}
	