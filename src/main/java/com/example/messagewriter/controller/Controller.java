package com.example.messagewriter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.messagewriter.message.MyMessage;
import com.example.messagewriter.message.sender.MessageSender;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api
public class Controller {

	@Autowired
	MessageSender messageSender;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ApiOperation(value = "test method")
	public String test() {
		MyMessage myMessage = new MyMessage("my message");
		messageSender.send(myMessage);
		return "Hello";
	}

}
