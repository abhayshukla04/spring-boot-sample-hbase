package com.changhongit.sample;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.hadoop.hbase.HbaseTemplate;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.changhongit.sample" })
public class UserApp {

	private static final Log log = LogFactory.getLog(UserApp.class);

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(
				"classpath:/application-context.xml", args);
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
//				"application-context.xml", UserApp.class);
		log.info("HBase Application Running");
	
	}
}
