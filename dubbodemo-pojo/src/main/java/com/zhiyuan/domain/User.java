package com.zhiyuan.domain;

import java.io.Serializable;

public class User  implements Serializable {
	 private String userId;  
     private String userName;  
     private String account;  
     private String phone;  
     private String password;  
     private String address;  
     public String getUserId() {  
         return userId;  
     }  
     public void setUserId(String userId) {  
         this.userId = userId;  
     }  
     public String getUserName() {  
         return userName;  
     }  
     public void setUserName(String userName) {  
         this.userName = userName;  
     }  
     public String getAccount() {  
         return account;  
     }  
     public void setAccount(String account) {  
         this.account = account;  
     }  
     public String getPhone() {  
         return phone;  
     }  
     public void setPhone(String phone) {  
         this.phone = phone;  
     }  
     public String getAddress() {  
         return address;  
     }  
     public void setAddress(String address) {  
         this.address = address;  
     }  
     public String getPassword() {  
         return password;  
     }  
     public void setPassword(String password) {  
         this.password = password;  
     }  
}
