package Developer1.dev;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseservice;
	
	@GetMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id){
		return courseservice.getAllCourses(id);
	}
	
	@GetMapping("/topics/{topicid}/courses/{id}")
	public void getCourse(@PathVariable String topicid ,@PathVariable String id  ) {
		courseservice.getCourse(id);
	}
	
	@PostMapping("/topics/{topicId}/courses")
	public void addCourse(@PathVariable String topicid, @RequestBody Course course) {
		courseservice.addCourse(course);
	}
	
	@PutMapping("/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String topicid, @PathVariable String id) {
		courseservice.updateCourse(course);
	}
	
	@DeleteMapping("/topics/{topicId}/courses/{id}")
	public void deleteCourse( @PathVariable String topicid, @PathVariable String id) {
		courseservice.deleteCourse(id);
	}

}
