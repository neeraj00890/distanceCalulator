package com.service;

import com.dto.InputDTO;

public interface IUserService  {

	public void storeUser(InputDTO inputdto);
	public Float getDistance(String startTimeStamp,String endTimeStamp,String userName);
}
