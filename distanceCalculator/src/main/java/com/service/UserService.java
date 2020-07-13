package com.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.InputDTO;
import com.model.UserSchedule;
import com.repo.UserRepo;

@Service
public class UserService implements IUserService{

	@Autowired
	UserRepo repo;
	
	public void storeUser(InputDTO inputdto) {
		UserSchedule us = new UserSchedule();
		us.setDistance(Float.valueOf(inputdto.getDistance()));
		us.setTimeTaken(inputdto.getTime());
		us.setName(inputdto.getName());
		us.setWhen(new Date(inputdto.getWhen_Travelled()));
		us.setUserName(inputdto.getUserName());
		repo.save(us);
	}
	public Float getDistance(String startTimeStamp,String endTimeStamp,String userName) {
		Float distance=repo.getDistance(userName, new Date(startTimeStamp), new Date(endTimeStamp));
		return distance;
	}
}
