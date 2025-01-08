package com.example.bookingsolutions.bookmyshowlld.modules;

import java.io.Serializable;
import java.util.Objects;

public class Location  implements Serializable {
    private int locationId;
    private String locationName;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return locationId == location.locationId && Objects.equals(locationName, location.locationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationId, locationName);
    }
}
