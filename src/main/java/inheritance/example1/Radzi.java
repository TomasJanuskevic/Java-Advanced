package inheritance.example1;

public class Radzi extends Singer {

    public void singLikeRadzi() {
        System.out.println("Ka daryt");
    }

    @Override
    protected void singCommonSong() {
        System.out.println("Dainuoju su akcentu popular song");
    }
}
