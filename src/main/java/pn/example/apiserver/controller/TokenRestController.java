package pn.example.apiserver.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import pn.example.apiserver.entity.Token;

/**
 * @author
 *
 */
@RestController
public class TokenRestController {

	@PostMapping("/tokens")
	public Token gettoken() {
		Token token = new Token();
		token.setAccess_token("1231213412kfsdhujfh32i3ejeiuwqdskjmiasjdfias");
		return token;
	}

}