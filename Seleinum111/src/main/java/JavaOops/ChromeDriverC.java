package JavaOops;

public class ChromeDriverC extends EdgeDriverP{
	
	public void Chrome () {
		System.out.println("Chrome Driver Child");
	}

	public static void main(String[] args) {
		
		ChromeDriverC CD= new ChromeDriverC();
		
		CD.Remotedriver();
		CD.Edge();
		CD.Internet();
		CD.Chrome();
		CD.Opera();
		
		
		
		
		
	}

}
