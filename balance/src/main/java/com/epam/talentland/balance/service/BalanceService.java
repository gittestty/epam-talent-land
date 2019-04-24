package com.epam.talentland.balance.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.epam.talentland.balance.entity.BalanceEntity;
import com.epam.talentland.balance.exceptions.UserException;
import com.epam.talentland.balance.repository.BalanceRepository;
import com.epam.talentland.balance.util.Util;

@Service
public class BalanceService {
	
	@Autowired
	private BalanceRepository balanceRepository;
	
	
	public List<BalanceEntity> getLastThreeMonths(String id) throws UserException{
		String dateNow = Util.getNowDateYYYmmDDMonthaddSub(1);
		String dateNowMinus3Months = Util.getNowDateYYYmmDDMonthaddSub(-3);
		List<BalanceEntity> balanceInThreeMonths = balanceRepository.getLastThreeMonths(id,dateNowMinus3Months,dateNow);
		if(null == balanceInThreeMonths || balanceInThreeMonths.isEmpty()) {
			throw new UserException("id-" + id);
		}
		return balanceInThreeMonths;
	}
	
	



}
