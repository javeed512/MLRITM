package com.crud;

import java.util.List;

public interface IDepartmentService {
	
	
	
	public int addDept(Department dept);
	public int updateDept(Department dept);
	public int deleteDeptByNo(int deptNo);
	public Department getDeptByNo(int deptNo);
	public List<Department>  getAll();

}
