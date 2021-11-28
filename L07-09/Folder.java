import java.util.ArrayList;
import java.util.Arrays;
public class Folder{
    private String name;
    private ArrayList<File> files = new ArrayList<File>();
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    Folder(String name){
    this.setName(name);
    }
    public void addFile(File file){
        files.add(file);
    }
    public void removeFile(File file){
        files.remove(file);
    }
    public void display(){
        for (File i : files){
            System.out.println(i);
        }
    }
    
    public static void main(String[] args){
        Folder folder1 = new Folder("folder");
        File file1 = new File("text",".txt",25555);
        File file2 = new File("photo",".jpg",2554545);
        folder1.addFile(file1);
        folder1.addFile(file2);
        folder1.display();
        File file3 = new File("text2", ".txt",12356);
        folder1.addFile(file3);
        folder1.display();
        folder1.removeFile(file1);
        folder1.display();
    }
}
