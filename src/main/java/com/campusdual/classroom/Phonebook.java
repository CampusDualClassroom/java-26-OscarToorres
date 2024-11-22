package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    Map<String,Contact> data;

    public Phonebook() {
        this.data = new HashMap<>();
    }

    public void addContact(Contact c) {

        data.put(c.getCode(), c);

    }

    public void deleteContact(String code) {

        data.remove(code);

    }

    public void showPhonebook() {

        data.forEach((s, contact) -> contact.showContactDetails());

    }

    public Map<String, Contact> getData() {
        return data;
    }

    public void setData(Map<String, Contact> data) {
        this.data = data;
    }

}
