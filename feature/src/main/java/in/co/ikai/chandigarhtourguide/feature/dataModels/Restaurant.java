package in.co.ikai.chandigarhtourguide.feature.dataModels;

public class Restaurant {

    private String restaurantName;
    private String restaurantDescription;
    private String restaurantLocation;
    private String restaurantContact;
    private int restaurantImageId;

    // Empty constructor.
    public Restaurant() {
    }

    // Constructor with arguments.
    public Restaurant(String restaurantName, String restaurantDescription
            , String restaurantLocation, String restaurantContact, int restaurantImageId) {
        this.restaurantName = restaurantName;
        this.restaurantDescription = restaurantDescription;
        this.restaurantLocation = restaurantLocation;
        this.restaurantContact = restaurantContact;
        this.restaurantImageId = restaurantImageId;
    }

    // Getters and Setters.
    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantDescription() {
        return restaurantDescription;
    }

    public void setRestaurantDescription(String restaurantDescription) {
        this.restaurantDescription = restaurantDescription;
    }

    public String getRestaurantLocation() {
        return restaurantLocation;
    }

    public void setRestaurantLocation(String restaurantLocation) {
        this.restaurantLocation = restaurantLocation;
    }

    public String getRestaurantContact() {
        return restaurantContact;
    }

    public void setRestaurantContact(String restaurantContact) {
        this.restaurantContact = restaurantContact;
    }

    public int getRestaurantImageId() {
        return restaurantImageId;
    }

    public void setRestaurantImageId(int restaurantImageId) {
        this.restaurantImageId = restaurantImageId;
    }

    // To string method.
    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantName='" + restaurantName + '\'' +
                ", restaurantDescription='" + restaurantDescription + '\'' +
                ", restaurantLocation='" + restaurantLocation + '\'' +
                ", restaurantContact='" + restaurantContact + '\'' +
                ", restaurantImageId=" + restaurantImageId +
                '}';
    }
}
