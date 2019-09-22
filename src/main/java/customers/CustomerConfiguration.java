package customers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {


    @Bean
    public ILogger getLogger() {
        return new Logger();
    }

    @Bean
    public ICustomerDAO getCustomerDao() {
        ICustomerDAO customerDao = new CustomerDAO();
        customerDao.setLogger(getLogger());
        return customerDao;
    }

    @Bean
    public IEmailSender getEmail() {
        return new EmailSender();
    }


    @Bean
    public ICustomerService customerService() {
        ICustomerService customerService = new CustomerService();

        customerService.setEmailSender(getEmail());
        customerService.setCustomerDAO(getCustomerDao());

        return customerService;
    }

}
