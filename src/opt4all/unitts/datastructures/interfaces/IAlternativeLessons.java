package opt4all.unitts.datastructures.interfaces;

import java.util.Vector;

public interface IAlternativeLessons {

	/**
	 * 
	 * @return the alternatives for a particular part of a course.
	 */
	public Vector<ILesson> getAlternatives();
}
