package com.andrenoack.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by andre.noack on 03.12.15.
 */
@RestController
public class LuckyWordController {

	@Value("${lucky-word}") String luckyWord;

	@RequestMapping("lucky-word")
	public String showLuckyWord() {
		return "The lucky word is: " + luckyWord;
	}

}
