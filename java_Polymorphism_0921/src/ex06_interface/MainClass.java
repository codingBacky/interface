package ex06_interface;

public class MainClass {

	public static void main(String[] args) {

		Printable printable = new LPrinter();
		String mg = "message";
		printable.print(mg);
		
		printable = new SPrinter();
		printable.print(mg);
		
		CSPrint c = new SPrinter();
		c.cprint(mg);
		c.print(mg);
		
		Printable p = new SPrinter();
		p.print(mg);
		
	}

}
