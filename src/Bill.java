public class Bill {

    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public double cover() {        
        if(Bill.feeding(this.beer, this.barbecue, this.softDrink) > 30){
            return 0.0;
        }else{
            return 4.0;
        }
    }

    public static double feeding(int beer, int barbecue, int softDrink) {
        return (beer * 5) + (barbecue * 7) + (softDrink * 3);
    }

    public static double ticket(char gender) {
        if (gender == 'M' || gender == 'm') {
            return 10.0;
        } else if (gender == 'F' || gender == 'f') {
            return 8.0;
        } else {
            return 0.0;
        }

    }

    public static double total(int beer, int barbecue, int softDrink, char gender){
        return Bill.feeding(beer, barbecue, softDrink) + Bill.ticket(gender);
    }

}
