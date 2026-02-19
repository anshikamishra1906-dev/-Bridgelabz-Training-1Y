package com.gla;

public class Library {
    private int quantity;
    private Admin admin;
    public LibraryRepository libraryRepository = new LibraryRepository();

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
