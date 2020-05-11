package guestbook;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;

@Configuration
public class GuestBookConfig {

	@Bean
	@Scope("prototype")
	@DependsOn("createRateLimiter")
	public SpamCheckerDecorator createSpamCheckerDecorator() {
		return new SpamCheckerDecorator();
	}

	@Bean
	public FrenchSpamChecker createFrenchSpamChecker() {
		return new FrenchSpamChecker();
	}

	@Bean
	public EnglishSpamChecker createEnglishSpamChecker() {
		return new EnglishSpamChecker();
	}

	@Bean
	public JpaRepository createJpaRepository() {
		return new JpaRepository();
	}

	@Bean
	public RateLimiter createRateLimiter() {
		return new RateLimiter();
	}

	@Bean("guestBookService")
	@Scope("prototype")
	public GuestbookService creategGuestbookService(String tenantName) {
		return new GuestbookService(tenantName, createSpamCheckerDecorator(), createRateLimiter(),
				createJpaRepository());
	}
}
