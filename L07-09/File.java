public class File{
    private String name;
    private String type;
    private int sizeInBytes;
    
    public void setName(String name){
        this.name=name;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setSizeInBytes(int size){
        this.sizeInBytes=size;
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public int getSizeInBytes(){
        return this.sizeInBytes;
    }
    public String toString(){
        return "Name: " + this.name + " Type: " + this.type + " Size (in bytes): " + this.sizeInBytes; 
    }
    
    File(String name, String type, int sizeInBytes){
        this.setName(name);
        this.setType(type);
        this.setSizeInBytes(sizeInBytes);
    }
}
