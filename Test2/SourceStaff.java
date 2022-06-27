package Test2;


public class SourceStaff {
	
		
		 public String handleException(Activity a)
		 {
		 String s1=a.string1;
		 String s2=a.string2;
		 String s3=a.operator;
		 try
		 {
		 if(s1==null||s2==null)
		 throw new NullPointerException("Null values found");
		 else if(s3!="+"&&s3!="-")
		 throw new MyException(s3);
		 }
		 catch(NullPointerException e)
		 {
		 return e.getMessage();
		 }
		 catch(MyException ex)
		 {
		 return ex.getMessage();
		 }
		 return "No Exception Found";
		 }
		 public String doOperation(Activity a)
		 {
		 String s1=a.string1;
		 String s2=a.string2;
		 String s3=a.operator;
		 String s = "";
		 switch(s3)
		 {
		 case "+":s=s1+s2;
		 break;
		 case "-":s=s1.replace(s2,"");
		 break;
		 }
		 return s;
		 }
		 
		public static void main(String args[] ) throws Exception {
		
		}
		}
