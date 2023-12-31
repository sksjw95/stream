package stream;

public class Student {
    public enum Gender{Male, Female};
    private String name;
    private int score;
    private Gender gender;

    public Student(String name, int score, Gender gender){
        this.name = name;
        this.score = score;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public Gender getGender(){
        return gender;
    }
}
