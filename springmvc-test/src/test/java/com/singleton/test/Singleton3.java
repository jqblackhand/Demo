package com.singleton.test;

/**
 * Holder模式
 *
 * @author Gabriel
 * @desc 既希望利用饿汉模式中静态变量的方便和线程安全；又希望通过懒加载规避资源浪费。Holder模式满足了这两点要求：核心仍然是静态变量，
 * 足够方便和线程安全；通过静态的Holder类持有真正实例，间接实现了懒加载
 */
public class Singleton3 {
	
	private static class SingletonHolder {
		private static final Singleton3 singleton = new Singleton3();
		private SingletonHolder() {}
	}
	private Singleton3() {}
	
	public static Singleton3 getInstance() {
		return SingletonHolder.singleton;
	}

}
