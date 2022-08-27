package dto;

public class Stage {

    private String id;


    public Stage() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "id='" + id + '\'' +
                '}';
    }
}
