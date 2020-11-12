package com.comunus.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.net.ssl.HttpsURLConnection;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class Main {
	
      public Cache  getAuthorList(String requestUrl)
	   	{
		   
			BufferedReader reader=null;
			String line=null;
			StringBuffer responseContent=new StringBuffer();
//		    Object object=null;
//		    JsonArray jsonArray=null;
//		    JsonParser parser=null;
//			TreeMap<Integer, UserData> map=null;
			 Cache cache =Cache.getInstance();
			try
			{
			URL url = new URL(requestUrl);
			HttpsURLConnection httpClient=(HttpsURLConnection)url.openConnection();
			
			httpClient.setRequestMethod("GET");
		    
		    httpClient.addRequestProperty("User-Agent", "Mozilla/5.0");	
		
			int responseCode=httpClient.getResponseCode();
			
			if(responseCode >299)
			{
				reader = new BufferedReader(new InputStreamReader(httpClient.getErrorStream()));
			    while((line=reader.readLine())!=null)
			    {
			    	responseContent.append(line);	
			    }
			    reader.close();
			}
			else
			{
			    reader =new BufferedReader(new InputStreamReader(httpClient.getInputStream()));
				while((line=reader.readLine())!=null)
				{
					responseContent.append(line);
				}
				  
				ObjectMapper mapper = new ObjectMapper();
			    UserData[] jsonObj = mapper.readValue(responseContent.toString(), UserData[].class);
             
                //  map = new TreeMap<Integer, UserData>();
			   
			             
				for (UserData itr : jsonObj) {
					
				  //  map.put(itr.getId(), itr);
					cache.put(itr.getId(), itr);
				}
				//System.out.println(map);
			}
			}
			catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
				e.printStackTrace();
			}
			return cache;
		}

}
