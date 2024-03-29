package org.example.constuctorIngestion;

public class person {
    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", Certificate=" + certificate.name+
                '}';
    }

    private String name;
    private int personId;

    private Certificate certificate;


    public person(String name, int personId, Certificate certificate){
        this.name = name;
        this.personId = personId;
        this.certificate = certificate;
    }
}
