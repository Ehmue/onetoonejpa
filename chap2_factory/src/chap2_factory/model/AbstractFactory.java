package chap2_factory.model;

public interface AbstractFactory 
{
	public Bank getBank(String bankName);
	public Account getAccount(String accountType);

}
