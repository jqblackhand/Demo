package com.singleton.test;

/**
 * 饱汉模式（懒加载）
 *
 * @author Gabriel
 * @desc 绝对线程安全；坏处是并发性能极差，事实上完全退化到了串行。单例只需要初始化一次，但就算初始化以后，synchronized的锁也无法避开，
 * 从而getInstance()完全变成了串行操作
 */
public class Singleton1_1 {
	
	private static Singleton1_1 singleton = null;
	private Singleton1_1() {}
	
	public synchronized static Singleton1_1 getInstance() {
		if (singleton == null) {
			singleton = new Singleton1_1();
		}
		return singleton;
	}

}
