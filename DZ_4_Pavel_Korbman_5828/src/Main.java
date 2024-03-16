public class Main {
    public static void main(String[] args) {

        LibraryCard<Integer, Boolean> card1 = new LibraryCard<>
                (10001, false, new Book<>("Война и мир", "Л. Толстой"));
        LibraryCard<Integer, Boolean> card2 = new LibraryCard<>
                (10002, false, new Book<>("Мир и война", "Б. Акунин"));
        LibraryCard<Integer, Boolean> card3 = new LibraryCard<>
                (10003, false, new Book<>("Война миров", "Г. Уэллс"));
        LibraryCard<Integer, Boolean> card4 = new LibraryCard<>
                (10004, false, new Book<>("Мир, или Трактат о свете", "Р. Декарт"));
        LibraryCard<Integer, Boolean> card5 = new LibraryCard<>
                (10005, false, new Book<>("Война с саламандрами", "К. Чапек"));

        Library.addInLib(card1);
        Library.addInLib(card2);
        Library.addInLib(card3);
        Library.addInLib(card4);
        Library.addInLib(card5);

        card1.setBookInfo(true);
        card2.setBookInfo(true);
        card3.setBookInfo(true);
        card4.setBookInfo(true);

        Library.findCard("Война миров");
        System.out.println();

        Library.getCard(10005);
        System.out.println();

        Library.printGiven();


    }
}