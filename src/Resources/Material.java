package Resources;

public class Material {
    private String name;
    private String description;
    private String brand;
    private int series_number;

    public Material(String name, String description, String brand, int series_number) {
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.series_number = series_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeries_number() {
        return series_number;
    }

    public void setSeries_number(int series_number) {
        this.series_number = series_number;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
