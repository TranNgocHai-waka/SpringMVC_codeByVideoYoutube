package com.laptrinhjavaweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;



@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider") //bat tinh nang cua auditing
public class JpaAuditingConfig {
	
	@Bean
	public AuditorAware<String> auditorProvider() {
		return new AuditorAwareImpl();
	}
	
	public static class AuditorAwareImpl implements AuditorAware<String> {

		@Override
		public String getCurrentAuditor() {
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();  //in spring security
			if (authentication == null) {
				return null;
			}
			return authentication.getName();//chua all thong tin ng dung(prinipal) sau khi dang nhap va jpaAudi.. se vao lay thong tin //createdBy, modifiedBy
		}
	}
}
