package com.wwwxy.employeemanagement.control;

import java.util.List;

import com.wwwxy.employeemanagement.dao.EmployeeDao;
import com.wwwxy.employeemanagement.entity.EmployeeEntity;

public class EmployeeControl {
	EmployeeDao ed = new EmployeeDao();
	
	//�鿴Ա����Ϣ
	public List<EmployeeEntity> getAllEmployee(){
		return ed.getAllEmployee();
	}
	//����������ѯԱ����Ϣ��ģ����ѯ
	public List<EmployeeEntity> getEmployeeByName(String EmpName){
		return ed.getEmployeeByName(EmpName);
	}
	//�޸�Ա����Ϣ
	public boolean UpdateEmployee(EmployeeEntity ee){
		ed.UpdateEmployee(ee);
		boolean flag = true;
		return flag;
	}
	//���ݹ��Ų�ѯԱ��
	public EmployeeEntity getEmployeeById(int EmpId){
		return ed.getEmployeeById(EmpId);
	}
	//����Ա��
	public boolean AddEmployee(EmployeeEntity ee){
		ed.AddEmployee(ee);
		boolean flag=true;
		return flag;
	}
	//ɾ��Ա��
	public boolean DeleteEmployee(int EmpId){
		ed.DeleteEmployee(EmpId);
		boolean flag = true;
		return flag;
		
	}
}
