package indi.qiaolin.excel.tools.annotation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 *  注在需要导入字段上
 * @author qiaolin
 * @dete 2018年2月11日
 * 
 */

@Target({METHOD,FIELD})
@Retention(RUNTIME)
public @interface Import {
	
	/**
	 * 导出字段名（默认调用当前字段的“get”方法，如指定导出字段为对象，请填写“e名.对象属性”，
	 * 例：“area.name”、“office.name”）
	 */
	String value() default "";
	
	/**
	 * 字典类型
	 */
	String dictType() default "";
	
	/**
	 * 反射类型
	 */
	Class<?> fieldType() default Class.class;
	
}
