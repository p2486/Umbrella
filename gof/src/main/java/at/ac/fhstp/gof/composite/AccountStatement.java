package at.ac.fhstp.gof.composite;

public class AccountStatement 
{
    public void merge(AccountStatement g) 
    {
        System.out.println("Merging account statement: " + g.toString());
    }
}
