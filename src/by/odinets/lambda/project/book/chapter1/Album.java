package by.odinets.lambda.project.book.chapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Album {

	private String name;
	private List<Artist> musicians;
	private List<Track> tracks;
	
	public Album(String name, List<Track> tracks, List<Artist> musicians) {
		Objects.requireNonNull(name);
		Objects.requireNonNull(tracks);
		Objects.requireNonNull(musicians);
		
		this.name = name;
		this.tracks = new ArrayList<>(tracks);
		this.musicians = new ArrayList<>(musicians);
	}
	
	public String getName() {
		return name;
	}
	
	public List<Artist> getMusiciansList() {
		return Collections.unmodifiableList(musicians);
	}
	
	public Stream<Artist> getMusicians() {
		return musicians.stream();
	}
	
	public Stream<Track> getTracks() {
		return tracks.stream();
	}
	
	public List<Track> getTrackList() {
		return Collections.unmodifiableList(tracks);
	}
	
}
