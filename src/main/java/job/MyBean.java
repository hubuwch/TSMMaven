/**
 * 
 */
package job;

import org.springframework.stereotype.Component;

/**
 * @title  myBean
 * @author Administrator
 * @date   2017年9月13日上午11:24:34
 */
@Component("myBean")
public class MyBean {
  
  public void printMessage(){
    System.out.println("使用简单触发器模式打印消息");
  }

}
