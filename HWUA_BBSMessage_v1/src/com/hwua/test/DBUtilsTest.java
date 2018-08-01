package com.hwua.test;

import org.junit.Test;

import com.hwua.tools.DBUtil;

public class DBUtilsTest {

	@Test
	public void testConnection() {
		DBUtil.getConnection();
	}

}
