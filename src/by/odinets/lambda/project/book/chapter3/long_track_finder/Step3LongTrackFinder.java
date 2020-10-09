package by.odinets.lambda.project.book.chapter3.long_track_finder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import by.odinets.lambda.project.book.chapter1.Album;

public class Step3LongTrackFinder implements LongTrackFinder{

	public Set<String> findLongTracks(List<Album> albums) {
		Set<String> trackNames = new HashSet<>();
		albums.stream()
			  .flatMap(album -> album.getTracks())
			  .filter(track -> track.getLength() > 60)
			  .map(track -> track.getName())
			  .forEach(name -> trackNames.add(name));
		return trackNames;
	}
}
