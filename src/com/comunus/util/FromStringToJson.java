package com.comunus.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FromStringToJson {
	  
	public UserData  convertStringJsonObject(String input)
	{
		  UserData emp=null;
		 ObjectMapper mapper = new ObjectMapper();
	        try
	        {
	            emp = mapper.readValue(input, UserData.class);
	             
	            System.out.println(emp);
	        } 
	        catch (JsonGenerationException e) 
	        {
	            e.printStackTrace();
	        } catch (JsonMappingException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return emp;
	}
	
      
}
