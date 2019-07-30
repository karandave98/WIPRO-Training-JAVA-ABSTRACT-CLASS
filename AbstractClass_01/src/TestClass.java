
public class TestClass {

	public static void main(String[] args) {
		ICICIBank i = new ICICIBank();
		System.out.print("ICICI Bank\'s Interest Rate :");
		System.out.println("Savings Interest Rate :" + i.getSavingsInterstRate() +"%   &  "+"Fixed Deposit Interest Rate: "+i.getFixedDepositInterstRate()+"%");
		
		KotakMBank k = new KotakMBank();
		System.out.print("KotakM Bank\'s Interest Rate :");
		System.out.println("Savings Interest Rate :" + k.getSavingsInterstRate() +"%   &  "+"Fixed Deposit Interest Rate: "+k.getFixedDepositInterstRate()+"%");
		
		GeneralBank g = new ICICIBank();
		System.out.print("ICICI Bank\'s Interest Rate using GeneralBank Class :");
		System.out.println("Savings Interest Rate :" + g.getSavingsInterstRate() +"%   &  "+"Fixed Deposit Interest Rate: "+g.getFixedDepositInterstRate()+"%");
		
		GeneralBank g1 = new KotakMBank();
		System.out.print("KotakM Bank\'s Interest Rate using GeneralBank Class :");
		System.out.print("Savings Interest Rate :" + g1.getSavingsInterstRate() +"%   &  "+"Fixed Deposit Interest Rate: "+g1.getFixedDepositInterstRate()+"%");
		
	}

}
