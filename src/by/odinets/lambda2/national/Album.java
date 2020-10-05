package by.odinets.lambda2.national;

import java.util.List;
import java.util.stream.Stream;

import by.odinets.lambda1.Artist;

public class Album {

	private List<Artist> musicians;
	
	public Album() {
		
	}
	
	public Album(List<Artist> musicians) {
		this.musicians = musicians;
	}

	public Stream<Artist> getMusicians() {
		return this.musicians.stream();
	}
}
