package keyWords;

public class Father {
    int height = 10;
    int numOfSports = 5;

    public Father() {

    }

    public Father(int height) {
        this.height = height;
        System.out.println("Father: " + height);
    }

    public void education() {
        System.out.println("Educated");
    }

}

