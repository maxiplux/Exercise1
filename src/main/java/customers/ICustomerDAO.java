package customers;

public interface ICustomerDAO {
	void setLogger(ILogger logger);

	void save(Customer customer) ;
}
