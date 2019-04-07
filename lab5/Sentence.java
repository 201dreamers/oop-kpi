//package lab5;

public class Sentence {

    private StringBuilder inputedText;
    private Splitter splitter;

    Sentence(StringBuilder inputedText) {
        this.inputedText = inputedText;
    }
    
    public StringBuilder[] getSentenceWords(){
        splitter = new Splitter(inputedText, 'w');
		return splitter.getSplitedText();
    }

    public StringBuilder joiner(StringBuilder [] arr, int len){
        return splitter.joiner(arr, len);
    }
}
