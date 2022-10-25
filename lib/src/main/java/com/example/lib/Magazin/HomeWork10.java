package com.example.lib.Magazin;

import java.util.Comparator;

public class HomeWork10 {
    public static void main(String[] args) {

        Shop shop = new Shop();
        shop.addProduct(new Product(159,"Bananas", 9));
        shop.addProduct(new Product(188,"Pineapple", 2));
        shop.addProduct(new Product(84998,"Cherry", 3));
        shop.addProduct(new Product(98489,"Mango", 5));
        shop.addProduct(new Product(984949,"Apple", 4));
        shop.addProduct(new Product(5454,"Kiwi", 11));
        shop.addProduct(new Product(48994984,"Strawberry", 6));


        System.out.println("Start list:");
        shop.showProductList();
        System.out.println();

        shop.productList.sort(Comparator.comparingInt(Product::getPrice));

        System.out.println("Sorted list by price increment:");
        shop.showProductList();
        System.out.println();

        shop.removeProduct(12343);

        System.out.println("List after deleting an element:");
        shop.showProductList();
        System.out.println();

        shop.editProduct(new Product(123123,"Lemon", 8));

        System.out.println("List after editing an element:");
        shop.showProductList();


    }
}
