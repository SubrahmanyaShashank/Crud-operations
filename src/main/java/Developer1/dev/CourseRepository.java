package Developer1.dev;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository <Course, String> {

	Iterable<Course> findByTopicId(String topicId);

	

}
