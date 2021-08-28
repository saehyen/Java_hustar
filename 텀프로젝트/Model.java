public class Model {
    String price;
    String name;
    String num;

    public Model(String price, String name, String num) {
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public String getprice() {
        return price;
    }

    public String getname() {
        return name;
    }

    public String getnum() {
        return num;
    }

    public void setprice(String price) {
        this.price = price;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setnum(String num) {
        this.num = num;
    }
}