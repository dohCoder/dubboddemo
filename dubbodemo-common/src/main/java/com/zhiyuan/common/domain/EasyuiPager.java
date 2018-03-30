package com.zhiyuan.common.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Administrator
 * easyui分页数据结构 Include.ALWAYS表示对象中有属性为空，转化给前台json的时候，属性为null
 * Include.NON_NULL表示为null的属性直接不传入前台
 */
@JsonInclude(value=Include.ALWAYS)
public class EasyuiPager implements Serializable{
	private Long total = 0l;
	private List rows = new ArrayList();
	
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	
}
