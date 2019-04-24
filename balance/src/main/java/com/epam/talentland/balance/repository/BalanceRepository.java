package com.epam.talentland.balance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.epam.talentland.balance.entity.BalanceEntity;

@Repository
public interface BalanceRepository extends JpaRepository<BalanceEntity,String>{
	
	    @Query(value = "SELECT u FROM BalanceEntity u WHERE u.user = :user and date > :d1 and date <= :d2  order by date desc")
	    public List<BalanceEntity> getLastThreeMonths (@Param("user") String user,@Param("d1") String d1,@Param("d2") String d2);

}
