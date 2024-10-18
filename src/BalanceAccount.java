import java.text.DecimalFormat;

public class BalanceAccount {
    private double bankBalance = 0;
    private double topUpAmount = 5.00;
    private double sendTxtAmount = 0.20;
    private double makeCallAmount = 0.50;
    
    //Decimal format
    DecimalFormat df = new DecimalFormat("#.##");

    public double getBankBalance() {
        return this.bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Balance = " +
        df.format(this.bankBalance);
    }

    public double getTopUpAmount() {
        return this.topUpAmount;
    }


    //to do 
    //make call method

    // public double makeCallBtn(double balance) {
    // }
    //send text method

    public double sendTxtBtn() {
        if (bankBalance > 0) {
            bankBalance -= sendTxtAmount;
        }
        return bankBalance;
    }
    //top up method

    public double topUpBtn() {
        bankBalance += topUpAmount;
        return bankBalance;
    }

    //make call method
    public double makeCallBtn() {
        if (bankBalance > 0) {
            bankBalance -= makeCallAmount;
        }
        return bankBalance;
    }

}
