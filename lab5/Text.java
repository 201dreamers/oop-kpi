//package lab5;

public class Text{

    private StringBuilder inputedText;
    private Splitter splitter;
    private StringBuilder[] buff;
    private Sentence[] sentences;

    public Text(StringBuilder inputedText) {
        this.inputedText = inputedText;
    }

    public StringBuilder[] getText(){

        splitter = new Splitter(inputedText, 's');
        //buff = splitter.getSplitedText();
        //sentences = new Sentence[buff.length];
/*
		    for (int i = 0; i < buff.length; i++) {
			       //sentences[i] = new Sentence(buff[i]);
		    }
            */
        return splitter.getSplitedText();
    }

}
