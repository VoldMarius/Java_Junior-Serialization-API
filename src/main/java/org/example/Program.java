package org.example;

public class Program {
    public static final String FILE_BIN = "students.bin";
    public static final String FILE_JSON = "students.json";
    public static final String FILE_XML = "students.xml";

    public static final String FILE_BIN_2 = "students2.bin";
    public static final String FILE_JSON_2 = "students2.json";
    public static final String FILE_XML_2 = "students2.xml";

    public static void main(String[] args) {



            Student student1 = new Student("Igor", 31, 6.5);
            System.out.println("Создан экземпляр -> " + student1);

            new AppSerializable().app(FILE_BIN, FILE_JSON, FILE_XML, student1);

        }
}