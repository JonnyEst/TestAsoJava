package dto;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Data data = generateData();
        System.out.println(data.toString());
    }

    public static Data generateData(){
        Stage stage = new Stage();
        stage.setId("PLANNING_TO_HAVE_A_BABY");

        Price price = new Price();
        price.setAmount(600);
        price.setCurrency("EUR");

        Price price2 = new Price();
        price2.setAmount(400);
        price2.setCurrency("EUR");

        EquipmentItems equipmentItems = new EquipmentItems();
        equipmentItems.setId("01");

        equipmentItems.setPrice(price);

        EquipmentItems equipmentItems2 = new EquipmentItems();
        equipmentItems2.setId("02");
        equipmentItems2.setDetail("MY STROLLER COSTS 400 EURO");
        equipmentItems2.setPrice(price2);

        List<EquipmentItems> ltsEquipments = new ArrayList<>();
        ltsEquipments.add(equipmentItems);
        ltsEquipments.add(equipmentItems2);


        Data data = new Data();
        data.setStage(stage);
        data.setFrequency("Mon");
        data.setEquipmentItemsList(ltsEquipments);





        return data;
    }

}
