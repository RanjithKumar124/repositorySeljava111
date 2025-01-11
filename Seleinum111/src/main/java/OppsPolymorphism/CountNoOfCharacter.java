package OppsPolymorphism;

public class CountNoOfCharacter {

	public static void main(String[] args) {


		String name="AWS Amazon work Space";
		
		int count=0;
		int counto=0;
		char[] ch = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] =='a') {
				count++;
			}else if(ch[i]=='o') {
				counto++;
			}
			}
		System.out.println("totlal number of a presented:"+count);
		System.out.println("totlal number of o is presented:"+counto);
	}

}
