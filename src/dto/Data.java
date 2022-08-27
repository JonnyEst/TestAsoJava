package dto;

import java.util.List;

public class Data {
    private Stage stage;
    private String frequency;
    private List<EquipmentItems> equipmentItemsList;


    public Data() {
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public List<EquipmentItems> getEquipmentItemsList() {
        return equipmentItemsList;
    }

    public void setEquipmentItemsList(List<EquipmentItems> equipmentItemsList) {
        this.equipmentItemsList = equipmentItemsList;
    }

    @Override
    public String toString() {
        return "Data{" +
                "stage=" + stage +
                ", frequency='" + frequency + '\'' +
                ", equipmentItemsList=" + equipmentItemsList +
                '}';
    }
}
