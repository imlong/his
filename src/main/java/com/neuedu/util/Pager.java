package com.neuedu.util;

/*
 * 分页工具类：
 */
public class Pager {

	private int rows = 5;//每页多少条记录
	private int pageNum;//当前是第几页
	private int rowCounts;//一共多少条查询记录
	private int pageCounts;//一共多少页
	private int startRow;//当前页从 startRow+1 条记录开始显示，配合mysql的limit使用
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getRowCounts() {
		return rowCounts;
	}
	public void setRowCounts(int rowCounts) {
		this.rowCounts = rowCounts;
	}
	public int getPageCounts() {
		return pageCounts;
	}
	public void setPageCounts(int pageCounts) {
		this.pageCounts = pageCounts;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	@Override
	public String toString() {
		return "Pager [rows=" + rows + ", pageNum=" + pageNum + ", rowCounts=" + rowCounts + ", pageCounts="
				+ pageCounts + ", startRow=" + startRow + "]";
	}
	
}
