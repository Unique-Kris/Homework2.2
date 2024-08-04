public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int magicPower, int transgression, int nobility, int honor, int bravery) {
        super(name, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                "благороден на " + nobility +
                " храб " + honor +
                " и обладает честью " + bravery;
    }

    public int getPointsGryffindor() {
        int i = 0;
        i += getMagicPower() + getTransgression() + getNobility() + getHonor() + getBravery();
        return i;
    }

    public static void compareStudentsGryffindor(Gryffindor[] gryffindors) {
        if (gryffindors[2].getPointsGryffindor() > gryffindors[1].getPointsGryffindor()) {
            System.out.println(
                    "Студент Гриффиндора " + gryffindors[2].getName() + " сильнее, чем " + gryffindors[1].getName());
        } else if (gryffindors[2].getPointsGryffindor() == gryffindors[1].getPointsGryffindor()) {
            System.out.println("Студент Гриффиндора " + gryffindors[2].getName() + " одной силы с " + gryffindors[1].getName());
        } else {
            System.out.println("Студент Гриффиндора " + gryffindors[2].getName() + " слабее, чем " + gryffindors[1].getName());
        }
    }
}

