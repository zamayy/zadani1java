public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;
    public Student(String firstName, String lastName, String group, double averageMark){
        this.averageMark = averageMark;
        this.firstName = firstName;
        this.group = group;
        this.lastName = lastName;
    }
    int getscolarship(){
        return averageMark == 5 ? 10000 : 8000;
    }
}
