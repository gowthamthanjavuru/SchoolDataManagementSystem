
public class Student {
private int id;
private String name;
private int fees;
private int feePaid;
public int getId() {
	return id;
}
public Student(int id, String name, int fees) {
	this.id = id;
	this.name = name;
	this.fees = fees;
	feePaid=0;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getFees() {
	return fees;
}
public void setFees(int fees) {
	this.fees = fees;
}
@Override
public String toString() {
	return "name="+name+" id="+id;
}

}
