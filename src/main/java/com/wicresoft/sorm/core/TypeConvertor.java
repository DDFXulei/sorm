package com.wicresoft.sorm.core;

/**
 * 负责将java类型和数据库数据类型互相转化
 * @author Administrator
 *
 */
public interface TypeConvertor {

	/**
	 * 将数据库类型转化成java的数据类型
	 * @param columnType 数据库字段的数据类型
	 * @return	java数据类型
	 */
	public String dataBaseType2JavaType(String columnType);
	
	/**
	 * 将java数据类型转化成数据库数据类型
	 * @param javaType	java数据类型
	 * @return 数据库数据类型
	 */
	public String javaType2DataBaseType(String javaType);
	
}
