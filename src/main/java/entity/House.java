package entity;

public class House {
    private final String address;
    private String color;
    private final int numberOfFloors;
    private Owner owner;

    public String getAddress() {
        return address;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }


    public House(String address, String color, int numberOfFloors, Owner owner) {
        this.address = address;
        this.color = color;
        this.numberOfFloors = numberOfFloors;
        this.owner = owner;
    }

    public String getOwnerInfo() {
        return String.format("This house is owned by %s %s which is %d years old.",
                this.owner.getName(),
                this.owner.getSurname(),
                this.owner.getAge());
    }

    public String getFullHouseInfo() {
        String info = String.format("%s This house is %s and has %d floor(s).",
                this.getOwnerInfo(),
                this.getColor(),
                this.getNumberOfFloors());
        return info;
    }

    public void changeColor(String newColor) {
        System.out.println(String.format("The house has been repainted from %s to %s.", color, newColor));
        color = newColor;
    }

}
