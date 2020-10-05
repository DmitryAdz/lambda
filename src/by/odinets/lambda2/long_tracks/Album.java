package by.odinets.lambda2.long_tracks;

import java.util.List;
import java.util.stream.Stream;

import by.odinets.lambda1.Artist;

public class Album {

	private List<Artist> musicians;
	private List<Track> tracks;
	
	public Album() {
		
	}
	
	public Album(List<Artist> musicians) {
		this.musicians = musicians;
	}
	
	public Album(List<Track> tracks, List<Artist> musicians) {
		this.tracks = tracks;
		this.musicians = musicians;
	}

	public Stream<Artist> getMusicians() {
		return this.musicians.stream();
	}
	
	public List<Artist> getMusiciansList() {
		return musicians;
	}
	
	public Stream<Track> getTracks() {
		return this.tracks.stream();
	}
	
	public List<Track> getTrackList() {
		return tracks;
	}
	
}
