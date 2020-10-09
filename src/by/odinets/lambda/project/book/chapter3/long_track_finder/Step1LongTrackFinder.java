package by.odinets.lambda.project.book.chapter3.long_track_finder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import by.odinets.lambda.project.book.chapter1.Album;

public class Step1LongTrackFinder implements LongTrackFinder {

	public Set<String> findLongTracks(List<Album> albums) {
		Set<String> trackNames = new HashSet<>();
		albums.stream()
			  .forEach(album -> {
				  album.getTracks()
				  	.forEach(track -> {
				  		if(track.getLength() > 60) {
				  			String nameTrack = track.getName();
				  			trackNames.add(nameTrack);
				  		}
				  	});
			  });
		return trackNames;
	}
}
