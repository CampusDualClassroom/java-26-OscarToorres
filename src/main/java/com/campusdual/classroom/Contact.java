package com.campusdual.classroom;

import java.text.Normalizer;

public class Contact implements ICallActions{

    private String name;
    private String surnames;
    private String phone;
    private String code;

    public Contact(String name, String surname, String phone) {
        this.name = name;
        this.surnames = surname;
        this.phone = phone;
        this.setCode(surname, name);
    }

    public Contact() {
    }

    @Override
    public void callMyNumber() {
        System.out.println("Llamando a " + this.name + " " + this.surnames + " con telefono" + this.phone);
    }

    @Override
    public void callOtherNumber(String number) {
        System.out.println("Llamando a " + this.name + " " + this.surnames + " con telefono" + number);
    }

    @Override
    public void showContactDetails() {
        System.out.println("Nombre: " + name + " Apellidos: " + surnames + " Telefono: " + phone + " Codigo: " + code);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    private void setCode(String surname, String name) {

        surname = clearText(surname);
        name = clearText(name);

        StringBuilder sb = new StringBuilder();


            sb.append(name.charAt(0));

            String[] surnames = surname.split(" ");

            if(surnames.length == 1){
                sb.append(surname);
            } else if (surnames.length > 1){
                sb.append(surnames[0].charAt(0));
                for (int i = 1; i < surnames.length; i++){
                    sb.append(surnames[i]);
                }


        }

        this.code = sb.toString();
    }

    private String clearText(String text){

        // Paso 1: Eliminar signos diacríticos
        String clearText = Normalizer.normalize(text, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");


        /*
        // Paso 2: Eliminar signos de puntuación y caracteres especiales
        String clearText = text.replaceAll("[\\p{Punct}]", "");
         */
        return clearText.toLowerCase();
    }
}
