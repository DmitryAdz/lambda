package by.odinets.lambda5.collector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import by.odinets.lambda.sources.Album;
import by.odinets.lambda.sources.Artist;
import by.odinets.lambda.sources.Track;

public class CollectorLearning {

	public static void main(String[] args) {
		
		Artist artist11 = new Artist("Moscow", "11", "RU");
		Artist artist22 = new Artist("London", "22", "UK");
		Artist artist33 = new Artist("Paris", "33", "FR");
		Artist artist1 = new Artist("Moscow", "Ivan Fuckoff", "RU", Arrays.asList(artist11));
		Artist artist2 = new Artist("London", "Ringo Starr", "UK", Arrays.asList(artist11, artist22, artist33));
		Artist artist3 = new Artist("Paris", "Joe Dasin", "FR", Arrays.asList(artist11, artist22));
		Artist artist4 = new Artist("London", "John Lennon", "UK", Arrays.asList(artist11, artist33));
		Artist artist5 = new Artist("Kiev", "Taras Bulba", "UA", Arrays.asList(artist11, artist22, artist33));
		Artist artist6 = new Artist("NewYork", "The Offspring", "USA", Arrays.asList(artist11));
		List<Artist> artists = new ArrayList<Artist>();
		artists.add(artist1);
		artists.add(artist2);
		artists.add(artist3);
		artists.add(artist4);
		artists.add(artist5);
		artists.add(artist6);
		Track track1 = new Track(10, "EEE");
		Track track2 = new Track(20, "AAAA");
		Track track3 = new Track(43, "DDDDDD");
		Track track4 = new Track(30, "CCCC");
		Track track5 = new Track(70, "WWWWWWW");
		Track track6 = new Track(20, "AAAAA");
		List<Track> tracks = new ArrayList<Track>();
		tracks.add(track1);
		tracks.add(track2);
		tracks.add(track3);
		tracks.add(track4);
		tracks.add(track5);
		tracks.add(track6);
		Album album1 = new Album(tracks, artists);
		List<Album> albums = new ArrayList<>();
		albums.add(album1);
		
		Artist testArtist = new Artist();
		//Optional<Artist> testArtist;
		testArtist.biggestGroup(artists.stream());
		System.out.println("testArtist :: " + testArtist.getName());
	}

}
