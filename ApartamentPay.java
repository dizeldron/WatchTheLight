import java.text.DecimalFormat;

public class ApartamentPay {

    double sum ;
    double contribution ;
    double payPercent ;
    int years;

  public double getSum() {
        return sum;
    }
    public void setSum(int sum){
        this.sum = sum;
    }
    public void setContribution(double firstPay){
        this.contribution = firstPay;
    }
    public double getContribution(){
        return contribution;
    }
    public void setPayPercent(double payPercent){
        this.payPercent = payPercent;
    }
    public double getPayPercent(){
        return payPercent;
    }
    public int getYears (){
        return years;
    }
    public void setYears (int years){
        this.years = years;
    }
    public static void main(String[] args) {

        ApartamentPay ap = new ApartamentPay();
        ap.setSum( 2000000 );
        ap.setContribution( 400000 );
        ap.setPayPercent( 7 );
        ap.setYears( 10 );
        System.out.println("Total sum : " + ap.getSum() );
        System.out.println("First pay : " + ap.getContribution());
        System.out.println("Percent : " + ap.getPayPercent());


        DecimalFormat df = new DecimalFormat( "#.###" );

        double rest = ap.getSum() - ap.getContribution();
        double MonthPay = rest / (ap.getYears()* 12);
        System.out.println("MonthPay : " + MonthPay);


         for (int i = 0; i < (ap.years * 12) ; i++){

    double MonthPayWithPercents = (rest / 100 * ap.getPayPercent()) / 12;
    System.out.println( "MonthPayWithPercents : " + df.format( +MonthPayWithPercents ) );
    System.out.println( "Total Pay : " + df.format( MonthPay + MonthPayWithPercents ) );
    rest = rest - MonthPay;
    System.out.println( "The rest : " + df.format( rest ) );

            }
    }}
