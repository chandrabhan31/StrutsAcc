package com.service;

import javax.mail.MessagingException;

public interface MailServiceInt {
	public void sendMail(String toEmail, String subject,
			String message) throws MessagingException;

}
