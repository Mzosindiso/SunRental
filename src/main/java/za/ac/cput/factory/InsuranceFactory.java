package za.ac.cput.factory;
import za.ac.cput.domain.Insurance;
import za.ac.cput.util.Helper;
/*
 * InsuranceFactory.java
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 */
public class InsuranceFactory {

    public static Insurance buildInsurance(String coverageType, boolean coverageAmount){
        if(Helper.isNullorEmpty(coverageType) || !coverageAmount) {
            return null;
        }
        String insuranceID = Helper.generateId();
        return new Insurance.Builder()
                .setInsuranceID(insuranceID)
                .setCoverageAmount(coverageAmount)
                .setCoverageType(coverageType)
                .build();
    }
}
