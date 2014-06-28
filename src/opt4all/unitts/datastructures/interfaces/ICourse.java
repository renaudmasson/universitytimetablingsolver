package opt4all.unitts.datastructures.interfaces;

import java.util.Vector;

public interface ICourse {
	
	/**
	 * 
	 * @return the id of the course.
	 */
	public String getCourseId();
	
	/**
	 * 
	 * @return the parts of the course (exercises, exam, lessons...)
	 */
	public Vector<IAlternativeLessons> getCoursesPart();

}
