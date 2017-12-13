import java.util.Scanner;

public class expCalculator {
	public double x,n;
	public double ans;
	
	public expCalculator(){
		x=1;
		n=10;
	}
	
	//method for calculating x^n/n!
	public double poly(double x,double n){
		int i=0;
		double temp=1;
		for(i=1;i<=n;i++){
			temp*=x/i;
		}
		return temp;
	}
	//method for calculating whole series sum
	public double Exp(double x,double n){
		double ans=1;
		int i;
		for(i=1;i<=n;i++){
			ans+=poly(x,i);
		}
		return ans;
	}
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		expCalculator P=new expCalculator();
		
		boolean check=true;
		while(check){
			System.out.println("==============Main Menu===============");
			System.out.println("(1) Change x from current value: "+P.x);
			System.out.println("(2) Change n from current value: "+P.n);
			System.out.println("(3) Calculate exp");
			System.out.println("(4) Exit the program");
			System.out.println("==============Main Menu===============");
			int k=scan.nextInt();
			switch(k){
			case 1:{
				System.out.println("The value for x:");
				P.x=scan.nextDouble();
				break;
			}
			case 2:{
				System.out.println("The value for n:");
				P.n=scan.nextDouble();
				break;
			}
			case 3:{
				System.out.println("The value of e^"+P.x +" is:"+P.Exp(P.x,P.n));
				break;
			}
			case 4:{
				check=false;
				break;
			}
			default:{
				System.out.println("Input is not valid!");
				break;
			}
			}

		}
		return ;
	}
}
