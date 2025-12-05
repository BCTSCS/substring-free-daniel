public class SebastianBetancur {
    private String month, gift;
    private int day;
    public SebastianBetancur(String gift) {
        month = "April";
        day = 24;
    }
    public String getGift() {
        return gift;
    }
    public void setGift(String gift) {
        this.gift = gift;
    }
    public String toString() {
        return "Sebastian Betancur" + " " + month + " " + day + " " + gift;
    }
    public static void main(String[] args) {
        SebastianBetancur seb = new SebastianBetancur("Cupcake");
        seb.setGift("Cupcake");
        System.out.println(seb.toString());
    }
}
