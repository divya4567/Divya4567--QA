package tutorial;

public class CompoundIntrest {
	public static void main(String args[]){
		int amount=10000;
		double intr=0.01, total;
		for(int month=1;month<3;month++){
		total= amount*Math.pow(1+intr, month);
		System.out.println("total amount with intrest is:"+ total);
		
	}

}
}