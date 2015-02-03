//Ryan Hughes
//1/31/15
//CSE 002
//Arithmetic code to calculate the cost of groceries

    public class Arithmetic {   //names the class
        
        public static void main(String [] args) {   //declares the main method
            
                int nSocks=3;   //declares integers for the number of items being bought
                int nGlasses=6;
                int nEnvelopes=1;
                
                
                double sockCost$=2.58;  //declares doubles for the price of the items
                double glassCost$=2.29;
                double envelopeCost$=3.25;
                double taxPercent=0.06;     //declares the percentage of tax
                
                double totalSockCost$, totalGlassesCost$, totalEnvelopesCost$, totalCostPreTax$, totalSalesTax$, totalCostPostTax$;
                double sockTax$, envelopeTax$, glassesTax$;     //declares doubles for the total costs before and after tax
                
                totalSockCost$ = (nSocks * sockCost$);  //calculates total costs for the items
                totalGlassesCost$ = (nGlasses * glassCost$);
                totalEnvelopesCost$ = (nEnvelopes * envelopeCost$);
                totalCostPreTax$ = (totalSockCost$ + totalGlassesCost$ + totalEnvelopesCost$);  //calculates total values before and after tax
                totalSalesTax$ = (totalCostPreTax$ * taxPercent);
                totalCostPostTax$ = (totalCostPreTax$ + totalSalesTax$);
                sockTax$ = (totalSockCost$ * taxPercent);   //calculates the value of tax being added for each item
                envelopeTax$ = (totalEnvelopesCost$ * taxPercent);
                glassesTax$ = (totalGlassesCost$ * taxPercent);
                
                sockTax$ *=100;     //converts the long decimal values to 2 decimal places
                sockTax$ = (int)sockTax$;
                sockTax$ /=100;
                
                glassesTax$ *=100;      //converts the long decimal values to 2 decimal places
                glassesTax$ = (int)glassesTax$;
                glassesTax$ /=100;
                
                envelopeTax$ *=100;     //converts the long decimal values to 2 decimal places
                envelopeTax$ = (int)envelopeTax$;
                envelopeTax$ /=100;
                
                totalSalesTax$ *=100;       //converts the long decimal values to 2 decimal places
                totalSalesTax$ = (int)totalSalesTax$;
                totalSalesTax$ /=100;
                
                totalCostPostTax$ *=100;        //converts the long decimal values to 2 decimal places
                totalCostPostTax$ = (int)totalCostPostTax$;
                totalCostPostTax$ /=100;
                
                System.out.println(nSocks + " pairs of socks at $" + sockCost$ + " per item."); //prints out the items and their costs
                System.out.println(nGlasses + " glasses at $" + glassCost$ + " per item."  );
                System.out.println(nEnvelopes + " box of envelopes at $" + envelopeCost$ + " per item.");
                System.out.println("The total cost of the socks is $" + totalSockCost$ + " ,with $" + sockTax$ + " in sales tax."); //prints out the cost of the items including tax
                System.out.println("The total cost of the glasses is $" + totalGlassesCost$ + " ,with $" + glassesTax$ + " in sales tax.");
                System.out.println("The total cost of the envelopes is $" + totalEnvelopesCost$ + ", with $" + envelopeTax$ + " in sales tax.");
                System.out.println("The total cost of the purchases is $" + totalCostPreTax$ + ", with $" + totalSalesTax$ + " in sales tax,");
                System.out.println("bringing the total cost to $" + totalCostPostTax$ + " including sales tax.");   //prints out the total cost including tax
        }
    }