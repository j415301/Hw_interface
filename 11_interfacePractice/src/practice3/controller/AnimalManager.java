package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] a = new Animal[5];
		a[0] = new Dog("멍멍이","푸들",3);
		a[1] = new Dog("번개","스피츠",5);
		a[2] = new Dog("하양","꼬똥드툴레아",6);
		a[3] = new Cat("코비","페르시안","우리집","회색");
		a[4] = new Cat("솜이","터키쉬앙고라","너네집","흰색");
		
		for(int i=0; i<a.length ; i++) {
			a[i].speak();
		}

	}

}
