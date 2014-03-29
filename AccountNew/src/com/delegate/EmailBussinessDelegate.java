package com.delegate;

import javax.mail.MessagingException;

import com.locator.ServiceLocator;
import com.service.MailServiceInt;

public class EmailBussinessDelegate {
	private EmailBussinessDelegate() {
	}

	private static MailServiceInt mailService = (MailServiceInt) ServiceLocator
			.getInstance().getMailService();

	public static void sendMail(String toEmail, String subject, String message)
			throws MessagingException {
		mailService.sendMail(toEmail, subject, message);
	}

}
