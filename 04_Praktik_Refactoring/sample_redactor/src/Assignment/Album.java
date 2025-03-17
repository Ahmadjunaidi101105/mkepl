package Assignment;

public class Album {
    private final String name;
    private final String coverURL;

    public Album(String name, String coverURL) {
        this.name = name;
        this.coverURL = coverURL;
    }

    public void printAlbumInfo() {
        System.out.println("Album Title: " + name);
    }

    public String getName() {
        return name;
    }

    public String getCoverURL() {
        return coverURL;
    }
}
