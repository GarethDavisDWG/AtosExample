package atos.cat;

public class Cat {

    private String name;
    private int lives = 9;
    private int age;
    private String killDiameter;
    private String murderRadius;

    public Cat(){

    }

    public String hairball(String hairball){
        if(hairball == "Wool"){

        }
        return "Cough";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getKillDiameter() {
        return killDiameter;
    }

    public void setKillDiameter(String killDiameter) {
        this.killDiameter = killDiameter;
    }

    public String getMurderRadius() {
        return murderRadius;
    }

    public void setMurderRadius(String murderRadius) {
        this.murderRadius = murderRadius;
    }
}
