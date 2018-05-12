package keyWords;

public class Child extends Father {

    public Child() {
        super(12);
    }

    public void higherEducation() {
        super.education();
    }

    public void height() {
        int height = super.height;
        System.out.println("Child: " + height);
    }

    public void athleticSkills() {
        int numOfSports = super.numOfSports;
        System.out.println("Child: " + numOfSports);
    }
}
