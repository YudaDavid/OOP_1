package tirgul_2_interface;

public class Student implements Comparable<Student>{
    int id;
    String name;

    public Student(int id, String name){
        this.id= id;
        this.name= name;
    }

    @Override
    public int compareTo(Student o) {
        if(id < o.id) return -1;
        else if(id > o.id) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
