class RBIAtm{
	void deposit() {
		System.out.println("Account holder deposits money");
	}
	void checkBalance() {
		System.out.println("Account Holder checks Balance");
	}
	void withdraw() {
		System.out.println("Account holder withdraws the amount");
	}
}

class SBIAtm extends RBIAtm{
	@Override
	void deposit() {
		System.out.println("SBI Account holder deposits in SBI Atm");
	}
	@Override
	void checkBalance() {
		System.out.println("SBI Account Holder checks Balance in SBI Atm");
	}
	@Override
	void withdraw() {
		System.out.println("SBI Account holder withdraws the amount in SBI Atm");
	}
}

class CanaraAtm extends RBIAtm{
	@Override
	void deposit() {
		System.out.println("Canara Account holder deposits in Canara Atm");
	}
	@Override
	void checkBalance() {
		System.out.println("Canara Account Holder checks Balance in Canara Atm");
	}
	@Override	
	void withdraw() {
		System.out.println("Canara Account holder withdraws the amount in Canara Atm");
	}	
}

class ICICIAtm extends RBIAtm{
	@Override
	void deposit() {
		System.out.println("ICICI Account holder deposits in ICICI Atm");
	}
	@Override
	void checkBalance() {
		System.out.println("ICICI Account Holder checks Balance in ICICI Atm");
	}
	@Override
	void withdraw() {
		System.out.println("ICICI Account holder withdraws the amount in ICICI Atm");
	}	
}
class OrionMall{
	static void allow(RBIAtm r) {
		r.deposit();
		r.checkBalance();
		r.withdraw();
	}
}
public class ATM {

	public static void main(String[] args) {
		SBIAtm s =new SBIAtm();
		CanaraAtm c=new CanaraAtm();
		ICICIAtm i=new ICICIAtm();
		
		OrionMall.allow(s);
		System.out.println();
		OrionMall.allow(c);
		System.out.println();
		OrionMall.allow(i);
	}
}
