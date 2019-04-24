package com.epam.talentland.balance.rs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.talentland.balance.entity.BalanceEntity;
import com.epam.talentland.balance.exceptions.UserException;
import com.epam.talentland.balance.service.BalanceService;

@RestController
@RequestMapping("/balance")
public class BalanceRestController {
	
	@Autowired
	private BalanceService balanceService;

	@GetMapping("/getLastThreeMonths/{id}")
	public ResponseEntity<List<BalanceEntity>> getLastThreeMonths(@PathVariable String id) {
		List<BalanceEntity> balanceInThreeMonths = null;
		try {
		 balanceInThreeMonths = balanceService.getLastThreeMonths(id);
		}catch (UserException ex) {
			return new ResponseEntity<List<BalanceEntity>>(balanceInThreeMonths, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<BalanceEntity>>(balanceInThreeMonths, HttpStatus.OK);
	}
	
}
