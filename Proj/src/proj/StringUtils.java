package proj;

public class StringUtils {
	
	public static boolean isEmpty(String s) {
		
		if(s == null) {
			return true;
		}
		return s.trim().length() == 0;
	}
	//Segundo M�todo
	public static boolean isNotEmpty(String s) {
		
		return !isEmpty(s);
	}
	

}
