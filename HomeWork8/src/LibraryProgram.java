
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action;
        List<Reader> readers = new ArrayList<>(10);
        List<Book> libraryBooks = new ArrayList<>(100);
        int rInd = 0;

        do {
            System.out.println();
            System.out.println("Welcome to our magic Library!!!");
            System.out.println("What do you want to do?");
            System.out.println();
            System.out.println("1 -- Add new reader");
            System.out.println("2 -- Reader wants to take a book");
            System.out.println("3 -- Reader wants to return a book");
            System.out.println("4 -- print reader status ");
            System.out.println("5 -- print status of all readers ");
            System.out.println("6 -- exit from the program");
            System.out.println();
            System.out.println(" enter number of option: ");

            action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1: {
                    if(rInd < 9) {
                            System.out.println("Please enter data for a new reader");
                            System.out.println(" Full Name : ");
                            String fullN = scanner.nextLine();
                            System.out.println("Reader number - 5 digits");
                            int rNum = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println(" faculty - ");
                            String fac = scanner.nextLine();
                            System.out.println("Date of Birth in DD-MM-YYYY format");
                            String dOfB = scanner.nextLine();
                            System.out.println("Phone number");
                            String phoneN = scanner.nextLine();
                            readers.add(new Reader(fullN, rNum, fac, dOfB, phoneN));
                            System.out.println("The reader had been added successfully!");
                            System.out.println();
                            System.out.println(readers);
                            break;
                    }else {
                        System.out.println("The maximum of the readers is reached");
                        break;
                    }
                }

                case 2: {
                    System.out.println("Please enter the book info");
                    System.out.println("please enter the name of the book"); // add info about book
                    //create book
                    String nameOfBook = scanner.nextLine();
                    System.out.println("please enter the author of the book");
                    String authorOfBook = scanner.nextLine();
                    libraryBooks.add(new Book(nameOfBook, authorOfBook));

                    //find a reader
                    System.out.println("Please enter the reader's ticket number");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    for (Reader r: readers) {
                        if (r.getReaderNumber() == number) {
                            r.takeBook(libraryBooks.getLast());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("the reader doesn't exist");
                    }
                    break;
                }

                case 3: {
                    System.out.println("Please enter the name of the book");
                    String takenBookName = scanner.nextLine();
                    System.out.println("please enter the ticket number");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    for (Reader r: readers) {
                        if (r.getReaderNumber() == number) {
                            //reader return a book
                            r.returnBook(takenBookName);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("the reader doesn't exist");
                    }
                    break;
                }

                case 4: {
                    System.out.println("Please enter the ticket number");
                    int number = scanner.nextInt();
                    boolean found = false;
                    for (Reader r: readers) {
                        if (r.getReaderNumber() == number) {
                            r.printStatus();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("the reader doesn't exist");
                    }
                    break;
                }

                case 5:{
                    for (Reader r : readers) {
                            r.printStatus();
                            System.out.println();
                    }
                    break;
                 }

                case 6:{
                    System.out.println("Exiting from program");
                    break;
                }

                default:{
                    System.out.println("Command doesn't recognized, try again");
                    System.out.println();
                }
            }
        } while (action != 6);
    }
    }