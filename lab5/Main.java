/* package lab5; */
import java.lang.*;
import java.util.regex.*;

public class Main{
    public static void main (String [] args){
    	final int wordlen = 4;
    	if (wordlen <= 0){
			System.out.println("<wordlen> is equal 0. Please change it and restart this program.\n Exiting...");
			System.exit(1);
		}
		StringBuilder inputedText = new StringBuilder("some text input. Here oop dog? Cat fire house regular expression.");
    	Sentence sentence = new Sentence(inputedText);
    	StringBuilder [] wordsArr = sentence.getSentenceWords();
    	StringBuilder [] buffArr = wordsArr;
		int len = 0;
		//char [] parr = {'q', 'w', 'r', 't', 'p', ''};

    	for (int i = 0; i < wordsArr.length; i++){
    		if (wordsArr[i].length() == wordlen && Pattern.matches("[a-zA-Z&&[^aeyuoiAEYUOI]].{" + (wordlen-1) + "}", wordsArr[i])) {
				for(int j = i; j < wordsArr.length-1; j++){
					buffArr[j] = buffArr[j + 1];
				}
				len++;
				i = 0;
			}
    	}
    	StringBuilder txt = sentence.joiner(wordsArr, len);
		Pattern pat = Pattern.compile("[\\s]{2,}");
		Matcher mat = pat.matcher(txt);
	System.out.println(inputedText);
    	System.out.println(mat.replaceAll(" "));
    }
}