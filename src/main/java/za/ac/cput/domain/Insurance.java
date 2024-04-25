package za.ac.cput.domain;

/*
 * Insurance.java
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 */

import java.util.Objects;

public class Insurance {
    private String insuranceID;
    private String coverageType;
    private boolean coverageAmount;

    private Insurance(Builder builder){
        this.insuranceID = builder.insuranceID;
        this.coverageType = builder.coverageType;
        this.coverageAmount = builder.coverageAmount;
    }
    //Getters
    public String getInsuranceID() {
        return insuranceID;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public boolean getCoverageAmount() {
        return coverageAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Insurance insurance = (Insurance) o;
            return Objects.equals(insuranceID, insurance.insuranceID) &&
                Objects.equals(coverageType, insurance.coverageType) &&
                Objects.equals(coverageAmount, insurance.coverageAmount);
    }

    @Override
    public int hashCode(){
        return Objects.hash(insuranceID, coverageType, coverageAmount);
    }
    @Override
    public String toString() {
        return "Insurance{" +
                "insuranceID='" + insuranceID + '\'' +
                ", coverageType='" + coverageType + '\'' +
                ", coverageAmount='" + coverageAmount + '\'' +
                '}';
    }

    public static class Builder{
        private String insuranceID;
        private String coverageType;
        private boolean coverageAmount;

        public Builder setInsuranceID(String insuranceID) {
            this.insuranceID = insuranceID;
            return this;
        }

        public Builder setCoverageType(String coverageType) {
            this.coverageType = coverageType;
            return this;
        }

        public Builder setCoverageAmount(boolean coverageAmount) {
            this.coverageAmount = coverageAmount;
            return this;
        }

        public Builder copy(Insurance insurance){
            this.insuranceID = insurance.insuranceID;
            this.coverageType = insurance.coverageType;
            this.coverageAmount = insurance.coverageAmount;
            return this;
        }

        public Insurance build(){
            return new Insurance(this);
        }
    }
}