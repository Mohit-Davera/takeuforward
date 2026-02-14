package practice;


import java.util.*;

public class CompareableComparator {

    public static void main(String[] args) {
        Book b = new Book("The Amazing Spiderman", "Raj",1999);
        Book b5 = new Book("Book of Zelda", "MOHIT",1999);
        Book b1 = new Book("BOOK 2", "A",1994);
        Book b2 = new Book("BOOK 4", "B",2000);
        Book b3 = new Book("BOOK 5", "C",1966);
        Book b4 = new Book("BOOK 3", "D",1991);

        List<Book> books = new ArrayList<>(List.of(b,b1,b2,b3,b4,b5));
//        System.out.println(books);
//        Collections.sort(books);
//        System.out.println(books);
//        System.out.println();

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Amy");
        Integer a = names.stream().filter((name) -> name.startsWith("A")).map(name -> name.length()).findFirst().orElse(-1);
        System.out.println(a);


        List<List<Integer>> nestedNumbers = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
        List<Integer> list = nestedNumbers.stream().flatMap(Collection::stream).toList();

        Comparator<Product> ratingDescComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o2.rating,o1.rating);
            }
        };
        Comparator<Product> priceComparator = Comparator.comparing(Product::getPrice);

    }

}
