public class FractionCalculateImpl implements FractionCalculate {

    @Override
    public FractionalNumber Multiply(FractionalNumber first, FractionalNumber second) {
        FractionalNumber result = new FractionalNumber();
        result.Numerator = first.Numerator * second.Numerator;
        result.Denominator = first.Denominator * second.Denominator;
        return result;
    }

    @Override
    public FractionalNumber Divide(FractionalNumber first, FractionalNumber second) {
        FractionalNumber result = new FractionalNumber();
        result.Numerator = first.Numerator * second.Denominator;
        result.Denominator = first.Denominator * second.Numerator;
        return result;
    }

    @Override
    public FractionalNumber Append(FractionalNumber first, FractionalNumber second) {
        FractionalNumber result = new FractionalNumber();
        result.Numerator = first.Numerator*second.Denominator + first.Denominator*second.Numerator;
        result.Denominator = first.Denominator * second.Denominator;
        return result;
    }

    @Override
    public FractionalNumber Subtract(FractionalNumber first, FractionalNumber second) {
        FractionalNumber result = new FractionalNumber();
        result.Numerator = first.Numerator * second.Denominator-first.Denominator*second.Numerator;
        result.Denominator = first.Denominator * second.Denominator;
        return result;
        
    }
    
}
