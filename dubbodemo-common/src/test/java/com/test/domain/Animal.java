package com.test.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
/*在Jackson中，对于Boolean类型的sex属性，序列化结果为{"sex":true}或者{"sex":false}。
但我希望当sex为true时，
序列化结果为1，否则为0，即{"sex":1}或者{"sex":0}。这就需要自定义一个Boolean类型的序列化器来解决*/
@JsonInclude(Include.NON_NULL)  
public class Animal {
	/** 名称 */  
    private String name;  
      
    /** 性别 */  
    @JsonSerialize(using = BooleanSerializer.class)  
    private Boolean sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}  
  
}
