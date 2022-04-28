package com.khamvongsa.victor.poc_getmapapi.Models;

/**
 * Created by <Victor Khamvongsa> on <26/04/2022>
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tags {

    @SerializedName("addr:city")
    @Expose
    private String addrCity;
    @SerializedName("addr:housenumber")
    @Expose
    private String addrHousenumber;
    @SerializedName("addr:postcode")
    @Expose
    private String addrPostcode;
    @SerializedName("addr:street")
    @Expose
    private String addrStreet;
    @SerializedName("amenity")
    @Expose
    private String amenity;
    @SerializedName("cuisine")
    @Expose
    private String cuisine;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("wheelchair")
    @Expose
    private String wheelchair;
    @SerializedName("opening_hours:signed")
    @Expose
    private String openingHoursSigned;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("facebook")
    @Expose
    private String facebook;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("survey:date")
    @Expose
    private String surveyDate;
    @SerializedName("opening_hours:covid19")
    @Expose
    private String openingHoursCovid19;
    @SerializedName("takeaway:covid19")
    @Expose
    private String takeawayCovid19;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("alt_name")
    @Expose
    private String altName;
    @SerializedName("old_name")
    @Expose
    private String oldName;
    @SerializedName("operator")
    @Expose
    private String operator;
    @SerializedName("note")
    @Expose
    private String note;
    @SerializedName("opening_hours")
    @Expose
    private String openingHours;
    @SerializedName("contact:phone")
    @Expose
    private String contactPhone;
    @SerializedName("delivery:covid19")
    @Expose
    private String deliveryCovid19;
    @SerializedName("description:covid19")
    @Expose
    private String descriptionCovid19;
    @SerializedName("diet:vegetarian")
    @Expose
    private String dietVegetarian;
    @SerializedName("outdoor_seating")
    @Expose
    private String outdoorSeating;
    @SerializedName("takeaway")
    @Expose
    private String takeaway;
    @SerializedName("changing_table")
    @Expose
    private String changingTable;
    @SerializedName("drinking_water")
    @Expose
    private String drinkingWater;
    @SerializedName("internet_access")
    @Expose
    private String internetAccess;
    @SerializedName("internet_access:fee")
    @Expose
    private String internetAccessFee;
    @SerializedName("internet_access:ssid")
    @Expose
    private String internetAccessSsid;
    @SerializedName("check_date:opening_hours")
    @Expose
    private String checkDateOpeningHours;
    @SerializedName("dog")
    @Expose
    private String dog;
    @SerializedName("contact:facebook")
    @Expose
    private String contactFacebook;

    public String getAddrCity() {
        return addrCity;
    }

    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity;
    }

    public String getAddrHousenumber() {
        return addrHousenumber;
    }

    public void setAddrHousenumber(String addrHousenumber) {
        this.addrHousenumber = addrHousenumber;
    }

    public String getAddrPostcode() {
        return addrPostcode;
    }

    public void setAddrPostcode(String addrPostcode) {
        this.addrPostcode = addrPostcode;
    }

    public String getAddrStreet() {
        return addrStreet;
    }

    public void setAddrStreet(String addrStreet) {
        this.addrStreet = addrStreet;
    }

    public String getAmenity() {
        return amenity;
    }

    public void setAmenity(String amenity) {
        this.amenity = amenity;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getWheelchair() {
        return wheelchair;
    }

    public void setWheelchair(String wheelchair) {
        this.wheelchair = wheelchair;
    }

    public String getOpeningHoursSigned() {
        return openingHoursSigned;
    }

    public void setOpeningHoursSigned(String openingHoursSigned) {
        this.openingHoursSigned = openingHoursSigned;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSurveyDate() {
        return surveyDate;
    }

    public void setSurveyDate(String surveyDate) {
        this.surveyDate = surveyDate;
    }

    public String getOpeningHoursCovid19() {
        return openingHoursCovid19;
    }

    public void setOpeningHoursCovid19(String openingHoursCovid19) {
        this.openingHoursCovid19 = openingHoursCovid19;
    }

    public String getTakeawayCovid19() {
        return takeawayCovid19;
    }

    public void setTakeawayCovid19(String takeawayCovid19) {
        this.takeawayCovid19 = takeawayCovid19;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAltName() {
        return altName;
    }

    public void setAltName(String altName) {
        this.altName = altName;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getDeliveryCovid19() {
        return deliveryCovid19;
    }

    public void setDeliveryCovid19(String deliveryCovid19) {
        this.deliveryCovid19 = deliveryCovid19;
    }

    public String getDescriptionCovid19() {
        return descriptionCovid19;
    }

    public void setDescriptionCovid19(String descriptionCovid19) {
        this.descriptionCovid19 = descriptionCovid19;
    }

    public String getDietVegetarian() {
        return dietVegetarian;
    }

    public void setDietVegetarian(String dietVegetarian) {
        this.dietVegetarian = dietVegetarian;
    }

    public String getOutdoorSeating() {
        return outdoorSeating;
    }

    public void setOutdoorSeating(String outdoorSeating) {
        this.outdoorSeating = outdoorSeating;
    }

    public String getTakeaway() {
        return takeaway;
    }

    public void setTakeaway(String takeaway) {
        this.takeaway = takeaway;
    }

    public String getChangingTable() {
        return changingTable;
    }

    public void setChangingTable(String changingTable) {
        this.changingTable = changingTable;
    }

    public String getDrinkingWater() {
        return drinkingWater;
    }

    public void setDrinkingWater(String drinkingWater) {
        this.drinkingWater = drinkingWater;
    }

    public String getInternetAccess() {
        return internetAccess;
    }

    public void setInternetAccess(String internetAccess) {
        this.internetAccess = internetAccess;
    }

    public String getInternetAccessFee() {
        return internetAccessFee;
    }

    public void setInternetAccessFee(String internetAccessFee) {
        this.internetAccessFee = internetAccessFee;
    }

    public String getInternetAccessSsid() {
        return internetAccessSsid;
    }

    public void setInternetAccessSsid(String internetAccessSsid) {
        this.internetAccessSsid = internetAccessSsid;
    }

    public String getCheckDateOpeningHours() {
        return checkDateOpeningHours;
    }

    public void setCheckDateOpeningHours(String checkDateOpeningHours) {
        this.checkDateOpeningHours = checkDateOpeningHours;
    }

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }

    public String getContactFacebook() {
        return contactFacebook;
    }

    public void setContactFacebook(String contactFacebook) {
        this.contactFacebook = contactFacebook;
    }

}
