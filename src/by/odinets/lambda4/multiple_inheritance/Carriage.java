package by.odinets.lambda4.multiple_inheritance;

public interface Carriage {

	public default String rock() {
		return "... from side to side";
	}
}
