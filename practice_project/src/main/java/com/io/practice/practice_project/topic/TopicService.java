package com.io.practice.practice_project.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService 
{

	private List<topic>topics=new ArrayList<>(Arrays.asList(
		    new topic("spring", "Spring Framework", "Spring Framework Description"),
		    new topic("java", "Core Java", "Core Java Description"),
		    new topic("javascript", "JavaScript", "JavaScript Description")));
	
	public List<topic> getAllTopics()
	{
		return topics;
	}
	
	public topic getTopic(String id)
	{
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(topic topic1) {
		// TODO Auto-generated method stub
		topics.add(topic1);
	}

}
