package Assignment;

public class Song {
    private final String id;
    private final String title;
    private final String releaseYear;
    private final String musicFileURL;
    private Genre genre;
    private Artist artist;
    private Album album;

    public Song(String id, String title, String releaseYear, String musicFileURL) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.musicFileURL = musicFileURL;
        this.genre = Genre.UNDEFINED;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void printInfo(int detailLevel) {
        System.out.println("Song Title: " + title);
        System.out.println("Release Year: " + releaseYear);
        if (genre != Genre.UNDEFINED) {
            System.out.println("Genre: " + genre);
        }

        if (detailLevel >= 1 && artist != null) {
            artist.printArtistInfo();
        }

        if (detailLevel >= 2 && album != null) {
            album.printAlbumInfo();
        }
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public String getMusicFileURL() {
        return musicFileURL;
    }
}
