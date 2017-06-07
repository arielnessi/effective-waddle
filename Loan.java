package model;
public class Loan {

	private double amount = 100000;
    private double rate = 7.5;  //7.5%
    private int numPeriods = 30;
	public Loan(double amount, double rate, int numPeriods) {
		this.amount = amount;
		this.rate = rate;
		this.numPeriods = numPeriods;
	}
	
	public Loan() {}

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getNumPeriods() {
		return numPeriods;
	}
	public void setNumPeriods(int numPeriods) {
		this.numPeriods = numPeriods;
	}
	
    //Compute the monthly payment based on the loan amount,
    //APR, and length of loan.
    double computePayment(double loanAmt, double rate, int numPeriods) {
        double I, partial1, denominator, answer;

        numPeriods *= 12;        //get number of months
        if (rate > 0.01) {
            I = rate / 100.0 / 12.0;         //get monthly rate from annual
            partial1 = Math.pow((1 + I), (0.0 - numPeriods));
            denominator = (1 - partial1) / I;
        } else { //rate ~= 0
            denominator = numPeriods;
        }

        answer = (-1 * loanAmt) / denominator;
        return answer;
    }
    
    public double computePayment() {
        double I, partial1, denominator, answer;

        numPeriods *= 12;        //get number of months
        if (rate > 0.01) {
            I = rate / 100.0 / 12.0;         //get monthly rate from annual
            partial1 = Math.pow((1 + I), (0.0 - numPeriods));
            denominator = (1 - partial1) / I;
        } else { //rate ~= 0
            denominator = numPeriods;
        }

        answer = (-1 * amount) / denominator;
        return answer;
    }
	

}
