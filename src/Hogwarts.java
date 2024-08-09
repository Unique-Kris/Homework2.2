public class Hogwarts {
    private final String name;
    private final int magicPower;
    private final int transgression;

    public Hogwarts(String name, int magicPower, int transgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override
    public String toString() {
        return "Студент " + name +
                " обладает силой магии " +
                " и может трансгрессировать на расстоянии " + transgression;
    }

    public static void compareStudents(Hogwarts[] hogwarts) {
        if (hogwarts[0].getMagicPower() + hogwarts[0].getTransgression() > hogwarts[1].getMagicPower() + hogwarts[1].getMagicPower()) {
            System.out.println(
                    "Студент Хогвартса " + hogwarts[0].getName() + " обладает большей силой, чем " + hogwarts[1].getName());
        } else if (hogwarts[0].getMagicPower() + hogwarts[0].getTransgression() == hogwarts[1].getMagicPower() + hogwarts[1].getTransgression()) {
            System.out.println("Сила студента Хогвартса " + hogwarts[0].getName() + " равна силе студента" + hogwarts[1].getName());
        } else {
            System.out.println("Студент Хогвартса " + hogwarts[0].getName() + " обладает меньшей силой, чем " + hogwarts[1].getName());
        }
    }
}
