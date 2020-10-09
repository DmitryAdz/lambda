package by.odinets.lambda.project.book.chapter3.long_track_finder;

import java.util.*;

import by.odinets.lambda.project.book.chapter1.Album;
import by.odinets.lambda.project.book.chapter1.Track;

public class Step0LongTrackFinder implements LongTrackFinder {

	public Set<String> findLongTracks(List<Album> albums) {
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
		
}
