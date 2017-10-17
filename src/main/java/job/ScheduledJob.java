/**
 * 
 */
package job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @title  ScheduledJob
 * @author Administrator
 * @date   2017年9月13日下午1:43:03
 */
public class ScheduledJob extends QuartzJobBean {
  
  private AnotherBean anotherBean;   
  
  @Override  
  protected void executeInternal(JobExecutionContext arg0)  
          throws JobExecutionException {  
      anotherBean.printAnotherMessage();  
  }  
 
  public void setAnotherBean(AnotherBean anotherBean) {  
      this.anotherBean = anotherBean;  
  }  

}
