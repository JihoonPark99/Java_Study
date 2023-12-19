package AssignmentUnitilSeptember9th;

public class Problem1 {
    public static void main(String[] args) {
        // Joe purchased stock in Acme SoftWare, Inc
        // - 1000 : number of shares
        // - paid $32.87 per share
        // - paid his stockbroker a commission that amounted to 2% of the amout he paid
        // for the stock.

        // Two weeks later, Joe sold the stock.
        // detail
        // - 1000 : number of shares
        // - sold $33.92 per share
        // - paid his stockbroker another commission that amounted to 2% of the amount
        // he received for the stock.

        // What's in code
        // - The amount of money Joe paid for the stock : $ (1000 * 32.97) => a
        // - The amount of commission Joe paid his broker when he bought the stock.
        // => a * 0.02 = a'

        // - The amount that Joe sold the stock for. : $ (1000 * 33.92) => b
        // - The amount of commission Joe paed his broker when he sold the stock.
        // => b * 0.02 = b'

        // - Display the amount of profit that Joe made after selling his stock and
        // paying the two commissions to his broker
        // => b - a - (a' + b') = net profit
        // if net profit is a negative number, then Joe lost money on the transaction.

        // paying
        int cntShares = 1000;
        double paidCost = 32.87; // per share
        double commissionPercent = 0.02; // stock broker commission

        double paidProfit = cntShares * paidCost;
        double paidCommission = paidProfit * commissionPercent;

        System.out.println("The amount of money Joe paid for the stock : " + paidProfit);
        System.out.println("The amount of commission Joe paid his broker when he bought the stock : " + paidCommission);
        System.out.println();

        // selling
        double soldCost = 33.92;
        double soldProfit = cntShares * soldCost;
        double soldCommission = soldProfit * commissionPercent;
        System.out.println("The amount that Joe sold the stock for : " + soldProfit);
        System.out.println("The amount of commission Joe paed his broker when he sold the stock : " + soldCommission);

        // Net Profit
        double netProfit = soldProfit - paidCost - paidCommission - soldCommission;
        if (netProfit > 0) {
            System.out.println("Net Profit is +" + netProfit);
        } else {
            System.out.println("Joe lost money on the transaction(" + netProfit + ")");
        }

    }
}
