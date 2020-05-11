package guestbook;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import one.util.streamex.StreamEx;

public class GuestBookServiceTest {
	/*
	 * 
	 * 
	 * @BeforeAll public void initialize() { this.guestbookService=new
	 * GuestbookService(new SpamCheckerDecorator(),new RateLimiter(), new
	 * JpaRepository()); }
	 * 
	 * 
	 * 
	 * @Test public void create() {
	 * this.guestbookService.create(newGuestbookEntry("Prashant", "Backend"),
	 * "121.09.76.13"); }
	 */

	@Test
	public void tenantNameCheck() {
		ApplicationContext context = new AnnotationConfigApplicationContext("guestbook");
		String tenantName = "XebiaTenant";
		GuestbookService guestBookService = context.getBean(GuestbookService.class, tenantName);
		guestBookService.create(new GuestbookEntry("Prashant", "Spanish"), "121.00.23");
		assertEquals(tenantName, guestBookService.getTenantName());
	}

	@Test
	public void getCountryName() {
		ApplicationContext context = new AnnotationConfigApplicationContext("guestbook");
		String tenantName = "XebiaTenant";
		String ipAddress = "172.8.9.28";
		GuestbookService guestBookService = context.getBean(GuestbookService.class, tenantName);
		assertEquals("India", guestBookService.getCountryName(ipAddress));

	}

	@Test
	public void uniqueNamesList() {
		ApplicationContext context = new AnnotationConfigApplicationContext("guestbook");
		String tenantName = "XebiaTenant";
		GuestbookService guestBookService = context.getBean(GuestbookService.class, tenantName);
		List<String> actual = new ArrayList<>();
		actual.add("Prashant");
		actual.add("Abhay");
		Stream<GuestbookEntry> first_entry = Stream.of(new GuestbookEntry("Prashant", "English"));
		Stream<GuestbookEntry> second_entry = Stream.of(new GuestbookEntry("Abhay", "Spanish"));
		Stream<GuestbookEntry> result = Stream.concat(first_entry, second_entry);
		assertEquals(actual, guestBookService.viewUniqueNames(result));

	}

	@Test
	public void spamGuests() {
		ApplicationContext context = new AnnotationConfigApplicationContext("guestbook");
		String tenantName = "XebiaTenant";
		GuestbookService guestBookService = context.getBean(GuestbookService.class, tenantName);
		Stream<GuestbookEntry> first_entry = Stream.of(new GuestbookEntry("Prashant", "English"));
		Stream<GuestbookEntry> second_entry = Stream.of(new GuestbookEntry("Abhay", "English"));
		Stream<GuestbookEntry> third_entry = Stream.of(new GuestbookEntry("FDS", "English"));
		Stream<GuestbookEntry> fourth_entry = Stream.of(new GuestbookEntry("LKJ", "English"));
		Stream<GuestbookEntry> fifth_entry = Stream.of(new GuestbookEntry("hjjj", "English"));
		// Stream<GuestbookEntry>
		// result=StreamEx.of(first_entry).append(second_entry).append(third_entry).append(fourth_entry).append(fifth_entry);
		Stream<GuestbookEntry> result = Stream.of(first_entry, second_entry, third_entry, fourth_entry, fifth_entry)
				.flatMap(s -> s);
		List<String> actual = new ArrayList<>();
		actual.add("Prashant");
		actual.add("Abhay");
		actual.add("FDS");
		actual.add("LKJ");
		actual.add("hjjj");
		Map<Stream<GuestbookEntry>, String> map = new LinkedHashMap<>();
		map.put(first_entry, "spam");
		map.put(second_entry, "spam");
		map.put(third_entry, "spam");
		map.put(fourth_entry, "This is also also alsospam");
		map.put(fifth_entry, "This is a spam");
		// guestBookService.postSpam(result);
		assertEquals(actual, guestBookService.postSpam(map));

	}

	@Test
	public void visitorCount() {
		ApplicationContext context = new AnnotationConfigApplicationContext("guestbook");
		String tenantName = "XebiaTenant";
		GuestbookService guestBookService = context.getBean(GuestbookService.class, tenantName);
		Stream<GuestbookEntry> first_entry = Stream.of(new GuestbookEntry("Prashant", "English"));
		Stream<GuestbookEntry> second_entry = Stream.of(new GuestbookEntry("Abhay", "English"));
		Stream<GuestbookEntry> third_entry = Stream.of(new GuestbookEntry("FDS", "English"));
		Stream<GuestbookEntry> fourth_entry = Stream.of(new GuestbookEntry("LKJ", "English"));
		Stream<GuestbookEntry> fifth_entry = Stream.of(new GuestbookEntry("hjjj", "English"));
		Stream<GuestbookEntry> result = Stream.of(first_entry, second_entry, third_entry, fourth_entry, fifth_entry)
				.flatMap(s -> s);
		int actual = 5;
		Map<Stream<GuestbookEntry>, String> map = new LinkedHashMap<>();
		map.put(first_entry, "United States");
		map.put(second_entry, "Germany");
		map.put(third_entry, "France");
		map.put(fourth_entry, "United States");
		map.put(fifth_entry, "India");
		assertEquals(actual, guestBookService.visitorCount(map));

	}

	@Test
	public void messageCount() {
		ApplicationContext context = new AnnotationConfigApplicationContext("guestbook");
		String tenantName = "XebiaTenant";
		GuestbookService guestBookService = context.getBean(GuestbookService.class, tenantName);
		Stream<String> first_message = Stream.of("My name is Prashant");
		Stream<String> second_message = Stream.of("Ich heisse Prashant");
		Stream<String> third_message = Stream.of("Me llamo Prashant");
		Stream<String> fourth_message = Stream.of("mon nom est Prashant");
		Stream<String> result = Stream.of(first_message, second_message, third_message, fourth_message).flatMap(s -> s);
		int actual = 4;
		Map<Stream<String>, String> map = new LinkedHashMap<>();
		map.put(first_message, "United States");
		map.put(second_message, "Germany");
		map.put(third_message, "Spain");
		map.put(fourth_message, "France");
		assertEquals(actual, guestBookService.messageCount(map));
	}

}
