//package lab5;

public class Text{
    Text(StringBuilder inputedText) {
        this.inputedText = inputedText;
    }
    
    private StringBuilder inputedText;
    private Splitter splitter = new Splitter(inputedText, 's');
    private StringBuilder[] buff = splitter.getSplitedText();
    private Sentence[] sentences = new Sentence[buff.length];
    
    public Sentence[] getText(){
		for (int i = 0; i < buff.length; i++) {
			sentences[i] = new Sentence(buff[i]);
		}
		return sentences;
	}
    
}
