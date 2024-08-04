public class Ravenclaw extends Hogwarts {
    private final int intellect;
    private final int wisely;
    private final int creative;

    public Ravenclaw(String name, int magicPower, int transgression, int intellect, int wisely, int creative) {
        super(name, magicPower, transgression);
        this.intellect = intellect;
        this.wisely = wisely;
        this.creative = creative;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getWisely() {
        return wisely;
    }

    public int getCreative() {
        return creative;
    }

    @Override
    public String toString() {
        return super.toString() +
                "умен на " + intellect +
                " мудр " + wisely +
                " и полон творчества " + creative;
    }

    public int getPointsRavenclaw() {
        int i = 0;
        i += getMagicPower() + getTransgression() + getIntellect() + getWisely() + getCreative();
        return i;
    }

    public static void compareStudentsRavenclaw(Ravenclaw[] ravenclaws) {
        if (ravenclaws[2].getPointsRavenclaw() > ravenclaws[1].getPointsRavenclaw()) {
            System.out.println(
                    "Студент Когтеврана " + ravenclaws[2].getName() + " сильнее, чем " + ravenclaws[1].getName());
        } else if (ravenclaws[2].getPointsRavenclaw() == ravenclaws[1].getPointsRavenclaw()) {
            System.out.println("Студент Когтеврана " + ravenclaws[2].getName() + " одной силы с " + ravenclaws[1].getName());
        } else {
            System.out.println("Студент Когтеврана " + ravenclaws[2].getName() + " слабее, чем " + ravenclaws[1].getName());
        }
    }
}
