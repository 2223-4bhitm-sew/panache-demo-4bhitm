package at.htl.entity.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class VehicleDto {

    private String brand;
    private String type;

    //region constructors
    public VehicleDto() {
    }

    public VehicleDto(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }
    //endregion

    //region getter and setter

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    //endregion


    @Override
    public String toString() {
        return String.format("%s %s", brand, type);
    }
}
