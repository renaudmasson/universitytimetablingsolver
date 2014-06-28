package opt4all.unitts.datastructures.interfaces;

import java.util.Set;

public interface IStudent {
	
	/**
	 * 
	 * @return the id of the student.
	 */
	public String getStudentId();
	
	/**
	 * 
	 * @return the lessons that this student has to attend.
	 */
	public Set<ILesson> getLessonsToAttend();

}
