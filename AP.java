public class AP {
    private String month;
    private int day;
    private String gift;
    
    
    public AP(String gift){
        month = "December";
        gift = "PS5";
        day = 5;
    }
    public String getGift(){
        return gift;
    }

    public void setGift(String gift){
        this.gift = gift;
    }

    public String toString() {
        return "AP " + month + " " + day + " " + gift;

    }

    public static void main(String[] args) {
        AP ap = new AP("XBOX");
        ap.setGift("PS5");
        System.out.println(ap.toString());
    }



    
}
