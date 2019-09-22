package customers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfiguration.class);


		/*
		ICustomerDAO CustomerDAO = context.getBean("CustomerDAO",
				ICustomerDAO.class);


		ILogger logger = context.getBean("Logger",
				ILogger.class);
		CustomerDAO.setLogger(logger);

		IEmailSender EmailSender = context.getBean("EmailSender",
				IEmailSender.class);
		*/


		ICustomerService customerService = context.getBean("customerService",
				ICustomerService.class);





		customerService.addCustomer("Frank Brown", "fbrown@acme.com",
				"mainstreet 5", "Chicago", "60613");
	}
}

