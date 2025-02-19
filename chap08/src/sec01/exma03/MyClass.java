package sec01.exma03;

import sec01.exam01.Audio;
import sec01.exam01.RemoteControl;
import sec01.exam01.Television;

public class MyClass {
	// 필드
	RemoteControl rc = new Television();
	
	// 생성자
	MyClass() {}
	
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// 메서드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(8);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(3);
	}
}
