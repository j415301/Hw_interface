package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] a = new Animal[5];
		a[0] = new Dog("�۸���","Ǫ��",3);
		a[1] = new Dog("����","������",5);
		a[2] = new Dog("�Ͼ�","���˵�������",6);
		a[3] = new Cat("�ں�","�丣�þ�","�츮��","ȸ��");
		a[4] = new Cat("����","��Ű���Ӱ��","�ʳ���","���");
		
		for(int i=0; i<a.length ; i++) {
			a[i].speak();
		}

	}

}
