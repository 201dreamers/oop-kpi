//package lab5;

public class Word {

    private StringBuilder inputedText;
    private Splitter splitter;
    private StringBuilder[] buff;
    private Letter[] letters;

    public Word(StringBuilder inputedText) {
        this.inputedText = inputedText;
    }
    


    public StringBuilder[] getWords(){

        splitter = new Splitter(inputedText, 'l');
        //buff = splitter.getSplitedText();
        //letters = new Letter[buff.length];
		/*for (int i = 0; i < buff.length; i++) {
			letters[i] = new Letter(buff[i]);
		}*/
		return splitter.getSplitedText();
	}	
}
