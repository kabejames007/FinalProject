package edu.dmacc.codedsm.FinalProject;

public class Payroll {
        private double grossPay;
        private double netPay;
        private final double taxRate = 1.2;
        Employee employee;

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "grossPay=" + grossPay +
                ", netPay=" + netPay +
                ", taxRate=" + taxRate +
                ", employee=" + employee +
                '}';
    }
}
