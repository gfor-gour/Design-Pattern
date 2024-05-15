import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private int size;
    private List<FileSystemComponent> child;

    public Directory() {
        this.size = 0;
        child = new ArrayList<>();
    }

    public void add(FileSystemComponent component){
        child.add(component);
    }

    @Override
    public int file_size() {
        for (FileSystemComponent component : child) {
            size += component.file_size();
        }
        return size;
    }

}
