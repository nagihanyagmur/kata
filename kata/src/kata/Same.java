package kata;

public class Same {
	
	public  int mxdiflg(String[] a1, String[] a2) {
	     int enbuyuk=a2[0].length();
		        for(int t=1;t<a2.length;t++){
		            if(a2[t].length()>enbuyuk){
		            	enbuyuk=a2[t].length();
		            }
		        }
		       
		       
		       int enkucuk=a1[0].length();
		        for(int a=1;a<a1.length;a++){
		            if(a1[a].length()<enkucuk){
		            	enkucuk=a1[a].length();
		            }
		        }
	          return enbuyuk-enkucuk;

	    }

	

}
