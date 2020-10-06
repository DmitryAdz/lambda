package by.odinets.lambda4.multiple_inheritance;

public class MusicalCarriage implements Carriage, Jukebox {

	@Override
	public String rock() {
		//return Carriage.super.rock();
		return Jukebox.super.rock();	//метод унаследованного интерфейса
	}
}
