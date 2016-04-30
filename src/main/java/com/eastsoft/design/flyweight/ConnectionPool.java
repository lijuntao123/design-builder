package com.eastsoft.design.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

/**
 * ConnectionPool
 * 
 * @author ljt
 * @date 2015年5月6日 下午1:52:49
 */
public class ConnectionPool {

	private final String url = "mysql://129.1.77.9:3306/mydb";
	private final String username = "root";
	private final String passwd = "passwd";
	private final String driverName = "mysql-driver-class";

	private int poolSize = 10;
	private Vector<Connection> pools;

	public ConnectionPool() {
		pools = new Vector<Connection>(poolSize);
		Connection conn = null;
		for (int i = 0; i < poolSize; i++) {
			try {
				Class.forName(driverName);
				conn = DriverManager.getConnection(url, username, passwd);
				pools.add(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	public synchronized void release(Connection conn) {
		pools.add(conn);
	}

	public synchronized Connection getConnection() {
		if (pools.size() > 0) {
			Connection conn = pools.get(0);
			pools.remove(conn);
			return conn;
		}
		return null;

	}

}
