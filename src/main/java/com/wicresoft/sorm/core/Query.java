package com.wicresoft.sorm.core;

import java.util.List;

/**
 * 负责查询（对外提供服务的核心类）     1. 增删改的时候传入对象，出来sql  2.传入sql 出来对象
 * @author Joseph Xu
 * 
 *
 */
@SuppressWarnings(value = { "all" })
public interface Query {

	/**
	 * 直接执行一个dml语句
	 * @param sql sql语句
	 * @param params 参数
	 * @return 执行sql语句后，影响的行数
	 */
	public int executeDmlQuery(String sql, Object[] params);
	
	/**
	 * 将一个对象存储到数据库中
	 * @param object 要存储的对象
	 */
	public void insert(Object object); 
	
	/**
	 * 删除对象在数据库中对应的记录（对象所在类对应到表， 通过对象的主键的值对应到记录）
	 * @param object
	 */
	public void delete(Object object); 
	
	/**
	 * 删除clazz类对应的表中的记录（指定主键值id的记录）
	 * @param clazz	跟表对应的类的 Class 对象
	 * @param id 主键的值
	 * @return
	 */
	public void delete(Class clazz,int id);
	
	/**
	 * 更新对象对应的表中的记录，并且只更新对应的字段
	 * @param obj 所要更新的对象
	 * @param fieldNames  更新的属性的列表
	 * @return  执行影响的行数
	 */
	public int update(Object obj, String[] fieldNames);  // update  uname=?  pwd=?
	
	/**
	 * 查询返回多行记录，并将每行记录封装到clazz指定的类的对象中
	 * @param sql 查询语句
	 * @param clazz 封装数据的javabean类的对象中
	 * @param params sql的参数
	 * @return 返回查询到的结果
	 */
	public List queryRows(String sql, Class clazz, Object params[]);
	
	
	/**
	 * 查询返回1行记录，并将每行记录封装到clazz指定的类的对象中
	 * @param sql 查询语句
	 * @param clazz 封装数据的javabean类的对象中
	 * @param params sql的参数
	 * @return 返回查询到的结果
	 */
	public Object queryUniqueRow(String sql, Class clazz, Object params[]);
	
	
	/**
	 * 查询返回一个值（一行一列），并将该值返回
	 * @param sql 查询语句
	 * @param clazz 封装数据的javabean类的对象中
	 * @param params sql的参数
	 * @return 返回查询到的结果
	 */
	public Object queryValue(String sql, Object params[]);
	
	/**
	 * 查询返回一个数字，并将该值返回
	 * @param sql 查询语句
	 * @param clazz 封装数据的javabean类的对象中
	 * @param params sql的参数
	 * @return 返回查询到的结果
	 */
	public Number queryNumber(String sql, Object params[]);
	
	
}
