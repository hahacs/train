package com.keep.train.util;

import java.lang.reflect.Field;

import com.keep.train.model.TrainResource;

public class GenerateCodeUtils {
	
	public static void generateDtoSet(Object object){
		Class class1 =object.getClass();
		String classNameR = class1.getSimpleName();
		String className = changeCase("lowwer",classNameR);
		
		System.out.println(classNameR + " "+className+" = new "+classNameR+"();");
		Field[] fields = class1.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			String field = fields[i].getName();
			printFieldsDoSet(className,field);
		}
		
		
	}
	
	public static void generateSql(Object object){
		
		Class class1 =object.getClass();
		String classNameR = class1.getSimpleName();
		String className = changeCase("lowwer",classNameR);
		
		System.out.println("DbUtils dbUtils = new DbUtils();");
		System.out.println(classNameR+"Dao "+className+"Dao = new "+classNameR+"Dao();");
		System.out.println();
		System.out.println("Connection con =null;");
		System.out.println("try {");
		System.out.println("	con = dbUtils.getCon();");
		System.out.println("} catch (Exception e) {");
		System.out.println("	e.printStackTrace();");
		System.out.println("} finally{");
		System.out.println("	try {");
		System.out.println("		dbUtils.closeCon(con);");
		System.out.println("	} catch (Exception e) {");
		System.out.println("		e.printStackTrace();");
		System.out.println("	}");
		System.out.println("}");
		
	}
	
	public static void generateInsert(Object object){
		
		Class class1 =object.getClass();
		String classNameR = class1.getSimpleName();
		String className = changeCase("lowwer",classNameR);
		
		Field[] fields = class1.getDeclaredFields();
		int fieldNo=fields.length;
		
		System.out.println("String sql=\"insert into "+generateTabName(classNameR)+" values("+generateFieldNum(fieldNo)+")\";");
		System.out.println("PreparedStatement pst = con.prepareStatement(sql);");
		for (int i = 0; i < fieldNo; i++) {
			generateFiled(fields[i],i,className);
		}
		System.out.println();
		System.out.println("return pst.executeUpdate();");
		
	}
	
	private static String generateFiled(Field field,int i,String className){
		i=i+1;
		String typeName = field.getType().getName();
		if("java.lang.String".equals(typeName)){
			System.out.println("pst.setString("+i+", "+className+".get"+changeCase("upper",field.getName())+"());");
		}
		
		if("java.util.Date".equals(typeName)){
			System.out.println("pst.setTimestamp("+i+", "+"new Timestamp("+className+".get"+changeCase("upper",field.getName())+"().getTime()));");
		}
		
		if("int".equals(typeName)){
			System.out.println("pst.setInt("+i+", "+className+".get"+changeCase("upper",field.getName())+"());");
		}
		
		return null;
	}
	
	private static String generateFieldNum(int no){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < no; i++) {
			sb.append(",?");
		}
		return sb.toString().replaceFirst(",", "");
	}
	
	private static String generateTabName(String tabName){
		StringBuilder sb = new StringBuilder();
		sb.append("tab");
		
		for (int i = 0; i < tabName.length(); i++) {
            if (Character.isUpperCase(tabName.charAt(i))) {
            	sb.append("_"+tabName.charAt(i));
            }else{
            	sb.append(tabName.charAt(i));
            }
		}
//		System.out.println(sb.toString().toLowerCase());
		return sb.toString().toLowerCase();
	}
	
	
	public static void printFields(Object object){
		
		Class class1 =object.getClass();
		String classNameR = class1.getSimpleName();
		String className = changeCase("lowwer",classNameR);

		System.out.println(classNameR + " "+className+" = new "+classNameR+"();");
		
		
		Field[] fields = class1.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			String field = fields[i].getName();
			printFieldsDoSet(className,field);
			
//			Class<?> type = fields[i].getType();
		}
	}
	
	public static void printFieldsDoSet(String className,String fieldName){
		System.out.println(className+".set"+changeCase("upper",fieldName)+"();");
	}
	
	/**
	 * 第一个字母大小写转化
	 * @Title: changeCase   
	 * @Description: TODO
	 * @param type
	 * @param fieldName
	 * @return
	 * @return: String
	 * @throws
	 * @author: wuhaopeng
	 * @date:   2017年10月3日 上午11:39:12
	 */
	public static String changeCase(String type,String fieldName){
		String returnString =null;
		if(type.equals("upper")){
			returnString = fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
		}
		if(type.equals("lowwer")){
			returnString = fieldName.substring(0,1).toLowerCase()+fieldName.substring(1);
		}
		
		return returnString;
	}
	
	
	public static void main(String[] args) {
		Object object = new TrainResource();
		
		//生成出入sql的代码
//		generateInsert(object);
		
		//生成调用sql代码
//		generateSql(object);
		
		//生成DTOset代码
		generateDtoSet(object);
		
	}
}
