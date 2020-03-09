package hreday.sagar.foodreceipe.EngActivity1;

public class EngPojoClass {


    //String name;
    String image;

    String hobby;


    public EngPojoClass() {
    }

    public EngPojoClass(String image, String hobby) {
        this.image = image;
        this.hobby = hobby;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}