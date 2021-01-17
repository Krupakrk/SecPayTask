package pages.helpers;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.company.Company;
import io.codearte.jfairy.producer.person.Person;

public class randomDataGenerator {
	
	Fairy fairy = Fairy.create();
	Person person = fairy.person();
	public String firstName = person.getFirstName();
	public String lastName = person.getLastName();
	public String email = person.getCompanyEmail();
	public String phoneNumber = person.getTelephoneNumber();
	
	Company company = fairy.company();
	public String companyName = company.getName();
	public String webSiteUrl = company.getUrl();

}
