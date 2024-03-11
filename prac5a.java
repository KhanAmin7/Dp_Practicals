import java.util.List;
import java.util.ArrayList;

class FileSystemItem {
    String name;
    public String getName() {
        return name;
    }
}

class File extends FileSystemItem {
    public File(String name) {
        this.name = name;
    }
}

class Folder extends FileSystemItem {
    List<FileSystemItem> children;
    
    public Folder(String name) {
        this.name = name;
        children = new ArrayList<>();
    }
    
    public void addChild(FileSystemItem item) {
        children.add(item);
    }
}

public class prac5a {
    public static void main(String[] args) {
        Folder root = new Folder("Root");
        root.addChild(new File("file.txt"));
        Folder folder1 = new Folder("folder1");
        root.addChild(folder1);

        for (FileSystemItem item : root.children) {
            System.out.println(item.getName());
        }
    }
}
