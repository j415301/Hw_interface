package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{
	
	public GalaxyNote9() {
		// TODO Auto-generated constructor stub
		setMaker("�Ｚ");
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
		return "1300�� ���ī�޶�";
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "������, ������ ����";
	}

	@Override
	public boolean bluetoothPen() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public String printInformation() {
		return "������ ��Ʈ9�� "+getMaker()+"���� ��������� ������ ������ ����.\n"+makeCall()+"\n"+takeCall()
		+"\n"+picture()+"\n"+charge()+"\n"+touch()+"\n������� �� ž�� ���� : "+bluetoothPen()+"\n";
	}

}
