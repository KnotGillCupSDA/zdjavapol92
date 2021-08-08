package com.sda.advanced.solution.zad8;

public class ParcelValidatorDawid implements Validator {

    private boolean checkIfYYZLessThan300(Parcel parcel) {
        return parcel.getxLength() + parcel.getyLength() + parcel.getzLength() <= 300;
    }

    private boolean checkIfAllDimensionsMoreThan30(Parcel parcel) {
        return parcel.getxLength() >= 30 && parcel.getyLength() >= 30 && parcel.getzLength() >= 30;
    }

    private boolean checkIfWeightIsCorrect(Parcel parcel) {
        return (!parcel.isExpress() && parcel.getWeight() <= 30) || (parcel.isExpress() && parcel.getWeight() <= 15);
    }

    @Override
    public boolean validate(Parcel parcel) {
        return checkIfYYZLessThan300(parcel) && checkIfWeightIsCorrect(parcel) && checkIfAllDimensionsMoreThan30(parcel);
    }
}
