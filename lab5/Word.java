//package lab5;

public class Word {
    public Word(StringBuilder inputedText) {
        this.inputedText = inputedText;
    }
    
    private StringBuilder inputedText;
    private Splitter splitter = new Splitter(inputedText, 'l');
    private StringBuilder[] buff = splitter.getSplitedText();
    private Letter[] letters = new Letter[buff.length];

    public Letter[] getWords(){
		for (int i = 0; i < buff.length; i++) {
			letters[i] = new Letter(buff[i]);
		}
		return letters;
	}	
}
