
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String name, String artist, int durationInSeconds) {
        this.name = name;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
    }
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Song)) {
            return false;
        }

        Song comparedSong = (Song) compared;

        return this.artist.equals(comparedSong.artist) &&
               this.name.equals(comparedSong.name) &&
               this.durationInSeconds == comparedSong.durationInSeconds;
}

    @Override
    public String toString() {
        return "Song<" + this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)>";
    }


}
