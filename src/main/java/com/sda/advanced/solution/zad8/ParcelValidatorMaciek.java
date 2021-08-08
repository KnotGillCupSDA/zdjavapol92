package com.sda.advanced.solution.zad8;

public class ParcelValidatorMaciek implements Validator {
    @Override
    public boolean validate(Parcel parcel) {
        if (parcel.getxLength() + parcel.getyLength() + parcel.getzLength() > 300) {
            System.out.println("Za duża paczka");
            return false;
        }
        if (parcel.getxLength() < 30) {
            System.out.println("Bok x jest za mały");
            return false;
        }
        if (parcel.getyLength() < 30) {
            System.out.println("Bok y jest za mały");
            return false;
        }
        if (parcel.getzLength() < 30) {
            System.out.println("Bok z jest za mały");
            return false;
        }
        if (parcel.getWeight() > 30 && parcel.isExpress() == false) {
            System.out.println("Waga za duża dla paczki nieekspresowej");
            return false;
        }
        if (parcel.getWeight() > 15 && parcel.isExpress()) {
            System.out.println("Waga za duża dla paczki ekspresowej");
            return false;
        }
        return true;
    }
}
