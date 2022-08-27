package dto;

public class EquipmentItems {

    private String id;
    private Price price;
    private String detail;


    public EquipmentItems() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "EquipmentItems{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", detail='" + detail + '\'' +
                '}';
    }
}
