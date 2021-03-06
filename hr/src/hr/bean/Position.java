package hr.bean;

import java.util.Date;
import java.util.List;

public class Position {
   private int pid;
   private int deptId;
   private String posName;
   private Date createTime;
   private Dept dept;
   private List<Employee>list;
   
public Position(int pid, int deptId, String posName, Date createTime) {
	super();
	this.pid = pid;
	this.deptId = deptId;
	this.posName = posName;
	this.createTime = createTime;
}
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}


public Position(int pid, int deptId, String posName) {
	super();
	this.pid = pid;
	this.deptId = deptId;
	this.posName = posName;
}
public String getPosName() {
	return posName;
}
public void setPosName(String posName) {
	this.posName = posName;
}
public Position() {
	super();
	// TODO Auto-generated constructor stub
}
   
}
