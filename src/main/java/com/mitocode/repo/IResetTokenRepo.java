package com.mitocode.repo;

import com.mitocode.model.ResetToken;

public interface IResetTokenRepo extends IGenericRepo<ResetToken, Integer>{
	ResetToken findByToken(String token);
}
