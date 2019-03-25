import java.util.regex.*;


class Main {
	
	//#public static StringBuilder[] split(StringBuilder line){
		//pattern for split by symbol -- "^.+\\s" "\\s.+\\s" "" ----------------  \\b
	//}
	
	public static void main(String[] args){
		StringBuilder text = new StringBuilder("some text input here oop dog cat fire house regular expression");
		int wordlen = 4;
		//[a-z&&[^aeyuoi]]  [qwrtpsdfghjklzxcvbnm]
		if (wordlen <= 0){
			System.out.println("<wordlen> is equal 0. Please change it and restart this program.\n Exiting...");
			System.exit(1);
		}

		Pattern pat = Pattern.compile("\\b[a-z&&[^aeyuoi]].{" + (wordlen-1) + "}\\b", 2); //Pattern.CASE_INSESITIVE);
		Matcher mat = pat.matcher(text);
		int startind;
		int endind;
		
		while (mat.find()) {
			startind=mat.start();
			endind=mat.end();
			text.delete(startind, endind);
			mat = pat.matcher(text);
		}
		
		System.out.println(text);
				
	}
}
