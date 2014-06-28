package opt4all.unitts.datastructures.interfaces;

import java.util.Set;

/**
 * Interface for a classroom.
 * @author renaud
 *
 */
public interface IClassroom {
	
	/**
	 * 
	 * @return the id of the classroom.
	 */
	public String getClassroomId();
	
	/**
	 * Get the time needed to go from this classroom to an other.
	 * @param other the other classroom.
	 * @return the travel time in minutes.
	 */
	public int getTravelTimeTo(IClassroom other);
	
	/**
	 * 
	 * @return the number of student that can use this classroom.
	 */
	public int getCapacity();
	
	/**
	 * 
	 * @return the time slots during which lessons can be assigned to the classroom.
	 */
	public Set<Integer> getAvailableTimeSlots();

}
