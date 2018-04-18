
public class Main {

	public static void main(String[] args) {

		//stringToReverse("string reverse");	
		//occuranceOfCharacter("occurance count", 'c');	
		//occuranceOfString("oop java java", "java");
		//revereStringCase("WElcOMe jAvA");
		//revereUsingStringBuilder("reverse");
		//insertUsingStringBuilder("please in this string");
		replaceUsingStringBuilder("please replace in this string");
 }
	
	public static void stringToReverse(String sOriginal)
	{
		String sTemp= new String();
		for(int i=1 ; i<sOriginal.length()+1 ; i++ )
		{
		   sTemp = sTemp + sOriginal.charAt(sOriginal.length() - i) ;
		}
		
		System.out.println("Reverse of the String =" + sTemp);
	}
	
	public static void occuranceOfCharacter(String sOriginal, char sCharacter)
	{
		int iOccuranceCount = 0 ;
		for(int i=0 ; i<sOriginal.length() ; i++ )
		{
			if(sOriginal.charAt(i) == sCharacter )
			{
				iOccuranceCount++;
			}
		}
		
		System.out.println("Occurance of character is =" + iOccuranceCount);
	}
	
	public static void occuranceOfString(String sOriginal, String sOccuranceCheck)
	{
		int iOccuranceCount = 0 ;
		for(int i=0 ; i<sOriginal.length() ; i++ )
		{
			if(sOriginal.indexOf(sOccuranceCheck) > 0)
			{
				iOccuranceCount = sOriginal.indexOf(sOccuranceCheck);
				break;
			}
		}
		
		System.out.println("Occurance of character is =" + iOccuranceCount);
	}
	
	public static void revereStringCase(String sOriginal)
	{
		String sTemp= new String();
		for(int i=0 ; i<sOriginal.length() ; i++ )
		{
			if(sOriginal.charAt(i) > 64 && sOriginal.charAt(i) <= 90)
			{
				String sToUpper = String.valueOf(sOriginal.charAt(i));
				sTemp = sTemp + sToUpper.toLowerCase();
			}
			else
			{
				String sToLower = String.valueOf(sOriginal.charAt(i));
				sTemp = sTemp + sToLower.toUpperCase();
			}
			
		}
		
		System.out.println("Reverse String case is =" + sTemp);  	
	
	}
	
	
	public static void revereUsingStringBuilder(String sOriginal)
	{
		StringBuilder sBuilder = new StringBuilder(sOriginal);
		System.out.println("Reverse of provided String =" + sBuilder.reverse());  	
	
	}
	
	public static void insertUsingStringBuilder(String sOriginal)
	{
		StringBuilder sBuilder = new StringBuilder(sOriginal);
		System.out.println("Reverse of provided String =" + sBuilder.insert(7, "insert"));  	
	
	}
	
	public static void replaceUsingStringBuilder(String sOriginal)
	{
		StringBuilder sBuilder = new StringBuilder(sOriginal);
		System.out.println("Reverse of provided String =" + sBuilder.replace(7, 15, "insert"));  	
	
	}
	
}
