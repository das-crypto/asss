package cpax;





 class das{
public static void main(String args[])
{
Student s1 = new Student(1,"ABC",77.1);
Student s2 = new Student(2,"PQR",81.8);
Student s3 = new Student(3,"XYZ",76.5);
s1.show();
s2.show();
s3.show();
}}
 class Student 
 { 
 int roll;
 String name; 
 double marks; 
 Student(int r, String s, double d)
 {
 roll=r;
 name=s;
 marks=d;
 }
 void show()
 {
 System.out.println("Roll No = "+roll);
 System.out.println("Name = "+name);
 System.out.println("Marks = "+marks);
 }}
