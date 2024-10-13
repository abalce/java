public class Book {
    public final String name;
    public final int totalPages;
    public boolean isRead;
    public int readPages;

    public Book (String name, int totalPages){
        this.name = name;
        this.totalPages = totalPages;
        this.isRead = false;
        this.readPages = 0;
    }
    public void addReadPages(int numberOfPages){
        if(numberOfPages < 0){
            System.out.println("Liczba stron ujemna");
            return;
        }
        readPages+=numberOfPages;
        if(readPages>=totalPages){
            readPages = totalPages;
            isRead = true;
        }
    }


}
/*
■W klasie Book powinno się znaleźć:
+Pole finalne zawierające nazwę książki (typu String)
+Pole finalne zawierające ilość stron książki.
+Pole zawierające informacje czy książka jest przeczytana. Na początku każda książka jest nie przeczytana.
+Pole zawierające informacje ile stron zostało przeczytanych. Na początku ma wartość 0.
+Konstruktor z parametrami nazwa i ilość stron.
+Metoda pozwalająca dodać do przeczytanych stron określoną ich liczbę (np. addReadPages(int numberOfPages)).
Jeśli liczba przeczytanych stron jest większa bądź równa ilości wszystkich stron, to oznaczamy tą książkę jako przeczytaną.
(Instrukcja if wygląda tak samo jak w C++)
*/