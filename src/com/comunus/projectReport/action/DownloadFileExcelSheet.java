package com.comunus.projectReport.action;

import java.io.IOException;
import java.util.Map;


import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.comunus.util.ExportExcel;

@WebServlet("/DownloadFileExcelSheet")
public class DownloadFileExcelSheet extends CommonServlet {
    private static final long serialVersionUID = 2067115822080269398L;
	
 
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            validate(request, response);
           
        try {
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-Disposition", "attachment; filename=SampleExcel.xls");
          //  HSSFWorkbook workbook = createExcel();
             XSSFWorkbook workbook=createXSSFExcel();
              ServletOutputStream inputStream=response.getOutputStream();
            //  ServletResponse servletResponse=(ServletResponse)response.getOutputStream();
             workbook.write(inputStream);
             inputStream.flush();
             inputStream.close();
        } catch (Exception e) {
            throw new ServletException("Exception in DownLoad Excel Servlet", e);
        }
    }
 
//    private HSSFWorkbook createExcel() {
//    	  Map< String, Object[] > empinfo=null;
//        HSSFWorkbook workbook = new HSSFWorkbook();
//        
//          
//        empinfo = new TreeMap<String, Object[]>();
//        
//        empinfo.put( "1", new Object[] {
//                "EMP ID", "EMP NAME", "DESIGNATION" });
//        Main main=new Main();
//         UserData[] jsonObj=(UserData[]) main.getAuthorList("https://jsonplaceholder.typicode.com/posts");	
//        for(UserData itr:jsonObj)
//        {
//        	empinfo.put(String.valueOf(itr.getUserId()), new Object[] {String.valueOf(itr.getId()), itr.getTitle(), itr.getBody()});
//        }
//        HSSFSheet worksheet = workbook.createSheet("Rista User Detail Sheet");
//        HSSFRow row1 = worksheet.createRow((short)2);
// 
//        HSSFCell cellA1 = row1.createCell((short)2);
//        cellA1.setCellValue(" Provided the Data by Communus");
//        HSSFCellStyle cellStyle = workbook.createCellStyle();
//        cellA1.setCellStyle(cellStyle);
//        return workbook;
//    }
    private XSSFWorkbook createXSSFExcel()
    {
    	ExportExcel exportExcel=new ExportExcel();
    //	XSSFWorkbook workBook=exportExcel.createWorkBook();
     	XSSFWorkbook workBook = exportExcel.createDynamicSheet();
    	return workBook;
    }
    
    public void destroy() {
        // do nothing.
    }
}