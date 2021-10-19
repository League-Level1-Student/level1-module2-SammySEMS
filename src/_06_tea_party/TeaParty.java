package _06_tea_party;

public class TeaParty {
	
	   
		public String welcome(String name, boolean isWoman, boolean isKnighted) {
			String greeting = "Hello " ;
			if(isWoman=true) {
				if(isKnighted=true) {
					return "Lady";
				}
				else{
					
						return "Ms.";
			}
			}
				
			else if(isWoman=false){
				if(isKnighted=false) {
					return "Mr.";
				}
				else {
					return "Sir";
				}
				
			
			}
	        
	        
	        
	    	
	    return greeting;
	}}

