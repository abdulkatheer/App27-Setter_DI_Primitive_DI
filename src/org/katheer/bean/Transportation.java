package org.katheer.bean;

public class Transportation {
    private String lorryNo;
    private String driverName;
    private String from;
    private String to;
    private String grossWeight;
    private String netWeight;
    private String cost;

    public String getLorryNo() {
        return lorryNo;
    }

    public void setLorryNo(String lorryNo) {
        this.lorryNo = lorryNo;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    public String getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void getTransportationDetails() {
        System.out.println(String.format("%-15s: %s\n%-15s: %s\n%-15s: %s\n" +
                "%-15s: %s\n%-15s: %s\n%-15s: %s\n%-15s: %s\n",
                "Lorry No", this.getLorryNo(), "Driver Name", this.getDriverName(),
                "From", this.getFrom(), "To", this.getTo(),
                "Gross Weight", this.getGrossWeight(), "Net Weight", this.getNetWeight(),
                "Cost", this.getCost()));
    }
}
