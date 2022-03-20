package week5day1;

public class Axisbank extends Bankinfo{

	public void deposit() {
		super.deposit();
		System.out.println("Deposit amount is investment");}
	public static void main(String[] args) {
Axisbank axis =new Axisbank();
axis.saving();
axis.fixed();
axis.deposit();
	}
}