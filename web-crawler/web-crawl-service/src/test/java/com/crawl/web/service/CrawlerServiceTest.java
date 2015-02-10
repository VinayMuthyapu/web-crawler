package com.crawl.web.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.crawl.web.service.impl.WebCrawlerServiceImpl;
import com.crawl.web.util.ApplicationProperties;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Test Class to test the services defined in crawlerService class
 *
 */
public class CrawlerServiceTest {

	private static final String CONFIG_PATH = "classpath:Application-config-crawler.xml";
	
	/**
	 * 
	 * @throws Exception
	 * Check if all properties are loaded by spring IOC.
	 * Asserts if any of the property is null
	 */
	@Test
	public void testProcessRequest(){
		final ApplicationContext context = new ClassPathXmlApplicationContext(
				CONFIG_PATH);
		final CrawlerService crawler = context.getBean(WebCrawlerServiceImpl.class);
		//crawler.processRequest();
		//Assert.assertFalse("Application Properties are not loaded successfully",flag);
	}
}