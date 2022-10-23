package baivenha;

public class Avgscore {
    private Student students;

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Avgscore{" +
                "students=" + students +
                '}';
    }
}
