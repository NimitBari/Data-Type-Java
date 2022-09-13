package OOPConcept;

public class student {
String firstname;
String lastname;
int mobnum;
int dob;



student(String fn ,String ln ,int mn ,int dob) {
	this.firstname=fn;
	this.lastname=ln;
	this.mobnum=mn;
	this.dob=dob;
}

public void display() {
	System.out.println("firstname: "+this.firstname);
	System.out.println("lasttname: "+this.lastname);
	System.out.println("mobnum: "+this.mobnum);
	System.out.println("dob: "+this.dob);
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
    student s1 = new student("Nimit","Bari",703021744,5/4/1999);
    s1.display();
	}

}
