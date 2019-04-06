/* package lab5; */
import java.lang.*;

public class Main{
    public static void main (String [] args){
    	int wordlen = 4;
    	if (wordlen <= 0){
			System.out.println("<wordlen> is equal 0. Please change it and restart this program.\n Exiting...");
			System.exit(1);
		}
		StringBuilder inputedText = new StringBuilder("some text input. Here oop dog? Cat fire house regular expression.");
    	Text text = new Text(inputedText);
    	Sentence sentence = new Sentence(inputedText);
    	StringBuilder [] wordsArr = sentence.getSentenceWords();

    	for (int i = 0; i < wordsArr.length; i++){
    		if (wordsArr[i].length() == wordlen) {
				for(int j = i; j < wordsArr.length-1; j++){
					wordsArr[j] = wordsArr[j + 1];
				}
			}
    	}
		Splitter splitter = new Splitter(wordsArr);
    	System.out.println("Result - " + splitter.joiner() );
    }
}



/*		
		Pattern pat = Pattern.compile("\\b[a-z&&[^aeyuoi]].{" + (wordlen-1) + "}\\b", 2); //Pattern.CASE_INSESITIVE);
		Matcher mat = pat.matcher(text);

		while (mat.find()) {
			startind=mat.start();
			endind=mat.end();
			text.delete(startind, endind);
			mat = pat.matcher(text);
		}

		System.out.println(text);
*/