package by.odinets.lambda.project.book.chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Album {

	private String name;
	private List<Artist> musicians;
	private List<Track> tracks;
	
	public Album(String name, List<Track> tracks, List<Artist> musicians) {
		Objects.requireNonNull(name);
		
		this.name = name;
		tracks = new ArrayList<>(tracks);
		musicians = new ArrayList<>(musicians);
	}
	
	public String getName() {
		return name;
	}
	
	public List<Artist> getMusicians() {
		return musicians;
	}
	
	public List<Track> getTracks() {
		return tracks;
	}
	
}
