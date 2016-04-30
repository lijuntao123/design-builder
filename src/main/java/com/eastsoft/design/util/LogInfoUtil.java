package com.eastsoft.design.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * LogInfoUtil
 * 
 * @author ljt
 * @date 2015-4-30 17:32:57
 */
public class LogInfoUtil {
	private String className = null;

	private LogInfoUtil(String className) {
		this.className = className;
	}

	public static LogInfoUtil getLogInfoUtil(String className) {
		return new LogInfoUtil(className);

	}

	public void info(String format, String content1) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String timeStr = sdf.format(new Date());
		String format1 = format.replace("{}", "%s");
		String format2 = String.format(format1, content1);
		System.out.println("[" + timeStr + "] |" + className + " | " + format2);
	}

	public void info(String format, String content1, String content2) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String timeStr = sdf.format(new Date());
		String format1 = format.replace("{}", "%s");
		String format2 = String.format(format1, content1, content2);
		System.out.println("[" + timeStr + "] |" + className + " | " + format2);
	}

	public void info(String format, String content1, String content2,
			String content3) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String timeStr = sdf.format(new Date());
		String format1 = format.replace("{}", "%s");
		String format2 = String.format(format1, content1, content2, content3);
		System.out.println("[" + timeStr + "] |" + className + " | " + format2);
	}

	public static void print(String className, String format, String content1) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String timeStr = sdf.format(new Date());
		String format1 = format.replace("{}", "%s");
		String format2 = String.format(format1, content1);
		System.out.println("[" + timeStr + "] |" + className + " | " + format2);
	}

	public static void print(String className, String format, String content1,
			String content2) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String timeStr = sdf.format(new Date());
		String format1 = format.replace("{}", "%s");
		String format2 = String.format(format1, content1, content2);
		System.out.println("[" + timeStr + "] |" + className + " | " + format2);
	}

	public static void print(String className, String format, String content1,
			String content2, String content3) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String timeStr = sdf.format(new Date());
		String format1 = format.replace("{}", "%s");
		String format2 = String.format(format1, content1, content2, content3);
		System.out.println("[" + timeStr + "] |" + className + " | " + format2);
	}

}
