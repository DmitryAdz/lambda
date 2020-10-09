package by.odinets.lambda.project.book.chapter3.long_track_finder;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import by.odinets.lambda.project.book.chapter1.Album;

public class Step4LongTrackFinder implements LongTrackFinder {

	public Set<String> findLongTracks(List<Album> albums) {
		return albums.stream()
					 .flatMap(album -> album.getTracks())
					 .filter(track -> track.getLength() > 60)
					 .map(track -> track.getName())
					 .collect(Collectors.toSet());
	}
}
