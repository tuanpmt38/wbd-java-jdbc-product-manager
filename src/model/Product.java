package model;

public class Product {
    private int id;
    private String code;
    private String name;
    private double price;
    private int category_id;

    public Product(){}
    public Product( String code, String name, double price, int category_id){
        this.code = code;
        this.name = name;
        this.price = price;
        this.category_id = category_id;
    }

    public Product(int id,String name,  String code, float price, int category_id) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.price = price;
        this.category_id = category_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
}
