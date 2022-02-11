package phase1;
class ExceptionHandler{  
  void m(){  
    int data=50/0;  
  }  
  void n(){  
    m();  
  }  
  void p(){  
	  try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handled");}  
		  }  
		  public static void main(String args[]){  
		   ExceptionHandler obj=new ExceptionHandler ();  
		   obj.p();  
		   System.out.println("normal flow...");  
		  }  
  }