import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		String nome1 = sc.nextLine();
		String nome2 = sc.nextLine();
		String nome3 = sc.nextLine();
		
	
		
	if (nome1.equals("vertebrado")) {
			if(nome2.equals("ave")){
			   if(nome3.equals("carnivoro")) {
			     System.out.println("aguia");
			     }
			
			       else   {
				           System.out.println("pomba");
			             }
			  
			  }
		     else {
			      if(nome3.equals("onivoro")) {
					            System.out.println("homem");
				              }
		                       else {
					                 System.out.println("vaca");
				                    }
			             
	           }
	   }
	     else {
                if(nome1.equals("invertebrado")) {
    	           if(nome2.equals("inseto")) {
    		          if(nome3.equals("hematofago")) {
    			          System.out.println("pulga");
    		             }
    		              else {
    			                System.out.println("lagarta");
    		                   }
    	            }
    		          else {
    			           
    				           if(nome3.equals("hematofago")) {
    					           System.out.println("sanguessuga");
    				              }
    				                else {
    					                  System.out.println("minhoca");
    				                     }
    			               }
    		              
               }
	     }
		sc.close();
	}

}
