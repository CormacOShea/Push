package labsheet5.exercise1;

//TestBook.java
/*A driver class for the Book class based on Exercise 4 which gets the user to create objects
*their favourite and least-favourite books , using the user-supplied values on input dialogs
 */



import Lab3.exercise2.Computer;

import javax.swing.*;
import java.awt.*;

public class TestBook {
    public static void main(String[] args) {

        String title, ISBN, output = "";
        double price;
        int pages;

        Computer c1 = new Computer();

        System.out.println(c1.getManufacturer());

       JTextArea textArea = new JTextArea();
       Font font = new Font("monospaced", Font.PLAIN,12);
       textArea.setFont(font);

       textArea.setText(String.format("%-25s%-9s%-15s%s", "Title","Price","ISBN","Pages"));

       title = JOptionPane.showInputDialog("Please enter the title of your favourite book");
       price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your favourite book"));
       ISBN = JOptionPane.showInputDialog("Please enter the ISBN of your favourite book");
       pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages of your favourite book"));

       labsheet4.exercise5.Book favouriteBook = new labsheet4.exercise5.Book(title,price,ISBN,pages);

       output += String.format("\n\n%-25s%-9.2f%-15s%d",favouriteBook.getTitle(),favouriteBook.getPrice(),
               favouriteBook.getISBN(),favouriteBook.getPages());

        title = JOptionPane.showInputDialog("Please enter the title of your least favourite book");
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your least favourite book"));
        ISBN = JOptionPane.showInputDialog("Please enter the ISBN of your least favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages of your least favourite book"));

        labsheet4.exercise5.Book leastFavouriteBook = new Book(title,price,ISBN,pages);

        output += String.format("\n\n%-25s%-9.2f%-15s%d", leastFavouriteBook.getTitle(),leastFavouriteBook.getPrice(),
                leastFavouriteBook.getISBN(),leastFavouriteBook.getPages());

        textArea.append(output);

        JOptionPane.showMessageDialog(null,textArea,"Book Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }
}
