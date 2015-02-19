package jar;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job{ 
	
	private HelloService hs = new HelloService();
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
		hs.sayHello();
		} 
}
