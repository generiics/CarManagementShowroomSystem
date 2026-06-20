public abstract class Car implements CarOperations{
    protected int carId;
    protected String company;
    protected String model;
    protected double price;

    public int getCarId(){
    return carId;
    }

    public String getCompany(){
    return company;
    }
    public String getModel(){
        return model;

    }
    public double getPrice(){
        return price;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}




