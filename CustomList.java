package Home_App;

public class CustomList {
    int imagee;
    String name;

    public int getImagee() {
        return imagee;
    }

    public void setImagee(int imagee) {
        this.imagee = imagee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomList(int imagee, String name) {
        this.imagee = imagee;
        this.name = name;
    }
}
