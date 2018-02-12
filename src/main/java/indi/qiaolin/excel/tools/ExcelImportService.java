package indi.qiaolin.excel.tools;

import org.apache.log4j.Logger;

import lombok.extern.slf4j.Slf4j;

/**
 * Excel导入服务类
 * @author qiaolin
 * @dete 2018年2月6日
 * 
 */

@Slf4j
public class ExcelImportService {
	
	public static void aa() {
		String s = "垃圾)";
		boolean b = s.matches("[^?!@#$%\\\\^&*()]+");
		log.error("验证结果 = {}", b);
		log.warn("验证结果 = {}", b);
		log.info("验证结果 = {}", b);
		log.debug("验证结果 = {}", b);
//		System.out.println(b);
	}
}
