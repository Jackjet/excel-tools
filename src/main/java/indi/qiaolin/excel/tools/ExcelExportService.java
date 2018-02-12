package indi.qiaolin.excel.tools;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import indi.qiaolin.excel.tools.style.ExportStyle;
import indi.qiaolin.excel.tools.style.impl.DefaultExportStyle;
import indi.qiaolin.excel.tools.vo.ExportVo;
import lombok.extern.slf4j.Slf4j;

/**
 * Excel导出服务类
 * @author qiaolin
 * @dete 2018年2月6日
 * 
 */

@Slf4j
public class ExcelExportService {
	private static final Map<Class<?>,ExportVo> EXPORT_FIELD_MAP = new HashMap<Class<?>,ExportVo>();
	
	
	/**
	 * 工作簿对象
	 */
	private SXSSFWorkbook wb;
	
	/**
	 * 导出样式对象
	 */
	private ExportStyle exportStyle;

	
	public ExcelExportService() {
		this.exportStyle = new DefaultExportStyle();
	}
	
	/**
	 *  
	 * @param title 标题栏
	 */
	public ExcelExportService(String title) {
		this.exportStyle = new DefaultExportStyle();
	}
	
	/**
	 *  初始化工作簿
	 * @param title
	 */
	public <T> void init(String title,List<T> list) {
		
		
	}
	
	
	 
}
