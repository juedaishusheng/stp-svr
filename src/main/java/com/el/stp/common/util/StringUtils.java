package com.el.stp.common.util;

import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;

/**
 * 各种字符处理函数
 * add by billy 2016-08-10
 */
public abstract class StringUtils {

  private final static Logger logger = LoggerFactory.getLogger(StringUtils.class);

  private final static int SHORT_LENGTH = 40;

  /**
   * 获得对象的某属性值，内部由 apache PropertyUtils具体实现，封装拦截错误异常
   * @param bean
   * @param name
   * @return
   */
  public static Object getValue(Object bean, String name) {
    Object value = null;
    try {
      value = PropertyUtils.getProperty(bean, name);
    } catch (IllegalAccessException e) {
      logger.error(e.getLocalizedMessage());
    } catch (InvocationTargetException e) {
      logger.error(e.getLocalizedMessage());
    } catch (NoSuchMethodException e) {
      logger.error(e.getLocalizedMessage());
    }
    return value;
  }

  /**
   * 将对象（integer或字符串转成Integer）
   * @param obj
   * @return
   */
  public static Integer parseInt(Object obj) {
    if(obj == null){
      return null;
    }
    if (obj instanceof Integer) {
      return (Integer) obj;
    } else if (obj instanceof String && !StringUtils.isEmpty(obj)) {
      return Integer.parseInt(((String)obj).trim());
    }
    return null;
  }
  /**
   * 将对象（long或字符串转成Long）
   * @param obj
   * @return
   */
  public static Long parseLong(Object obj) {
    if(obj == null){
      return null;
    }
    if (obj instanceof Long) {
      return (Long) obj;
    } else if (obj instanceof String && !StringUtils.isEmpty(obj)) {
      return Long.parseLong(((String)obj).trim());
    }
    return null;
  }
  /**
   * 将对象（float或字符串转成float）
   * @param obj
   * @return
   */
  public static Float parseFloat(Object obj) {
    if(obj == null){
      return null;
    }
    if (obj instanceof Float) {
      return (Float) obj;
    } else if (obj instanceof String && !StringUtils.isEmpty(obj)) {
      return Float.parseFloat(((String)obj).trim());
    }
    return null;
  }
  /**
   * 将对象（double或字符串转成double）
   * @param obj
   * @return
   */
  public static Double parseDouble(Object obj) {
    if(obj == null){
      return null;
    }
    if (obj instanceof Float) {
      return (Double) obj;
    } else if (obj instanceof String && !StringUtils.isEmpty(obj)) {
      return Double.parseDouble(((String) obj).trim());
    }
    return null;
  }

  /**
   * 判断两对象是否相等
   * @param obj1
   * @param obj2
   * @return true 相等
   */
  public static boolean strEquals(Object obj1, Object obj2) {
//    return obj1 == null || (obj1 instanceof String && ((String) obj1).length() == 0)
//        ? obj2 == null || (obj2 instanceof String && ((String) obj2).length() == 0)
//        : obj1.equals(obj2);
    return StringUtils.isEmpty(obj1) ? (StringUtils.isEmpty(obj2) ? true : false)
        : ((StringUtils.isEmpty(obj2) ? false : obj1.equals(obj2) ) );
  }
  /**
   * 将超长字符截断显示
   * @param s
   * @return
   */
  public static String cutStr(String s) {
    return StringUtils.cutStr(s,SHORT_LENGTH);
  }
  public static String cutStr(String s, int length) {
    if (s == null || s.length() <= length) {
      return s;
    }
    return s.substring(0, length) + "...";
  }
  /**
   * 检测字符串是否为空(null,"","null")
   * @param str
   * @return 为空则返回true，不否则返回false
   */
  public static boolean isEmpty(Object str) {
    return (str == null || (str.getClass().isArray() && Array.getLength(str) == 0) || "".equals(str) );
  }
  /**
   * 检测字符串是否不为空(null,"","null")
   * @param str
   * @return 不为空则返回true，否则返回false
   */
  public static boolean notEmpty(Object str) {
    return !isEmpty(str);
  }
  /**
   * 字符串转换为字符串数组
   * @param str 字符串
   * @param splitRegex 分隔符
   * @return
   */
  public static String[] strToArray(String str, String splitRegex){
      if (isEmpty(str)){
          return null;
      }
      return str.split(splitRegex);
  }

  /**
   * 用默认的分隔符(,)将字符串转换为字符串数组
   * @param str 字符串
   * @return
   */
  public static String[] strToArray(String str) {
      return strToArray(str, ",\\s*");
  }
  /**
   * 字符转为byte数组
   * @param str
   * @return
   */
  public static byte[] strToByte(String str) {
    if (StringUtils.isEmpty(str)) {
      return null;
    }
    String[] ss = str.split(",");
    byte[] bytes = new byte[ss.length];
    for (int i = 0; i < ss.length; i++) {
      bytes[i] = Byte.parseByte(ss[i]);
    }
    return bytes;
  }
  /**
   * byte数组转为字符
   * @return
   */
  public static String bytesToStr(byte[] bytes) {
    if (StringUtils.isEmpty(bytes)) {
      return "";
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < bytes.length; i++) {
      if (sb.length() > 0) {
        sb.append(",");
      }
      sb.append(Byte.toString(bytes[i]));
    }
    return sb.toString();
  }

  /**
   * 对字符型判断 true or false
   * @param source
   * @return
   */
  public static boolean isTrue(Object source) {
    if (source == null)
      return false;
    if (source instanceof Boolean || source.getClass().equals(boolean.class)) {
      return ((Boolean) source).booleanValue();
    } else if (source instanceof String) {
      String _source = ((String) source).trim().toLowerCase();
      if ("true".equalsIgnoreCase(_source) || "yes".equalsIgnoreCase(_source)
          || "y".equalsIgnoreCase(_source) || "1".equalsIgnoreCase(_source))
        return true;
    }
    return false;
  }
  /**
   * 左补齐空格
   * @param src
   * @param length
   * @return
   */
  public static String leftPad(String src,int length){
    return StringUtils.addPad(src, length, 'L');
  }
  /**
   * 右补齐空格
   * @param src
   * @param length
   * @return
   */
  public static String rightPad(String src,int length){
    return StringUtils.addPad(src, length, 'R');
  }
  private static String addPad(String src,int length,char type){
    if(src == null){
      src="";
    }
    if(src.length()>=length){
      return src;
    }
    StringBuilder sb = new StringBuilder();
    length -= src.length();
    for(int i=0;i<length;i++){
      sb.append(' ');
    }
    if(type == 'L'){
      return src+sb.toString();
    }else{
      return sb.toString()+src;
    }
  }
  /**
   * 去掉字符空格，null返回""
   * @param s
   * @return
   */
  public static String trimAll(String s){
    if(s == null){
      return "";
    }
    return s.trim();
  }
  /**
   * 转为小写字母，null返回""
   * @param s
   * @return
   */
  public static String toLower(String s){
    if(s == null){
      return "";
    }
    return s.toLowerCase();
  }
  /**
   * 转为大写字母，null返回""
   * @param s
   * @return
   */
  public static String toUpper(String s){
    if(s == null){
      return "";
    }
    return s.toUpperCase();
  }


}
