package by.odinets.lambda2.minMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import junit.framework.Assert;

public class LambdaMinMax {

	public static void main(String[] args) {
		
		List<Track> tracks = Arrays.asList(new Track("AAA", 5), new Track("BBB", 7), new Track("CCC", 3));
		Track shortestTrack = tracks.get(0);
		for(Track track : tracks) {
			if(track.getLength() < shortestTrack.getLength()) {
				shortestTrack = track;
			}
		}
		
		//lambda
		Track shortestTrack1 = tracks.stream()
									 .min(Comparator.comparing(track -> track.getLength()))
									 .get();
		
		System.out.println("shortestTrack1 :: " + shortestTrack1);
		Assert.assertEquals(tracks.get(2), shortestTrack1);
		System.out.println(" ::::::::::::::::::::::: ");
		Assert.assertEquals(tracks.get(1), shortestTrack1);
	}

}
