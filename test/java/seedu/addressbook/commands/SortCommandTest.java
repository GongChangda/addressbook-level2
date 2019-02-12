package seedu.addressbook.commands;


import static org.junit.Assert.assertTrue;
import java.util.Collections;
import org.junit.Test;
import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.person.Address;
import seedu.addressbook.data.person.Email;
import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.Phone;
import seedu.addressbook.util.TestUtil;


public class SortCommandTest {
    private AddressBook addressBook;
    private String testResult;

    @Test
    public void sortTest() throws Exception{
        Person johnDoe = new Person(new Name("John Doe"), new Phone("61234567", false),
                new Email("john@doe.com", false), new Address("395C Ben Road", false), Collections.emptySet());
        Person janeDoe = new Person(new Name("Jane Doe"), new Phone("91234567", false),
                new Email("jane@doe.com", false), new Address("33G Ohm Road", false), Collections.emptySet());
        Person samDoe = new Person(new Name("Sam Doe"), new Phone("63345566", false),
                new Email("sam@doe.com", false), new Address("55G Abc Road", false), Collections.emptySet());
        Person davidGrant = new Person(new Name("David Grant"), new Phone("61121122", false),
                new Email("david@grant.com", false), new Address("44H Define Road", false),
                Collections.emptySet());

        addressBook = TestUtil.createAddressBook(johnDoe, janeDoe, davidGrant, samDoe);
        addressBook.sort();
        testResult = addressBook.getAllPersons().immutableListView().get(0).getName().fullName;
        assertTrue(testResult.equals("David Grant"));
    }
}