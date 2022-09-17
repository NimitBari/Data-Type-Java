package RegistrationForm;

public class Utilities {
int id;
String firstname,lastname,mobilenumber,Dateofbirth,Emailid;
double Salary;

public Utilities(String string){
	id = 0;
	firstname = "No NAME";
	lastname = "No NAME";
	mobilenumber = "No NUMBER";
	Dateofbirth = "No birth";
	Emailid = "No id";
	Salary = 0.0;
}
public Utilities(){
	this.firstname = firstname;
	this.lastname = lastname;
	this.mobilenumber = mobilenumber;
	this.Dateofbirth = Dateofbirth;
	this.Emailid = Emailid;

}
public String getfirstname() {
	return firstname;
}
public void setfirstname(String firstname) {
	this.firstname = firstname;
}
public String getlastname() {
	return lastname;
}
public void setlastname(String lastname) {
	this.lastname = lastname;
}
public String getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(String mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public String getDateofbirth() {
	return Dateofbirth;
}
public void setDateofbirth(String dateofbirth) {
	Dateofbirth = dateofbirth;
}
public String getEmailid() {
	return Emailid;
}
public void setEmailid(String emailid) {
	Emailid = emailid;
}

public void setSalary(double salary){
	this.Salary = salary;
}
	
	
	
}

