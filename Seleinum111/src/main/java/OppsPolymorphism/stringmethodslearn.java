package OppsPolymorphism;

import java.nio.file.spi.FileSystemProvider;

public class stringmethodslearn {

	public static void main(String[] args) {
		
		String name="Lost Suits";
		
		//split (name.split("s") example s will split(delete where s is appears and will continue in nxt line
		// println used means will print in nxt line where s appeared remaining will print in nxt line  
		String[] split = name.split("s");
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
		//Lot Suit  outpu
		}
			
			System.out.println(); // it is used to print in nxtline
			
			//replaceAll
			String replaceAll = name.replaceAll("[t]", "@");
			System.out.print("replaceAll method :"+replaceAll);
			
			//o/p replaceAll method :Los@ Sui@s
			
			System.out.println();// it is used to print in nxtline
		
			//replace method. under single qouts single vaule can change (replace)
        String chrome="google chrome";
         String replace = chrome.replace('o', '1');
         System.out.print("replace method:" + replace);
			
        //o/p replace method:g11gle chr1me
         
         System.out.println(); // it is used to print in nxtline
         
         //SubString the index value start with 0
         
         //substring single index value to start
         String value="java substing index";
         
         String substringi = value.substring(2);
         System.out.println("substring single index:"+substringi);
          
         //length
         int length = value.length();
         System.out.println(length);
         
         System.out.println(); // it is used to print in nxtline
         
         //sub string with start and end index given to print in o/p
         //endindex - 1
         //20-1= 19
         String substringse = value.substring(2, 17);
         System.out.println("substring start and end inder give:"+substringse);
    //o/p  substring start and end inder give:va substing ind      
	
         //lowercase to uppercase
     
         String valuecase="AWS Amazon Work Space2025";
         
         //lowercase (convert all the value to lowercase
         String lowerCase = valuecase.toLowerCase();
         System.out.println(lowerCase);
         //o/p aws amazon work space
         
         //uppercase conver all the value to upper case)
         
         String upperCase = valuecase.toUpperCase();
         System.out.println(upperCase);
         //AWS AMAZON WORK SPACE  o/p
         
       String numb="2025";
       
       //string to int format (int no qoutes are used, ' single qoutes for char, " double qoutes of string
       int int1 = Integer.parseInt(numb);
       System.out.println(int1);
	   
	}
	
}


