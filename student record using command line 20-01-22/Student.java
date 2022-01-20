class Student
{
    String rollNum, name;
    int marks1, marks2, marks3;

    public Student(String name, String rollNum, int marks1, int marks2, int marks3)
    {
        this.rollNum = rollNum;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public void display()
    {
        System.out.println("Name: " + name + "\nRoll num: " + rollNum + "\nmarks1: " + marks1 + "\nmarks2: " + marks2
                + "\nmarks3: " + marks3);
    }
    
    public static void main(String args[])
    {
        Student obj = new Student(args[0], args[1], Integer.parseInt(args[2]), Integer.parseInt(args[3]),
                Integer.parseInt(args[4]));
        obj.display();
    }

}