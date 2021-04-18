package arraysandstrings;

public class StrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(strStr("mississippi","issipi"));

	}
	 public static int strStr(String haystack, String needle) {
	        
	        int j=0; //haystack
	       int i = 0;//needle
	      
	           if(needle.equals(""))return 0;
	        if(needle.length()>haystack.length()) return -1;
	           while(j<haystack.length() && i<needle.length()){
	        	   System.out.println("j and i are - "+ j +",,"+i);
	               while(j<haystack.length() && i<needle.length() && haystack.charAt(j)==needle.charAt(i)){
	            	   System.out.println("j and i in inner loop are - "+ j +",,"+i);
	                   i++; j++;
	                  if(i==needle.length()){
	                     
	                      return j-i;
	                  }                
	        }
	           if(i>0){
	               j=j-i+1;
	               i=0;
	           }else
	               j++;
	           }               
	        
	        return -1;
	        
	        
	    }

}
