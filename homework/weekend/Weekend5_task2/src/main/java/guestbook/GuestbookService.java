package guestbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.net.InetAddresses;

//@Component
public class GuestbookService {

	private SpamChecker spamChecker;
	private RateLimiter rateLimiter;
	private JpaRepository jpaRepository;
	private String tenantName;
	private String IpAddress;;

	@Autowired
	public GuestbookService(String tenantName, SpamCheckerDecorator spamCheckerDecorator, RateLimiter rateLimiter,
			JpaRepository jpaRepository) {
		this.tenantName = tenantName;
		this.spamChecker = spamCheckerDecorator;
		this.rateLimiter = rateLimiter;
		this.jpaRepository = jpaRepository;

	}

	public GuestbookService() {
	}

	public void create(GuestbookEntry guestbookEntry, String ipAddress) {

		if (spamChecker.isSpam(guestbookEntry.getContent())) {
			throw new RuntimeException("Spam words in content");
		}

		if (rateLimiter.isRateLimited(ipAddress)) {
			throw new RuntimeException("Ip Address is rate limited");
		}

		jpaRepository.save(guestbookEntry);
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public boolean isIPValid(String IpAddress) {
		if (InetAddresses.isInetAddress(IpAddress)) {
			return true;
		} else
			return false;
	}

	public String getCountryName(String IpAddress) {
		Location location = new Location();
		if (isIPValid(IpAddress)) {
			return location.getCountry(IpAddress);
		} else
			return "IPAddress not Valid";

	}

	public List<String> viewUniqueNames(Stream<GuestbookEntry> guestbookEntry) {
		List<GuestbookEntry> list = guestbookEntry.collect(Collectors.toList());
		ArrayList<GuestbookEntry> guestList = new ArrayList<GuestbookEntry>(list);
		List<String> nameList = new ArrayList<>();
		for (GuestbookEntry names : guestList) {
			nameList.add(names.getName());
		}
		return nameList;
	}

	public List<String> postSpam(Map<Stream<GuestbookEntry>, String> map) {
		List<String> nameList = new ArrayList<>();
		for (Map.Entry<Stream<GuestbookEntry>, String> entry : map.entrySet()) {
			if (entry.getValue().contains("spam"))
				nameList.add(entry.getKey().findFirst().get().getName());
		}
		return nameList;
	}

	public int visitorCount(Map<Stream<GuestbookEntry>, String> map) {
		int count = 0;
		for (Map.Entry<Stream<GuestbookEntry>, String> entry : map.entrySet()) {
			if (entry.getValue() != null)
				count = map.size();
		}
		return count;
	}

	public int messageCount(Map<Stream<String>, String> map) {
		int count = 0;
		for (Map.Entry<Stream<String>, String> entry : map.entrySet()) {
			if (entry.getKey() != null)
				count = map.size();
		}
		return count;
	}

}
