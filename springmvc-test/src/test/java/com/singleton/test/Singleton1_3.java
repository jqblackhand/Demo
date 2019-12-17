package com.singleton.test;

/**
 * 饱汉模式（懒加载）
 *
 * @author Gabriel
 * @desc 增加了volatile关键字,线程安全
 */
public class Singleton1_3 {
	
	private static volatile Singleton1_3 singleton = null;
	
	public int f1 = 1; // 触发部分初始化问题
	public int f2 = 2;
	private Singleton1_3() {}
	
	public static Singleton1_3 getInstance() {
		if (singleton == null) {
			synchronized (Singleton1_3.class) {
				if (singleton == null) {
					singleton = new Singleton1_3();
				}
			}
		}
		return singleton;
	}

}
