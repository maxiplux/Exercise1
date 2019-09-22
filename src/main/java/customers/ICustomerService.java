package customers;

public interface ICustomerService {
	void setCustomerDAO(ICustomerDAO customerDAO);

	void setEmailSender(IEmailSender emailSender);

	void addCustomer(String name, String email, String street, String city, String zip);
}
