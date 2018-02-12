package indi.qiaolin.excel.tools.style.impl;

import java.util.HashMap;
import java.util.Map;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import indi.qiaolin.excel.tools.enumerate.style.StyleType;
import indi.qiaolin.excel.tools.style.ExportStyle;

/**
 *  默认导出样式
 * @author qiaolin
 * @date 2018年2月11日
 * 
 */

public class DefaultExportStyle implements ExportStyle{
	private static final String DATA_FONT_NAME = "仿宋_GB2312"; // 数据字体
	private static final String NAME_FONT_NAME = "黑体"; // 列名字体
	private static final Map<StyleType,CellStyle> styleMap = new HashMap<StyleType,CellStyle>();
	
	public DefaultExportStyle() {}
	
	
	/**
	 *  获取表头样式
	 * @param wb 工作簿对象
	 * @return 表头样式
	 */
	@Override
	public CellStyle getHeaderStyle(XSSFWorkbook wb) {
		CellStyle headerStyle = styleMap.get(StyleType.header);
		if(headerStyle == null) {
			headerStyle = wb.createCellStyle();
			setCellBorder(headerStyle);
			headerStyle.setAlignment(HorizontalAlignment.CENTER);
			XSSFFont font = wb.createFont();
			font.setFontName(NAME_FONT_NAME);
			font.setFontHeightInPoints((short) 11);// 设置字体大小
			font.setBold(true);// 粗体显示
			headerStyle.setFont(font);
			styleMap.put(StyleType.header, headerStyle);
		}
		return headerStyle;
	}

	/**
	 * 获取内容单元格的样式
	 * @param wb 工作簿对象
	 * @return 单元格的样式
	 */
	@Override
	public CellStyle getTitleStyle(XSSFWorkbook wb) {
		CellStyle titleStyle = styleMap.get(StyleType.title);
		if(titleStyle == null) {
			titleStyle = wb.createCellStyle();
			setCellBorder(titleStyle);
			titleStyle.setAlignment(HorizontalAlignment.CENTER);
			XSSFFont font = wb.createFont();
			font.setFontName(NAME_FONT_NAME);
			font.setBold(true);// 粗体显示
			font.setFontHeightInPoints((short) 16);// 设置字体大小
			styleMap.put(StyleType.title, titleStyle);
		}
		
		return titleStyle;
	}
	
	/**
	 * 获取内容单元格的样式
	 * @param wb 工作簿对象
	 * @return 单元格的样式
	 */
	@Override
	public CellStyle getBodyStyle(XSSFWorkbook wb) {
		CellStyle bodyStyle = styleMap.get(StyleType.body);
		if(bodyStyle == null) {
			bodyStyle = wb.createCellStyle();
			setCellBorder(bodyStyle);
			XSSFFont font = wb.createFont();
			font.setFontName(DATA_FONT_NAME);
			font.setFontHeightInPoints((short) 11);
			bodyStyle.setFont(font);//选择需要用到的字体格式
			styleMap.put(StyleType.body, bodyStyle);
		}
		return bodyStyle;
	}
	
	/**
	 *  设置单元格边框线
	 * @param cellStyle 单元格样式
	 */
	private void setCellBorder(CellStyle cellStyle) {
		cellStyle.setBorderBottom(BorderStyle.THIN); // 下边框
		cellStyle.setBorderLeft(BorderStyle.THIN);// 左边框
		cellStyle.setBorderTop(BorderStyle.THIN);// 上边框
		cellStyle.setBorderRight(BorderStyle.THIN);// 右边框
	}
}
