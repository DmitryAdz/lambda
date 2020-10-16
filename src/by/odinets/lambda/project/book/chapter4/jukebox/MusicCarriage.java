package by.odinets.lambda.project.book.chapter4.jukebox;

public class MusicCarriage implements Carriage, Jukebox {

	@Override
	public String rock() {
		return Carriage.super.rock();
	}
}
