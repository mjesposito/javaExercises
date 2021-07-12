package day9threads;

import java.time.LocalDateTime;

public class MyThread extends Thread {

	public void run() {
		System.out.println(this.getName());
		this.setName("MyThread");
		System.out.println(this.getName());
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		try {
			Thread.sleep(5000);
		} catch (Exception x) {
			x.printStackTrace();
		}
		System.out.println(LocalDateTime.now());
	}

}
