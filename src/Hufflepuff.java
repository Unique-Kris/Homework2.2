public class Hufflepuff extends Hogwarts {
    private final int industriousness;
    private final int loyalty;
    private final int bravery;

    public Hufflepuff(String name, int magicPower, int transgression, int industriousness, int loyalty, int bravery) {
        super(name, magicPower, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.bravery = bravery;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                "трудолюбив на " + industriousness +
                " верен " + loyalty +
                " и обладает честью " + bravery;
    }

    public int getPointsHufflepuff() {
        int i = 0;
        i += getMagicPower() + getTransgression() + getIndustriousness() + getLoyalty() + getBravery();
        return i;
    }

    public static void compareStudentsHufflepuff(Hufflepuff[] hufflepuffs) {
        if (hufflepuffs[2].getPointsHufflepuff() > hufflepuffs[0].getPointsHufflepuff()) {
            System.out.println(
                    "Студент Пуффиндора " + hufflepuffs[2].getName() + " сильнее, чем " + hufflepuffs[0].getName());
        } else if (hufflepuffs[2].getPointsHufflepuff() == hufflepuffs[0].getPointsHufflepuff()) {
            System.out.println("Студент Пуффиндора " + hufflepuffs[2].getName() + " одной силы с " + hufflepuffs[0].getName());
        } else {
            System.out.println("Студент Пуффиндора " + hufflepuffs[2].getName() + " слабее, чем " + hufflepuffs[0].getName());
        }
    }
}
