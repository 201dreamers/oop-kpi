//package lab5;

public class Sentence {
    Sentence(StringBuilder inputedText) {
        this.inputedText = inputedText;
    }
    
    private StringBuilder inputedText;
    private Splitter splitWords = new Splitter(inputedText, 'w');
    private Splitter splitPunct = new Splitter(inputedText, 'p');
    private StringBuilder[] buffWords = splitWords.getSplitedText(); 
    private StringBuilder[] buffPuncts = splitPunct.getSplitedText();
    private Word[] words = new Word[buffWords.length];
    private Punctuation[] puncts = new Punctuation[buffPuncts.length];
    
    public Word[] getSentenceWords(){
    	for (int i = 0; i < buffWords.length; i++) {
			words[i] = new Word(buffWords[i]);
		}
		return words;	
    }

	public Punctuation[] getSentencePuncts(){
    	for (int i = 0; i < buffPuncts.length; i++) {
			puncts[i] = new Punctuation(buffPuncts[i]);
		}
		return puncts;	
    }    
    
    
}
