package com.test.utils;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/** 
 * 自定义布尔序列化器 
 * @author chaijunkun 
 * @since 2015年4月18日 
 */  
public class BooleanSerializer extends JsonSerializer<Boolean> {

    @Override  
    public void serialize(Boolean value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {  
        if (Boolean.FALSE.equals(value)){  
            jgen.writeNumber(0);  
        }else{  
            jgen.writeNumber(1);  
        }  
    } 
  
 
      
}  