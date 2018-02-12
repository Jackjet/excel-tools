package indi.qiaolin.excel.tools.style;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *  导出样式接口
 * @author qiaolin
 * @date 2018年2月11日
 *
 */

public interface ExportStyle {
	
	/**
	 * 获取内容单元格的样式
	 * @param wb 工作簿对象
	 * @return 单元格的样式
	 */
	public CellStyle getTitleStyle(XSSFWorkbook wb);
	
	/**
	 *  获取表头样式
	 * @param wb 工作簿对象
	 * @return 表头样式
	 */
	public CellStyle getHeaderStyle(XSSFWorkbook wb);
	
	/**
	 * 获取内容单元格的样式
	 * @param wb 工作簿对象
	 * @return 单元格的样式
	 */
	public CellStyle getBodyStyle(XSSFWorkbook wb);
	
}
