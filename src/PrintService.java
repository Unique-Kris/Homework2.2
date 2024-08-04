public class PrintService {
    public static void printGryffindor(Gryffindor[] gryffindors) {
        System.out.println("Ученики Гриффиндора: ");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя " + gryffindor.getName() + " , cила магии " + gryffindor.getMagicPower() +
                    " , трансгрессия " + gryffindor.getTransgression() + " , благородство " + gryffindor.getNobility() +
                    " , храбрость " + gryffindor.getHonor() + " , честь " + gryffindor.getBravery());
        }
    }

    public static void printHufflepuff(Hufflepuff[] hufflepuffs) {
        System.out.println("Ученики Пуффендуй: ");
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Имя " + hufflepuff.getName() + " , cила магии " + hufflepuff.getMagicPower() +
                    " , трансгрессия " + hufflepuff.getTransgression() + " , трудолюбие " + hufflepuff.getIndustriousness() +
                    " , верность " + hufflepuff.getLoyalty() + " , честь " + hufflepuff.getBravery());
        }
    }

    public static void printRavenclaw(Ravenclaw[] ravenclaws) {
        System.out.println("Ученики Когтевран: ");
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя " + ravenclaw.getName() + " , cила магии " + ravenclaw.getMagicPower() +
                    " , трансгрессия " + ravenclaw.getTransgression() + " , ум " + ravenclaw.getIntellect() +
                    " , мудрость " + ravenclaw.getWisely() + " , творчество " + ravenclaw.getCreative());
        }
    }

    public static void printSlytherin(Slytherin[] slytherins) {
        System.out.println("Ученики Слизерин: ");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя " + slytherin.getName() + " , cила магии " + slytherin.getMagicPower() +
                    " , трансгрессия " + slytherin.getTransgression() + " , хитрость " + slytherin.getTrick() +
                    " , решительность " + slytherin.getResolute() + " , амбициозность " + slytherin.getAmbition() +
                    " , находчивость " + slytherin.getResourcefulness() + " , жажда власти " + slytherin.getOverbearing());
        }
    }
}
