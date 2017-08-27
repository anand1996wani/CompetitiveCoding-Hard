/*
Question :
	Reverse the word of a string but the relative position of the special characters should not be changed. 

*/


public class HelloWorld{

     public static void main(String []args){

        String new_string = "Quanta,      Probability ----- Reasoning & CS.";
		String string = "";
		int start = 0,s_new = 0;
		String [] array = new String[100];
		String [] queue = new String[100];
		int top = 0;
		int q = 0;
		boolean a = true,e = true;
		for(int i = 0;i<new_string.length();i++){ 
			if((new_string.charAt(i) >= 92 && new_string.charAt(i) <= 122)||(new_string.charAt(i) >= 65 && new_string.charAt(i) <= 90)){
				if(a==false){
					start = i;
					queue[q++] = new_string.substring(s_new,i);
				}
				a = true;
				e = false;
			}
			else{
				e = true;
				if(a==true && e==true){
				s_new = i;
				a = false;
				array[top++] = new_string.substring(start,i);
				start = i;
				}
			}
				
		}
		queue[q++] = ".";
		int k = top-1;
		for(int j = 0;j<q;j++){
		    System.out.print(array[k--]);
			System.out.print(queue[j]);
		}
		System.out.println();
     }
}