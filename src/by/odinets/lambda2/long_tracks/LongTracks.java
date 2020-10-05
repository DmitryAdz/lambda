package by.odinets.lambda2.long_tracks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import by.odinets.lambda1.Artist;

public class LongTracks {

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
		
		Set<String> test = findLongTracks(albums);
		System.out.println("test :: " + test);
		test.clear();
		
		test = findLongTracks1(albums);
		System.out.println("test :: 1 :: " + test);
		test.clear();
		
		test = findLongTracks2(albums);
		System.out.println("test :: 2 :: " + test);
		test.clear();
		
		test = findLongTracks3(albums);
		System.out.println("test :: 3 :: " + test);
		test.clear();
		
		test = findLongTracks4(albums);
		System.out.println("test :: 4 :: " + test);
		test.clear();
		
		test = findNationalityArtists(album1);
		System.out.println("test nation :: " + test);
		test.clear();
				
	}
	
	public static Set<String> findLongTracks(List<Album> albums) {
		Set<String> trackNames = new HashSet<>();
		for(Album album : albums) { 
			for(Track track : album.getTrackList()) {
				if(track.getLength() > 60) {
					String name = track.getName();
					trackNames.add(name);
				}
			}
		}
		return trackNames;
	}

	//lambda
	public static Set<String> findLongTracks1(List<Album> albums) {
		Set<String> trackNames = new HashSet<>();
		albums.stream()
				.forEach(album -> {
					album.getTracks()
						.forEach(track -> {
							if(track.getLength() > 60) {
								String name = track.getName();
								trackNames.add(name);
							}
						});
				});
		return trackNames;
	}
	
	public static Set<String> findLongTracks2(List<Album> albums) {
		Set<String> trackNames = new HashSet<>();
		albums.stream()
				.forEach(album -> {
					album.getTracks()
						 .filter(track -> track.getLength() > 60)
						 .map(track -> track.getName())
						 .forEach(name -> trackNames.add(name));
				});
		return trackNames;
	}
	
	public static Set<String> findLongTracks3(List<Album> albums) {
		Set<String> trackNames = new HashSet<>();
		albums.stream()
			  .flatMap(album -> album.getTracks())
			  .filter(track -> track.getLength() > 60)
			  .map(track -> track.getName())
			  .forEach(name -> trackNames.add(name));
		return trackNames;
	}
	
	public static Set<String> findLongTracks4(List<Album> albums) {
		return albums.stream()
			  		 .flatMap(album -> album.getTracks())
			  		 .filter(track -> track.getLength() > 60)
			  		 .map(track -> track.getName())
			  		 .collect(Collectors.toSet());
	}
	
	//lambda
	public static Set<String> findNationalityArtists(Album album) {
		Set<String> origins = new HashSet<>();
		List<Artist> musicians = album.getMusicians()
							   		  .collect(Collectors.toList());
		List<Artist> bands = musicians.stream()
									  .filter(artist -> artist.getName().startsWith("The"))
									  .collect(Collectors.toList());
		origins = bands.stream()
					   .map(artist -> artist.getNationality())
					   .collect(Collectors.toSet());
									  
		return origins;
	}
}
