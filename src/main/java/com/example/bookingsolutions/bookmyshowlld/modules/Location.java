package com.example.bookingsolutions.bookmyshowlld.modules;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Location  implements Serializable {
    private int locationId;
    private String locationName;//city
    private List<String> pinCodes;

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public List<String> getPinCodes() {
        return pinCodes;
    }

    public void setPinCodes(List<String> pinCodes) {
        this.pinCodes = pinCodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return locationId == location.locationId && Objects.equals(locationName, location.locationName) && Objects.equals(pinCodes, location.pinCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationId, locationName, pinCodes);
    }
}
