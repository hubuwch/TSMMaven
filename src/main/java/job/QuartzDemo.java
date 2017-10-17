/**
 * 
 */
package job;

import java.util.Date;

import org.quartz.DateBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @title  SimpleTriggerExample
 * @author Administrator
 * @date   2017年9月13日上午10:18:55
 */
public class QuartzDemo {
  
  
  public void run() throws SchedulerException{
    System.out.println("---------初始化----------");
    //获取scheduler调度器
    SchedulerFactory sf = new StdSchedulerFactory();
    System.out.println("-----初始化完成------");
    //加入job
    JobDetail jobDetail = JobBuilder.newJob(HelloJob.class)
        .withIdentity("job_1", "group_1")
        .build();
    //定义任务执行时间
    Date runTime = DateBuilder.evenSecondDateAfterNow();
    //创建job执行触发器
    Trigger trigger = TriggerBuilder.newTrigger()
        .withIdentity("trigger_1", "group_1")
        .startAt(runTime)
        .withSchedule(
           SimpleScheduleBuilder.simpleSchedule()
           .withIntervalInSeconds(2) //时间间隔
           .withRepeatCount(5) //重复次数  实际运行6次
            )
        .build();
    
    //创建scheduler实例
    Scheduler sched = sf.getScheduler();
    
    sched.scheduleJob(jobDetail,trigger);
    System.out.println(jobDetail.getKey()   + "运行在:"  +runTime);
    sched.start();
  }

  /**
   * @param args
   * @throws SchedulerException 
   */
  public static void main(String[] args) throws SchedulerException {
    
     QuartzDemo demo = new QuartzDemo();
     demo.run();

  }

}
