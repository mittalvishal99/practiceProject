package com.io.practice.practice_project.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController 
{
	
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topic")
	public List<topic> getAllTopics()
	{
		return topicservice.getAllTopics();
	}
/*	
	@RequestMapping("/topic/{id}")
	public topic getTopic(@PathVariable String id)
	{
		return topicservice.getTopic(id);
	}
*/	
	@RequestMapping("/topic/{id}")
	 public topic getTopic(@PathVariable String id) 
	{
		return topicservice.getTopic(id);
	 }
	
	@RequestMapping(method=RequestMethod.POST,value="/topic")
	
		public void addTopic(@RequestBody topic topic1)
		{
			topicservice.addTopic(topic1);
		}
	

}
