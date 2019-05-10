public abstract class MusicTrack {

    private String name;
    private int length;
    private String styleName;

    public MusicTrack(String name, int length, String styleName){
        if (name == null) {
            System.out.println("Name cannot be null");
            System.exit(1);
        }
        if (length <= 0) {
            System.out.println("Length cannot be less than zero");
            System.exit(1);
        }
        this.name = name;
        this.length = length;
        this.styleName = styleName;
    }

    public String getName(){
        return name;
    }

    public int getLength() {
        return length;
    }

    public String getStyleName(){
        return styleName;
    }
}
