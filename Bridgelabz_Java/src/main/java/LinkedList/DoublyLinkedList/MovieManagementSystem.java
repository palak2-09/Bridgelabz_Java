package LinkedList.DoublyLinkedList;
import java.util.Scanner;
class MovieNode{
    String title;
    String director;
    int year;
    double rating;

    MovieNode next;
    MovieNode prev;

    MovieNode(String title, String director, int year, double rating){
        this.title=title;
        this.director=director;
        this.year=year;
        this.rating=rating;
        this.next=null;
        this.prev=null;
    }
}
public class MovieManagementSystem {
    MovieNode head=null;
    MovieNode tail=null;

    //1. add a movie at the beginning
    void insertAtBeginning(String title,String director,int year,double rating){
        MovieNode newNode=new MovieNode(title,director,year,rating);

        if(head==null){
            head=tail=newNode;
        }
        else{
            newNode.next=head;
            newNode.prev=null;
            head=newNode;
        }
        System.out.println("Movie added at the beginning.");
    }
    //2. add movie at the end
    void insertAtEnd(String title,String director,int year, double rating){
        MovieNode newNode=new MovieNode(title,director,year,rating);
        if(head==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        System.out.println("Movie added at the end.");
    }
    //3. add movie at a specific position
    void insertAtPosition(String title,String director,int year, double rating, int position){
        if(position<1){
            System.out.println("Invalid position");
            return;
        }
        if(position==1){
            insertAtBeginning(title,director,year,rating);
            return;
        }
        MovieNode temp=head;
        for(int i=0;i<position-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Invalid position");
            return;
        }
        if(temp==tail){
            insertAtEnd(title,director,year,rating);
            return;
        }
        MovieNode newNode=new MovieNode(title, director, year, rating);

        newNode.next=temp.next;
        newNode.prev=temp;
        temp.next.prev=newNode;
        temp.next=newNode;

        System.out.println("Movie added at position " + position + ".");
    }
    //4. remove movie by title
    void removeMovie(String title){
        MovieNode temp=head;

        while(temp!=null && !temp.title.equalsIgnoreCase(title)){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Movie not found");
            return;
        }
        if(temp==head && temp==tail){
            head=tail=null;
        }
        else if(temp==head){
            head=head.next;
            head.prev=null;
        }
        else if(temp==tail){
            tail=tail.prev;
            tail.next=null;
        }
        else{
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
        System.out.println("Movie removed successfully");
    }
    //5. search movies by director
    void searchByDirector(String director){
        MovieNode temp=head;
        boolean found=false;

        while(temp!=null){
            if(temp.director.equalsIgnoreCase(director)){
                displayMovie(temp);
                found=true;
            }
            temp=temp.next;
        }
        if(!found) {
            System.out.println("No movies found for this director");
        }
    }
    //6. search movies by rating
    void searchByRating(double rating){
        MovieNode temp=head;
        boolean found=false;

        while(temp!=null){
            if(Double.compare(temp.rating,rating)==0){
                displayMovie(temp);
                found=true;
            }
            temp=temp.next;
        }
        if(!found){
            System.out.println("No movies found with this rating");
        }
    }
    //helper method to display one movie
    void displayMovie(MovieNode movie) {
        System.out.println("Movie Title: " + movie.title);
        System.out.println("Director: " + movie.director);
        System.out.println("Year of Release: " + movie.year);
        System.out.println("Rating: " + movie.rating);
        System.out.println("----------------------------");
    }
    //7. Display all movies in forward order
    void displayForward(){
        if(head==null){
            System.out.println("No movies found");
            return;
        }

        MovieNode temp=head;
        System.out.println("\n--- Movies (Forward Order) ---");

        while(temp!=null){
            displayMovie(temp);
            temp=temp.next;
        }
    }
    //8. display all movies in reverse order
    void displayReverse(){
        if(tail==null){
            System.out.println("No movies available");
            return;
        }
        MovieNode temp=tail;
        System.out.println("\n--- Movies (Reverse Order) ---");

        while(temp!=null){
            displayMovie(temp);
            temp=temp.prev;
        }
    }
    //9. Update movie rating by title
    void updateRating(String title, double newRating){
        MovieNode temp=head;
        while(temp!=null){
            if(temp.title.equalsIgnoreCase(title)){
                temp.rating=newRating;
                System.out.println("Movie rating updated successfully");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Movie not found");
    }
    //main method
    public static void main(String[] args){
        MovieManagementSystem list=new MovieManagementSystem();
        Scanner sc=new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n===== Movie Management System =====");
            System.out.println("1. Add movie at beginning");
            System.out.println("2. Add movie at end");
            System.out.println("3. Add movie at specific position");
            System.out.println("4. Remove movie by title");
            System.out.println("5. Search movie by director");
            System.out.println("6. Search movie by rating");
            System.out.println("7. Display movies in forward order");
            System.out.println("8. Display movies in reverse order");
            System.out.println("9. Update movie rating");
            System.out.println("10. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                case 2:
                case 3: {
                    System.out.print("Enter movie title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter director: ");
                    String director = sc.nextLine();

                    System.out.print("Enter year of release: ");
                    int year = sc.nextInt();

                    System.out.print("Enter rating: ");
                    double rating = sc.nextDouble();

                    if (choice == 1) {
                        list.insertAtBeginning(title, director, year, rating);
                    } else if (choice == 2) {
                        list.insertAtEnd(title, director, year, rating);
                    } else {
                        System.out.print("Enter position: ");
                        int position = sc.nextInt();

                        list.insertAtPosition(title, director, year, rating, position);
                    }
                    break;
                }
                case 4: {
                    System.out.print("Enter movie title to remove: ");
                    String title = sc.nextLine();

                    list.removeMovie(title);
                    break;
                }

                case 5: {
                    System.out.print("Enter director name: ");
                    String director = sc.nextLine();

                    list.searchByDirector(director);
                    break;
                }

                case 6: {
                    System.out.print("Enter rating to search: ");
                    double rating = sc.nextDouble();

                    list.searchByRating(rating);
                    break;
                }

                case 7:
                    list.displayForward();
                    break;

                case 8:
                    list.displayReverse();
                    break;

                case 9: {
                    System.out.print("Enter movie title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter new rating: ");
                    double rating = sc.nextDouble();

                    list.updateRating(title, rating);
                    break;
                }

                case 10:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 10);

        sc.close();
    }


}
