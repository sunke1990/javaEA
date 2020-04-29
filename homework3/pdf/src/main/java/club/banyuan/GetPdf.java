package club.banyuan;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet("/pdf")
public class GetPdf extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //make filename and filepath
        String filename="sun.pdf";
        String filepath="D:\\javaweb";
        //open file
        FileInputStream fileInputStream=new FileInputStream(filepath);
        //set request-header UTF-8
        filename= URLEncoder.encode(filename, "UTF-8");
        resp.setHeader("Content-disposition", "attachment;filename=" +filename);
        int len=1;
        byte[] bs=new byte[1024];
        ServletOutputStream sos=resp.getOutputStream();
        while((len = fileInputStream.read(bs))!=-1){
            sos.write(bs,0,len);

        }
        fileInputStream.close();
    }


}
