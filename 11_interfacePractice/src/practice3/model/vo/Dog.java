package practice3.model.vo;

public class Dog extends Animal{
	
	public final String PLACE = "애견까페";
	private int weight;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPLACE() {
		return PLACE;
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(toString()+" 몸무게는 "+weight+"kg입니다.");
	}

}
