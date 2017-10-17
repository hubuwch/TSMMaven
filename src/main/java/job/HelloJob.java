/**
 * 
 */
package job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @title  HelloJob
 * @author Administrator
 * @date   2017年9月13日上午10:14:00
 */
public class HelloJob implements Job {
  
  public void execute(JobExecutionContext arg0) throws JobExecutionException {
    // TODO Auto-generated method stub
    System.out.println("hello,quartz!");
  }

}
