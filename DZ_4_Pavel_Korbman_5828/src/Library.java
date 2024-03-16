import java.util.*;

public class Library {
    static List<LibraryCard> list = new ArrayList<>();


    public static void addInLib(LibraryCard card) {
        list.add(card);
    }


    /**
     * Вывод списка карточек выданных книг
     */
    public static void printGiven() {
        for (LibraryCard val : list) {
            if ((boolean) val.getBookInfo()) System.out.println(val);
        }
    }

    public static List<LibraryCard> getList() {
        return list;
    }

    public static void findCard(String title) {
        for (LibraryCard val : list) {
            if (val.getBook().getTitle().equals(title)) System.out.println(val);
        }
    }

    public static void getCard(Integer ID) {
        for (LibraryCard val : list) if (val.getiD().equals(ID)) System.out.println(val);
    }
}
