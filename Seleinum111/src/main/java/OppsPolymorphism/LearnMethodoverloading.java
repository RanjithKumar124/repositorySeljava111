package OppsPolymorphism;

public class LearnMethodoverloading {

	public void overloading(String Name) {
		System.out.println(Name);
			}
	public void overloading(int date,String Data,boolean r) {
		System.out.println(date+" "+Data+" "+r);
			}
	public void overloading() {
		System.out.println("No arguments");
	}
	public void overloading(String url,int value,boolean s) {
		System.out.println(url+" "+value+" "+s);
	}
	public static void main(String[] args) {
		LearnMethodoverloading mol=new LearnMethodoverloading();
		
		mol.overloading();
		mol.overloading("Mike Ross");
		mol.overloading(14, "MOL", true);
		mol.overloading("udemy", 22, true);
		
				}
}

