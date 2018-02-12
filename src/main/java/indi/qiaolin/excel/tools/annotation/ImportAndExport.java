package indi.qiaolin.excel.tools.annotation;

import indi.qiaolin.excel.tools.enumerate.Alignment;

/**
 *  注在需要导入并且导出的字段上
 * @author qiaolin
 * @dete 2018年2月11日
 * 
 */

public @interface ImportAndExport {
	
	/**
	 * 导出字段名
	 * 默认调用当前字段的“get”方法，如指定导出字段为对象，
	 * 请填写“属性名.对象属性”，例：“user.name”、“emp.name”）
	 */
	String value() default "";
	
	/**
	 * 导出字段标题（需要添加批注请用“**”分隔，标题**批注，仅对导出模板有效）
	 */
	String title();
	
	/**
	 * 导出字段对齐方式
	 */
	Alignment align() default Alignment.auto;
	
	/**
	 * 导出字段字段排序（升序）
	 */
	int sort() default 0;

	/**
	 * 如果是字典类型，请设置字典的type值
	 */
	String dictType() default "";
	
	/**
	 * 反射类型
	 */
	Class<?> fieldType() default Class.class;
	
}
