package com.kumaran.util;

import org.apache.log4j.Logger;

public class LogUtil {

	public static Logger logger(Class classname) {
		return Logger.getLogger(classname);
	}
}
