package com.comunus.projectReport.delegate;

import com.comunus.projectReport.dto.LoginDTO;
import com.comunus.projectReport.serviceI.CommonServiceI;
import com.comunus.projectReport.serviceI.ServiceImpl.CommonServiceImpl;

public class CommonDelegate {
  
	public String getLogin(LoginDTO loginDto)
	{
		CommonServiceI commonService=new CommonServiceImpl();
		  return commonService.getLogin(loginDto);
	}
}
