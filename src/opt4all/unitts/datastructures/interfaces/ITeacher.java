package opt4all.unitts.datastructures.interfaces;

import java.util.Set;

public interface ITeacher {
	
	/**
	 * 
	 * @return the id of the teacher.
	 */
	public String getTeacherId();
	
	/**
	 * 
	 * @return the time slots during which the teacher can
	 * be assigned to do a lesson.
	 */
	public Set<Integer> getAvailableTimeSlots();

}
