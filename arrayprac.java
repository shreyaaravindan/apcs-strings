
public class arrayprac {

	public static void main(String[] args) {
		 String[] names = {
				 "Shreya Aravindan",
				 "Aadya Nair",
				 "Srinidhi Yelimati",
				 "Sathvika Sangoju",
				 "Kalpana Sundaram",
				 "Shriya Ramanujam",
				 "Shrikha Balaji",
				 "Anvitha Ramanujam",
				 "Krishtika Kalyanaraman",
				 "Harshini Venkat"	 
		 };
		 
		 String firstnames[] = new String[10];
		 String lastnames[] = new String[10];
		 
		 for(int i=0; i<names.length; i++){
			 int space = (names[i].indexOf(" "));
			 firstnames[i] = names[i].substring(0, space);
			 lastnames[i] = names[i].substring(space);
			 
			 
		 }
		 for(int i=0; i<firstnames.length; i++){
			 System.out.println(firstnames[i] + lastnames[i]);
			 
		 }
	
		 for(int i = 0; i<lastnames.length; i++) {
			 
		 }
				 
				 
		 }
		                   
	

	}


