package com.comunus.projectReport.daoI.daoImpl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.comunus.projectReport.daoI.CommonDAOI;
import com.comunus.projectReport.dto.LoginDTO;
import com.comunus.util.CryptoUtil;
import com.comunus.util.HibernateUtils;

public class CommonDAOImpl implements CommonDAOI {
	@Override
	public String getLogin(LoginDTO loginDto) {
		// TODO Auto-generated method stub
		SessionFactory factory=null;
		Session session=null;
		String username=loginDto.getLoginId();
		
		String password=loginDto.getLoginPassword();
		
		System.out.println("commmon DAO  login username and password"+username+"  "+password);
		try
		{
		  factory=HibernateUtils.getSessionFactory();
		 
		if(factory!=null)
		{
			System.out.println("Data base is Eastablised");
		}
		session=factory.openSession();
		Query query=session.createQuery("from LoginDTO where loginId='"+username+"' and loginPassword='"+password+"'");
        		
		List<LoginDTO> list=query.list();
		
		Iterator<LoginDTO> it=list.iterator();
		
		while(it.hasNext()){
			loginDto=it.next();
			String loginType=loginDto.getLoginType();
			System.out.println(loginType);
			if(loginType.equals("A")){
				return "ADMIN";
			}else if(loginType.equals("C")){
				return "CUSTOMER";
			}
		}
		
		}
		finally
		{
			  if(factory!=null)
			  {
				  factory.close();
			  }
			  if(session!=null)
			  {
				  session.close();
			  }
		}
		return null;
	}

}
