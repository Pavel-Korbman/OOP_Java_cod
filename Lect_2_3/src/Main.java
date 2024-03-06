/** Программа для сохранения файлов в разных форматах*/
public class Main {
    public static void main(String[] args) {

        Notepad notes = new Notepad(); // Создаю блокнот для записи туда новой информации
        notes.newFile();  // Создаю файл этого блокнота
        notes.currentDocument().addAllText("text1"); // Добавляю в файл текст
        notes.currentDocument().addAllText("text2");  // Добавляю в файл текст
        notes.currentDocument().addAllText("text3");  // Добавляю в файл текст
        notes.SaveAs("file1", new Txt());// Сохраняю как
        notes.SaveAs("file2", new Md());
        notes.SaveAs("file3", new Doc());



    }
}