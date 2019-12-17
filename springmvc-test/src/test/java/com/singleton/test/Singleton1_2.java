package com.singleton.test;

/**
 * 饱汉模式（懒加载）
 *
 * @author Gabriel
 * @desc “双重检查锁”（Double Check Lock，简称DCL）似乎已经达到了理想的效果：懒加载+线程安全。可惜的是，正如注释中所说，
 * DCL仍然是线程不安全的，由于指令重排序，你可能会得到“半个对象”，即”部分初始化“问题
 */
public class Singleton1_2 {
	
	private static Singleton1_2 singleton = null;
	
	public int f1 = 1; // 触发部分初始化问题
	public int f2 = 2;
	private Singleton1_2() {}
	
	public static Singleton1_2 getInstance() {
		if (singleton == null) {
			synchronized (Singleton1_2.class) {
				if (singleton == null) {
					singleton = new Singleton1_2();
				}
			}
		}
		return singleton;
	}

}
