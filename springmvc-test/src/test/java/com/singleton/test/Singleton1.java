package com.singleton.test;

/**
 * 饱/懒汉模式（懒加载）
 *
 * @author Gabriel
 * @desc 好处是更启动速度快、节省资源，一直到实例被第一次访问，才需要初始化单例；小坏处是写起来麻烦，大坏处是线程不安全，if语句存在竞态条件
 */
public class Singleton1 {
	
	private static Singleton1 singleton = null;
	private Singleton1() {}
	public static Singleton1 getInstance() {
		if (singleton == null) {
			singleton = new Singleton1();
		}
		return singleton;
	}

}
