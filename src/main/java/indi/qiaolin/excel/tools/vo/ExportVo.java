package indi.qiaolin.excel.tools.vo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import indi.qiaolin.excel.tools.annotation.Export;
import indi.qiaolin.excel.tools.annotation.ImportAndExport;
import indi.qiaolin.excel.tools.enumerate.Alignment;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 导出Vo
 * 避免多次使用instaceOf
 * @author qiaolin
 *
 */

@Getter
@Setter
@NoArgsConstructor
public class ExportVo implements Comparable<ExportVo>{
	private Export export;  // 导出注解
	private ImportAndExport importAndExport; // 导入并且导出注解
	private Field field; // 字段
	private Method method; // 方法
	
	/**
	 * 获取注解 value()
	 * @return
	 */
	public String getValue() {
		if(export != null) {
			return export.value();
		}
		return importAndExport.value();
	}
	
	/**
	 * 获取注解 表头()
	 * @return
	 */
	public String getTitle() {
		if(export != null) {
			return export.title();
		}
		return importAndExport.title();
	}
	
	/**
	 * 获取注解 对齐方式()
	 * @return
	 */
	public Alignment getAlign() {
		if(export != null) {
			return export.align();
		}
		return importAndExport.align();
	}
	
	/**
	 * 获取注解 序号
	 * @return
	 */
	public Integer getSort() {
		if(export != null) {
			return export.sort();
		}
		return importAndExport.sort();
	}
	
	/**
	 * 获取注解 数据字典Key
	 * @return
	 */
	public String getDictType() {
		if(export != null) {
			return export.dictType();
		}
		return importAndExport.dictType();
	}

	/**
	 * 获取注解 反射类型
	 * @return
	 */
	public Class<?> getFieldType() {
		if(export != null) {
			return export.fieldType();
		}
		return importAndExport.fieldType();
	}

	/**
	 *  排序
	 */
	@Override
	public int compareTo(ExportVo o) {
		return this.getSort().compareTo(o.getSort());
	}
	
}
