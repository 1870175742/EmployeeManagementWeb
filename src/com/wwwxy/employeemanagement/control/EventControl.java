package com.wwwxy.employeemanagement.control;

import java.util.List;

import com.wwwxy.employeemanagement.dao.EventDao;
import com.wwwxy.employeemanagement.entity.EventEntity;


public class EventControl {
	EventDao ed = new EventDao();
	//��ѯ��������
	public List<EventEntity> getAllEvent(){
		return ed.getAllEvent();
	}
	//��������
	public int addEventEntity(EventEntity t){
		return ed.addEventEntity(t);
	}
	//�޸�����
	public int getEventEntityByid(EventEntity t){
		return ed.addEventEntity(t);
	}
	//ɾ������
	public int DropEventEntity(int eId){
		return ed.DropEventEntity(eId);
	}
	
}
