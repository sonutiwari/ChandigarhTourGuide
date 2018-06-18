package in.co.ikai.chandigarhtourguide.feature.dataModels;

public class Location {

    // Declaring all the variables.
    private String nameOfThePlace;
    private int descriptionOfThePlaceId;
    private String linkOfWikipediaPage;
    private int imageIdOfThePlace;

    // Empty constructor.
    public Location() {
    }

    public Location(String nameOfThePlace, int descriptionOfThePlace, String linkOfWikipediaPage
            , int imageIdOfThePlace) {
        this.nameOfThePlace = nameOfThePlace;
        this.descriptionOfThePlaceId = descriptionOfThePlace;
        this.linkOfWikipediaPage = linkOfWikipediaPage;
        this.imageIdOfThePlace = imageIdOfThePlace;
    }

    // Getters and Setters.
    public String getNameOfThePlace() {
        return nameOfThePlace;
    }

    public void setNameOfThePlace(String nameOfThePlace) {
        this.nameOfThePlace = nameOfThePlace;
    }

    public int getDescriptionOfThePlace() {
        return descriptionOfThePlaceId;
    }

    public void setDescriptionOfThePlace(int descriptionOfThePlace) {
        this.descriptionOfThePlaceId = descriptionOfThePlace;
    }

    public String getLinkOfWikipediaPage() {
        return linkOfWikipediaPage;
    }

    public void setLinkOfWikipediaPage(String linkOfWikipediaPage) {
        this.linkOfWikipediaPage = linkOfWikipediaPage;
    }

    public int getImageIdOfThePlace() {
        return imageIdOfThePlace;
    }

    public void setImageIdOfThePlace(int imageIdOfThePlace) {
        this.imageIdOfThePlace = imageIdOfThePlace;
    }

}
