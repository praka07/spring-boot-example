/**
 * 
 */
package com.tcs.demo.springboot;

import org.springframework.boot.SpringApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Prakash
 *
 */
@Slf4j
public class BootApplication {
	
	public static void main(String a[]) {
		SpringApplication.run(BootApplication.class, a);
		log.info("Application started sucessfully");
	}

}
