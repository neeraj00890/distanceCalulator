package com.repo;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.UserSchedule;


public interface UserRepo extends CrudRepository<UserSchedule, Long> {

	@Query("SELECT SUM(us.distance) from UserSchedule us WHERE us.userName = ?1 AND  (us.when BETWEEN ?2 AND ?3)")
	public Float getDistance(String userName,Date startTimestamp,Date endTimeStamp);
}
