package umbcs680.hw10;
public class LinkCommand implements FileSystemCommand {
    private Link link;

    public LinkCommand(Link link) {
        this.link = link;
    }

    @Override
    public void execute() {
        System.out.println("Link " + link.getName() + " points to: " + link.getTarget());
    }
}
