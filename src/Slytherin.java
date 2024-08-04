public class Slytherin extends Hogwarts {
    private final int trick;
    private final int resolute;
    private final int ambition;
    private final int resourcefulness;
    private final int overbearing;

    public Slytherin(String name, int magicPower, int transgression, int trick, int resolute, int ambition, int resourcefulness, int overbearing) {
        super(name, magicPower, transgression);
        this.trick = trick;
        this.resolute = resolute;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.overbearing = overbearing;
    }

    public int getTrick() {
        return trick;
    }

    public int getResolute() {
        return resolute;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getOverbearing() {
        return overbearing;
    }

    @Override
    public String toString() {
        return super.toString() +
                "хитер на " + trick +
                " решителен " + resolute +
                " амбициозен " + ambition +
                " находчив " + resourcefulness +
                " и жаждет власти " + overbearing;
    }

    public int getPointsSlytherin() {
        int i = 0;
        i += getMagicPower() + getTransgression() + getTrick() + getResolute() + getAmbition() + getResourcefulness() + getOverbearing();
        return i;
    }

    public static void compareStudentsSlytherin(Slytherin[] slytherins) {
        if (slytherins[0].getPointsSlytherin() > slytherins[1].getPointsSlytherin()) {
            System.out.println(
                    "Студент Слизерина " + slytherins[0].getName() + " сильнее, чем " + slytherins[1].getName());
        } else if (slytherins[0].getPointsSlytherin() == slytherins[1].getPointsSlytherin()) {
            System.out.println("Студент Слизерина " + slytherins[0].getName() + " одной силы с " + slytherins[1].getName());
        } else {
            System.out.println("Студент Слизерина " + slytherins[0].getName() + " слабее, чем " + slytherins[1].getName());
        }
    }
}
