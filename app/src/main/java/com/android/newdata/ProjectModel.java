package com.android.newdata;

public class ProjectModel {
    private String  headline, description, price, brand, productType,aboutProduct,origin;
    private String productImage;

    public ProjectModel(String headline, String description, String price, String brand, String productType, String aboutProduct, String origin, String productImage) {
        this.headline = headline;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.productType = productType;
        this.aboutProduct = aboutProduct;
        this.origin = origin;
        this.productImage = productImage;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getAboutProduct() {
        return aboutProduct;
    }

    public void setAboutProduct(String aboutProduct) {
        this.aboutProduct = aboutProduct;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public ProjectModel() {


    }
}
