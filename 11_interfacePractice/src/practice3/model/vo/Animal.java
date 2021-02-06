package practice3.model.vo;

public abstract class Animal {
	
	private String name;
	private String kinds;
	
	protected Animal() {
		// TODO Auto-generated constructor stub
	}

	protected Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}

	@Override
	public String toString() {
		return "���� �̸��� " + name + "�̰�, ������ " + kinds + "�Դϴ�.";
	}
	
	public abstract void speak();

}
