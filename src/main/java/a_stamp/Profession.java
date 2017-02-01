package a_stamp;

/**
 * Created by john on 31.01.17.
 */
public class Profession {
    private String second_name;
    private String working;
    private int experience;

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getWorking() {
        return working;
    }

    public void setWorking(String working) {
        this.working = working;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

//----------------------------------------------------------------------------------------------------------------------


    @Override
    public String toString() {
        return "Profession{" +
                "second_name='" + second_name + '\'' +
                ", working='" + working + '\'' +
                ", experience=" + experience +
                '}';
    }



}