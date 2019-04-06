//package lab5;

public class Sentence {

    private StringBuilder inputedText;
    private Splitter splitter;
    //private Splitter splitPunct;
    //private StringBuilder[] buffWords;
    //private StringBuilder[] buffPuncts;
    //private StringBuilder[] words;
    //private StringBuilder[] puncts;

    Sentence(StringBuilder inputedText) {
        this.inputedText = inputedText;
    }
    
    public StringBuilder[] getSentenceWords(){

        splitter = new Splitter(inputedText, 'w');
        //buffWords = splitWords.getSplitedText();
        //words = new Word[buffWords.length];
        //words = splitWords.getSplitedText();
/*
    	for (int i = 0; i < buffWords.length; i++) {
			words[i] = new StringBuilder(buffWords[i]);
		}
*/
		return splitter.getSplitedText();
    }


	/*public StringBuilder[] getSentencePuncts(){

        splitPunct = new Splitter(inputedText, 'p');
        //buffPuncts = splitPunct.getSplitedText();
        //puncts = new StringBuilder[buffPuncts.length];

    	for (int i = 0; i < buffPuncts.length; i++) {
			puncts[i] = new Punctuation(buffPuncts[i]);
		}
		return splitPunct.getSplitedText();	
    }  */
    
    
}
