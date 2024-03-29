package org.example.constuctorIngestion;

public class Certificate {
    @Override
    public String toString() {
        return "Certificate{" +
                "name='" + name + '\'' +
                '}';
    }

    public Certificate(String name) {
        this.name = name;
    }

     String name;
}
