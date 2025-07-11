package com.juaracoding.belajararray;

import java.net.Socket;
import java.util.ArrayList;

import com.juaracoding.belajararray.models.Cart;
import com.juaracoding.belajararray.models.Product;
import com.juaracoding.belajararray.models.ProductException;

public class App {
    public static void main(String[] args) {
        try {
            Product product1 = new Product(
                    "PRD-001",
                    "Produk 1",
                    5000);
            product1.setId("");
            product1.setPrice(-5000);
            Product product2 = new Product(
                    "PRD-002",
                    "Produk 2",
                    25000);
            Product product3 = new Product(
                    "PRD-003",
                    "Produk 3",
                    3000);

            Cart cart1 = new Cart(product1, -100);
            Cart cart2 = new Cart(product2, -5);
            Cart cart3 = new Cart(product3, 20);

            ArrayList<Cart> carts = new ArrayList<Cart>();

            carts.add(cart1);
            carts.add(cart2);
            carts.add(cart3);

            // membawa barang belanjaan ke kasir
            int totalPrice = 0;

            for (Cart cart : carts) {
                cart.calculateSubtotal();
                totalPrice += cart.getSubtotal();
            }

            System.out.println("Harga : " + totalPrice);
        } catch (ProductException e) {
            e.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
