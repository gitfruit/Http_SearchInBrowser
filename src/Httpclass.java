import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Httpclass extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
	{
		String stext=req.getParameter("st");
		String sengine=req.getParameter("seng");
		
		String url=null;
		
		if(sengine.equals("google"))
		{
			url="https://www.google.com/search?q="+stext;
		}
			
		else if(sengine.equals("yahoo"))
		{
			url="https://in.search.yahoo.com/search?p="+stext;
		}
		else if(sengine.equals("bing"))
		{
			url="https://www.bing.com/search?q="+stext;
		}
		else if(sengine.equals("paytm"))
		{
			url="https://paytm.com/shop/search?q="+stext;
		}
		else if(sengine.equals("amazon"))
		{
			url="https://www.amazon.in/s/ref="+stext;
		}
		else if(sengine.equals("flipkart"))
		{
			url="https://www.flipkart.com/search?q="+stext;
		}
		else if(sengine.equals("youtube"))
		{
			url="https://www.youtube.com/results?search_query="+stext;
		}
			
		resp.sendRedirect(url);
	}

}
