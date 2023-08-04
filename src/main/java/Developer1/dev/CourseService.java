package Developer1.dev;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CourseService {
	@Autowired
	private CourseRepository courserepository;

	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		courserepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
		
	}

	public void getCourse(String id) {
		courserepository.findById(id);
		
		
	}

	public void addCourse(Course course) {
		courserepository.save(course);
		
	}

	public void updateCourse(Course course) {
	 courserepository.save(course);
		
	}

	public void deleteCourse(String id) {
	courserepository.deleteById(id);
	}

}
