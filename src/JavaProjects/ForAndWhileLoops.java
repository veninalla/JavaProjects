package JavaProjects;

public class ForAndWhileLoops {
	
	public static void main (String[] args) {
	}
	
	public static String method1(int n){
		 if (n <= 0){
			 return n+ "";
		 }
			
		 if(n%3==0 && n%5==0){
				return("ping pong");
		 }
		   else if(n%3 == 0){
			return("ping");
		}
		   else if(n%5 == 0){
			return("pong");
		}
		  else{
			return(n + "");
		}
	
	}
}

