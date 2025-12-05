public class SebastianRiano {
    private String month;
    private int day;
    private String gift;

    public SebastianRiano(String gift) {
        this.gift = gift;
        this.month = "May";
        this.day = 05;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public String toString() {
        return "Name: SebastianRiano | Month:" + month +
               " | Day: " + day +
               " | Gift: " + gift;
    }

    public static void main(String[] args){
        SebastianRiano sebastian = new SebastianRiano("books");
        System.out.println(sebastian.toString());
    }

}