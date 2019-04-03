//package lab5;

import java.util.regex.*;

public class Splitter {
  
  Splitter(StringBuilder text, char splitOn){
    this.text = text;
    switch (splitOn){
      case 's' : 
        this.sPattern = Pattern.compile("[a-zA-Z1-90\\-\\_\\ &&[^\\.\\?\\!]]+");
        break;
      case 'w' :
        this.sPattern = Pattern.compile("\\b[a-zA-Z]+\\b");
        break;
      case 'l' :
        this.sPattern = Pattern.compile("[a-zA-Z1-90]{1}");
        break;
      case 'p' :
        this.sPattern = Pattern.compile("[\\.\\?\\!]{1,3}");
        break;
    }
    sMatch = this.sPattern.matcher(text);
    while(sMatch.find()) count++;
    splitedText = new StringBuilder[count];
  } //Splitter constructor
  
  private StringBuilder text;
  private Pattern sPattern;
  private Matcher sMatch;
  private int count = 0;
  private StringBuilder[] splitedText;
  
  StringBuilder [] getSplitedText(){
    int i = 0;
    sMatch = this.sPattern.matcher(text);
    while (sMatch.find()) {
      splitedText[i] = new StringBuilder(text.substring(sMatch.start(), sMatch.end()));
      i++;
      if (i == count) break;
    } //END while
    return splitedText;
  } //StringBuider [] getSplitedText() method
  
} //Splitter class
