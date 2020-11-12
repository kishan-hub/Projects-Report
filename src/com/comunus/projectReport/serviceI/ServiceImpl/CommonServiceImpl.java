package com.comunus.projectReport.serviceI.ServiceImpl;

import com.comunus.projectReport.daoI.CommonDAOI;
import com.comunus.projectReport.daoI.daoImpl.CommonDAOImpl;
import com.comunus.projectReport.dto.LoginDTO;
import com.comunus.projectReport.serviceI.CommonServiceI;

public class CommonServiceImpl implements CommonServiceI {

	@Override
	public String getLogin(LoginDTO loginDto) {
		// TODO Auto-generated method stub
	    CommonDAOI commonDaoI=new CommonDAOImpl();
		return commonDaoI.getLogin(loginDto);
	}

}
