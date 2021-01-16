package sec01.exam01;

public class Television implements RemoteControl {
	// �ʵ�
	private int volume;

	// turnOn() �߻� �޼����� ��ü �޼���
	@Override
	public void turnOn() {
		System.out.println("tv�� �մϴ�");
	}

	// turnOff() �߻�޼����� ��ü �޼���
	@Override
	public void turnOff() {
		System.out.println("tv�� ���ϴ�");
	}

	// setVolume() �߻�޼����� ��ü�޼���
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : " + this.volume);
	}

}