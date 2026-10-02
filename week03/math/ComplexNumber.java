public class ComplexNumber {
    private double real;
    private double imag;
    public ComplexNumber(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public boolean equals(ComplexNumber number){
        return this.real == number.real && this.imag == number.imag;
    }

    public double re(){
        return real;
    }
    public double imag(){
        return imag;
    }
    public ComplexNumber conjugate(){
        return new ComplexNumber(real, -imag);
    }
    public ComplexNumber abs(){
        double magnitude = Math.sqrt(this.real*this.real + this.imag*this.imag);
        return new ComplexNumber(magnitude, 0);
    }
    public ComplexNumber add(ComplexNumber number){
        return new ComplexNumber(this.real + number.real, this.imag+number.imag);
    }
    public ComplexNumber sub(ComplexNumber number){
        return new ComplexNumber(this.real-number.real,this.imag-number.imag);
    }
     // (a+bi)(c+di) = (ac - bd) + (ad + bc)i
    public ComplexNumber mult(ComplexNumber number){
        double newReal = this.real * number.real - this.imag * number.imag;
        double newImag = this.real * number.imag + this.imag * number.real;
        return new ComplexNumber(newReal, newImag);
    }
    public ComplexNumber pow(int n){
        ComplexNumber result = new ComplexNumber(1, 0);
        for(int i=0; i<n;i++){
            result = result.mult(this);
        }
        return result;
    }
    @Override 
    public String toString(){
        if(imag<0){
            return this.real + " - "+ this.imag + "i";
        } else {
            return this.real + " + "+ this.imag + "i";
        }
    }

}
