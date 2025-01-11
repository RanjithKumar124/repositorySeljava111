package OppsPolymorphism;

import static org.testng.Assert.assertEquals;

public class Stinglearnmethods {
	
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
			 //o/p is equal because string char of the contains same
		    
		    String slname=new String("LoseSuits");
		    
		    //object ot object
		    
		    if(lsNmae==slname) {
		    	System.out.println("it is equal in Object");
		    }else {
				 System.out.println("not equal Object");
				 
				}
		    //o/p is not equal because use New to save the value in diff locatio
		    //so the address of the value will not in same location
		    
		    //equalIngoreCase
		    //it with ingore case caps and small. will check the value are equal
		    
		    String casee="LosesuiTs";
		    if (casee.equalsIgnoreCase(slname)) {
		    	System.out.println("it is equalIgnoreCase");
		    }else {
				 System.out.println("not equalIngonreCase");
				 
				}
		    //tocharArray (to convert the value or int to char 
		    String sname="RanjithKumar";
		    	
		    	char[] cArray = sname.toCharArray();
		    for (int i = cArray.length-1 ; i >=0 ; i--) {
		    	System.out.print(cArray[i]);
		    }
		    
		    	for (int j = 0; j < cArray.length; j++) {
					System.out.print(cArray[j]);
				
				
			}
		}
		

	}



