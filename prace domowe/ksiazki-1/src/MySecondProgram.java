
public class MySecondProgram {
    public static void main(String[] args) {
        Book ksiazka1 = new Book("Ksiazka 1", 300);
        Book ksiazka2 = new Book("Ksiazka 2",150);

        System.out.println("ksiazka1 nazwa: "+ksiazka1.name +", ilość stron: "+ksiazka1.totalPages);
        System.out.println("ksiazka2 nazwa: "+ksiazka2.name +", ilość stron: "+ksiazka2.totalPages);

        System.out.println("Przeczytane strony ksiazka 1: "+ksiazka1.readPages);
        System.out.println("Przeczytane strony ksiazka 2: "+ksiazka2.readPages);

        System.out.println("Czy ksiazka 1 jest przeczytana: "+ksiazka1.isRead);
        System.out.println("Czy ksiazka 2 jest przeczytana: "+ksiazka2.isRead);

        ksiazka1.addReadPages(300);
        ksiazka2.addReadPages(100);

        System.out.println("Przeczytane strony ksiazka 1: "+ksiazka1.readPages);
        System.out.println("Przeczytane strony ksiazka 2: "+ksiazka2.readPages);

        System.out.println("Czy ksiazka 1 jest przeczytana: "+ksiazka1.isRead);
        System.out.println("Czy ksiazka 2 jest przeczytana: "+ksiazka2.isRead);



    }
}

/*
■W klasie MySecondProgram powinna znaleźć się metoda main realizująca
poniższy scenariusz:
+Stwórz dwie książki
+Wypisz na ekran ich nazwy i ilość stron.
+Wypisz ilość przeczytanych stron w pierwszej i drugiej książce.
+Wypisz na ekran informacje czy obie książki są przeczytane czy nie.
+Dodaj pierwszej książce tyle stron, aby została ona przeczytana.
+Dodaj drugiej książce tyle stron, aby nie została ona przeczytana.
+Wypisz ilość przeczytanych stron w pierwszej i drugiej książce.
+Wypisz na ekran informacje czy obie książki są przeczytane czy nie.
*/