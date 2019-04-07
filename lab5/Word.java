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
        return splitter.getSplitedText();
	}

    public StringBuilder joiner(StringBuilder [] arr, int len){
        return splitter.joiner(arr, len);
    }
}
