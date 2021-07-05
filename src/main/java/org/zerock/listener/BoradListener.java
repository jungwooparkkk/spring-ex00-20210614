package org.zerock.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class BoradListener
 *
 */
@WebListener
public class BoradListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public BoradListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	ServletContext application = sce.getServletContext();
    	application.setAttribute("appRoot", application.getContextPath());
    	
    	// aws s3 bucket 주소
    	String bucketUrl = "https://choongang-jwpark1.s3.ap-northeast-2.amazonaws.com/";
    	application.setAttribute("imgRoot", bucketUrl);
    }
	
}



















