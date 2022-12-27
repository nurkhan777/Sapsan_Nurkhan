package org.example;

import java.util.ArrayList;

public class Kazakh {
    private String ru;
    private String name;
    private String[] zhetiAta = new String[7];

    public Kazakh(String ru, String name) {
        this.ru = ru;
        this.name = name;
    }

    public Kazakh(String ru, String name, String[] zhetiAta) {
        this.ru = ru;
        this.name = name;
        this.zhetiAta = zhetiAta;
    }

    public String getRu() {
        return ru;
    }

    public void setRu(String ru) {
        this.ru = ru;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getZhetiAta() {
        for (int i = 0; i < zhetiAta.length; i++) {
            System.out.print(zhetiAta[i] + ", ");
        }
    }

    public void setZhetiAta(String[] zhetiAta) {
        this.zhetiAta = zhetiAta;
    }
}
