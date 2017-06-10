/**
 * 
 */
package com.mor.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @see http://blog.csdn.net/morning99/article/details/40426781
 * @author wanggengqi
 * @email wanggengqi@chinasofti.com
 * @date 2014年10月23日 下午1:56:05
 */
public class StartServer {

	/**
	 * @author wanggengqi
	 * @date 2014年10月23日 下午1:56:05
	 * @param args
	 * @return void
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationProvider.xml" });
		context.start();
		System.out.println("按任意键退出");
		System.in.read();
	}

}
