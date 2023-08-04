package Developer1.dev;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TopicService {
	@Autowired
	private TopicRepository topicrepository;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicrepository.findAll()
		.forEach(topics::add);
		return topics;
	}

	public void getTopic(String id) {
		topicrepository.findById(id);
		}

	public void addTopic(Topic topic) {
		topicrepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		topicrepository.save(topic);
		
		
	}

	public void deleteTopic(Topic topic) {
		topicrepository.delete(topic);
		
	}

}
