package com.jianle.common;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	
	private static final SimpleDateFormat YEAR_MONTH_DAY_HH_MM_SS = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");
	
	private static final SimpleDateFormat yearMonthDayHHMMss = new SimpleDateFormat(
			"yyyyMMddHHmmss");
	
	private static final SimpleDateFormat YEAR_MONTH_DAY = new SimpleDateFormat(
			"yyyy-MM-dd");
	
	private static final SimpleDateFormat yearMonthDay = new SimpleDateFormat(
			"yyyyMMdd");
	
	private static final SimpleDateFormat HH_MM_SS = new SimpleDateFormat(
			"HH:mm:ss");
	
	public static Date getYesterdayStart(Date today){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		calendar.add(Calendar.DATE, -1);
		calendar.set(Calendar.HOUR, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		return calendar.getTime();
	}
	
	public static Date getYesterdayEnd(Date today){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		calendar.add(Calendar.DATE, -1);
		calendar.set(Calendar.HOUR, 23);
		calendar.set(Calendar.MINUTE, 59);
		return calendar.getTime();
	}
	
	public static long getSecond(Date date){
		if(date==null){
			return 0;
		}
		return date.getTime()/1000;
	}

    /**
     * add by reese
     * @param date 日期
     * @param n 前几天 参数
     * @return
     */
    public static  String getNdaysBefore(Date date , int n){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DAY_OF_MONTH, -n);  //设置为前一天
        Date dBefore = c.getTime();   //得到前n天的时间
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") ;//设置时间格式
        String defaultStartDate = sdf.format(dBefore);    //格式化前一天
        return defaultStartDate ;
    }
    
    
    /**
	 * 获得当前日期时间
	 * <p>
	 * 日期时间格式yyyy-MM-dd HH:mm:ss
	 * 
	 * @return
	 */
	public static String currentDatetime() {
		return YEAR_MONTH_DAY_HH_MM_SS.format(now());
	}
	
	/**
	 * 获得当前时间的<code>java.util.Date</code>对象
	 * 
	 * @return
	 */
	public static Date now() {
		return new Date();
	}
	
	/**
     * 格式化日期时间
     * 
     * @param date
     * @param simpleDateFormat
     */
	public static String formatDatetime() {
	    Date date = new Date();
        return yearMonthDayHHMMss.format(date);
    }
	
	public static void main(String[] args) {
		Date date = new Date();
		Timestamp timeStamp = new Timestamp(date.getTime());
		System.out.println("==============>" + timeStamp + "==" + date);
		
		
		System.out.println("==============>" + Calendar.getInstance().getTime());
	}
}
