package JavaOops;

public class Internetexp extends RemotedriverGP {
	
	public void Internet() {
		System.out.println("InternetExp Parent");
	}
	
	public void Opera() {
		System.out.println("Opera Parent");
	}

	public static void main(String[] args) {
		Internetexp IE=new Internetexp();
		
		IE.Internet();
		IE.Remotedriver();
		IE.Opera();
		
	
		
		
	}
}
