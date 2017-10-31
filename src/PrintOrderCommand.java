
public class PrintOrderCommand {
	PrintOrder p;
	public PrintOrderCommand(PrintOrder p) {
		// TODO Auto-generated constructor stub
		this.p = p;
	}
	
	public boolean execute(String s) {
		return p.printOrder(s);
	}
	
	public boolean execute(int x) {
		System.out.println("NULL");
		return false;
	}
	
	public boolean execute() {
		System.out.println("NULL");
		return false;
	}

}
