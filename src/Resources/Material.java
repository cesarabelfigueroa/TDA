package Resources;

public class Material {
    private String name;
    private String description;
    private String brand;
    private String series_number;

    public Material(String name, String description, String brand, String series_number) {
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

    public String getSeries_number() {
        return series_number;
    }

    public void setSeries_number(String series_number) {
        this.series_number = series_number;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
