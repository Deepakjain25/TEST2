package Test2;

public class SourceJobAgency {
	 
		String searchForJob(int age, String highestQualification) throws NotEligibleException
		{
		String s= "";
		if(age>=200||age<=0)
		{
		 throw new NotEligibleException("The age entered is not typical for a human being");
		}
		else{
		s=CompanyJobRepository.getJobPrediction(age,highestQualification);
		}
		return s;
		}
		public static void main(String args[] ) {
		}

}
