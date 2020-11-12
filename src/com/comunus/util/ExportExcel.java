package com.comunus.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;

public class ExportExcel {
	
	private static Map<Integer, UserData> mappData;

	public XSSFWorkbook createWorkBook()
	{
		XSSFWorkbook workbook=null;	
		int [] serial =new int[10];
			
		for(int i=0;i<serial.length;i++)
		{
			  serial[i]=i+1;
		}
		String []name=new String[10];
		
		name[0]="Student A";
		name[1]="Student B";
		name[2]="Student c";
		name[3]="student D";
		name[4]="student E";
		name[5]="Student F";
		name[6]="Student G";
		name[7]="Student H";
		name[8]="Student I";
		name[9]="student j";
		
		
		String[]result=new String[10];
		
		result[0]="pass";
		result[1]="pass";
		result[2]="pass";
		result[3]="pass";
		result[4]="pass";
		result[5]="pass";
		result[6]="pass";
		result[7]="pass";
		result[8]="pass";
		result[9]="pass";
		
		//create the WorkBook;
		workbook=new XSSFWorkbook();
		
		//create the Spreadsheet
		XSSFSheet sheet=workbook.createSheet("Rista User Detail Sheet");
		
		//create Row Object
		XSSFRow row;
		
		row =sheet.createRow(0);
		Cell cell1=row.createCell(0);
		Cell cell2=row.createCell(1);
		Cell cell3=row.createCell(2);
		
		cell1.setCellValue("Serial No");
		cell2.setCellValue("Name of Students");
		cell3.setCellValue("results");
		
		
		for(int i=0;i<serial.length;i++)
		{
			row=sheet.createRow(i+1);
			
			for(int j=0;j<3;j++)
			{
				Cell cell=row.createCell(j);
				
				
				if(cell.getColumnIndex() ==0)
				{
					cell.setCellValue(serial[i]);
				}
				if(cell.getColumnIndex()==1)
				{
					cell.setCellValue(name[i]);
				}
				if(cell.getColumnIndex()==2)
				{
					cell.setCellValue(result[i]);
				}
			}
		}	
		return workbook;
	}
	
	
	public XSSFWorkbook createDynamicSheet()
	{
		Cache cache=null;
		
		Main main=new Main();
		cache = main.getAuthorList("https://jsonplaceholder.typicode.com/posts");
	     
        Map<Integer,UserData> map=cache.getDataMap();
        
        System.out.println("Cache Memory "+map);
        
		//create the work book
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		
		//create the worksheet
		XSSFSheet sheet=workbook.createSheet("Rista User Data");
		
		 //create the Row Object
		XSSFRow row;
         
          Map<Integer, Object[]> data=new TreeMap<Integer, Object[]>();
          Set<Integer> keySet=map.keySet();
          for(Integer key:keySet)
          {
        	  UserData user =  map.get(key);     	   
        	  System.out.println(user);
              data.put(key, new Object[]{user.getId(),user.getUserId(),user.getTitle(),user.getBody()});      
          }
          
          Set<Integer> keySetData=data.keySet();
          int rownum=0;
          for(Integer key:keySetData)
          {
        	  row=sheet.createRow(rownum++);
        	  Object[] objArr = data.get(key); 
              int cellnum = 0; 
              for (Object obj : objArr) { 
                  // this line creates a cell in the next column of that row 
                  Cell cell = row.createCell(cellnum++); 
                  if (obj instanceof Integer) 
                      cell.setCellValue((Integer)obj);
                  else if (obj instanceof Integer) 
                      cell.setCellValue((Integer)obj); 
                  else if(obj instanceof String)
                	  cell.setCellValue((String)obj);
                  else if(obj instanceof String)
                	  cell.setCellValue((String)obj);
              } 
          }
		return workbook;
	}	
}
