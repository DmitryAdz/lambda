package by.odinets.lambda2.national;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import by.odinets.lambda1.Artist;

public class LambdaNational {

	public static void main(String[] args) {
		
		Artist artist1 = new Artist("Moscow", "Ivan Fuckoff", "RU");
		Artist artist2 = new Artist("London", "Ringo Starr", "UK");
		Artist artist3 = new Artist("Paris", "Joe Dasin", "FR");
		Artist artist4 = new Artist("London", "John Lennon", "UK");
		Artist artist5 = new Artist("Kiev", "Taras Bulba", "UA");
		Artist artist6 = new Artist("NewYork", "The Offspring", "USA");
		List<Artist> artists = new ArrayList<Artist>();
		artists.add(artist1);
		artists.add(artist2);
		artists.add(artist3);
		artists.add(artist4);
		artists.add(artist5);
		artists.add(artist6);
		Album album = new Album(artists);
		
		Set<String> origins = album.getMusicians()
									.filter(artist -> artist.getName().startsWith("The"))
									.map(artist -> artist.getNationality())
									.collect(Collectors.toSet());
		System.out.println("origins :: " + origins);

	}

}
