package com.entity;

public class Login {
	
String name;
String password;
Double number1;
Double number2;
Double result = 0.0;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Double getAdd(Double number1, Double number2) {
	result = number1+number2;
	return result;
}
public Double getSub(Double number1, Double number2) {
	result = number1-number2;
	return result;
}
public Double getMul(Double number1, Double number2) {
	result = number1*number2;
	return result;
}
public Double getDiv(Double number1, Double number2) {
	result = number1/number2;
	return result;
}
}
