package com.example.adddatafregment;

import android.widget.EditText;

public class resturant {
    private EditText name;
    private  EditText price;
    private EditText description;
    private  EditText  location;
    private  EditText phone;

    public resturant(EditText name, EditText price, EditText description, EditText location, EditText phone) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.location = location;
        this.phone = phone;
    }

    public EditText getName() {
        return name;
    }

    public EditText getPrice() {
        return price;
    }

    public EditText getDescription() {
        return description;
    }

    public EditText getLocation() {
        return location;
    }

    public EditText getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "resturant{" +
                "name=" + name +
                ", price=" + price +
                ", description=" + description +
                ", location=" + location +
                ", phone=" + phone +
                '}';
    }
}


