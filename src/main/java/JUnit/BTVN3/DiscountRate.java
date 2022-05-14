package JUnit.BTVN3;

public class DiscountRate {
    static double serviceDiscountPremium = 0.2;
    static double serviceDiscountGold = 0.15;
    static double serviceDiscountSilver = 0.1;
    static double productDiscountPremium = 0.1;
    static double productDiscountGold = 0.1;
    static double productDiscountSilver = 0.1;

    public static  double getServiceDiscountRate(String memberType){
        switch (memberType){
            case "PREMIUM":
                    return 0.2;
            case "GOLD":
                return 0.15;
            case "SILVER":
                return 0.1;
        }
        return 0;

    }
    public static  double getProductDiscountRate(String memberType){
        if(memberType.equals("PREMIUM")||memberType.equals("GOLD")||memberType.equals("SILVER"))
            return 0.1;
        return 0;
    }
}
