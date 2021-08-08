package com.sda.advanced.solution.zad8;

public class ValidatorImpl implements Validator {

	@Override
	public boolean validate(Parcel parcel) {

		if (parcel.getxLength() + parcel.getyLength() + parcel.getyLength() > 300) {
			return false;
		}

		if (parcel.getxLength() <= 30
				|| parcel.getyLength() <= 30
				|| parcel.getzLength() <= 30) {
			return false;
		}

		if(parcel.isExpress() && parcel.getWeight() > 15.0) {
			return false;
		}

		if(!parcel.isExpress() && parcel.getWeight() > 30.0) {
			return false;
		}

		return true;
	}

}
