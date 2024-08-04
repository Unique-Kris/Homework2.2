public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindor = {
                new Gryffindor("Гарри Поттер", 9, 9, 9, 9, 9),
                new Gryffindor("Гермиона Грейнджер", 8, 9, 8, 8, 9),
                new Gryffindor("Рон Уизли", 6, 7, 6, 5, 6),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 4, 6, 8, 7, 5),
                new Hufflepuff("Седрик Диггори", 5, 6, 7, 6, 5),
                new Hufflepuff("Джастин Финч-Флетчли", 7, 8, 5, 6, 7)
        };
        Ravenclaw[] ravenclaw = {
                new Ravenclaw("Чжоу Чанг", 6, 5, 6, 8, 5),
                new Ravenclaw("Падма Патил", 6, 5, 7, 5, 7),
                new Ravenclaw("Маркус Белби", 5, 6, 6, 7, 5),
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 9, 8, 7, 8, 9, 7, 9),
                new Slytherin("Грэхэм Монтегю", 7, 7, 8, 6, 7, 7, 8),
                new Slytherin("Грегори Гойл", 6, 7, 7, 8, 7, 9, 8)
        };

        PrintService.printGryffindor(gryffindor);
        PrintService.printHufflepuff(hufflepuffs);
        PrintService.printRavenclaw(ravenclaw);
        PrintService.printSlytherin(slytherins);

        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри Поттер", 9, 9),
                new Hogwarts("Гермиона Грейнджер", 8, 9),
                new Hogwarts("Рон Уизли", 6, 7),
                new Hogwarts("Захария Смит", 4, 6),
                new Hogwarts("Седрик Диггори", 4, 6),
                new Hogwarts("Джастин Финч-Флетчли", 7, 8),
                new Hogwarts("Чжоу Чанг", 6, 5),
                new Hogwarts("Падма Патил", 6, 5),
                new Hogwarts("Маркус Белби", 5, 6),
                new Hogwarts("Драко Малфой", 9, 8),
                new Hogwarts("Грэхэм Монтегю", 7, 7),
                new Hogwarts("Грегори Гойл", 6, 7)
        };

        Hogwarts.compareStudents(hogwarts);
        Gryffindor.compareStudentsGryffindor(gryffindor);
        Hufflepuff.compareStudentsHufflepuff(hufflepuffs);
        Ravenclaw.compareStudentsRavenclaw(ravenclaw);
        Slytherin.compareStudentsSlytherin(slytherins);
    }
}
