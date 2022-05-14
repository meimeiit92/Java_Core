package JUnit.BTVN3;

import java.util.Date;

public class Visit {
    Customer customer;
    Date date;
    double serviceExpense;
    double productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getDate() {
        return date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public void setProductExpense(double productExpense) {
            this.productExpense = productExpense;
    }
    public double getTotalExpense() {
        double totalExpense =0;
        double serviceDiscount = DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double productDiscount = DiscountRate.getProductDiscountRate(customer.getMemberType());
        totalExpense = (1-serviceDiscount)*getServiceExpense()+ (1-productDiscount)*getProductExpense();
        return  Math.round(totalExpense*1000.0)/ (1000.0);
    }
    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}
