package LinkedList.SinglyLinkedList;
import java.util.Scanner;
class Node{
    int rollNumber;
    String name;
    int age;
    char grade;
    Node next;

    Node(int rollNumber,String name, int age, char grade){
        this.rollNumber=rollNumber;
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.next=null;
    }
}
public class StudentRecordManagement {
    Node head=null;

    //1. add student at the beginning
    void insertAtBeginning(int rollNumber, String name, int age, char grade){
        Node newNode=new Node(rollNumber,name, age, grade);

        newNode.next=head;
        head=newNode;

        System.out.println("Student added at the beginning");
    }
    //2. add student at the end
    void insertAtEnd(int rollNumber, String name, int age, char grade){
        Node newNode=new Node(rollNumber, name, age, grade);

        if(head==null){
            head=newNode;
            System.out.println("Student added at the end");
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        System.out.println("Student added at the end");
    }
    //3. add student at specific position
    void insertAtPosition(int rollNumber, String name, int age, char grade, int position){
        if(position<1){
            System.out.println("Invalid position");
        }
        if(position==1){
            insertAtBeginning(rollNumber, name, age, grade);
            return;
        }
        Node newNode=new Node(rollNumber,name,age,grade);
        Node temp=head;

        for(int i=1;i<position-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Invalid position");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        System.out.println("Student added at position: "+position+ ".");
    }
    //4. delete student by roll number
    void deleteStudent(int rollNumber){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.rollNumber==rollNumber){
            head=head.next;
            System.out.println("Student deleted successfully");
            return;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.rollNumber!=rollNumber){
            temp=temp.next;
        }

        if(temp.next==null){
            System.out.println("Student not found");
            return;
        }
        temp.next=temp.next.next;
        System.out.println("Student deleted successfully");
    }
    //5. search student by roll number
    void searchStudent(int rollNumber){
        Node temp=head;
        while(temp!=null){
            if (temp.rollNumber == rollNumber) {
                System.out.println("Student found!");
                System.out.println("Roll Number: " + temp.rollNumber);
                System.out.println("Name: " + temp.name);
                System.out.println("Age: " + temp.age);
                System.out.println("Grade: " + temp.grade);
                return;
            }

            temp=temp.next;
        }
        System.out.println("Student not found");
    }
    //6. display all student records
    void displayStudents(){
        if(head==null){
            System.out.println("No student records available");
            return;
        }
        Node temp=head;
        System.out.println("Student record:");
        while(temp!=null){
            System.out.println("Roll Number: " + temp.rollNumber);
            System.out.println("Name: " + temp.name);
            System.out.println("Age: " + temp.age);
            System.out.println("Grade: " + temp.grade);
            System.out.println("----------------------");

            temp = temp.next;
        }
    }
    //7. update student grade by rollnumber
    void updateGrade(int rollNumber, char newGrade){
        Node temp=head;
        while(temp!=null){
            if(temp.rollNumber==rollNumber){
                temp.grade=newGrade;
                System.out.println("Grade updated successfully");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Student not found");
    }
    //main method
    public static void main(String[] args){
        StudentRecordManagement list=new StudentRecordManagement();
        Scanner sc=new Scanner(System.in);

        int choice;

        do{
            System.out.println("\n===== Student Record Management =====");
            System.out.println("1. Add student at beginning");
            System.out.println("2. Add student at end");
            System.out.println("3. Add student at specific position");
            System.out.println("4. Delete student by roll number");
            System.out.println("5. Search student by roll number");
            System.out.println("6. Display all students");
            System.out.println("7. Update student grade");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice=sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1: {
                    System.out.print("Enter roll number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter grade: ");
                    char grade = sc.nextLine().charAt(0);

                    list.insertAtBeginning(roll, name, age, grade);
                    break;
                }
                case 2:{
                    System.out.print("Enter roll number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter grade: ");
                    char grade = sc.nextLine().charAt(0);

                    list.insertAtEnd(roll, name, age, grade);
                    break;
                }
                case 3: {
                    System.out.print("Enter roll number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter grade: ");
                    char grade = sc.nextLine().charAt(0);

                    System.out.print("Enter position: ");
                    int position = sc.nextInt();

                    list.insertAtPosition(roll, name, age, grade, position);
                    break;
                }
                case 4: {
                    System.out.print("Enter roll number to delete: ");
                    int roll = sc.nextInt();

                    list.deleteStudent(roll);
                    break;
                }
                case 5: {
                    System.out.print("Enter roll number to search: ");
                    int roll = sc.nextInt();

                    list.searchStudent(roll);
                    break;
                }
                case 6:
                    list.displayStudents();
                    break;
                case 7: {
                    System.out.print("Enter roll number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new grade: ");
                    char grade = sc.nextLine().charAt(0);

                    list.updateGrade(roll, grade);
                    break;
                }
                case 8:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }while(choice!=8);

        sc.close();
    }

}
