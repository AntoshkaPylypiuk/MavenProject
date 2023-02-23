public class Road {
    private int length;
    private String type;

    public Road(int length, String type){
        this.length = length;
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength (int length){
        this.length = length;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
}
