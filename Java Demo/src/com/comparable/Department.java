package com.comparable;

public class Department implements Comparable<Department> {
private String depName;
private String depLeader;
private int noOfPersons;
private int depId;
public Department(int depId, String depName, String depLeader, int noOfPersons) {
super();
// set name, id ,leader no of persons
this.depId = depId;
this.depName = depName;
this.depLeader=depLeader;
this.noOfPersons = noOfPersons;
}
@Override
public String toString() {
return "Department [depId=" + depId + ", depName=" + depName + ",depLeader="+depLeader+", noOfPersons=" +noOfPersons+ "]";
}// method ends
//getter for Id
public int getDepId() {
return depId;
}
//setter for Id
public void setDepId(int depId) {
this.depId = depId;
}
//getter for depName
public String getDepName() {
return depName;
}
//setter for depName
public void setDepName(String depName) {
this.depName = depName;
}
//getter for depLeader
public String getDepLeader() {
return depLeader;
}
//setter for depLeader
public void setDepLeader(String depLeader) {
	this.depLeader = depLeader;
}
//getter for NoOfPersons
public int getNoOfPersons() {
return noOfPersons;
}
//setter for NoOfPersons
public void setNoOfPersons(int noOfPersons) {
this.noOfPersons = noOfPersons;
}
@Override
public int compareTo(Department o2){
/*if(noOfPersons==o2.noOfPersons)
return 0;
else if(noOfPersons<o2.noOfPersons)
return 1;
else
return -1;*/
/*return(depName.compareTo(o2.depName));*/
/*if(depId==o2.depId)
return 0;
else if(depId<o2.depId)
return 1;
else
return -1;*/
return(depLeader.compareTo(o2.depLeader));
}
}



 

 