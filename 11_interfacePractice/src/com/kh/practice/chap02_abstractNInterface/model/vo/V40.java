package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen{
	
	public V40() {
		// TODO Auto-generated constructor stub
		setMaker("LG");
	}

	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return "�������, ��� ���� ����";
	}

	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		return "��ȣ�� ������ ��ȭ��ư�� ����";
	}

	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		return "��ȭ�ޱ� ��ư�� ����";
	}

	@Override
	public String picture() {
		// TODO Auto-generated method stub
		return "1200, 1600�� ȭ�� Ʈ���� ī�޶�";
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "������";
	}

	@Override
	public boolean bluetoothPen() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String printInformation() {
		return "V40�� "+getMaker()+"���� ��������� ������ ������ ����.\n"+makeCall()+"\n"+takeCall()
		+"\n"+picture()+"\n"+charge()+"\n"+touch()+"\n������� �� ž�� ���� : "+bluetoothPen();
	}

}
