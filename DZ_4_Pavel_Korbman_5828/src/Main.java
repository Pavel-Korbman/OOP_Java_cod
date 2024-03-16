public class Main {
    public static void main(String[] args) {
        Book<String> book1 = new Book<>("Война и мир", "Л. Толстой");
        Book<String> book2 = new Book<>("Мир и война", "Б. Акунин");
        Book<String> book3 = new Book<>("Война миров", "Г. Уэллс");
        Book<String> book4 = new Book<>("Мир, или Трактат о свете", "Р. Декарт");
        Book<String> book5 = new Book<>("Война с саламандрами", "К. Чапек");

        LibraryCard<Integer, Boolean> card1 = new LibraryCard<>(10001, false, book1);
        LibraryCard<Integer, Boolean> card2 = new LibraryCard<>(10002, false, book2);
        LibraryCard<Integer, Boolean> card3 = new LibraryCard<>(10003, true, book3);
        LibraryCard<Integer, Boolean> card4 = new LibraryCard<>(10004, true, book4);
        LibraryCard<Integer, Boolean> card5 = new LibraryCard<>(10005, true, book5);

        Library.addInLib(card1);
        Library.addInLib(card2);
        Library.addInLib(card3);
        Library.addInLib(card4);
        Library.addInLib(card5);

        Library.findCard("Война миров");
        System.out.println();
        Library.getCard(10001);
        System.out.println();
        Library.printGiven();







    }
}