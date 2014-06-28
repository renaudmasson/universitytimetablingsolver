package opt4all.unitts.datastructures.interfaces;

import java.util.Set;
import java.util.Vector;

public interface ILesson {
	
	/**
	 * 
	 * @return the id of the lesson.
	 */
	public String getLessonId();
	
	/**
	 * 
	 * @return the course associated to this lesson.
	 */
	public ICourse getCourse();
	
	/**
	 * 
	 * @return the teacher for this lesson.
	 */
	public ITeacher getTeacher();
	
	/**
	 * 
	 * @return the possible classrooms for this lesson.
	 */
	public Set<IClassroom> getPossibleClassroom();

}
