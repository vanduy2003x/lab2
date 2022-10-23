package baivenha;

public class Student{
    private String name;
    private int ID;
    private int scoreMath;
    private int scorePhysic;
    private int scoreChemistry;
    private int avgscore;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", scoreMath=" + scoreMath +
                ", scorePhysic=" + scorePhysic +
                ", scoreChemistry=" + scoreChemistry +
                ", avgscore=" + avgscore +
                '}';
    }

    public Student(String name, int ID, int scoreMath, int scorePhysic, int scoreChemistry, int avgscore) {
        this.name = name;
        this.ID = ID;
        this.scoreMath = scoreMath;
        this.scorePhysic = scorePhysic;
        this.scoreChemistry = scoreChemistry;
        this.avgscore = avgscore;

    }
}
