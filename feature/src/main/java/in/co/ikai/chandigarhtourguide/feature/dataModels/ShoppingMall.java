package in.co.ikai.chandigarhtourguide.feature.dataModels;

public class ShoppingMall {

    private String nameOfTheMall;
    private String addressOfTheMall;
    private String openingHoursOfTheMall;
    private String phoneNumberOfTheMall;

    // Empty Constructor.
    public ShoppingMall() {
    }

    // Constructor with arguments.
    public ShoppingMall(String nameOfTheMall, String addressOfThemall, String openingHoursOfTheMall
            , String phoneNumberOfTheMall) {
        this.nameOfTheMall = nameOfTheMall;
        this.addressOfTheMall = addressOfThemall;
        this.openingHoursOfTheMall = openingHoursOfTheMall;
        this.phoneNumberOfTheMall = phoneNumberOfTheMall;
    }

    // Getters and setters.
    public String getNameOfTheMall() {
        return nameOfTheMall;
    }

    public void setNameOfTheMall(String nameOfTheMall) {
        this.nameOfTheMall = nameOfTheMall;
    }

    public String getAddressOfTheMall() {
        return addressOfTheMall;
    }

    public void setAddressOfTheMall(String addressOfThemall) {
        this.addressOfTheMall = addressOfThemall;
    }

    public String getOpeningHoursOfTheMall() {
        return openingHoursOfTheMall;
    }

    public void setOpeningHoursOfTheMall(String openingHoursOfTheMall) {
        this.openingHoursOfTheMall = openingHoursOfTheMall;
    }

    public String getPhoneNumberOfTheMall() {
        return phoneNumberOfTheMall;
    }

    public void setPhoneNumberOfTheMall(String phoneNumberOfTheMall) {
        this.phoneNumberOfTheMall = phoneNumberOfTheMall;
    }

    // To string method declaration.
    @Override
    public String toString() {
        return "ShoppingMall{" +
                "nameOfTheMall='" + nameOfTheMall + '\'' +
                ", addressOfThemall='" + addressOfTheMall + '\'' +
                ", openingHoursOfTheMall='" + openingHoursOfTheMall + '\'' +
                ", phoneNumberOfTheMall='" + phoneNumberOfTheMall + '\'' +
                '}';
    }
}
