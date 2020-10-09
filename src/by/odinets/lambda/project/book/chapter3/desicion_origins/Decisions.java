package by.odinets.lambda.project.book.chapter3.desicion_origins;

import java.util.*;
import java.util.stream.Collectors;

import by.odinets.lambda.project.book.chapter1.Album;
import by.odinets.lambda.project.book.chapter1.Artist;

public class Decisions {

	public static class Imperative {
		public Set<String> originsOfBands(Album album) {
			Set<String> nationalities = new HashSet<>();
			for(Artist artist : album.getMusiciansList()) {
				if(artist.getName().startsWith("The")) {
					String nationality = artist.getNationality();
					nationalities.add(nationality);
				}
			}
			return nationalities;
		}
	}
	
	public Set<String> originsOfBandsMisuse(Album album) {
		
		List<Artist> musicians = album.getMusicians()
									  .collect(Collectors.toList());
		
		List<Artist> bands = musicians.stream()
									  .filter(artist -> artist.getName().startsWith("The"))
									  .collect(Collectors.toList());
		
		Set<String> origins = bands.stream()
								   .map(artist -> artist.getNationality())
								   .collect(Collectors.toSet());
		return origins;
	}
	
	public Set<String> originsOfBands(Album album) {
		Set<String> origins = album.getMusicians()
								   .filter(artist -> artist.getName().startsWith("The"))
								   .map(artist -> artist.getNationality())
								   .collect(Collectors.toSet());
		return origins;
	}
}
