package umbcs680.hw10;
public class Link implements FileSystemElement {
    private String name;
    private String target;

    public Link(String name, String target) {
        this.name = name;
        this.target = target;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getTarget() {
        return target;
    }
}
