import com.aluracursos.audio.models.MyFavourites;
import com.aluracursos.audio.models.Podcast;
import com.aluracursos.audio.models.Song;

public class Main {
    public static void main(String[] args) {
        Song mySong = new Song();
        mySong.setTitle("Far beyond the sun");
        mySong.setArtist("Yngwie Malmsteen");

        Podcast myPodcast = new Podcast();
        myPodcast.setHost("Gaby Hawryluk");
        myPodcast.setTitle("Literature in the world");

        for (int i = 0; i < 100; i++) {
            mySong.iLike();
        }

        for (int i = 0; i < 100; i++) {
            mySong.play();
        }

        for (int i = 0; i < 5000; i++) {
            myPodcast.iLike();
        }

        for (int i = 0; i < 5000; i++) {
            myPodcast.play();
        }

        System.out.println("Total likes for '" + mySong.getTitle() + "' is: " + mySong.getLikes());
        System.out.println("Total likes for '" + myPodcast.getTitle() + "' is: " + myPodcast.getLikes());

        MyFavourites favourites = new MyFavourites();
        favourites.add(mySong);
        favourites.add(myPodcast);
    }
}