package indi.qiaolin.excel.tools.annotation;

import indi.qiaolin.excel.tools.enumerate.Alignment;

/**
 *  注在需要导出字段上
 * @author qiaolin
 * @dete 2018年2月11日
 * 
 */

public @interface Export {
	
	/**
	 * 导出字段名
	 * 默认调用当前字段的“get”方法，如指定导出字段为对象，
	 * 请填写“属性名.对象属性”，例：“user.name”、“emp.name”）
	 */
	String value() default "";
	
	/**
	 *  表头名称
	 * @return
	 */
	String title(); 
	
	/**
	 * 对齐方式
	 */
	Alignment align() default Alignment.auto;
	
	/**
	 * 导出字段字段排序（升序）
	 */
	int sort() default 0;

	/**
	 * 字典类型
	 */
	String dictType() default "";
	
	/**
	 * 反射类型
	 */
	Class<?> fieldType() default Class.class;
	
}
