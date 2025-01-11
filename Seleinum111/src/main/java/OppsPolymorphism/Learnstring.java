package OppsPolymorphism;

public class Learnstring {
	
	public static void main(String[] args) {
		
		//string literal
		
		String sName="LoseSuits";
		String name="Losesuits@2025";
		
		//string object or instantiation both are same
		
		String lsNmae=new String("LoseSuits");
	    
	    //lenght 
		
		int li = name.length();
		System.out.println("lenght of the string name:"+ li);
		
		int ls = lsNmae.length();
		System.out.println("lenght of Ls name sting:"+ ls);
		
		
	    //chaAt (index value start form 0 (chatAt to find index value)
		//Losesuits@2025   
		//01234567891011121314 index value of losesuits
		char chA = name.charAt(5);
		System.out.println("index value of 5 in name:"+ chA);
		
		//contians (contains to check the string Character (LoseSuits)
	
		boolean ctns = lsNmae.contains("Lose");
		System.out.println("Checking the character in the String:"+ctns);
	
		//equals  (.equals check the string char in both literal and object
		// .equals
		if(sName.equals(lsNmae)) {
			 System.out.println("it is equals");
		 }else {
			 System.out.println("not equals");
			 
			}
		
		//what is diff b/w .equals and ==
		//TestLeaf==TestLeaf  check the char or string are same
		//== => will check memory address the value  
        //==  	(check in literal to object  address value will change 
		if(sName==lsNmae) {
			 System.out.println("it is equal");
		 }else {
			 System.out.println("not equal");
			 
			}
		//== 
		
		String namme="Losesuits@2025"; //literal
		//checking in b/w literal to literal
	 
	    if(name==namme) {
			 System.out.println("it is equal in literal");
		 }else {
			 System.out.println("not equal literal");
			 
			}
		 //o/p is equal because string char of the cont
	}
	

}
