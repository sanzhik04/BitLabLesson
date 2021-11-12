//Student.java
import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    String name;
    String surname;
    ArrayList<Subject> subjects = new ArrayList();

    public Student(){
        this.name = "";
        this.surname = "";
    }

    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void AddSubject(Subject subject){
        subjects.add(subject);
    }

    public void listSubjects(){
        for(int i=0;i< subjects.size();i++){
            System.out.println(subjects.get(i));
        }
    }

    @Override
    public String toString() {
        return name+" "+surname;
    }
}
