//package lab5;

import java.util.regex.*;

public class Splitter {

  private StringBuilder text;
  private Pattern sPattern;
  private Matcher sMatch;
  private int count = 0;
  private StringBuilder[] splitedText;
  private StringBuilder[] arr;

  public Splitter(StringBuilder text, char splitOn){
    this.text = text;
    switch (splitOn) {
      case 's':
        sPattern = Pattern.compile("[a-zA-Z1-90\\-\\_\\ &&[^\\.\\?\\!]]+");
        break;
      case 'w':
        sPattern = Pattern.compile("(\\b[a-zA-Z]+\\b)|([\\.\\?\\!]{1,3})");
        break;
      case 'l':
        sPattern = Pattern.compile("[a-zA-Z1-90]{1}");
        break;
    }
  } //Splitter constructor

  public Splitter (StringBuilder[] arr){
    this.arr = arr;
  }


  //sPattern = Pattern.compile("[a-zA-Z1-90\\-\\_\\ &&[^\\.\\?\\!]]+");
  //sMatch =


  public StringBuilder [] getSplitedText(){

    sMatch = sPattern.matcher(text);
    while(sMatch.find()) count++;
    splitedText = new StringBuilder[count];
    int i = 0;
    sMatch = sPattern.matcher(text);

    while (sMatch.find()) {
      splitedText[i] = new StringBuilder(text.substring(sMatch.start(), sMatch.end()));
      i++;
      if (i == count) break;
    } //END while

    return splitedText;
  } //StringBuider [] getSplitedText() method

  public StringBuilder joiner(){
    StringBuilder buff = new StringBuilder("");
    for (int i = 0; i < arr.length; i++){
      buff.append(arr[i]);
    }
    return buff;
  }

} //Splitter class
