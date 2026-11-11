/*
1. Smart Warehouse Management System
Concepts: Generic Classes, Bounded Type Parameters, Wildcards
Problem Statement:
You are developing a Smart Warehouse System that manages different types of items like Electronics, Groceries, and Furniture. The system should be able to store and retrieve items dynamically while maintaining type safety.
Hints:
Create an abstract class WarehouseItem that all items extend (Electronics, Groceries, Furniture).
Implement a generic class Storage<T extends WarehouseItem> to store items safely.
Implement a wildcard method to display all items in storage regardless of their type (List<? extends WarehouseItem>).

 */
package Generics;
import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem{
    String name;
    double price;

    WarehouseItem(String name, double price){
        this.name=name;
        this.price=price;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
}
class Electronics extends WarehouseItem{
    Electronics(String name, double price){
        super(name, price);
    }
}
class Groceries extends WarehouseItem{
    Groceries(String name, double price){
        super(name, price);
    }
}
class Furniture extends WarehouseItem{
    Furniture(String name, double price){
        super(name, price);
    }
}

class Storage<T extends WarehouseItem>{
    private List<T> items= new ArrayList<>();
    void addItem(T item){
        items.add(item);
    }
    List<T> getItems(){
        return items;
    }

}
public class SmartWarehouseManagementSystem {
    void displayItems(List<? extends WarehouseItem>items){
        for(WarehouseItem item: items){
            item.display();
            System.out.println("------------------");
        }
    }
    public static void main(String[] args){
        SmartWarehouseManagementSystem warehouse=new SmartWarehouseManagementSystem();
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceryStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(new Electronics("Laptop", 60000));
        electronicsStorage.addItem(new Electronics("Mobile", 25000));

        groceryStorage.addItem(new Groceries("Rice", 1000));
        groceryStorage.addItem(new Groceries("Sugar", 50));

        furnitureStorage.addItem(new Furniture("Table", 5000));
        furnitureStorage.addItem(new Furniture("Chair", 2000));

        System.out.println("ELECTRONICS");
        warehouse.displayItems(electronicsStorage.getItems());

        System.out.println("GROCERIES");
        warehouse.displayItems(groceryStorage.getItems());

        System.out.println("FURNITURE");
        warehouse.displayItems(furnitureStorage.getItems());

    }
}
