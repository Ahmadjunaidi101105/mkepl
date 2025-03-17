package Assignment;

public class Artist {
    private final String name;
    private final String alias;
    private final String imageURL;

    public Artist(String name, String alias, String imageURL) {
        this.name = name;
        this.alias = alias;
        this.imageURL = imageURL;
    }

    public void printArtistInfo() {
        System.out.println("Artist Name: " + name);
        if (!alias.isEmpty()) {
            System.out.println("Also Known As: " + alias);
        }
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public String getImageURL() {
        return imageURL;
    }
}
