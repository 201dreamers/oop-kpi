import java.util.Random;


class SportEquipment{
  String gameName;
  int count;
  int price;
  String title;
  String color;

  SportEquipment(int count, int price, String title, String color, String gameName){
    this.gameName = gameName;
    this.count = count;
    this.price = price;
    this.title = title;
    this.color = color;
  }

}//SportEquipment

public class Main{
  public static void main(String[] args){
    String [] titleArray = {"ball", "bite", "hoop", "racuet", "net"};
    String [] colorArray = {"blue", "red", "green", "yellow", "black"};
    String [] gameNameArray = {"football", "basketball", "tennis", "baseball", "american football"};
    SportEquipment [] array = new SportEquipment[5];
    Random rand = new Random();
    
    for (int i = 0; i < array.length; i++){
      array[i] = new SportEquipment(rand.nextInt(49)+1, rand.nextInt(49)+1, titleArray[rand.nextInt(titleArray.length)], colorArray[rand.nextInt(colorArray.length)], gameNameArray[rand.nextInt(gameNameArray.length)]);
    }//for

	SportEquipment buff = new SportEquipment(0, 0, "", "", "");
    for (int i = 0; i < array.length; i++){
		for (int j = i; j < array.length; j++){
			if (array[i].price > array[j].price) {
				buff = array[i];
				array[i] = array[j];
				array[j] = buff;
			}
		}
	}
	
	for (int i = 0; i < array.length; i++){
      System.out.println("##########\nGame name - " + array[i].gameName);
      System.out.println("Color - " + array[i].color);
      System.out.println("Tile - " + array[i].title);
      System.out.println("Count - " + array[i].count);
      System.out.println("Price - " + array[i].price + "\n");
    }
	System.out.println("REVERSE\n");
	buff = new SportEquipment(0, 0, "", "", "");
	for (int i = array.length-1; i >= 0; i--){
		for (int j = i; j >= 0; j--){
			if (array[i].count > array[j].count) {
				buff = array[i];
				array[i] = array[j];
				array[j] = buff;
			}
		}
	}
    
    for (int i = 0; i < array.length; i++){
      System.out.println("##########\nGame name - " + array[i].gameName);
      System.out.println("Color - " + array[i].color);
      System.out.println("Tile - " + array[i].title);
      System.out.println("Count - " + array[i].count);
      System.out.println("Price - " + array[i].price + "\n");
    }
  }//main()
}//Main class

